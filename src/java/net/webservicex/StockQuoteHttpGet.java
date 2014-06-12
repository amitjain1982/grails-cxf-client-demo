package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2014-06-12T11:35:55.448-05:00
 * Generated source version: 2.6.2
 * 
 */
@WebService(targetNamespace = "http://www.webserviceX.NET/", name = "StockQuoteHttpGet")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface StockQuoteHttpGet {

    /**
     * Get Stock quote for a company Symbol
     */
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET/", partName = "Body")
    @WebMethod(operationName = "GetQuote")
    public java.lang.String getQuote(
        @WebParam(partName = "symbol", name = "symbol", targetNamespace = "http://www.webserviceX.NET/")
        java.lang.String symbol
    );
}
