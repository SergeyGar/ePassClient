
package com.example.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "BEPTGlobalService", targetNamespace = "http://globalservice.ws.bept.ids.by/", wsdlLocation = "http://www.epass.by:80/BEPTGlobalService?wsdl")
public class BEPTGlobalService
    extends Service
{

    private final static URL BEPTGLOBALSERVICE_WSDL_LOCATION;
    private final static WebServiceException BEPTGLOBALSERVICE_EXCEPTION;
    private final static QName BEPTGLOBALSERVICE_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "BEPTGlobalService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.epass.by:80/BEPTGlobalService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BEPTGLOBALSERVICE_WSDL_LOCATION = url;
        BEPTGLOBALSERVICE_EXCEPTION = e;
    }

    public BEPTGlobalService() {
        super(__getWsdlLocation(), BEPTGLOBALSERVICE_QNAME);
    }

    public BEPTGlobalService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BEPTGLOBALSERVICE_QNAME, features);
    }

    public BEPTGlobalService(URL wsdlLocation) {
        super(wsdlLocation, BEPTGLOBALSERVICE_QNAME);
    }

    public BEPTGlobalService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BEPTGLOBALSERVICE_QNAME, features);
    }

    public BEPTGlobalService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BEPTGlobalService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BEPTGlobal
     */
    @WebEndpoint(name = "BEPTGlobalPort")
    public BEPTGlobal getBEPTGlobalPort() {
        return super.getPort(new QName("http://globalservice.ws.bept.ids.by/", "BEPTGlobalPort"), BEPTGlobal.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BEPTGlobal
     */
    @WebEndpoint(name = "BEPTGlobalPort")
    public BEPTGlobal getBEPTGlobalPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://globalservice.ws.bept.ids.by/", "BEPTGlobalPort"), BEPTGlobal.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BEPTGLOBALSERVICE_EXCEPTION!= null) {
            throw BEPTGLOBALSERVICE_EXCEPTION;
        }
        return BEPTGLOBALSERVICE_WSDL_LOCATION;
    }

}
