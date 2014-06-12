package cxf.client.demo.simple;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2014-06-12T11:35:53.635-05:00
 * Generated source version: 2.6.2
 * 
 */
@WebService(targetNamespace = "http://demo.client.cxf/", name = "SimpleServicePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface SimpleServicePortType {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "simpleMethod2", targetNamespace = "http://demo.client.cxf/", className = "cxf.client.demo.simple.SimpleMethod2")
    @WebMethod
    @ResponseWrapper(localName = "simpleMethod2Response", targetNamespace = "http://demo.client.cxf/", className = "cxf.client.demo.simple.SimpleMethod2Response")
    public cxf.client.demo.simple.SimpleResponse simpleMethod2(
        @WebParam(name = "request", targetNamespace = "")
        cxf.client.demo.simple.SimpleRequest request
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "simpleMethod1", targetNamespace = "http://demo.client.cxf/", className = "cxf.client.demo.simple.SimpleMethod1")
    @WebMethod
    @ResponseWrapper(localName = "simpleMethod1Response", targetNamespace = "http://demo.client.cxf/", className = "cxf.client.demo.simple.SimpleMethod1Response")
    public cxf.client.demo.simple.SimpleResponse simpleMethod1(
        @WebParam(name = "request", targetNamespace = "")
        cxf.client.demo.simple.SimpleRequest request
    );
}
