
package eil.soa.nanoChat.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eil.soa.nanoChat.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SendResponse_QNAME = new QName("http://server.nanoChat.soa.eil/", "sendResponse");
    private final static QName _Send_QNAME = new QName("http://server.nanoChat.soa.eil/", "send");
    private final static QName _List_QNAME = new QName("http://server.nanoChat.soa.eil/", "list");
    private final static QName _ListResponse_QNAME = new QName("http://server.nanoChat.soa.eil/", "listResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eil.soa.nanoChat.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendResponse }
     * 
     */
    public SendResponse createSendResponse() {
        return new SendResponse();
    }

    /**
     * Create an instance of {@link List }
     * 
     */
    public List createList() {
        return new List();
    }

    /**
     * Create an instance of {@link Send }
     * 
     */
    public Send createSend() {
        return new Send();
    }

    /**
     * Create an instance of {@link ListResponse }
     * 
     */
    public ListResponse createListResponse() {
        return new ListResponse();
    }

    /**
     * Create an instance of {@link SendMessageRequest }
     * 
     */
    public SendMessageRequest createSendMessageRequest() {
        return new SendMessageRequest();
    }

    /**
     * Create an instance of {@link MessagesResponse }
     * 
     */
    public MessagesResponse createMessagesResponse() {
        return new MessagesResponse();
    }

    /**
     * Create an instance of {@link ListMessagesResponse }
     * 
     */
    public ListMessagesResponse createListMessagesResponse() {
        return new ListMessagesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.nanoChat.soa.eil/", name = "sendResponse")
    public JAXBElement<SendResponse> createSendResponse(SendResponse value) {
        return new JAXBElement<SendResponse>(_SendResponse_QNAME, SendResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Send }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.nanoChat.soa.eil/", name = "send")
    public JAXBElement<Send> createSend(Send value) {
        return new JAXBElement<Send>(_Send_QNAME, Send.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.nanoChat.soa.eil/", name = "list")
    public JAXBElement<List> createList(List value) {
        return new JAXBElement<List>(_List_QNAME, List.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.nanoChat.soa.eil/", name = "listResponse")
    public JAXBElement<ListResponse> createListResponse(ListResponse value) {
        return new JAXBElement<ListResponse>(_ListResponse_QNAME, ListResponse.class, null, value);
    }

}
