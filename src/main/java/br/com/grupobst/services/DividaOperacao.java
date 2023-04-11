/**
 * DividaOperacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class DividaOperacao  implements java.io.Serializable {
    private java.lang.String numero;

    private java.lang.String nossoNumero;

    private br.com.grupobst.services.DocumentoEnviar documento;

    private java.lang.String vencimento;

    private java.lang.String especie;

    public DividaOperacao() {
    }

    public DividaOperacao(
           java.lang.String numero,
           java.lang.String nossoNumero,
           br.com.grupobst.services.DocumentoEnviar documento,
           java.lang.String vencimento,
           java.lang.String especie) {
           this.numero = numero;
           this.nossoNumero = nossoNumero;
           this.documento = documento;
           this.vencimento = vencimento;
           this.especie = especie;
    }


    /**
     * Gets the numero value for this DividaOperacao.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this DividaOperacao.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the nossoNumero value for this DividaOperacao.
     * 
     * @return nossoNumero
     */
    public java.lang.String getNossoNumero() {
        return nossoNumero;
    }


    /**
     * Sets the nossoNumero value for this DividaOperacao.
     * 
     * @param nossoNumero
     */
    public void setNossoNumero(java.lang.String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }


    /**
     * Gets the documento value for this DividaOperacao.
     * 
     * @return documento
     */
    public br.com.grupobst.services.DocumentoEnviar getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this DividaOperacao.
     * 
     * @param documento
     */
    public void setDocumento(br.com.grupobst.services.DocumentoEnviar documento) {
        this.documento = documento;
    }


    /**
     * Gets the vencimento value for this DividaOperacao.
     * 
     * @return vencimento
     */
    public java.lang.String getVencimento() {
        return vencimento;
    }


    /**
     * Sets the vencimento value for this DividaOperacao.
     * 
     * @param vencimento
     */
    public void setVencimento(java.lang.String vencimento) {
        this.vencimento = vencimento;
    }


    /**
     * Gets the especie value for this DividaOperacao.
     * 
     * @return especie
     */
    public java.lang.String getEspecie() {
        return especie;
    }


    /**
     * Sets the especie value for this DividaOperacao.
     * 
     * @param especie
     */
    public void setEspecie(java.lang.String especie) {
        this.especie = especie;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DividaOperacao)) return false;
        DividaOperacao other = (DividaOperacao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.nossoNumero==null && other.getNossoNumero()==null) || 
             (this.nossoNumero!=null &&
              this.nossoNumero.equals(other.getNossoNumero()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              this.documento.equals(other.getDocumento()))) &&
            ((this.vencimento==null && other.getVencimento()==null) || 
             (this.vencimento!=null &&
              this.vencimento.equals(other.getVencimento()))) &&
            ((this.especie==null && other.getEspecie()==null) || 
             (this.especie!=null &&
              this.especie.equals(other.getEspecie())));
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
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getNossoNumero() != null) {
            _hashCode += getNossoNumero().hashCode();
        }
        if (getDocumento() != null) {
            _hashCode += getDocumento().hashCode();
        }
        if (getVencimento() != null) {
            _hashCode += getVencimento().hashCode();
        }
        if (getEspecie() != null) {
            _hashCode += getEspecie().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DividaOperacao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "divida-operacao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nossoNumero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nossoNumero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "documento-enviar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vencimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vencimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("especie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "especie"));
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
