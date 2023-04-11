/**
 * ConsultarTituloResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class ConsultarTituloResponse  implements java.io.Serializable {
    private br.com.grupobst.services.SacadorConsultar sacador;

    private br.com.grupobst.services.DevedorConsultar devedor;

    private br.com.grupobst.services.DividaConsultar divida;

    private br.com.grupobst.services.CartorioConsultar cartorio;

    private br.com.grupobst.services.OcorrenciaConsultar[] ocorrencia;

    private br.com.grupobst.services.CustasConsultar custas;

    private br.com.grupobst.services.RepasseConsultar repasse;

    private br.com.grupobst.services.InstrumentoConsultar instrumento;

    private br.com.grupobst.services.AnuenciaConsultar[] anuencia;

    private br.com.grupobst.services.StatusResponse resposta;

    public ConsultarTituloResponse() {
    }

    public ConsultarTituloResponse(
           br.com.grupobst.services.SacadorConsultar sacador,
           br.com.grupobst.services.DevedorConsultar devedor,
           br.com.grupobst.services.DividaConsultar divida,
           br.com.grupobst.services.CartorioConsultar cartorio,
           br.com.grupobst.services.OcorrenciaConsultar[] ocorrencia,
           br.com.grupobst.services.CustasConsultar custas,
           br.com.grupobst.services.RepasseConsultar repasse,
           br.com.grupobst.services.InstrumentoConsultar instrumento,
           br.com.grupobst.services.AnuenciaConsultar[] anuencia,
           br.com.grupobst.services.StatusResponse resposta) {
           this.sacador = sacador;
           this.devedor = devedor;
           this.divida = divida;
           this.cartorio = cartorio;
           this.ocorrencia = ocorrencia;
           this.custas = custas;
           this.repasse = repasse;
           this.instrumento = instrumento;
           this.anuencia = anuencia;
           this.resposta = resposta;
    }


    /**
     * Gets the sacador value for this ConsultarTituloResponse.
     * 
     * @return sacador
     */
    public br.com.grupobst.services.SacadorConsultar getSacador() {
        return sacador;
    }


    /**
     * Sets the sacador value for this ConsultarTituloResponse.
     * 
     * @param sacador
     */
    public void setSacador(br.com.grupobst.services.SacadorConsultar sacador) {
        this.sacador = sacador;
    }


    /**
     * Gets the devedor value for this ConsultarTituloResponse.
     * 
     * @return devedor
     */
    public br.com.grupobst.services.DevedorConsultar getDevedor() {
        return devedor;
    }


    /**
     * Sets the devedor value for this ConsultarTituloResponse.
     * 
     * @param devedor
     */
    public void setDevedor(br.com.grupobst.services.DevedorConsultar devedor) {
        this.devedor = devedor;
    }


    /**
     * Gets the divida value for this ConsultarTituloResponse.
     * 
     * @return divida
     */
    public br.com.grupobst.services.DividaConsultar getDivida() {
        return divida;
    }


    /**
     * Sets the divida value for this ConsultarTituloResponse.
     * 
     * @param divida
     */
    public void setDivida(br.com.grupobst.services.DividaConsultar divida) {
        this.divida = divida;
    }


    /**
     * Gets the cartorio value for this ConsultarTituloResponse.
     * 
     * @return cartorio
     */
    public br.com.grupobst.services.CartorioConsultar getCartorio() {
        return cartorio;
    }


    /**
     * Sets the cartorio value for this ConsultarTituloResponse.
     * 
     * @param cartorio
     */
    public void setCartorio(br.com.grupobst.services.CartorioConsultar cartorio) {
        this.cartorio = cartorio;
    }


    /**
     * Gets the ocorrencia value for this ConsultarTituloResponse.
     * 
     * @return ocorrencia
     */
    public br.com.grupobst.services.OcorrenciaConsultar[] getOcorrencia() {
        return ocorrencia;
    }


    /**
     * Sets the ocorrencia value for this ConsultarTituloResponse.
     * 
     * @param ocorrencia
     */
    public void setOcorrencia(br.com.grupobst.services.OcorrenciaConsultar[] ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public br.com.grupobst.services.OcorrenciaConsultar getOcorrencia(int i) {
        return this.ocorrencia[i];
    }

    public void setOcorrencia(int i, br.com.grupobst.services.OcorrenciaConsultar _value) {
        this.ocorrencia[i] = _value;
    }


    /**
     * Gets the custas value for this ConsultarTituloResponse.
     * 
     * @return custas
     */
    public br.com.grupobst.services.CustasConsultar getCustas() {
        return custas;
    }


    /**
     * Sets the custas value for this ConsultarTituloResponse.
     * 
     * @param custas
     */
    public void setCustas(br.com.grupobst.services.CustasConsultar custas) {
        this.custas = custas;
    }


    /**
     * Gets the repasse value for this ConsultarTituloResponse.
     * 
     * @return repasse
     */
    public br.com.grupobst.services.RepasseConsultar getRepasse() {
        return repasse;
    }


    /**
     * Sets the repasse value for this ConsultarTituloResponse.
     * 
     * @param repasse
     */
    public void setRepasse(br.com.grupobst.services.RepasseConsultar repasse) {
        this.repasse = repasse;
    }


    /**
     * Gets the instrumento value for this ConsultarTituloResponse.
     * 
     * @return instrumento
     */
    public br.com.grupobst.services.InstrumentoConsultar getInstrumento() {
        return instrumento;
    }


    /**
     * Sets the instrumento value for this ConsultarTituloResponse.
     * 
     * @param instrumento
     */
    public void setInstrumento(br.com.grupobst.services.InstrumentoConsultar instrumento) {
        this.instrumento = instrumento;
    }


    /**
     * Gets the anuencia value for this ConsultarTituloResponse.
     * 
     * @return anuencia
     */
    public br.com.grupobst.services.AnuenciaConsultar[] getAnuencia() {
        return anuencia;
    }


    /**
     * Sets the anuencia value for this ConsultarTituloResponse.
     * 
     * @param anuencia
     */
    public void setAnuencia(br.com.grupobst.services.AnuenciaConsultar[] anuencia) {
        this.anuencia = anuencia;
    }

    public br.com.grupobst.services.AnuenciaConsultar getAnuencia(int i) {
        return this.anuencia[i];
    }

    public void setAnuencia(int i, br.com.grupobst.services.AnuenciaConsultar _value) {
        this.anuencia[i] = _value;
    }


    /**
     * Gets the resposta value for this ConsultarTituloResponse.
     * 
     * @return resposta
     */
    public br.com.grupobst.services.StatusResponse getResposta() {
        return resposta;
    }


    /**
     * Sets the resposta value for this ConsultarTituloResponse.
     * 
     * @param resposta
     */
    public void setResposta(br.com.grupobst.services.StatusResponse resposta) {
        this.resposta = resposta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarTituloResponse)) return false;
        ConsultarTituloResponse other = (ConsultarTituloResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sacador==null && other.getSacador()==null) || 
             (this.sacador!=null &&
              this.sacador.equals(other.getSacador()))) &&
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
              java.util.Arrays.equals(this.ocorrencia, other.getOcorrencia()))) &&
            ((this.custas==null && other.getCustas()==null) || 
             (this.custas!=null &&
              this.custas.equals(other.getCustas()))) &&
            ((this.repasse==null && other.getRepasse()==null) || 
             (this.repasse!=null &&
              this.repasse.equals(other.getRepasse()))) &&
            ((this.instrumento==null && other.getInstrumento()==null) || 
             (this.instrumento!=null &&
              this.instrumento.equals(other.getInstrumento()))) &&
            ((this.anuencia==null && other.getAnuencia()==null) || 
             (this.anuencia!=null &&
              java.util.Arrays.equals(this.anuencia, other.getAnuencia()))) &&
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
        if (getSacador() != null) {
            _hashCode += getSacador().hashCode();
        }
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOcorrencia());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOcorrencia(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustas() != null) {
            _hashCode += getCustas().hashCode();
        }
        if (getRepasse() != null) {
            _hashCode += getRepasse().hashCode();
        }
        if (getInstrumento() != null) {
            _hashCode += getInstrumento().hashCode();
        }
        if (getAnuencia() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnuencia());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnuencia(), i);
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
        new org.apache.axis.description.TypeDesc(ConsultarTituloResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "consultarTituloResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sacador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sacador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "sacador-consultar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "devedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "devedor-consultar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "divida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "divida-consultar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cartorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "cartorio-consultar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocorrencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ocorrencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "ocorrencia-consultar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "custas-consultar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repasse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repasse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "repasse-consultar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instrumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instrumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "instrumento-consultar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anuencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anuencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "anuencia-consultar"));
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
