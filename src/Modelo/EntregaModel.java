
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author umg
 */
public class EntregaModel {
     public ArrayList<EntregaE> ListaEntrega = new ArrayList<EntregaE>();
     
     public void AgregarEntrega(String codigo, String nombreP, String fecha, String deSolucion)
    {
        EntregaE nuevoEquipo = new EntregaE(codigo, nombreP, fecha, deSolucion);
        this.ListaEntrega.add(nuevoEquipo);
    }
    
    public ArrayList ListaEquipos()
    {
        return ListaEntrega;
        
    }
}
