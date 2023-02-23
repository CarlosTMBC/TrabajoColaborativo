
package pckMain;

import Controlador.EntregaController;
import Controlador.PropietarioController;
import Controlador.EquipoRepController;
import Controlador.RegistroReparacionController;
import Modelo.EntregaModel;
import Modelo.EquipoRModel;
import Modelo.PropietarioModel;
import Modelo.RegistroReparacionModell;
import Vistas.frmEntregarEquipo;
import Vistas.frmEquipo;
import Vistas.frmPrincipal;
import Vistas.frmPropietarios;
import Vistas.frmRegReparacion;



public class main {
    public static void main(String[] args )
    {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        VistaPrincipal.setVisible(true);
        
        //Carlos
        frmEquipo VistaEquipo = new frmEquipo();
        EquipoRModel ModeloEquipos = new EquipoRModel();
        
        EquipoRepController Equipo = new EquipoRepController(VistaPrincipal,VistaEquipo,ModeloEquipos);
        
        //Daniel   
        frmPropietarios VistaPropietario = new frmPropietarios();
        PropietarioModel ModeloPropietario = new PropietarioModel();
        
        PropietarioController Propietario = new PropietarioController(VistaPrincipal,VistaPropietario,ModeloPropietario);
        
        //Andy
        frmEntregarEquipo VistaEntrega = new frmEntregarEquipo();
        EntregaModel ModeloEntrega = new EntregaModel();
        
        EntregaController Entrega = new EntregaController(VistaPrincipal,VistaEntrega,ModeloEntrega);
         
        //Javier
        frmRegReparacion VistaRegReparacion = new frmRegReparacion();
        RegistroReparacionModell ModeloRegReparacion = new RegistroReparacionModell();
        
        RegistroReparacionController RegistroRep = new RegistroReparacionController(VistaPrincipal,VistaRegReparacion,ModeloRegReparacion);
        
    }
}
