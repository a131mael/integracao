/**
 * ServicesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class ServicesLocator extends org.apache.axis.client.Service implements br.com.grupobst.services.Services {

    public ServicesLocator() {
    }


    public ServicesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServicesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProtestoPort
    private java.lang.String ProtestoPort_address = "https://cenprotsc.com.br/ieptb/services/ProtestoInterface";

    public java.lang.String getProtestoPortAddress() {
        return ProtestoPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProtestoPortWSDDServiceName = "ProtestoPort";

    public java.lang.String getProtestoPortWSDDServiceName() {
        return ProtestoPortWSDDServiceName;
    }

    public void setProtestoPortWSDDServiceName(java.lang.String name) {
        ProtestoPortWSDDServiceName = name;
    }

    public br.com.grupobst.services.ProtestoInterface getProtestoPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProtestoPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProtestoPort(endpoint);
    }

    public br.com.grupobst.services.ProtestoInterface getProtestoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.grupobst.services.ServicesSoapBindingStub _stub = new br.com.grupobst.services.ServicesSoapBindingStub(portAddress, this);
            _stub.setPortName(getProtestoPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProtestoPortEndpointAddress(java.lang.String address) {
        ProtestoPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.grupobst.services.ProtestoInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.grupobst.services.ServicesSoapBindingStub _stub = new br.com.grupobst.services.ServicesSoapBindingStub(new java.net.URL(ProtestoPort_address), this);
                _stub.setPortName(getProtestoPortWSDDServiceName());
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
        if ("ProtestoPort".equals(inputPortName)) {
            return getProtestoPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://grupobst.com.br/services", "services");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://grupobst.com.br/services", "ProtestoPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProtestoPort".equals(portName)) {
            setProtestoPortEndpointAddress(address);
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
