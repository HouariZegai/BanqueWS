
package org.me.banque;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.banque package. 
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

    private final static QName _GetSoldeResponse_QNAME = new QName("http://banque.me.org/", "getSoldeResponse");
    private final static QName _DeposerResponse_QNAME = new QName("http://banque.me.org/", "deposerResponse");
    private final static QName _Deposer_QNAME = new QName("http://banque.me.org/", "deposer");
    private final static QName _HelloResponse_QNAME = new QName("http://banque.me.org/", "helloResponse");
    private final static QName _RetirerResponse_QNAME = new QName("http://banque.me.org/", "retirerResponse");
    private final static QName _Retirer_QNAME = new QName("http://banque.me.org/", "retirer");
    private final static QName _Hello_QNAME = new QName("http://banque.me.org/", "hello");
    private final static QName _GetSolde_QNAME = new QName("http://banque.me.org/", "getSolde");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.banque
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeposerResponse }
     * 
     */
    public DeposerResponse createDeposerResponse() {
        return new DeposerResponse();
    }

    /**
     * Create an instance of {@link GetSoldeResponse }
     * 
     */
    public GetSoldeResponse createGetSoldeResponse() {
        return new GetSoldeResponse();
    }

    /**
     * Create an instance of {@link Retirer }
     * 
     */
    public Retirer createRetirer() {
        return new Retirer();
    }

    /**
     * Create an instance of {@link RetirerResponse }
     * 
     */
    public RetirerResponse createRetirerResponse() {
        return new RetirerResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Deposer }
     * 
     */
    public Deposer createDeposer() {
        return new Deposer();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link GetSolde }
     * 
     */
    public GetSolde createGetSolde() {
        return new GetSolde();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoldeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://banque.me.org/", name = "getSoldeResponse")
    public JAXBElement<GetSoldeResponse> createGetSoldeResponse(GetSoldeResponse value) {
        return new JAXBElement<GetSoldeResponse>(_GetSoldeResponse_QNAME, GetSoldeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeposerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://banque.me.org/", name = "deposerResponse")
    public JAXBElement<DeposerResponse> createDeposerResponse(DeposerResponse value) {
        return new JAXBElement<DeposerResponse>(_DeposerResponse_QNAME, DeposerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://banque.me.org/", name = "deposer")
    public JAXBElement<Deposer> createDeposer(Deposer value) {
        return new JAXBElement<Deposer>(_Deposer_QNAME, Deposer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://banque.me.org/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://banque.me.org/", name = "retirerResponse")
    public JAXBElement<RetirerResponse> createRetirerResponse(RetirerResponse value) {
        return new JAXBElement<RetirerResponse>(_RetirerResponse_QNAME, RetirerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retirer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://banque.me.org/", name = "retirer")
    public JAXBElement<Retirer> createRetirer(Retirer value) {
        return new JAXBElement<Retirer>(_Retirer_QNAME, Retirer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://banque.me.org/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSolde }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://banque.me.org/", name = "getSolde")
    public JAXBElement<GetSolde> createGetSolde(GetSolde value) {
        return new JAXBElement<GetSolde>(_GetSolde_QNAME, GetSolde.class, null, value);
    }

}
