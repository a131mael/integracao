/**
 * MovimentoTitulo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class MovimentoTitulo  implements java.io.Serializable {
    private br.com.grupobst.services.DevedorMovimento devedor;

    private br.com.grupobst.services.DividaMovimento divida;

    private br.com.grupobst.services.CartorioMovimento cartorio;

    private br.com.grupobst.services.OcorrenciaMovimento ocorrencia;

    private br.com.grupobst.services.RepasseMovimento repasse;

    public MovimentoTitulo() {
    }

    public MovimentoTitulo(
           br.com.grupobst.services.DevedorMovimento devedor,
           br.com.grupobst.services.DividaMovimento divida,
           br.com.grupobst.services.CartorioMovimento cartorio,
           br.com.grupobst.services.OcorrenciaMovimento ocorrencia,
           br.com.grupobst.services.RepasseMovimento repasse) {
           this.devedor = devedor;
           this.divida = divida;
           this.cartorio = cartorio;
           this.ocorrencia = ocorrencia;
           this.repasse = repasse;
    }


    /**
     * Gets the devedor value for this MovimentoTitulo.
     * 
     * @return devedor
     */
    public br.com.grupobst.services.DevedorMovimento getDevedor() {
        return devedor;
    }


    /**
     * Sets the devedor value for this MovimentoTitulo.
     * 
     * @param devedor
     */
    public void setDevedor(br.com.grupobst.services.DevedorMovimento devedor) {
        this.devedor = devedor;
    }


    /**
     * Gets the divida value for this MovimentoTitulo.
     * 
     * @return divida
     */
    public br.com.grupobst.services.DividaMovimento getDivida() {
        return divida;
    }


    /**
     * Sets the divida value for this MovimentoTitulo.
     * 
     * @param divida
     */
    public void setDivida(br.com.grupobst.services.DividaMovimento divida) {
        this.divida = divida;
    }


    /**
     * Gets the cartorio value for this MovimentoTitulo.
     * 
     * @return cartorio
     */
    public br.com.grupobst.services.CartorioMovimento getCartorio() {
        return cartorio;
    }


    /**
     * Sets the cartorio value for this MovimentoTitulo.
     * 
     * @param cartorio
     */
    public void setCartorio(br.com.grupobst.services.CartorioMovimento cartorio) {
        this.cartorio = cartorio;
    }


    /**
     * Gets the ocorrencia value for this MovimentoTitulo.
     * 
     * @return ocorrencia
     */
    public br.com.grupobst.services.OcorrenciaMovimento getOcorrencia() {
        return ocorrencia;
    }


    /**
     * Sets the ocorrencia value for this MovimentoTitulo.
     * 
     * @param ocorrencia
     */
    public void setOcorrencia(br.com.grupobst.services.OcorrenciaMovimento ocorrencia) {
        this.ocorrencia = ocorrencia;
    }


    /**
     * Gets the repasse value for this MovimentoTitulo.
     * 
     * @return repasse
     */
    public br.com.grupobst.services.RepasseMovimento getRepasse() {
        return repasse;
    }


    /**
     * Sets the repasse value for this MovimentoTitulo.
     * 
     * @param repasse
     */
    public void setRepasse(br.com.grupobst.services.RepasseMovimento repasse) {
        this.repasse = repasse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MovimentoTitulo)) return false;
        MovimentoTitulo other = (MovimentoTitulo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.devedor==null && other.getDevedor()==null) || 
             (this.devedor!=null &&
              this.devedor.equals(other.getDevedor()))) &&
            ((this.divida==null && other.getDivida()==null) || 
             (this.divida!=null &&
              this.divida.equals(other.getDivida()))) &&
            ((this.cartorio==null && other.getCartorio()==null) || 
             (this.cartorio!=null &&
              this.cartorio.equals(other.getCartorio()))) &&
            ((this.ocorrencia==null && other.getOcorrencia()==null) || 
             (this.ocorrencia!=null &&
              this.ocorrencia.equals(other.getOcorrencia()))) &&
            ((this.repasse==null && other.getRepasse()==null) || 
             (this.repasse!=null &&
              this.repasse.equals(other.getRepasse())));
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
        if (getDevedor() != null) {
            _hashCode += getDevedor().hashCode();
        }
        if (getDivida() != null) {
            _hashCode += getDivida().hashCode();
        }
        if (getCartorio() != null) {
            _hashCode += getCartorio().hashCode();
        }
        if (getOcorrencia() != null) {
            _hashCode += getOcorrencia().hashCode();
        }
        if (getRepasse() != null) {
            _hashCode += getRepasse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MovimentoTitulo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "movimentoTitulo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "devedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "devedor-movimento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "divida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "divida-movimento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cartorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "cartorio-movimento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocorrencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ocorrencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "ocorrencia-movimento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repasse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repasse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "repasse-movimento"));
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
