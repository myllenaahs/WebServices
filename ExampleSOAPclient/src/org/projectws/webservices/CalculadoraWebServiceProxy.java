package org.projectws.webservices;

public class CalculadoraWebServiceProxy implements org.projectws.webservices.CalculadoraWebService {
  private String _endpoint = null;
  private org.projectws.webservices.CalculadoraWebService calculadoraWebService = null;
  
  public CalculadoraWebServiceProxy() {
    _initCalculadoraWebServiceProxy();
  }
  
  public CalculadoraWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculadoraWebServiceProxy();
  }
  
  private void _initCalculadoraWebServiceProxy() {
    try {
      calculadoraWebService = (new org.projectws.webservices.CalculadoraEndpointCalculadoraendpointLocator()).getCalculadoraEndpointPort();
      if (calculadoraWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculadoraWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculadoraWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculadoraWebService != null)
      ((javax.xml.rpc.Stub)calculadoraWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.projectws.webservices.CalculadoraWebService getCalculadoraWebService() {
    if (calculadoraWebService == null)
      _initCalculadoraWebServiceProxy();
    return calculadoraWebService;
  }
  
  public double calcular(double x, double y) throws java.rmi.RemoteException{
    if (calculadoraWebService == null)
      _initCalculadoraWebServiceProxy();
    return calculadoraWebService.calcular(x, y);
  }
  
  
}