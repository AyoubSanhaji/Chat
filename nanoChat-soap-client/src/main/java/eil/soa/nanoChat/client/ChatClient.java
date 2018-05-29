package eil.soa.nanoChat.client;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import eil.soa.nanoChat.generated.ChatEndpoint;
import eil.soa.nanoChat.generated.ChatEndpointImplService;
import eil.soa.nanoChat.generated.ListMessagesResponse;
import eil.soa.nanoChat.generated.MessagesResponse;
import eil.soa.nanoChat.generated.SendMessageRequest;

public class ChatClient {
	public static void main(String[] args) {
		// C'est ici qu'on fait le lien avec le serveur...
		final ChatEndpoint chatServer = new ChatEndpointImplService().getChatEndpointImplPort();
		// ... mais attention, on est pas "connecté" : chaque appel d'opération est un
		// message HTTP différent.
		try (final Scanner scanner = new Scanner(System.in)) {
			// Nous allons lire les saisies utilisateurs avec ce scanner.
			// La construction try-with-resource permet de fermer automatiquement le
			// scanner.
			// TODO Afficher un message demandant la saisie d'un pseudo
			final String author = scanner.nextLine() /* lecture d'une ligne */;
			final String clientUuid = UUID.randomUUID().toString();
			new Thread() {
				@Override
				public void run() {
					int revisionNumber = 0; // le numéro de révision des derniers messages reçus
					while (true) {
						{
							// Ce bloc est exécuté en continu toutes les 100 ms.
							ListMessagesResponse listMessagesResponse = chatServer.list(revisionNumber);
							// TODO Appeler la méthode list du chatServer
							List<MessagesResponse> messagesResponse = listMessagesResponse.getMessages();
							// TODO Pour chaque message reçu,
							// TODO vérifier que clientUuid n'est pas equalsIgnoreCase à
							// message.getClientUuid()
							// TODO et s'ils ne sont pas égaux, afficher le message avec le format
							// TODO [message.getInstant()] message.getAuthor() > message.getText()
							// TODO Affecter la variable revisionNumber à la valeur renvoyée par le serveur
							for(MessagesResponse message : messagesResponse) {
								if(!clientUuid.equalsIgnoreCase(message.getClientUuid())) {
									System.out.println("["+message.getInstant()+"]"+ message.getAuthor() +">"+ message.getText());
									listMessagesResponse.setRevisionNumber(revisionNumber);
								}
							}
						}
						try {
							Thread.sleep(100); // on attend 100 ms
						} catch (final InterruptedException exception) {
							throw new RuntimeException(exception);
						}
					}
				}
			}.start();
			while (true) {
				// TODO Lire une ligne au clavier avec scanner.nextLine()
				String line = scanner.nextLine();
				// TODO Créer un objet SendMessageRequest
				SendMessageRequest smr = new SendMessageRequest();
				// TODO Setter les attributs author, clientUuid et text
				smr.setAuthor(author);
				smr.setClientUuid(clientUuid);
				smr.setText(line);
				// TODO Appeler la méthode send du chatServer
				chatServer.send(smr);
			}
		}
	}
}
