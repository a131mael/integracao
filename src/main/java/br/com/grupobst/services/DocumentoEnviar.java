/**
 * DocumentoEnviar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class DocumentoEnviar  implements java.io.Serializable {
    private java.lang.String extensao;

    private java.lang.String documentoBase64;

    public DocumentoEnviar() {
    }

    public DocumentoEnviar(
           java.lang.String extensao,
           java.lang.String documentoBase64) {
           this.extensao = extensao;
           this.documentoBase64 = documentoBase64;
    }


    /**
     * Gets the extensao value for this DocumentoEnviar.
     * 
     * @return extensao
     */
    public java.lang.String getExtensao() {
        return extensao;
    }


    /**
     * Sets the extensao value for this DocumentoEnviar.
     * 
     * @param extensao
     */
    public void setExtensao(java.lang.String extensao) {
        this.extensao = extensao;
    }


    /**
     * Gets the documentoBase64 value for this DocumentoEnviar.
     * 
     * @return documentoBase64
     */
    public java.lang.String getDocumentoBase64() {
        return documentoBase64;
    }


    /**
     * Sets the documentoBase64 value for this DocumentoEnviar.
     * 
     * @param documentoBase64
     */
    public void setDocumentoBase64(java.lang.String documentoBase64) {
        this.documentoBase64 = documentoBase64;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentoEnviar)) return false;
        DocumentoEnviar other = (DocumentoEnviar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extensao==null && other.getExtensao()==null) || 
             (this.extensao!=null &&
              this.extensao.equals(other.getExtensao()))) &&
            ((this.documentoBase64==null && other.getDocumentoBase64()==null) || 
             (this.documentoBase64!=null &&
              this.documentoBase64.equals(other.getDocumentoBase64())));
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
        if (getExtensao() != null) {
            _hashCode += getExtensao().hashCode();
        }
        if (getDocumentoBase64() != null) {
            _hashCode += getDocumentoBase64().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentoEnviar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "documento-enviar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extensao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoBase64");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentoBase64"));
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
