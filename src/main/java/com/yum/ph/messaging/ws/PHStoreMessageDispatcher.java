package com.yum.ph.messaging.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2017-04-12T15:12:45.644-05:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://ws.yum.com/phmf/PHStoreMessageDispatcher", name = "PHStoreMessageDispatcher")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface PHStoreMessageDispatcher {

    @WebMethod(action = "http://ws.yum.com/phmf/PHStoreMessageDispatcher/dispatchMessage")
    @WebResult(name = "PHDispatchResponse", targetNamespace = "http://ws.yum.com/phmf/PHStoreMessageDispatcher", partName = "body")
    public PHDispatchResponse dispatchMessage(
        @WebParam(partName = "body", name = "PHStoreMessage", targetNamespace = "http://ws.yum.com/phmf/PHStoreMessageDispatcher")
        PHStoreMessage body
    );
}
