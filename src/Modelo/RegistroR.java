/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author umgñ´´*/
public class RegistroR {

    String codigoE;
    String descriRep;
    String tecnico;
    String Fecha;

    public RegistroR(String codigoE, String descriRep, String tecnico, String Fecha) {
        this.codigoE = codigoE;
        this.descriRep = descriRep;
        this.tecnico = tecnico;
        this.Fecha = Fecha;
    }

    public String getCodigoE() {
        return codigoE;
    }

    public void setCodigoE(String codigoE) {
        this.codigoE = codigoE;
    }

    public String getDescriRep() {
        return descriRep;
    }

    public void setDescriRep(String descriRep) {
        this.descriRep = descriRep;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    
}
