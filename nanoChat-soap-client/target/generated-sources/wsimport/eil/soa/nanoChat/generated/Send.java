
package eil.soa.nanoChat.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour send complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="send">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageRequest" type="{http://server.nanoChat.soa.eil/}sendMessageRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "send", propOrder = {
    "messageRequest"
})
public class Send {

    protected SendMessageRequest messageRequest;

    /**
     * Obtient la valeur de la propriété messageRequest.
     * 
     * @return
     *     possible object is
     *     {@link SendMessageRequest }
     *     
     */
    public SendMessageRequest getMessageRequest() {
        return messageRequest;
    }

    /**
     * Définit la valeur de la propriété messageRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link SendMessageRequest }
     *     
     */
    public void setMessageRequest(SendMessageRequest value) {
        this.messageRequest = value;
    }

}
