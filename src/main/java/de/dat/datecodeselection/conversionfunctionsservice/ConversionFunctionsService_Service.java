
package de.dat.datecodeselection.conversionfunctionsservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ConversionFunctionsService", targetNamespace = "http://sphinx.dat.de/services/ConversionFunctionsService", wsdlLocation = "http://www.dat.de/DATECodeSelection/services/ConversionFunctionsService?wsdl")
public class ConversionFunctionsService_Service
    extends Service
{

    private final static URL CONVERSIONFUNCTIONSSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONVERSIONFUNCTIONSSERVICE_EXCEPTION;
    private final static QName CONVERSIONFUNCTIONSSERVICE_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "ConversionFunctionsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.dat.de/DATECodeSelection/services/ConversionFunctionsService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONVERSIONFUNCTIONSSERVICE_WSDL_LOCATION = url;
        CONVERSIONFUNCTIONSSERVICE_EXCEPTION = e;
    }

    public ConversionFunctionsService_Service() {
        super(__getWsdlLocation(), CONVERSIONFUNCTIONSSERVICE_QNAME);
    }

    public ConversionFunctionsService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONVERSIONFUNCTIONSSERVICE_QNAME, features);
    }

    public ConversionFunctionsService_Service(URL wsdlLocation) {
        super(wsdlLocation, CONVERSIONFUNCTIONSSERVICE_QNAME);
    }

    public ConversionFunctionsService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONVERSIONFUNCTIONSSERVICE_QNAME, features);
    }

    public ConversionFunctionsService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConversionFunctionsService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ConversionFunctionsService
     */
    @WebEndpoint(name = "ConversionFunctionsServicePort")
    public ConversionFunctionsService getConversionFunctionsServicePort() {
        return super.getPort(new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "ConversionFunctionsServicePort"), ConversionFunctionsService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConversionFunctionsService
     */
    @WebEndpoint(name = "ConversionFunctionsServicePort")
    public ConversionFunctionsService getConversionFunctionsServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "ConversionFunctionsServicePort"), ConversionFunctionsService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONVERSIONFUNCTIONSSERVICE_EXCEPTION!= null) {
            throw CONVERSIONFUNCTIONSSERVICE_EXCEPTION;
        }
        return CONVERSIONFUNCTIONSSERVICE_WSDL_LOCATION;
    }

}
