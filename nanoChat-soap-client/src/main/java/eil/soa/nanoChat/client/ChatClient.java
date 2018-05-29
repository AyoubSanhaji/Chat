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
		// ... mais attention, on est pas "connect�" : chaque appel d'op�ration est un
		// message HTTP diff�rent.
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
					int revisionNumber = 0; // le num�ro de r�vision des derniers messages re�us
					while (true) {
						{
							// Ce bloc est ex�cut� en continu toutes les 100 ms.
							ListMessagesResponse listMessagesResponse = chatServer.list(revisionNumber);
							// TODO Appeler la m�thode list du chatServer
							List<MessagesResponse> messagesResponse = listMessagesResponse.getMessages();
							// TODO Pour chaque message re�u,
							// TODO v�rifier que clientUuid n'est pas equalsIgnoreCase �
							// message.getClientUuid()
							// TODO et s'ils ne sont pas �gaux, afficher le message avec le format
							// TODO [message.getInstant()] message.getAuthor() > message.getText()
							// TODO Affecter la variable revisionNumber � la valeur renvoy�e par le serveur
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
				// TODO Cr�er un objet SendMessageRequest
				SendMessageRequest smr = new SendMessageRequest();
				// TODO Setter les attributs author, clientUuid et text
				smr.setAuthor(author);
				smr.setClientUuid(clientUuid);
				smr.setText(line);
				// TODO Appeler la m�thode send du chatServer
				chatServer.send(smr);
			}
		}
	}
}
