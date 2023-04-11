/**
 * MovimentoConsultar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class MovimentoConsultar  implements java.io.Serializable {
    private java.lang.String completa;

    private java.lang.String data;

    private br.com.grupobst.services.TipoMovimento[] status;

    public MovimentoConsultar() {
    }

    public MovimentoConsultar(
           java.lang.String completa,
           java.lang.String data,
           br.com.grupobst.services.TipoMovimento[] status) {
           this.completa = completa;
           this.data = data;
           this.status = status;
    }


    /**
     * Gets the completa value for this MovimentoConsultar.
     * 
     * @return completa
     */
    public java.lang.String getCompleta() {
        return completa;
    }


    /**
     * Sets the completa value for this MovimentoConsultar.
     * 
     * @param completa
     */
    public void setCompleta(java.lang.String completa) {
        this.completa = completa;
    }


    /**
     * Gets the data value for this MovimentoConsultar.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this MovimentoConsultar.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the status value for this MovimentoConsultar.
     * 
     * @return status
     */
    public br.com.grupobst.services.TipoMovimento[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this MovimentoConsultar.
     * 
     * @param status
     */
    public void setStatus(br.com.grupobst.services.TipoMovimento[] status) {
        this.status = status;
    }

    public br.com.grupobst.services.TipoMovimento getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, br.com.grupobst.services.TipoMovimento _value) {
        this.status[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MovimentoConsultar)) return false;
        MovimentoConsultar other = (MovimentoConsultar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.completa==null && other.getCompleta()==null) || 
             (this.completa!=null &&
              this.completa.equals(other.getCompleta()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus())));
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
        if (getCompleta() != null) {
            _hashCode += getCompleta().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MovimentoConsultar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "movimento-consultar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "completa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "tipoMovimento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
