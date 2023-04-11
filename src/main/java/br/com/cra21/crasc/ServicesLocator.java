/**
 * ServicesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.cra21.crasc;

public class ServicesLocator extends org.apache.axis.client.Service implements br.com.cra21.crasc.Services {

    public ServicesLocator() {
    }


    public ServicesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServicesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProtestoNacionalPort
    private java.lang.String ProtestoNacionalPort_address = "https://cenprotsc.com.br/ieptb/services/ProtestoNacionalInterface";

    public java.lang.String getProtestoNacionalPortAddress() {
        return ProtestoNacionalPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProtestoNacionalPortWSDDServiceName = "ProtestoNacionalPort";

    public java.lang.String getProtestoNacionalPortWSDDServiceName() {
        return ProtestoNacionalPortWSDDServiceName;
    }

    public void setProtestoNacionalPortWSDDServiceName(java.lang.String name) {
        ProtestoNacionalPortWSDDServiceName = name;
    }

    public br.com.cra21.crasc.ProtestoNacionalInterface getProtestoNacionalPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProtestoNacionalPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProtestoNacionalPort(endpoint);
    }

    public br.com.cra21.crasc.ProtestoNacionalInterface getProtestoNacionalPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.cra21.crasc.ServicesSoapBindingStub _stub = new br.com.cra21.crasc.ServicesSoapBindingStub(portAddress, this);
            _stub.setPortName(getProtestoNacionalPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProtestoNacionalPortEndpointAddress(java.lang.String address) {
        ProtestoNacionalPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.cra21.crasc.ProtestoNacionalInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.cra21.crasc.ServicesSoapBindingStub _stub = new br.com.cra21.crasc.ServicesSoapBindingStub(new java.net.URL(ProtestoNacionalPort_address), this);
                _stub.setPortName(getProtestoNacionalPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ProtestoNacionalPort".equals(inputPortName)) {
            return getProtestoNacionalPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:crasc.cra21.com.br", "services");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:crasc.cra21.com.br", "ProtestoNacionalPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProtestoNacionalPort".equals(portName)) {
            setProtestoNacionalPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
