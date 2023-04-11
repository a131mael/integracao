/**
 * DividaMovimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class DividaMovimento  implements java.io.Serializable {
    private java.lang.String numero;

    private java.lang.String nossoNumero;

    private java.lang.String especie;

    private java.lang.String vencimento;

    private java.lang.String emissao;

    private java.lang.String praca;

    public DividaMovimento() {
    }

    public DividaMovimento(
           java.lang.String numero,
           java.lang.String nossoNumero,
           java.lang.String especie,
           java.lang.String vencimento,
           java.lang.String emissao,
           java.lang.String praca) {
           this.numero = numero;
           this.nossoNumero = nossoNumero;
           this.especie = especie;
           this.vencimento = vencimento;
           this.emissao = emissao;
           this.praca = praca;
    }


    /**
     * Gets the numero value for this DividaMovimento.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this DividaMovimento.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the nossoNumero value for this DividaMovimento.
     * 
     * @return nossoNumero
     */
    public java.lang.String getNossoNumero() {
        return nossoNumero;
    }


    /**
     * Sets the nossoNumero value for this DividaMovimento.
     * 
     * @param nossoNumero
     */
    public void setNossoNumero(java.lang.String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }


    /**
     * Gets the especie value for this DividaMovimento.
     * 
     * @return especie
     */
    public java.lang.String getEspecie() {
        return especie;
    }


    /**
     * Sets the especie value for this DividaMovimento.
     * 
     * @param especie
     */
    public void setEspecie(java.lang.String especie) {
        this.especie = especie;
    }


    /**
     * Gets the vencimento value for this DividaMovimento.
     * 
     * @return vencimento
     */
    public java.lang.String getVencimento() {
        return vencimento;
    }


    /**
     * Sets the vencimento value for this DividaMovimento.
     * 
     * @param vencimento
     */
    public void setVencimento(java.lang.String vencimento) {
        this.vencimento = vencimento;
    }


    /**
     * Gets the emissao value for this DividaMovimento.
     * 
     * @return emissao
     */
    public java.lang.String getEmissao() {
        return emissao;
    }


    /**
     * Sets the emissao value for this DividaMovimento.
     * 
     * @param emissao
     */
    public void setEmissao(java.lang.String emissao) {
        this.emissao = emissao;
    }


    /**
     * Gets the praca value for this DividaMovimento.
     * 
     * @return praca
     */
    public java.lang.String getPraca() {
        return praca;
    }


    /**
     * Sets the praca value for this DividaMovimento.
     * 
     * @param praca
     */
    public void setPraca(java.lang.String praca) {
        this.praca = praca;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DividaMovimento)) return false;
        DividaMovimento other = (DividaMovimento) obj;
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
            ((this.especie==null && other.getEspecie()==null) || 
             (this.especie!=null &&
              this.especie.equals(other.getEspecie()))) &&
            ((this.vencimento==null && other.getVencimento()==null) || 
             (this.vencimento!=null &&
              this.vencimento.equals(other.getVencimento()))) &&
            ((this.emissao==null && other.getEmissao()==null) || 
             (this.emissao!=null &&
              this.emissao.equals(other.getEmissao()))) &&
            ((this.praca==null && other.getPraca()==null) || 
             (this.praca!=null &&
              this.praca.equals(other.getPraca())));
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
        if (getEspecie() != null) {
            _hashCode += getEspecie().hashCode();
        }
        if (getVencimento() != null) {
            _hashCode += getVencimento().hashCode();
        }
        if (getEmissao() != null) {
            _hashCode += getEmissao().hashCode();
        }
        if (getPraca() != null) {
            _hashCode += getPraca().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DividaMovimento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "divida-movimento"));
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
        elemField.setFieldName("especie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "especie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("emissao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emissao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("praca");
        elemField.setXmlName(new javax.xml.namespace.QName("", "praca"));
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
