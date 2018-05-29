package eil.soa.nanoChat.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface ChatEndpoint {
	@WebMethod
	ListMessagesResponse list(
	@WebParam(name = "fromRevisionNumber") int fromRevisionNumber);
	
	
	@WebMethod
	void send(@WebParam(name = "messageRequest") 
	SendMessageRequest messageRequest);
}
