package eil.soa.nanoChat.server;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

import javax.jws.WebService;

@WebService(endpointInterface = "eil.soa.nanoChat.server.ChatEndpoint")
public class ChatEndpointImpl implements ChatEndpoint {
	
	private static final Collection<MessagesInternal> allMessages =
			Collections.synchronizedList(new ArrayList<>());
	private static final AtomicInteger currentRevisionNumber = 
			new AtomicInteger(1);
	
	@Override
	public ListMessagesResponse list(int fromRevisionNumber) {
		List<MessagesResponse> messages = new ArrayList<>();
		 int revisionNumber = fromRevisionNumber;
		 for(MessagesInternal mi : allMessages) {
			 if(mi.getRevisionNumber()>fromRevisionNumber) {
				 MessagesResponse mr = new MessagesResponse();
				 mr.setAuthor(mi.getAuthor());
				 mr.setClientUuid(mi.getClientUuid());
				 mr.setInstant(mi.getInstant());
				 mr.setText(mi.getText());
				 messages.add(mr);
				 if(mi.getRevisionNumber()>revisionNumber) {
					 revisionNumber = mi.getRevisionNumber();
				 }
			 }
		}
		ListMessagesResponse listMessageResponse = new ListMessagesResponse();
		listMessageResponse.setMessages(messages);
		listMessageResponse.setRevisionNumber(revisionNumber);
		return listMessageResponse;
	}

	@Override
	public void send(SendMessageRequest messageRequest) {
		if(messageRequest != null) {
			MessagesInternal mi = new MessagesInternal();
			mi.setAuthor(messageRequest.getAuthor());
			mi.setClientUuid(messageRequest.getClientUuid());
			mi.setInstant(new Date());
			mi.setText(messageRequest.getText());
			mi.setRevisionNumber(currentRevisionNumber.getAndIncrement());
			allMessages.add(mi);
			
			
		}
		
	}

}
