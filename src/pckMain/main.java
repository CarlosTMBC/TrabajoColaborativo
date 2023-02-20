
package pckMain;

import Controlador.EquipoRepController;
import Modelo.EquipoRModel;
import Vistas.frmEquipo;
import Vistas.frmPrincipal;


public class main {
    public static void main(String[] args )
    {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        VistaPrincipal.setVisible(true);
        
        frmEquipo VistaEquipo = new frmEquipo();
        EquipoRModel ModeloEquipos = new EquipoRModel();
        
        EquipoRepController Equipo = new EquipoRepController(VistaPrincipal,VistaEquipo,ModeloEquipos);
        
    }
}
