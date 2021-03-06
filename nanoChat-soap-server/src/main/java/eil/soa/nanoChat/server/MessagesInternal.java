package eil.soa.nanoChat.server;

import java.util.Date;
import java.util.UUID;

public class MessagesInternal {
	private String author; // pseudo de l�auteur du message
	private UUID clientUuid; // identifiant technique de l�exp�diteur
	private Date instant; // date de r�ception du message par le serveur
	private int revisionNumber; // pour la synchronisation avec les clients
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
	public int getRevisionNumber() {
		return revisionNumber;
	}
	public void setRevisionNumber(int revisionNumber) {
		this.revisionNumber = revisionNumber;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}
