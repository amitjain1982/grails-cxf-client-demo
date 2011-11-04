package cxf.client.demo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2011-11-03T15:29:15.403-05:00
 * Generated source version: 2.4.2
 * 
 */
@WebServiceClient(name = "SimpleService", 
                  wsdlLocation = "file:docs/SimpleService.wsdl",
                  targetNamespace = "http://demo.client.cxf/") 
public class SimpleService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://demo.client.cxf/", "SimpleService");
    public final static QName SimpleServicePort = new QName("http://demo.client.cxf/", "SimpleServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:docs/SimpleService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SimpleService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:docs/SimpleService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SimpleService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SimpleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SimpleService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns SimpleServicePortType
     */
    @WebEndpoint(name = "SimpleServicePort")
    public SimpleServicePortType getSimpleServicePort() {
        return super.getPort(SimpleServicePort, SimpleServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SimpleServicePortType
     */
    @WebEndpoint(name = "SimpleServicePort")
    public SimpleServicePortType getSimpleServicePort(WebServiceFeature... features) {
        return super.getPort(SimpleServicePort, SimpleServicePortType.class, features);
    }

}
