
package com.yum.ph.messaging.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.yum.ph.messaging.ws package. 
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

    private final static QName _PHDispatchResponse_QNAME = new QName("http://ws.yum.com/phmf/PHStoreMessageDispatcher", "PHDispatchResponse");
    private final static QName _PHStoreMessage_QNAME = new QName("http://ws.yum.com/phmf/PHStoreMessageDispatcher", "PHStoreMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.yum.ph.messaging.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PHStoreMessage }
     * 
     */
    public PHStoreMessage createPHStoreMessage() {
        return new PHStoreMessage();
    }

    /**
     * Create an instance of {@link PHDispatchResponse }
     * 
     */
    public PHDispatchResponse createPHDispatchResponse() {
        return new PHDispatchResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PHDispatchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.yum.com/phmf/PHStoreMessageDispatcher", name = "PHDispatchResponse")
    public JAXBElement<PHDispatchResponse> createPHDispatchResponse(PHDispatchResponse value) {
        return new JAXBElement<PHDispatchResponse>(_PHDispatchResponse_QNAME, PHDispatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PHStoreMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.yum.com/phmf/PHStoreMessageDispatcher", name = "PHStoreMessage")
    public JAXBElement<PHStoreMessage> createPHStoreMessage(PHStoreMessage value) {
        return new JAXBElement<PHStoreMessage>(_PHStoreMessage_QNAME, PHStoreMessage.class, null, value);
    }

}
