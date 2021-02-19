
package com.pauljean.soapwebserver.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pauljean.soapwebserver.service package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _SayHello_QNAME = new QName("http://service.soapwebserver.pauljean.com/", "sayHello");
    private final static QName _SayHelloByName_QNAME = new QName("http://service.soapwebserver.pauljean.com/", "sayHelloByName");
    private final static QName _SayHelloByNameResponse_QNAME = new QName("http://service.soapwebserver.pauljean.com/", "sayHelloByNameResponse");
    private final static QName _SayHelloResponse_QNAME = new QName("http://service.soapwebserver.pauljean.com/", "sayHelloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pauljean.soapwebserver.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SayHelloByName }
     * 
     */
    public SayHelloByName createSayHelloByName() {
        return new SayHelloByName();
    }

    /**
     * Create an instance of {@link SayHelloByNameResponse }
     * 
     */
    public SayHelloByNameResponse createSayHelloByNameResponse() {
        return new SayHelloByNameResponse();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapwebserver.pauljean.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloByName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayHelloByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapwebserver.pauljean.com/", name = "sayHelloByName")
    public JAXBElement<SayHelloByName> createSayHelloByName(SayHelloByName value) {
        return new JAXBElement<SayHelloByName>(_SayHelloByName_QNAME, SayHelloByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloByNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayHelloByNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapwebserver.pauljean.com/", name = "sayHelloByNameResponse")
    public JAXBElement<SayHelloByNameResponse> createSayHelloByNameResponse(SayHelloByNameResponse value) {
        return new JAXBElement<SayHelloByNameResponse>(_SayHelloByNameResponse_QNAME, SayHelloByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapwebserver.pauljean.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

}
