/**
 * CartorioConsultar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class CartorioConsultar  implements java.io.Serializable {
    private java.lang.String data;

    private java.lang.String comarca;

    private java.lang.String cartorio;

    private java.lang.String nome;

    private java.lang.String cidade;

    private java.lang.String uf;

    private java.lang.String protocolo;

    public CartorioConsultar() {
    }

    public CartorioConsultar(
           java.lang.String data,
           java.lang.String comarca,
           java.lang.String cartorio,
           java.lang.String nome,
           java.lang.String cidade,
           java.lang.String uf,
           java.lang.String protocolo) {
           this.data = data;
           this.comarca = comarca;
           this.cartorio = cartorio;
           this.nome = nome;
           this.cidade = cidade;
           this.uf = uf;
           this.protocolo = protocolo;
    }


    /**
     * Gets the data value for this CartorioConsultar.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this CartorioConsultar.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the comarca value for this CartorioConsultar.
     * 
     * @return comarca
     */
    public java.lang.String getComarca() {
        return comarca;
    }


    /**
     * Sets the comarca value for this CartorioConsultar.
     * 
     * @param comarca
     */
    public void setComarca(java.lang.String comarca) {
        this.comarca = comarca;
    }


    /**
     * Gets the cartorio value for this CartorioConsultar.
     * 
     * @return cartorio
     */
    public java.lang.String getCartorio() {
        return cartorio;
    }


    /**
     * Sets the cartorio value for this CartorioConsultar.
     * 
     * @param cartorio
     */
    public void setCartorio(java.lang.String cartorio) {
        this.cartorio = cartorio;
    }


    /**
     * Gets the nome value for this CartorioConsultar.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this CartorioConsultar.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the cidade value for this CartorioConsultar.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this CartorioConsultar.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the uf value for this CartorioConsultar.
     * 
     * @return uf
     */
    public java.lang.String getUf() {
        return uf;
    }


    /**
     * Sets the uf value for this CartorioConsultar.
     * 
     * @param uf
     */
    public void setUf(java.lang.String uf) {
        this.uf = uf;
    }


    /**
     * Gets the protocolo value for this CartorioConsultar.
     * 
     * @return protocolo
     */
    public java.lang.String getProtocolo() {
        return protocolo;
    }


    /**
     * Sets the protocolo value for this CartorioConsultar.
     * 
     * @param protocolo
     */
    public void setProtocolo(java.lang.String protocolo) {
        this.protocolo = protocolo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CartorioConsultar)) return false;
        CartorioConsultar other = (CartorioConsultar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.comarca==null && other.getComarca()==null) || 
             (this.comarca!=null &&
              this.comarca.equals(other.getComarca()))) &&
            ((this.cartorio==null && other.getCartorio()==null) || 
             (this.cartorio!=null &&
              this.cartorio.equals(other.getCartorio()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.uf==null && other.getUf()==null) || 
             (this.uf!=null &&
              this.uf.equals(other.getUf()))) &&
            ((this.protocolo==null && other.getProtocolo()==null) || 
             (this.protocolo!=null &&
              this.protocolo.equals(other.getProtocolo())));
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
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getComarca() != null) {
            _hashCode += getComarca().hashCode();
        }
        if (getCartorio() != null) {
            _hashCode += getCartorio().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getUf() != null) {
            _hashCode += getUf().hashCode();
        }
        if (getProtocolo() != null) {
            _hashCode += getProtocolo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CartorioConsultar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "cartorio-consultar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comarca");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comarca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cartorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocolo"));
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
