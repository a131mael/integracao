/**
 * XmlPlanilha.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class XmlPlanilha  implements java.io.Serializable {
    private java.lang.String juros;

    private java.lang.String multa;

    private java.lang.String mora;

    private br.com.grupobst.services.XmlCalculo[] calculo;

    public XmlPlanilha() {
    }

    public XmlPlanilha(
           java.lang.String juros,
           java.lang.String multa,
           java.lang.String mora,
           br.com.grupobst.services.XmlCalculo[] calculo) {
           this.juros = juros;
           this.multa = multa;
           this.mora = mora;
           this.calculo = calculo;
    }


    /**
     * Gets the juros value for this XmlPlanilha.
     * 
     * @return juros
     */
    public java.lang.String getJuros() {
        return juros;
    }


    /**
     * Sets the juros value for this XmlPlanilha.
     * 
     * @param juros
     */
    public void setJuros(java.lang.String juros) {
        this.juros = juros;
    }


    /**
     * Gets the multa value for this XmlPlanilha.
     * 
     * @return multa
     */
    public java.lang.String getMulta() {
        return multa;
    }


    /**
     * Sets the multa value for this XmlPlanilha.
     * 
     * @param multa
     */
    public void setMulta(java.lang.String multa) {
        this.multa = multa;
    }


    /**
     * Gets the mora value for this XmlPlanilha.
     * 
     * @return mora
     */
    public java.lang.String getMora() {
        return mora;
    }


    /**
     * Sets the mora value for this XmlPlanilha.
     * 
     * @param mora
     */
    public void setMora(java.lang.String mora) {
        this.mora = mora;
    }


    /**
     * Gets the calculo value for this XmlPlanilha.
     * 
     * @return calculo
     */
    public br.com.grupobst.services.XmlCalculo[] getCalculo() {
        return calculo;
    }


    /**
     * Sets the calculo value for this XmlPlanilha.
     * 
     * @param calculo
     */
    public void setCalculo(br.com.grupobst.services.XmlCalculo[] calculo) {
        this.calculo = calculo;
    }

    public br.com.grupobst.services.XmlCalculo getCalculo(int i) {
        return this.calculo[i];
    }

    public void setCalculo(int i, br.com.grupobst.services.XmlCalculo _value) {
        this.calculo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XmlPlanilha)) return false;
        XmlPlanilha other = (XmlPlanilha) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.juros==null && other.getJuros()==null) || 
             (this.juros!=null &&
              this.juros.equals(other.getJuros()))) &&
            ((this.multa==null && other.getMulta()==null) || 
             (this.multa!=null &&
              this.multa.equals(other.getMulta()))) &&
            ((this.mora==null && other.getMora()==null) || 
             (this.mora!=null &&
              this.mora.equals(other.getMora()))) &&
            ((this.calculo==null && other.getCalculo()==null) || 
             (this.calculo!=null &&
              java.util.Arrays.equals(this.calculo, other.getCalculo())));
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
        if (getJuros() != null) {
            _hashCode += getJuros().hashCode();
        }
        if (getMulta() != null) {
            _hashCode += getMulta().hashCode();
        }
        if (getMora() != null) {
            _hashCode += getMora().hashCode();
        }
        if (getCalculo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCalculo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCalculo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XmlPlanilha.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "xmlPlanilha"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("calculo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calculo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "xmlCalculo"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
