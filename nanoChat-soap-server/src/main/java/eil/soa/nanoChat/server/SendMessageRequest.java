package eil.soa.nanoChat.server;

import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;

public class SendMessageRequest {
	private String author; // pseudo de l’auteur du message
	private UUID clientUuid; // identifiant technique de l’expéditeur
	private String text; // texte du message
	
	@XmlElement(required = true) 
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@XmlElement(required = true) 
	public UUID getClientUuid() {
		return clientUuid;
	}
	public void setClientUuid(UUID clientUuid) {
		this.clientUuid = clientUuid;
	}
	@XmlElement(required = true) 
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	
}
