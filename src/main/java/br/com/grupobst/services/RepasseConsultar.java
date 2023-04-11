/**
 * RepasseConsultar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class RepasseConsultar  implements java.io.Serializable {
    private java.lang.String dataRepasse;

    private java.lang.Double valorRepasse;

    public RepasseConsultar() {
    }

    public RepasseConsultar(
           java.lang.String dataRepasse,
           java.lang.Double valorRepasse) {
           this.dataRepasse = dataRepasse;
           this.valorRepasse = valorRepasse;
    }


    /**
     * Gets the dataRepasse value for this RepasseConsultar.
     * 
     * @return dataRepasse
     */
    public java.lang.String getDataRepasse() {
        return dataRepasse;
    }


    /**
     * Sets the dataRepasse value for this RepasseConsultar.
     * 
     * @param dataRepasse
     */
    public void setDataRepasse(java.lang.String dataRepasse) {
        this.dataRepasse = dataRepasse;
    }


    /**
     * Gets the valorRepasse value for this RepasseConsultar.
     * 
     * @return valorRepasse
     */
    public java.lang.Double getValorRepasse() {
        return valorRepasse;
    }


    /**
     * Sets the valorRepasse value for this RepasseConsultar.
     * 
     * @param valorRepasse
     */
    public void setValorRepasse(java.lang.Double valorRepasse) {
        this.valorRepasse = valorRepasse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RepasseConsultar)) return false;
        RepasseConsultar other = (RepasseConsultar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataRepasse==null && other.getDataRepasse()==null) || 
             (this.dataRepasse!=null &&
              this.dataRepasse.equals(other.getDataRepasse()))) &&
            ((this.valorRepasse==null && other.getValorRepasse()==null) || 
             (this.valorRepasse!=null &&
              this.valorRepasse.equals(other.getValorRepasse())));
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
        if (getDataRepasse() != null) {
            _hashCode += getDataRepasse().hashCode();
        }
        if (getValorRepasse() != null) {
            _hashCode += getValorRepasse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RepasseConsultar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "repasse-consultar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataRepasse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataRepasse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorRepasse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorRepasse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
