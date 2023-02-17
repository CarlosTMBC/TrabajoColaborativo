package Modelo;

import java.util.ArrayList;


public class propietariosModel {
    public ArrayList<Propietarios> listaPropietario = new ArrayList<Propietarios>();
    
    public void IngresarPropietario(String apellidos, String nombre, String telefono){
        Propietarios NuevoPropietario = new Propietarios(apellidos, nombre, telefono);
        this.listaPropietario.add(NuevoPropietario);
    }
    
    public ArrayList ListarPropietario(){
        return listaPropietario;
    }
}
