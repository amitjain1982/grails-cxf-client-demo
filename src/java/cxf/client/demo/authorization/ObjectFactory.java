
package cxf.client.demo.authorization;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cxf.client.demo.authorization package. 
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

    private final static QName _SecureMethod_QNAME = new QName("http://demo.client.cxf/", "secureMethod");
    private final static QName _AuthorizationMethod_QNAME = new QName("http://demo.client.cxf/", "authorizationMethod");
    private final static QName _AuthorizationMethodResponse_QNAME = new QName("http://demo.client.cxf/", "authorizationMethodResponse");
    private final static QName _SecureMethodResponse_QNAME = new QName("http://demo.client.cxf/", "secureMethodResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cxf.client.demo.authorization
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthorizationMethodResponse }
     * 
     */
    public AuthorizationMethodResponse createAuthorizationMethodResponse() {
        return new AuthorizationMethodResponse();
    }

    /**
     * Create an instance of {@link SecureMethodResponse }
     * 
     */
    public SecureMethodResponse createSecureMethodResponse() {
        return new SecureMethodResponse();
    }

    /**
     * Create an instance of {@link SecureMethod }
     * 
     */
    public SecureMethod createSecureMethod() {
        return new SecureMethod();
    }

    /**
     * Create an instance of {@link AuthorizationMethod }
     * 
     */
    public AuthorizationMethod createAuthorizationMethod() {
        return new AuthorizationMethod();
    }

    /**
     * Create an instance of {@link SimpleResponse }
     * 
     */
    public SimpleResponse createSimpleResponse() {
        return new SimpleResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecureMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.client.cxf/", name = "secureMethod")
    public JAXBElement<SecureMethod> createSecureMethod(SecureMethod value) {
        return new JAXBElement<SecureMethod>(_SecureMethod_QNAME, SecureMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.client.cxf/", name = "authorizationMethod")
    public JAXBElement<AuthorizationMethod> createAuthorizationMethod(AuthorizationMethod value) {
        return new JAXBElement<AuthorizationMethod>(_AuthorizationMethod_QNAME, AuthorizationMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.client.cxf/", name = "authorizationMethodResponse")
    public JAXBElement<AuthorizationMethodResponse> createAuthorizationMethodResponse(AuthorizationMethodResponse value) {
        return new JAXBElement<AuthorizationMethodResponse>(_AuthorizationMethodResponse_QNAME, AuthorizationMethodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecureMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.client.cxf/", name = "secureMethodResponse")
    public JAXBElement<SecureMethodResponse> createSecureMethodResponse(SecureMethodResponse value) {
        return new JAXBElement<SecureMethodResponse>(_SecureMethodResponse_QNAME, SecureMethodResponse.class, null, value);
    }

}
