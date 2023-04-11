/**
 * ServicesSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class ServicesSoapBindingStub extends org.apache.axis.client.Stub implements br.com.grupobst.services.ProtestoInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultarApresentante");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "apresentante"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://grupobst.com.br/services", "apresentante-consulta-request"), br.com.grupobst.services.ApresentanteConsultaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "apresentante-consulta-response"));
        oper.setReturnClass(br.com.grupobst.services.ApresentanteConsultaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resultado"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnviarTitulo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "titulo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://grupobst.com.br/services", "enviarTituloRequest"), br.com.grupobst.services.EnviarTituloRequest[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "enviarTituloResponse"));
        oper.setReturnClass(br.com.grupobst.services.EnviarTituloResponse[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "titulo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MovimentoDiario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "movimento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://grupobst.com.br/services", "movimento-consultar"), br.com.grupobst.services.MovimentoConsultar[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "movimentoResponse"));
        oper.setReturnClass(br.com.grupobst.services.MovimentoResponse[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "movimento"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CadastrarCedente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cedente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://grupobst.com.br/services", "cedente-cadastro"), br.com.grupobst.services.CedenteCadastro[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "cedente-cadastro-response"));
        oper.setReturnClass(br.com.grupobst.services.CedenteCadastroResponse[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cedente"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultarArquivo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arquivo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://grupobst.com.br/services", "consultarArquivoRequest"), br.com.grupobst.services.ConsultarArquivoRequest[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "consultarArquivoResponse"));
        oper.setReturnClass(br.com.grupobst.services.ConsultarArquivoResponse[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "arquivo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OperacaoTitulo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "titulo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://grupobst.com.br/services", "operacaoTituloRequest"), br.com.grupobst.services.OperacaoTituloRequest[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "operacaoTituloResponse"));
        oper.setReturnClass(br.com.grupobst.services.OperacaoTituloResponse[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "titulo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Autenticar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "credenciais"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://grupobst.com.br/services", "autenticarRequest"), br.com.grupobst.services.AutenticarRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "autenticarResponse"));
        oper.setReturnClass(br.com.grupobst.services.AutenticarResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "credenciais"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultarCedente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cedente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://grupobst.com.br/services", "cedente-consulta"), br.com.grupobst.services.CedenteConsulta.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "cedente-consulta-response"));
        oper.setReturnClass(br.com.grupobst.services.CedenteConsultaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resultado"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultarTitulo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "completa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "instrumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "anuencia"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "titulo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://grupobst.com.br/services", "consultarTituloRequest"), br.com.grupobst.services.ConsultarTituloRequest[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "consultarTituloResponse"));
        oper.setReturnClass(br.com.grupobst.services.ConsultarTituloResponse[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "titulo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

    }

    public ServicesSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ServicesSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ServicesSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "anuencia-consultar");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.AnuenciaConsultar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "apresentante-consulta-request");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.ApresentanteConsultaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "apresentante-consulta-response");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.ApresentanteConsultaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "apresentante-response");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.ApresentanteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "autenticarRequest");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.AutenticarRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "autenticarResponse");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.AutenticarResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "cartorio-consultar");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.CartorioConsultar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "cartorio-consultar-request");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.CartorioConsultarRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "cartorio-movimento");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.CartorioMovimento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "cartorio-operacao-request");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.CartorioOperacaoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "cedente-bancario");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.CedenteBancario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "cedente-cadastro");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.CedenteCadastro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "cedente-cadastro-response");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.CedenteCadastroResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "cedente-consulta");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.CedenteConsulta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "cedente-consulta-response");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.CedenteConsultaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "cedente-endereco");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.CedenteEndereco.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "cedente-response");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.CedenteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "consultarArquivoRequest");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.ConsultarArquivoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "consultarArquivoResponse");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.ConsultarArquivoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "consultarTituloRequest");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.ConsultarTituloRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "consultarTituloResponse");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.ConsultarTituloResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "custa-consultar");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.CustaConsultar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "custa-movimento");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.CustaMovimento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "custas-consultar");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.CustasConsultar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "devedor-consultar");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.DevedorConsultar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "devedor-enviar");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.DevedorEnviar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "devedor-movimento");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.DevedorMovimento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "devedor-operacao");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.DevedorOperacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "divida-consultar");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.DividaConsultar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "divida-enviar");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.DividaEnviar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "divida-movimento");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.DividaMovimento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "divida-operacao");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.DividaOperacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "documento-enviar");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.DocumentoEnviar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "enviarTituloRequest");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.EnviarTituloRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "enviarTituloResponse");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.EnviarTituloResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "instrumento-consultar");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.InstrumentoConsultar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "movimento-consultar");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.MovimentoConsultar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "movimentoResponse");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.MovimentoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "movimentoTitulo");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.MovimentoTitulo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "ocorrencia-consultar");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.OcorrenciaConsultar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "ocorrencia-movimento");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.OcorrenciaMovimento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "operacaoTituloRequest");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.OperacaoTituloRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "operacaoTituloResponse");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.OperacaoTituloResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "protocolo-consultar");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.ProtocoloConsultar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "protocolo-movimento");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.ProtocoloMovimento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "repasse-consultar");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.RepasseConsultar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "repasse-movimento");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.RepasseMovimento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "sacador-consultar");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.SacadorConsultar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "status-operacao");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.StatusOperacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "statusResponse");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.StatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "tipoArquivo");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.TipoArquivo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "tipoMovimento");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.TipoMovimento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "tipoOperacao");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.TipoOperacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "xmlCalculo");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.XmlCalculo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "xmlCedente");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.XmlCedente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "xmlPlanilha");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.XmlPlanilha.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://grupobst.com.br/services", "xmlSacador");
            cachedSerQNames.add(qName);
            cls = br.com.grupobst.services.XmlSacador.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public br.com.grupobst.services.ApresentanteConsultaResponse consultarApresentante(java.lang.String token, br.com.grupobst.services.ApresentanteConsultaRequest apresentante) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://grupobst.com.br/services", "ConsultarApresentante"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, apresentante});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.grupobst.services.ApresentanteConsultaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.grupobst.services.ApresentanteConsultaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.grupobst.services.ApresentanteConsultaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.grupobst.services.EnviarTituloResponse[] enviarTitulo(java.lang.String token, br.com.grupobst.services.EnviarTituloRequest[] titulo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://grupobst.com.br/services", "EnviarTitulo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, titulo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.grupobst.services.EnviarTituloResponse[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.grupobst.services.EnviarTituloResponse[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.grupobst.services.EnviarTituloResponse[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.grupobst.services.MovimentoResponse[] movimentoDiario(java.lang.String token, br.com.grupobst.services.MovimentoConsultar[] movimento) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://grupobst.com.br/services", "MovimentoDiario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, movimento});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.grupobst.services.MovimentoResponse[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.grupobst.services.MovimentoResponse[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.grupobst.services.MovimentoResponse[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.grupobst.services.CedenteCadastroResponse[] cadastrarCedente(java.lang.String token, br.com.grupobst.services.CedenteCadastro[] cedente) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://grupobst.com.br/services", "CadastrarCedente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, cedente});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.grupobst.services.CedenteCadastroResponse[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.grupobst.services.CedenteCadastroResponse[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.grupobst.services.CedenteCadastroResponse[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.grupobst.services.ConsultarArquivoResponse[] consultarArquivo(java.lang.String token, br.com.grupobst.services.ConsultarArquivoRequest[] arquivo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://grupobst.com.br/services", "ConsultarArquivo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, arquivo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.grupobst.services.ConsultarArquivoResponse[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.grupobst.services.ConsultarArquivoResponse[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.grupobst.services.ConsultarArquivoResponse[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.grupobst.services.OperacaoTituloResponse[] operacaoTitulo(java.lang.String token, br.com.grupobst.services.OperacaoTituloRequest[] titulo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://grupobst.com.br/services", "OperacaoTitulo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, titulo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.grupobst.services.OperacaoTituloResponse[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.grupobst.services.OperacaoTituloResponse[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.grupobst.services.OperacaoTituloResponse[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.grupobst.services.AutenticarResponse autenticar(br.com.grupobst.services.AutenticarRequest credenciais) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://grupobst.com.br/services", "Autenticar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credenciais});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.grupobst.services.AutenticarResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.grupobst.services.AutenticarResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.grupobst.services.AutenticarResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.grupobst.services.CedenteConsultaResponse consultarCedente(java.lang.String token, br.com.grupobst.services.CedenteConsulta cedente) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://grupobst.com.br/services", "ConsultarCedente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, cedente});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.grupobst.services.CedenteConsultaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.grupobst.services.CedenteConsultaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.grupobst.services.CedenteConsultaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.grupobst.services.ConsultarTituloResponse[] consultarTitulo(java.lang.String token, java.lang.String completa, java.lang.String instrumento, java.lang.String anuencia, br.com.grupobst.services.ConsultarTituloRequest[] titulo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://grupobst.com.br/services", "ConsultarTitulo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, completa, instrumento, anuencia, titulo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.grupobst.services.ConsultarTituloResponse[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.grupobst.services.ConsultarTituloResponse[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.grupobst.services.ConsultarTituloResponse[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
