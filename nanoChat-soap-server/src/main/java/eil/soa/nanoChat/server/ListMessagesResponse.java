package eil.soa.nanoChat.server;

import java.util.List;

public class ListMessagesResponse {
	private List<MessagesResponse> messages;
	private int revisionNumber; // pour la synchronisation avec les clients
	
	public List<MessagesResponse> getMessages() {
		return messages;
	}
	public void setMessages(List<MessagesResponse> messages) {
		this.messages = messages;
	}
	public int getRevisionNumber() {
		return revisionNumber;
	}
	public void setRevisionNumber(int revisionNumber) {
		this.revisionNumber = revisionNumber;
	}
	
	
	
}
