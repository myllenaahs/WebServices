package org.projectws.webservices;

import java.rmi.RemoteException;

import org.projectws.webservices.CalculadoraWebService;
import org.projectws.webservices.CalculadoraWebServiceProxy;
 
 
public class WSClient {
    public static void main(String[] args) {
        CalculadoraWebService webservice = new CalculadoraWebServiceProxy();
         
        try {
            double x, y, result;
             
            x = 5;
            y = 4;
             
            result = webservice.calcular(x, y);
             
            System.out.println(result);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}