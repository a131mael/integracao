/**
 * XmlSacador.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class XmlSacador  implements java.io.Serializable {
    private java.lang.String nome;

    private java.lang.String documentoTipo;

    private java.lang.String documento;

    private java.lang.String endereco;

    private java.lang.String numero;

    private java.lang.String complemento;

    private java.lang.String cep;

    private java.lang.String bairro;

    private java.lang.String municipio;

    private java.lang.String uf;

    private java.lang.String empresa;

    private java.lang.String filial;

    public XmlSacador() {
    }

    public XmlSacador(
           java.lang.String nome,
           java.lang.String documentoTipo,
           java.lang.String documento,
           java.lang.String endereco,
           java.lang.String numero,
           java.lang.String complemento,
           java.lang.String cep,
           java.lang.String bairro,
           java.lang.String municipio,
           java.lang.String uf,
           java.lang.String empresa,
           java.lang.String filial) {
           this.nome = nome;
           this.documentoTipo = documentoTipo;
           this.documento = documento;
           this.endereco = endereco;
           this.numero = numero;
           this.complemento = complemento;
           this.cep = cep;
           this.bairro = bairro;
           this.municipio = municipio;
           this.uf = uf;
           this.empresa = empresa;
           this.filial = filial;
    }


    /**
     * Gets the nome value for this XmlSacador.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this XmlSacador.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the documentoTipo value for this XmlSacador.
     * 
     * @return documentoTipo
     */
    public java.lang.String getDocumentoTipo() {
        return documentoTipo;
    }


    /**
     * Sets the documentoTipo value for this XmlSacador.
     * 
     * @param documentoTipo
     */
    public void setDocumentoTipo(java.lang.String documentoTipo) {
        this.documentoTipo = documentoTipo;
    }


    /**
     * Gets the documento value for this XmlSacador.
     * 
     * @return documento
     */
    public java.lang.String getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this XmlSacador.
     * 
     * @param documento
     */
    public void setDocumento(java.lang.String documento) {
        this.documento = documento;
    }


    /**
     * Gets the endereco value for this XmlSacador.
     * 
     * @return endereco
     */
    public java.lang.String getEndereco() {
        return endereco;
    }


    /**
     * Sets the endereco value for this XmlSacador.
     * 
     * @param endereco
     */
    public void setEndereco(java.lang.String endereco) {
        this.endereco = endereco;
    }


    /**
     * Gets the numero value for this XmlSacador.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this XmlSacador.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the complemento value for this XmlSacador.
     * 
     * @return complemento
     */
    public java.lang.String getComplemento() {
        return complemento;
    }


    /**
     * Sets the complemento value for this XmlSacador.
     * 
     * @param complemento
     */
    public void setComplemento(java.lang.String complemento) {
        this.complemento = complemento;
    }


    /**
     * Gets the cep value for this XmlSacador.
     * 
     * @return cep
     */
    public java.lang.String getCep() {
        return cep;
    }


    /**
     * Sets the cep value for this XmlSacador.
     * 
     * @param cep
     */
    public void setCep(java.lang.String cep) {
        this.cep = cep;
    }


    /**
     * Gets the bairro value for this XmlSacador.
     * 
     * @return bairro
     */
    public java.lang.String getBairro() {
        return bairro;
    }


    /**
     * Sets the bairro value for this XmlSacador.
     * 
     * @param bairro
     */
    public void setBairro(java.lang.String bairro) {
        this.bairro = bairro;
    }


    /**
     * Gets the municipio value for this XmlSacador.
     * 
     * @return municipio
     */
    public java.lang.String getMunicipio() {
        return municipio;
    }


    /**
     * Sets the municipio value for this XmlSacador.
     * 
     * @param municipio
     */
    public void setMunicipio(java.lang.String municipio) {
        this.municipio = municipio;
    }


    /**
     * Gets the uf value for this XmlSacador.
     * 
     * @return uf
     */
    public java.lang.String getUf() {
        return uf;
    }


    /**
     * Sets the uf value for this XmlSacador.
     * 
     * @param uf
     */
    public void setUf(java.lang.String uf) {
        this.uf = uf;
    }


    /**
     * Gets the empresa value for this XmlSacador.
     * 
     * @return empresa
     */
    public java.lang.String getEmpresa() {
        return empresa;
    }


    /**
     * Sets the empresa value for this XmlSacador.
     * 
     * @param empresa
     */
    public void setEmpresa(java.lang.String empresa) {
        this.empresa = empresa;
    }


    /**
     * Gets the filial value for this XmlSacador.
     * 
     * @return filial
     */
    public java.lang.String getFilial() {
        return filial;
    }


    /**
     * Sets the filial value for this XmlSacador.
     * 
     * @param filial
     */
    public void setFilial(java.lang.String filial) {
        this.filial = filial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XmlSacador)) return false;
        XmlSacador other = (XmlSacador) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.documentoTipo==null && other.getDocumentoTipo()==null) || 
             (this.documentoTipo!=null &&
              this.documentoTipo.equals(other.getDocumentoTipo()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              this.documento.equals(other.getDocumento()))) &&
            ((this.endereco==null && other.getEndereco()==null) || 
             (this.endereco!=null &&
              this.endereco.equals(other.getEndereco()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.complemento==null && other.getComplemento()==null) || 
             (this.complemento!=null &&
              this.complemento.equals(other.getComplemento()))) &&
            ((this.cep==null && other.getCep()==null) || 
             (this.cep!=null &&
              this.cep.equals(other.getCep()))) &&
            ((this.bairro==null && other.getBairro()==null) || 
             (this.bairro!=null &&
              this.bairro.equals(other.getBairro()))) &&
            ((this.municipio==null && other.getMunicipio()==null) || 
             (this.municipio!=null &&
              this.municipio.equals(other.getMunicipio()))) &&
            ((this.uf==null && other.getUf()==null) || 
             (this.uf!=null &&
              this.uf.equals(other.getUf()))) &&
            ((this.empresa==null && other.getEmpresa()==null) || 
             (this.empresa!=null &&
              this.empresa.equals(other.getEmpresa()))) &&
            ((this.filial==null && other.getFilial()==null) || 
             (this.filial!=null &&
              this.filial.equals(other.getFilial())));
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getDocumentoTipo() != null) {
            _hashCode += getDocumentoTipo().hashCode();
        }
        if (getDocumento() != null) {
            _hashCode += getDocumento().hashCode();
        }
        if (getEndereco() != null) {
            _hashCode += getEndereco().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getComplemento() != null) {
            _hashCode += getComplemento().hashCode();
        }
        if (getCep() != null) {
            _hashCode += getCep().hashCode();
        }
        if (getBairro() != null) {
            _hashCode += getBairro().hashCode();
        }
        if (getMunicipio() != null) {
            _hashCode += getMunicipio().hashCode();
        }
        if (getUf() != null) {
            _hashCode += getUf().hashCode();
        }
        if (getEmpresa() != null) {
            _hashCode += getEmpresa().hashCode();
        }
        if (getFilial() != null) {
            _hashCode += getFilial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XmlSacador.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "xmlSacador"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentoTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endereco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endereco"));
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
        elemField.setFieldName("complemento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "complemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bairro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bairro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("municipio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "municipio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empresa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filial"));
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
