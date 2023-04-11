/**
 * CartorioOperacaoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class CartorioOperacaoRequest  implements java.io.Serializable {
    private java.lang.String protocolo;

    private java.lang.String dataProtocolo;

    public CartorioOperacaoRequest() {
    }

    public CartorioOperacaoRequest(
           java.lang.String protocolo,
           java.lang.String dataProtocolo) {
           this.protocolo = protocolo;
           this.dataProtocolo = dataProtocolo;
    }


    /**
     * Gets the protocolo value for this CartorioOperacaoRequest.
     * 
     * @return protocolo
     */
    public java.lang.String getProtocolo() {
        return protocolo;
    }


    /**
     * Sets the protocolo value for this CartorioOperacaoRequest.
     * 
     * @param protocolo
     */
    public void setProtocolo(java.lang.String protocolo) {
        this.protocolo = protocolo;
    }


    /**
     * Gets the dataProtocolo value for this CartorioOperacaoRequest.
     * 
     * @return dataProtocolo
     */
    public java.lang.String getDataProtocolo() {
        return dataProtocolo;
    }


    /**
     * Sets the dataProtocolo value for this CartorioOperacaoRequest.
     * 
     * @param dataProtocolo
     */
    public void setDataProtocolo(java.lang.String dataProtocolo) {
        this.dataProtocolo = dataProtocolo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CartorioOperacaoRequest)) return false;
        CartorioOperacaoRequest other = (CartorioOperacaoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.protocolo==null && other.getProtocolo()==null) || 
             (this.protocolo!=null &&
              this.protocolo.equals(other.getProtocolo()))) &&
            ((this.dataProtocolo==null && other.getDataProtocolo()==null) || 
             (this.dataProtocolo!=null &&
              this.dataProtocolo.equals(other.getDataProtocolo())));
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
        if (getProtocolo() != null) {
            _hashCode += getProtocolo().hashCode();
        }
        if (getDataProtocolo() != null) {
            _hashCode += getDataProtocolo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CartorioOperacaoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "cartorio-operacao-request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataProtocolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataProtocolo"));
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
