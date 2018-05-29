package eil.soa.nanoChat.server;

import java.util.Date;
import java.util.UUID;

public class MessagesResponse {
	private String author; // pseudo de l’auteur du message
	private UUID clientUuid; // identifiant technique de l’expéditeur
	private Date instant; // date de réception du message par le serveur
	private String text; // texte du message
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public UUID getClientUuid() {
		return clientUuid;
	}
	public void setClientUuid(UUID clientUuid) {
		this.clientUuid = clientUuid;
	}
	public Date getInstant() {
		return instant;
	}
	public void setInstant(Date instant) {
		this.instant = instant;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	
	
}
