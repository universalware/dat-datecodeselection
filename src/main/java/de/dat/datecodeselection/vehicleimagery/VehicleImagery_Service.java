
package de.dat.datecodeselection.vehicleimagery;

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
@WebServiceClient(name = "VehicleImagery", targetNamespace = "http://sphinx.dat.de/services/VehicleImagery", wsdlLocation = "http://www.dat.de/DATECodeSelection/services/VehicleImagery?wsdl")
public class VehicleImagery_Service
    extends Service
{

    private final static URL VEHICLEIMAGERY_WSDL_LOCATION;
    private final static WebServiceException VEHICLEIMAGERY_EXCEPTION;
    private final static QName VEHICLEIMAGERY_QNAME = new QName("http://sphinx.dat.de/services/VehicleImagery", "VehicleImagery");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.dat.de/DATECodeSelection/services/VehicleImagery?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VEHICLEIMAGERY_WSDL_LOCATION = url;
        VEHICLEIMAGERY_EXCEPTION = e;
    }

    public VehicleImagery_Service() {
        super(__getWsdlLocation(), VEHICLEIMAGERY_QNAME);
    }

    public VehicleImagery_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), VEHICLEIMAGERY_QNAME, features);
    }

    public VehicleImagery_Service(URL wsdlLocation) {
        super(wsdlLocation, VEHICLEIMAGERY_QNAME);
    }

    public VehicleImagery_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VEHICLEIMAGERY_QNAME, features);
    }

    public VehicleImagery_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VehicleImagery_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VehicleImagery
     */
    @WebEndpoint(name = "VehicleImageryPort")
    public VehicleImagery getVehicleImageryPort() {
        return super.getPort(new QName("http://sphinx.dat.de/services/VehicleImagery", "VehicleImageryPort"), VehicleImagery.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleImagery
     */
    @WebEndpoint(name = "VehicleImageryPort")
    public VehicleImagery getVehicleImageryPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sphinx.dat.de/services/VehicleImagery", "VehicleImageryPort"), VehicleImagery.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VEHICLEIMAGERY_EXCEPTION!= null) {
            throw VEHICLEIMAGERY_EXCEPTION;
        }
        return VEHICLEIMAGERY_WSDL_LOCATION;
    }

}
