/**
 * MovimentoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class MovimentoResponse  implements java.io.Serializable {
    private int total;

    private java.lang.String data;

    private br.com.grupobst.services.MovimentoTitulo[] titulo;

    private br.com.grupobst.services.StatusResponse resposta;

    public MovimentoResponse() {
    }

    public MovimentoResponse(
           int total,
           java.lang.String data,
           br.com.grupobst.services.MovimentoTitulo[] titulo,
           br.com.grupobst.services.StatusResponse resposta) {
           this.total = total;
           this.data = data;
           this.titulo = titulo;
           this.resposta = resposta;
    }


    /**
     * Gets the total value for this MovimentoResponse.
     * 
     * @return total
     */
    public int getTotal() {
        return total;
    }


    /**
     * Sets the total value for this MovimentoResponse.
     * 
     * @param total
     */
    public void setTotal(int total) {
        this.total = total;
    }


    /**
     * Gets the data value for this MovimentoResponse.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this MovimentoResponse.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the titulo value for this MovimentoResponse.
     * 
     * @return titulo
     */
    public br.com.grupobst.services.MovimentoTitulo[] getTitulo() {
        return titulo;
    }


    /**
     * Sets the titulo value for this MovimentoResponse.
     * 
     * @param titulo
     */
    public void setTitulo(br.com.grupobst.services.MovimentoTitulo[] titulo) {
        this.titulo = titulo;
    }

    public br.com.grupobst.services.MovimentoTitulo getTitulo(int i) {
        return this.titulo[i];
    }

    public void setTitulo(int i, br.com.grupobst.services.MovimentoTitulo _value) {
        this.titulo[i] = _value;
    }


    /**
     * Gets the resposta value for this MovimentoResponse.
     * 
     * @return resposta
     */
    public br.com.grupobst.services.StatusResponse getResposta() {
        return resposta;
    }


    /**
     * Sets the resposta value for this MovimentoResponse.
     * 
     * @param resposta
     */
    public void setResposta(br.com.grupobst.services.StatusResponse resposta) {
        this.resposta = resposta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MovimentoResponse)) return false;
        MovimentoResponse other = (MovimentoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.total == other.getTotal() &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.titulo==null && other.getTitulo()==null) || 
             (this.titulo!=null &&
              java.util.Arrays.equals(this.titulo, other.getTitulo()))) &&
            ((this.resposta==null && other.getResposta()==null) || 
             (this.resposta!=null &&
              this.resposta.equals(other.getResposta())));
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
        _hashCode += getTotal();
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getTitulo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitulo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitulo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResposta() != null) {
            _hashCode += getResposta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MovimentoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "movimentoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titulo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "movimentoTitulo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resposta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resposta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "statusResponse"));
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
