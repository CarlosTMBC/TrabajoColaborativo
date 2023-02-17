/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author umg
 */
public class RegistroReparacionModell {

/* @author carlt*/

    public ArrayList<RegistroR> RegisReparacion = new ArrayList<RegistroR>();
    
    public void AgregarReparacion(String CodigoEquipo, String DesRerparacion, String Tecnico, String FechaIngreso)
    {
         RegistroR nuevoRegis= new RegistroR(CodigoEquipo,  DesRerparacion,Tecnico, FechaIngreso);
        this.RegisReparacion.add(nuevoRegis);
        
    }
     public ArrayList RegisReparacion()
    {
        return RegisReparacion;
    }
}
        
