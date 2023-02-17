/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author umg
 */
public class EntregaE {
    String codequipo;
    String personarecibe;
    String fechaentrega;
    String desolucion;

    public EntregaE(String codequipo, String personarecibe, String fechaentrega, String desolucion) {
        this.codequipo = codequipo;
        this.personarecibe = personarecibe;
        this.fechaentrega = fechaentrega;
        this.desolucion = desolucion;
    }

    public String getCodequipo() {
        return codequipo;
    }

    public void setCodequipo(String codequipo) {
        this.codequipo = codequipo;
    }

    public String getPersonarecibe() {
        return personarecibe;
    }

    public void setPersonarecibe(String personarecibe) {
        this.personarecibe = personarecibe;
    }

    public String getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(String fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public String getDesolucion() {
        return desolucion;
    }

    public void setDesolucion(String desolucion) {
        this.desolucion = desolucion;
    }
    
    
}
