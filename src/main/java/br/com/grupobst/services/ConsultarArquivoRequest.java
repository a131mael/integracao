/**
 * ConsultarArquivoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class ConsultarArquivoRequest  implements java.io.Serializable {
    private br.com.grupobst.services.TipoArquivo tipoArquivo;

    private java.lang.String dataArquivo;

    public ConsultarArquivoRequest() {
    }

    public ConsultarArquivoRequest(
           br.com.grupobst.services.TipoArquivo tipoArquivo,
           java.lang.String dataArquivo) {
           this.tipoArquivo = tipoArquivo;
           this.dataArquivo = dataArquivo;
    }


    /**
     * Gets the tipoArquivo value for this ConsultarArquivoRequest.
     * 
     * @return tipoArquivo
     */
    public br.com.grupobst.services.TipoArquivo getTipoArquivo() {
        return tipoArquivo;
    }


    /**
     * Sets the tipoArquivo value for this ConsultarArquivoRequest.
     * 
     * @param tipoArquivo
     */
    public void setTipoArquivo(br.com.grupobst.services.TipoArquivo tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }


    /**
     * Gets the dataArquivo value for this ConsultarArquivoRequest.
     * 
     * @return dataArquivo
     */
    public java.lang.String getDataArquivo() {
        return dataArquivo;
    }


    /**
     * Sets the dataArquivo value for this ConsultarArquivoRequest.
     * 
     * @param dataArquivo
     */
    public void setDataArquivo(java.lang.String dataArquivo) {
        this.dataArquivo = dataArquivo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarArquivoRequest)) return false;
        ConsultarArquivoRequest other = (ConsultarArquivoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoArquivo==null && other.getTipoArquivo()==null) || 
             (this.tipoArquivo!=null &&
              this.tipoArquivo.equals(other.getTipoArquivo()))) &&
            ((this.dataArquivo==null && other.getDataArquivo()==null) || 
             (this.dataArquivo!=null &&
              this.dataArquivo.equals(other.getDataArquivo())));
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
        if (getTipoArquivo() != null) {
            _hashCode += getTipoArquivo().hashCode();
        }
        if (getDataArquivo() != null) {
            _hashCode += getDataArquivo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarArquivoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "consultarArquivoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoArquivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoArquivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "tipoArquivo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataArquivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataArquivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
