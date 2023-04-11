/**
 * Services.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public interface Services extends javax.xml.rpc.Service {
    public java.lang.String getProtestoPortAddress();

    public br.com.grupobst.services.ProtestoInterface getProtestoPort() throws javax.xml.rpc.ServiceException;

    public br.com.grupobst.services.ProtestoInterface getProtestoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
