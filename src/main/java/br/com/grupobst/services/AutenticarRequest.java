/**
 * AutenticarRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class AutenticarRequest  implements java.io.Serializable {
    private java.lang.String usuario;

    private java.lang.String senha;

    private java.lang.String apresentante;

    public AutenticarRequest() {
    }

    public AutenticarRequest(
           java.lang.String usuario,
           java.lang.String senha,
           java.lang.String apresentante) {
           this.usuario = usuario;
           this.senha = senha;
           this.apresentante = apresentante;
    }


    /**
     * Gets the usuario value for this AutenticarRequest.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this AutenticarRequest.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the senha value for this AutenticarRequest.
     * 
     * @return senha
     */
    public java.lang.String getSenha() {
        return senha;
    }


    /**
     * Sets the senha value for this AutenticarRequest.
     * 
     * @param senha
     */
    public void setSenha(java.lang.String senha) {
        this.senha = senha;
    }


    /**
     * Gets the apresentante value for this AutenticarRequest.
     * 
     * @return apresentante
     */
    public java.lang.String getApresentante() {
        return apresentante;
    }


    /**
     * Sets the apresentante value for this AutenticarRequest.
     * 
     * @param apresentante
     */
    public void setApresentante(java.lang.String apresentante) {
        this.apresentante = apresentante;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutenticarRequest)) return false;
        AutenticarRequest other = (AutenticarRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.senha==null && other.getSenha()==null) || 
             (this.senha!=null &&
              this.senha.equals(other.getSenha()))) &&
            ((this.apresentante==null && other.getApresentante()==null) || 
             (this.apresentante!=null &&
              this.apresentante.equals(other.getApresentante())));
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
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getSenha() != null) {
            _hashCode += getSenha().hashCode();
        }
        if (getApresentante() != null) {
            _hashCode += getApresentante().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutenticarRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "autenticarRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apresentante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apresentante"));
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
