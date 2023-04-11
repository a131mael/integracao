/**
 * DividaEnviar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class DividaEnviar  implements java.io.Serializable {
    private java.lang.String especie;

    private java.lang.String numero;

    private java.lang.String nossoNumero;

    private java.lang.String valor;

    private java.lang.String saldo;

    private java.lang.String tipoEndosso;

    private java.lang.String aceite;

    private java.lang.String finsFalimentares;

    private java.lang.String declaracaoPortador;

    private java.lang.String emissao;

    private java.lang.String vencimento;

    private br.com.grupobst.services.DocumentoEnviar[] documento;

    private br.com.grupobst.services.XmlPlanilha planilha;

    private java.lang.String pracaManual;

    private java.lang.String anotacao;

    public DividaEnviar() {
    }

    public DividaEnviar(
           java.lang.String especie,
           java.lang.String numero,
           java.lang.String nossoNumero,
           java.lang.String valor,
           java.lang.String saldo,
           java.lang.String tipoEndosso,
           java.lang.String aceite,
           java.lang.String finsFalimentares,
           java.lang.String declaracaoPortador,
           java.lang.String emissao,
           java.lang.String vencimento,
           br.com.grupobst.services.DocumentoEnviar[] documento,
           br.com.grupobst.services.XmlPlanilha planilha,
           java.lang.String pracaManual,
           java.lang.String anotacao) {
           this.especie = especie;
           this.numero = numero;
           this.nossoNumero = nossoNumero;
           this.valor = valor;
           this.saldo = saldo;
           this.tipoEndosso = tipoEndosso;
           this.aceite = aceite;
           this.finsFalimentares = finsFalimentares;
           this.declaracaoPortador = declaracaoPortador;
           this.emissao = emissao;
           this.vencimento = vencimento;
           this.documento = documento;
           this.planilha = planilha;
           this.pracaManual = pracaManual;
           this.anotacao = anotacao;
    }


    /**
     * Gets the especie value for this DividaEnviar.
     * 
     * @return especie
     */
    public java.lang.String getEspecie() {
        return especie;
    }


    /**
     * Sets the especie value for this DividaEnviar.
     * 
     * @param especie
     */
    public void setEspecie(java.lang.String especie) {
        this.especie = especie;
    }


    /**
     * Gets the numero value for this DividaEnviar.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this DividaEnviar.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the nossoNumero value for this DividaEnviar.
     * 
     * @return nossoNumero
     */
    public java.lang.String getNossoNumero() {
        return nossoNumero;
    }


    /**
     * Sets the nossoNumero value for this DividaEnviar.
     * 
     * @param nossoNumero
     */
    public void setNossoNumero(java.lang.String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }


    /**
     * Gets the valor value for this DividaEnviar.
     * 
     * @return valor
     */
    public java.lang.String getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this DividaEnviar.
     * 
     * @param valor
     */
    public void setValor(java.lang.String valor) {
        this.valor = valor;
    }


    /**
     * Gets the saldo value for this DividaEnviar.
     * 
     * @return saldo
     */
    public java.lang.String getSaldo() {
        return saldo;
    }


    /**
     * Sets the saldo value for this DividaEnviar.
     * 
     * @param saldo
     */
    public void setSaldo(java.lang.String saldo) {
        this.saldo = saldo;
    }


    /**
     * Gets the tipoEndosso value for this DividaEnviar.
     * 
     * @return tipoEndosso
     */
    public java.lang.String getTipoEndosso() {
        return tipoEndosso;
    }


    /**
     * Sets the tipoEndosso value for this DividaEnviar.
     * 
     * @param tipoEndosso
     */
    public void setTipoEndosso(java.lang.String tipoEndosso) {
        this.tipoEndosso = tipoEndosso;
    }


    /**
     * Gets the aceite value for this DividaEnviar.
     * 
     * @return aceite
     */
    public java.lang.String getAceite() {
        return aceite;
    }


    /**
     * Sets the aceite value for this DividaEnviar.
     * 
     * @param aceite
     */
    public void setAceite(java.lang.String aceite) {
        this.aceite = aceite;
    }


    /**
     * Gets the finsFalimentares value for this DividaEnviar.
     * 
     * @return finsFalimentares
     */
    public java.lang.String getFinsFalimentares() {
        return finsFalimentares;
    }


    /**
     * Sets the finsFalimentares value for this DividaEnviar.
     * 
     * @param finsFalimentares
     */
    public void setFinsFalimentares(java.lang.String finsFalimentares) {
        this.finsFalimentares = finsFalimentares;
    }


    /**
     * Gets the declaracaoPortador value for this DividaEnviar.
     * 
     * @return declaracaoPortador
     */
    public java.lang.String getDeclaracaoPortador() {
        return declaracaoPortador;
    }


    /**
     * Sets the declaracaoPortador value for this DividaEnviar.
     * 
     * @param declaracaoPortador
     */
    public void setDeclaracaoPortador(java.lang.String declaracaoPortador) {
        this.declaracaoPortador = declaracaoPortador;
    }


    /**
     * Gets the emissao value for this DividaEnviar.
     * 
     * @return emissao
     */
    public java.lang.String getEmissao() {
        return emissao;
    }


    /**
     * Sets the emissao value for this DividaEnviar.
     * 
     * @param emissao
     */
    public void setEmissao(java.lang.String emissao) {
        this.emissao = emissao;
    }


    /**
     * Gets the vencimento value for this DividaEnviar.
     * 
     * @return vencimento
     */
    public java.lang.String getVencimento() {
        return vencimento;
    }


    /**
     * Sets the vencimento value for this DividaEnviar.
     * 
     * @param vencimento
     */
    public void setVencimento(java.lang.String vencimento) {
        this.vencimento = vencimento;
    }


    /**
     * Gets the documento value for this DividaEnviar.
     * 
     * @return documento
     */
    public br.com.grupobst.services.DocumentoEnviar[] getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this DividaEnviar.
     * 
     * @param documento
     */
    public void setDocumento(br.com.grupobst.services.DocumentoEnviar[] documento) {
        this.documento = documento;
    }

    public br.com.grupobst.services.DocumentoEnviar getDocumento(int i) {
        return this.documento[i];
    }

    public void setDocumento(int i, br.com.grupobst.services.DocumentoEnviar _value) {
        this.documento[i] = _value;
    }


    /**
     * Gets the planilha value for this DividaEnviar.
     * 
     * @return planilha
     */
    public br.com.grupobst.services.XmlPlanilha getPlanilha() {
        return planilha;
    }


    /**
     * Sets the planilha value for this DividaEnviar.
     * 
     * @param planilha
     */
    public void setPlanilha(br.com.grupobst.services.XmlPlanilha planilha) {
        this.planilha = planilha;
    }


    /**
     * Gets the pracaManual value for this DividaEnviar.
     * 
     * @return pracaManual
     */
    public java.lang.String getPracaManual() {
        return pracaManual;
    }


    /**
     * Sets the pracaManual value for this DividaEnviar.
     * 
     * @param pracaManual
     */
    public void setPracaManual(java.lang.String pracaManual) {
        this.pracaManual = pracaManual;
    }


    /**
     * Gets the anotacao value for this DividaEnviar.
     * 
     * @return anotacao
     */
    public java.lang.String getAnotacao() {
        return anotacao;
    }


    /**
     * Sets the anotacao value for this DividaEnviar.
     * 
     * @param anotacao
     */
    public void setAnotacao(java.lang.String anotacao) {
        this.anotacao = anotacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DividaEnviar)) return false;
        DividaEnviar other = (DividaEnviar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.especie==null && other.getEspecie()==null) || 
             (this.especie!=null &&
              this.especie.equals(other.getEspecie()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.nossoNumero==null && other.getNossoNumero()==null) || 
             (this.nossoNumero!=null &&
              this.nossoNumero.equals(other.getNossoNumero()))) &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor()))) &&
            ((this.saldo==null && other.getSaldo()==null) || 
             (this.saldo!=null &&
              this.saldo.equals(other.getSaldo()))) &&
            ((this.tipoEndosso==null && other.getTipoEndosso()==null) || 
             (this.tipoEndosso!=null &&
              this.tipoEndosso.equals(other.getTipoEndosso()))) &&
            ((this.aceite==null && other.getAceite()==null) || 
             (this.aceite!=null &&
              this.aceite.equals(other.getAceite()))) &&
            ((this.finsFalimentares==null && other.getFinsFalimentares()==null) || 
             (this.finsFalimentares!=null &&
              this.finsFalimentares.equals(other.getFinsFalimentares()))) &&
            ((this.declaracaoPortador==null && other.getDeclaracaoPortador()==null) || 
             (this.declaracaoPortador!=null &&
              this.declaracaoPortador.equals(other.getDeclaracaoPortador()))) &&
            ((this.emissao==null && other.getEmissao()==null) || 
             (this.emissao!=null &&
              this.emissao.equals(other.getEmissao()))) &&
            ((this.vencimento==null && other.getVencimento()==null) || 
             (this.vencimento!=null &&
              this.vencimento.equals(other.getVencimento()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              java.util.Arrays.equals(this.documento, other.getDocumento()))) &&
            ((this.planilha==null && other.getPlanilha()==null) || 
             (this.planilha!=null &&
              this.planilha.equals(other.getPlanilha()))) &&
            ((this.pracaManual==null && other.getPracaManual()==null) || 
             (this.pracaManual!=null &&
              this.pracaManual.equals(other.getPracaManual()))) &&
            ((this.anotacao==null && other.getAnotacao()==null) || 
             (this.anotacao!=null &&
              this.anotacao.equals(other.getAnotacao())));
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
        if (getEspecie() != null) {
            _hashCode += getEspecie().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getNossoNumero() != null) {
            _hashCode += getNossoNumero().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        if (getSaldo() != null) {
            _hashCode += getSaldo().hashCode();
        }
        if (getTipoEndosso() != null) {
            _hashCode += getTipoEndosso().hashCode();
        }
        if (getAceite() != null) {
            _hashCode += getAceite().hashCode();
        }
        if (getFinsFalimentares() != null) {
            _hashCode += getFinsFalimentares().hashCode();
        }
        if (getDeclaracaoPortador() != null) {
            _hashCode += getDeclaracaoPortador().hashCode();
        }
        if (getEmissao() != null) {
            _hashCode += getEmissao().hashCode();
        }
        if (getVencimento() != null) {
            _hashCode += getVencimento().hashCode();
        }
        if (getDocumento() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumento());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumento(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlanilha() != null) {
            _hashCode += getPlanilha().hashCode();
        }
        if (getPracaManual() != null) {
            _hashCode += getPracaManual().hashCode();
        }
        if (getAnotacao() != null) {
            _hashCode += getAnotacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DividaEnviar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "divida-enviar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("especie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "especie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("tipoEndosso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoEndosso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aceite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aceite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finsFalimentares");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finsFalimentares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declaracaoPortador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "declaracaoPortador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emissao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emissao"));
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
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "documento-enviar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planilha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "planilha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "xmlPlanilha"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pracaManual");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pracaManual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anotacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anotacao"));
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
