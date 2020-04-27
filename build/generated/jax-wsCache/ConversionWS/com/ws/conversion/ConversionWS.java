
package com.ws.conversion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ConversionWS", targetNamespace = "http://conversion.ws.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConversionWS {


    /**
     * 
     * @param montant
     * @param devise
     * @return
     *     returns float
     */
    @WebMethod(operationName = "FromDZD")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "FromDZD", targetNamespace = "http://conversion.ws.com/", className = "com.ws.conversion.FromDZD")
    @ResponseWrapper(localName = "FromDZDResponse", targetNamespace = "http://conversion.ws.com/", className = "com.ws.conversion.FromDZDResponse")
    @Action(input = "http://conversion.ws.com/ConversionWS/FromDZDRequest", output = "http://conversion.ws.com/ConversionWS/FromDZDResponse")
    public float fromDZD(
        @WebParam(name = "montant", targetNamespace = "")
        float montant,
        @WebParam(name = "devise", targetNamespace = "")
        String devise);

    /**
     * 
     * @param montant
     * @param devise
     * @return
     *     returns float
     */
    @WebMethod(operationName = "ToDZD")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ToDZD", targetNamespace = "http://conversion.ws.com/", className = "com.ws.conversion.ToDZD")
    @ResponseWrapper(localName = "ToDZDResponse", targetNamespace = "http://conversion.ws.com/", className = "com.ws.conversion.ToDZDResponse")
    @Action(input = "http://conversion.ws.com/ConversionWS/ToDZDRequest", output = "http://conversion.ws.com/ConversionWS/ToDZDResponse")
    public float toDZD(
        @WebParam(name = "montant", targetNamespace = "")
        float montant,
        @WebParam(name = "devise", targetNamespace = "")
        String devise);

}
