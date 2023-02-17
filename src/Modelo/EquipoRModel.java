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
public class EquipoRModel {
    public ArrayList<EquipoR> ListaEquipoR = new ArrayList<EquipoR>();
    
    public void AgregarUsuarios(String marca, String modelo, String tipo, String problema)
    {
        EquipoR nuevoEquipo = new EquipoR(marca, modelo, tipo, problema);
        this.ListaEquipoR.add(nuevoEquipo);
    }
    
    public ArrayList ListaUsuarios()
    {
        return ListaEquipoR;
    }
}
