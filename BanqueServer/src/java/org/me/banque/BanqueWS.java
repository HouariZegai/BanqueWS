package org.me.banque;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "BanqueWS")
public class BanqueWS {
    double solde = 0;
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "getSolde")
    public double getSolde() {
        return solde;
    }
    
    @WebMethod(operationName = "deposer")
    public double deposer(@WebParam(name = "montant") double montant) {
        solde += montant;
        return solde;
    }
    
    @WebMethod(operationName = "retirer")
    public double retirer(@WebParam(name = "montant") double montant) {
        if(montant <= solde)
            solde -= montant;
        
        return solde;
    }
    
}
