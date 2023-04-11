/**
 * CedenteCadastro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class CedenteCadastro  implements java.io.Serializable {
    private br.com.grupobst.services.TipoOperacao operacao;

    private java.lang.String nome;

    private java.lang.String codigo;

    private java.lang.String email;

    private java.lang.String telefone;

    private java.lang.String documentoTipo;

    private java.lang.String documento;

    private br.com.grupobst.services.CedenteEndereco endereco;

    private br.com.grupobst.services.CedenteBancario dadosBancario;

    public CedenteCadastro() {
    }

    public CedenteCadastro(
           br.com.grupobst.services.TipoOperacao operacao,
           java.lang.String nome,
           java.lang.String codigo,
           java.lang.String email,
           java.lang.String telefone,
           java.lang.String documentoTipo,
           java.lang.String documento,
           br.com.grupobst.services.CedenteEndereco endereco,
           br.com.grupobst.services.CedenteBancario dadosBancario) {
           this.operacao = operacao;
           this.nome = nome;
           this.codigo = codigo;
           this.email = email;
           this.telefone = telefone;
           this.documentoTipo = documentoTipo;
           this.documento = documento;
           this.endereco = endereco;
           this.dadosBancario = dadosBancario;
    }


    /**
     * Gets the operacao value for this CedenteCadastro.
     * 
     * @return operacao
     */
    public br.com.grupobst.services.TipoOperacao getOperacao() {
        return operacao;
    }


    /**
     * Sets the operacao value for this CedenteCadastro.
     * 
     * @param operacao
     */
    public void setOperacao(br.com.grupobst.services.TipoOperacao operacao) {
        this.operacao = operacao;
    }


    /**
     * Gets the nome value for this CedenteCadastro.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this CedenteCadastro.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the codigo value for this CedenteCadastro.
     * 
     * @return codigo
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this CedenteCadastro.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the email value for this CedenteCadastro.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this CedenteCadastro.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the telefone value for this CedenteCadastro.
     * 
     * @return telefone
     */
    public java.lang.String getTelefone() {
        return telefone;
    }


    /**
     * Sets the telefone value for this CedenteCadastro.
     * 
     * @param telefone
     */
    public void setTelefone(java.lang.String telefone) {
        this.telefone = telefone;
    }


    /**
     * Gets the documentoTipo value for this CedenteCadastro.
     * 
     * @return documentoTipo
     */
    public java.lang.String getDocumentoTipo() {
        return documentoTipo;
    }


    /**
     * Sets the documentoTipo value for this CedenteCadastro.
     * 
     * @param documentoTipo
     */
    public void setDocumentoTipo(java.lang.String documentoTipo) {
        this.documentoTipo = documentoTipo;
    }


    /**
     * Gets the documento value for this CedenteCadastro.
     * 
     * @return documento
     */
    public java.lang.String getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this CedenteCadastro.
     * 
     * @param documento
     */
    public void setDocumento(java.lang.String documento) {
        this.documento = documento;
    }


    /**
     * Gets the endereco value for this CedenteCadastro.
     * 
     * @return endereco
     */
    public br.com.grupobst.services.CedenteEndereco getEndereco() {
        return endereco;
    }


    /**
     * Sets the endereco value for this CedenteCadastro.
     * 
     * @param endereco
     */
    public void setEndereco(br.com.grupobst.services.CedenteEndereco endereco) {
        this.endereco = endereco;
    }


    /**
     * Gets the dadosBancario value for this CedenteCadastro.
     * 
     * @return dadosBancario
     */
    public br.com.grupobst.services.CedenteBancario getDadosBancario() {
        return dadosBancario;
    }


    /**
     * Sets the dadosBancario value for this CedenteCadastro.
     * 
     * @param dadosBancario
     */
    public void setDadosBancario(br.com.grupobst.services.CedenteBancario dadosBancario) {
        this.dadosBancario = dadosBancario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CedenteCadastro)) return false;
        CedenteCadastro other = (CedenteCadastro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operacao==null && other.getOperacao()==null) || 
             (this.operacao!=null &&
              this.operacao.equals(other.getOperacao()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.telefone==null && other.getTelefone()==null) || 
             (this.telefone!=null &&
              this.telefone.equals(other.getTelefone()))) &&
            ((this.documentoTipo==null && other.getDocumentoTipo()==null) || 
             (this.documentoTipo!=null &&
              this.documentoTipo.equals(other.getDocumentoTipo()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              this.documento.equals(other.getDocumento()))) &&
            ((this.endereco==null && other.getEndereco()==null) || 
             (this.endereco!=null &&
              this.endereco.equals(other.getEndereco()))) &&
            ((this.dadosBancario==null && other.getDadosBancario()==null) || 
             (this.dadosBancario!=null &&
              this.dadosBancario.equals(other.getDadosBancario())));
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
        if (getOperacao() != null) {
            _hashCode += getOperacao().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getTelefone() != null) {
            _hashCode += getTelefone().hashCode();
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
        if (getDadosBancario() != null) {
            _hashCode += getDadosBancario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CedenteCadastro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "cedente-cadastro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "tipoOperacao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "cedente-endereco"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dadosBancario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dadosBancario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "cedente-bancario"));
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
