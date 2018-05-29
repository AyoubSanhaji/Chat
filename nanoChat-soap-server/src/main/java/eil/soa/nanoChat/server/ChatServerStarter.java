package eil.soa.nanoChat.server;

import javax.xml.ws.Endpoint;

public class ChatServerStarter {
	public static void main(String[] args) {
		System.err.println("Bonjour eil");
		Endpoint.publish("http://0.0.0.0:8080/chat", new ChatEndpointImpl());
		
	}
}
