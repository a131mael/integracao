/**
 * XmlCalculo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class XmlCalculo  implements java.io.Serializable {
    private java.lang.String parcela;

    private java.lang.String vencimento;

    private java.lang.String valor;

    private java.lang.String saldo;

    private java.lang.String juros;

    private java.lang.String multa;

    private java.lang.String mora;

    private java.lang.String observacao;

    public XmlCalculo() {
    }

    public XmlCalculo(
           java.lang.String parcela,
           java.lang.String vencimento,
           java.lang.String valor,
           java.lang.String saldo,
           java.lang.String juros,
           java.lang.String multa,
           java.lang.String mora,
           java.lang.String observacao) {
           this.parcela = parcela;
           this.vencimento = vencimento;
           this.valor = valor;
           this.saldo = saldo;
           this.juros = juros;
           this.multa = multa;
           this.mora = mora;
           this.observacao = observacao;
    }


    /**
     * Gets the parcela value for this XmlCalculo.
     * 
     * @return parcela
     */
    public java.lang.String getParcela() {
        return parcela;
    }


    /**
     * Sets the parcela value for this XmlCalculo.
     * 
     * @param parcela
     */
    public void setParcela(java.lang.String parcela) {
        this.parcela = parcela;
    }


    /**
     * Gets the vencimento value for this XmlCalculo.
     * 
     * @return vencimento
     */
    public java.lang.String getVencimento() {
        return vencimento;
    }


    /**
     * Sets the vencimento value for this XmlCalculo.
     * 
     * @param vencimento
     */
    public void setVencimento(java.lang.String vencimento) {
        this.vencimento = vencimento;
    }


    /**
     * Gets the valor value for this XmlCalculo.
     * 
     * @return valor
     */
    public java.lang.String getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this XmlCalculo.
     * 
     * @param valor
     */
    public void setValor(java.lang.String valor) {
        this.valor = valor;
    }


    /**
     * Gets the saldo value for this XmlCalculo.
     * 
     * @return saldo
     */
    public java.lang.String getSaldo() {
        return saldo;
    }


    /**
     * Sets the saldo value for this XmlCalculo.
     * 
     * @param saldo
     */
    public void setSaldo(java.lang.String saldo) {
        this.saldo = saldo;
    }


    /**
     * Gets the juros value for this XmlCalculo.
     * 
     * @return juros
     */
    public java.lang.String getJuros() {
        return juros;
    }


    /**
     * Sets the juros value for this XmlCalculo.
     * 
     * @param juros
     */
    public void setJuros(java.lang.String juros) {
        this.juros = juros;
    }


    /**
     * Gets the multa value for this XmlCalculo.
     * 
     * @return multa
     */
    public java.lang.String getMulta() {
        return multa;
    }


    /**
     * Sets the multa value for this XmlCalculo.
     * 
     * @param multa
     */
    public void setMulta(java.lang.String multa) {
        this.multa = multa;
    }


    /**
     * Gets the mora value for this XmlCalculo.
     * 
     * @return mora
     */
    public java.lang.String getMora() {
        return mora;
    }


    /**
     * Sets the mora value for this XmlCalculo.
     * 
     * @param mora
     */
    public void setMora(java.lang.String mora) {
        this.mora = mora;
    }


    /**
     * Gets the observacao value for this XmlCalculo.
     * 
     * @return observacao
     */
    public java.lang.String getObservacao() {
        return observacao;
    }


    /**
     * Sets the observacao value for this XmlCalculo.
     * 
     * @param observacao
     */
    public void setObservacao(java.lang.String observacao) {
        this.observacao = observacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XmlCalculo)) return false;
        XmlCalculo other = (XmlCalculo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parcela==null && other.getParcela()==null) || 
             (this.parcela!=null &&
              this.parcela.equals(other.getParcela()))) &&
            ((this.vencimento==null && other.getVencimento()==null) || 
             (this.vencimento!=null &&
              this.vencimento.equals(other.getVencimento()))) &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor()))) &&
            ((this.saldo==null && other.getSaldo()==null) || 
             (this.saldo!=null &&
              this.saldo.equals(other.getSaldo()))) &&
            ((this.juros==null && other.getJuros()==null) || 
             (this.juros!=null &&
              this.juros.equals(other.getJuros()))) &&
            ((this.multa==null && other.getMulta()==null) || 
             (this.multa!=null &&
              this.multa.equals(other.getMulta()))) &&
            ((this.mora==null && other.getMora()==null) || 
             (this.mora!=null &&
              this.mora.equals(other.getMora()))) &&
            ((this.observacao==null && other.getObservacao()==null) || 
             (this.observacao!=null &&
              this.observacao.equals(other.getObservacao())));
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
        if (getParcela() != null) {
            _hashCode += getParcela().hashCode();
        }
        if (getVencimento() != null) {
            _hashCode += getVencimento().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        if (getSaldo() != null) {
            _hashCode += getSaldo().hashCode();
        }
        if (getJuros() != null) {
            _hashCode += getJuros().hashCode();
        }
        if (getMulta() != null) {
            _hashCode += getMulta().hashCode();
        }
        if (getMora() != null) {
            _hashCode += getMora().hashCode();
        }
        if (getObservacao() != null) {
            _hashCode += getObservacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XmlCalculo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "xmlCalculo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcela");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcela"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vencimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vencimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "saldo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "multa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "observacao"));
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
