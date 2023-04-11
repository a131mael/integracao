/**
 * ProtocoloConsultar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class ProtocoloConsultar  implements java.io.Serializable {
    private java.lang.String dataProtocolo;

    private java.lang.String codigoCartorio;

    private java.lang.String protocoloCartorio;

    public ProtocoloConsultar() {
    }

    public ProtocoloConsultar(
           java.lang.String dataProtocolo,
           java.lang.String codigoCartorio,
           java.lang.String protocoloCartorio) {
           this.dataProtocolo = dataProtocolo;
           this.codigoCartorio = codigoCartorio;
           this.protocoloCartorio = protocoloCartorio;
    }


    /**
     * Gets the dataProtocolo value for this ProtocoloConsultar.
     * 
     * @return dataProtocolo
     */
    public java.lang.String getDataProtocolo() {
        return dataProtocolo;
    }


    /**
     * Sets the dataProtocolo value for this ProtocoloConsultar.
     * 
     * @param dataProtocolo
     */
    public void setDataProtocolo(java.lang.String dataProtocolo) {
        this.dataProtocolo = dataProtocolo;
    }


    /**
     * Gets the codigoCartorio value for this ProtocoloConsultar.
     * 
     * @return codigoCartorio
     */
    public java.lang.String getCodigoCartorio() {
        return codigoCartorio;
    }


    /**
     * Sets the codigoCartorio value for this ProtocoloConsultar.
     * 
     * @param codigoCartorio
     */
    public void setCodigoCartorio(java.lang.String codigoCartorio) {
        this.codigoCartorio = codigoCartorio;
    }


    /**
     * Gets the protocoloCartorio value for this ProtocoloConsultar.
     * 
     * @return protocoloCartorio
     */
    public java.lang.String getProtocoloCartorio() {
        return protocoloCartorio;
    }


    /**
     * Sets the protocoloCartorio value for this ProtocoloConsultar.
     * 
     * @param protocoloCartorio
     */
    public void setProtocoloCartorio(java.lang.String protocoloCartorio) {
        this.protocoloCartorio = protocoloCartorio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProtocoloConsultar)) return false;
        ProtocoloConsultar other = (ProtocoloConsultar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataProtocolo==null && other.getDataProtocolo()==null) || 
             (this.dataProtocolo!=null &&
              this.dataProtocolo.equals(other.getDataProtocolo()))) &&
            ((this.codigoCartorio==null && other.getCodigoCartorio()==null) || 
             (this.codigoCartorio!=null &&
              this.codigoCartorio.equals(other.getCodigoCartorio()))) &&
            ((this.protocoloCartorio==null && other.getProtocoloCartorio()==null) || 
             (this.protocoloCartorio!=null &&
              this.protocoloCartorio.equals(other.getProtocoloCartorio())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDataProtocolo() != null) {
            _hashCode += getDataProtocolo().hashCode();
        }
        if (getCodigoCartorio() != null) {
            _hashCode += getCodigoCartorio().hashCode();
        }
        if (getProtocoloCartorio() != null) {
            _hashCode += getProtocoloCartorio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProtocoloConsultar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "protocolo-consultar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataProtocolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataProtocolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCartorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoCartorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocoloCartorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocoloCartorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
