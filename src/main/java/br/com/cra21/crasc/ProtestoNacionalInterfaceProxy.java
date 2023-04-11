package br.com.cra21.crasc;

public class ProtestoNacionalInterfaceProxy implements br.com.cra21.crasc.ProtestoNacionalInterface {
  private String _endpoint = null;
  private br.com.cra21.crasc.ProtestoNacionalInterface protestoNacionalInterface = null;
  
  public ProtestoNacionalInterfaceProxy() {
    _initProtestoNacionalInterfaceProxy();
  }
  
  public ProtestoNacionalInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initProtestoNacionalInterfaceProxy();
  }
  
  private void _initProtestoNacionalInterfaceProxy() {
    try {
      protestoNacionalInterface = (new br.com.cra21.crasc.ServicesLocator()).getProtestoNacionalPort();
      if (protestoNacionalInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)protestoNacionalInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)protestoNacionalInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (protestoNacionalInterface != null)
      ((javax.xml.rpc.Stub)protestoNacionalInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.cra21.crasc.ProtestoNacionalInterface getProtestoNacionalInterface() {
    if (protestoNacionalInterface == null)
      _initProtestoNacionalInterfaceProxy();
    return protestoNacionalInterface;
  }
  
  public java.lang.String desistencia(java.lang.String userArq, java.lang.String userDados) throws java.rmi.RemoteException{
    if (protestoNacionalInterface == null)
      _initProtestoNacionalInterfaceProxy();
    return protestoNacionalInterface.desistencia(userArq, userDados);
  }
  
  public java.lang.String retorno(java.lang.String userArq) throws java.rmi.RemoteException{
    if (protestoNacionalInterface == null)
      _initProtestoNacionalInterfaceProxy();
    return protestoNacionalInterface.retorno(userArq);
  }
  
  public java.lang.String autoriza_Desistencia(java.lang.String userArq, java.lang.String userDados) throws java.rmi.RemoteException{
    if (protestoNacionalInterface == null)
      _initProtestoNacionalInterfaceProxy();
    return protestoNacionalInterface.autoriza_Desistencia(userArq, userDados);
  }
  
  public java.lang.String imagem(java.lang.String userArq, java.lang.String userDados) throws java.rmi.RemoteException{
    if (protestoNacionalInterface == null)
      _initProtestoNacionalInterfaceProxy();
    return protestoNacionalInterface.imagem(userArq, userDados);
  }
  
  public java.lang.String instrumento(java.lang.String userDados) throws java.rmi.RemoteException{
    if (protestoNacionalInterface == null)
      _initProtestoNacionalInterfaceProxy();
    return protestoNacionalInterface.instrumento(userDados);
  }
  
  public java.lang.String homologadas(java.lang.String codapres, java.lang.String cartorios) throws java.rmi.RemoteException{
    if (protestoNacionalInterface == null)
      _initProtestoNacionalInterfaceProxy();
    return protestoNacionalInterface.homologadas(codapres, cartorios);
  }
  
  public java.lang.String confirmacao(java.lang.String userArq) throws java.rmi.RemoteException{
    if (protestoNacionalInterface == null)
      _initProtestoNacionalInterfaceProxy();
    return protestoNacionalInterface.confirmacao(userArq);
  }
  
  public java.lang.String consulta_Slip(java.lang.String codMunicipio, java.lang.String codCartorio, java.lang.String protocolo, java.lang.String dataProtocolo) throws java.rmi.RemoteException{
    if (protestoNacionalInterface == null)
      _initProtestoNacionalInterfaceProxy();
    return protestoNacionalInterface.consulta_Slip(codMunicipio, codCartorio, protocolo, dataProtocolo);
  }
  
  public java.lang.String remessa(java.lang.String userArq, java.lang.String userDados) throws java.rmi.RemoteException{
    if (protestoNacionalInterface == null)
      _initProtestoNacionalInterfaceProxy();
    return protestoNacionalInterface.remessa(userArq, userDados);
  }
  
  public java.lang.String autoriza_Cancelamento(java.lang.String userArq, java.lang.String userDados) throws java.rmi.RemoteException{
    if (protestoNacionalInterface == null)
      _initProtestoNacionalInterfaceProxy();
    return protestoNacionalInterface.autoriza_Cancelamento(userArq, userDados);
  }
  
  public java.lang.String cancelamento(java.lang.String userArq, java.lang.String userDados) throws java.rmi.RemoteException{
    if (protestoNacionalInterface == null)
      _initProtestoNacionalInterfaceProxy();
    return protestoNacionalInterface.cancelamento(userArq, userDados);
  }
  
  public java.lang.String consulta(java.lang.String nossoNumero, java.lang.String numeroTitulo) throws java.rmi.RemoteException{
    if (protestoNacionalInterface == null)
      _initProtestoNacionalInterfaceProxy();
    return protestoNacionalInterface.consulta(nossoNumero, numeroTitulo);
  }
  
  
}