
package Controlador;

import Modelo.RegistroReparacionModell;
import Vistas.frmRegReparacion;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javier
 */
public class RegistroReparacionController implements ActionListener{
    
    frmPrincipal VistaPrincipal;
    frmRegReparacion VistaRegistroReparacion;
    RegistroReparacionModell ModeloRegistroRep;
    public DefaultTableModel TablaRegistroRep = new DefaultTableModel();
    //ablaRegistroRep
    // LEVANTAR DE FORMA AUTOMATICA EL FORMULARIO PRINCIPAL

    public RegistroReparacionController (frmPrincipal VistaPrincipal, frmRegReparacion VistaRegistroReparacion, RegistroReparacionModell ModeloRegistroRep) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaRegistroReparacion= VistaRegistroReparacion;
        this.ModeloRegistroRep = ModeloRegistroRep;
        
        this.VistaPrincipal.btnEnviarReparacion.addActionListener(this);
        
        
        this.TablaRegistroRep.addColumn("Codigo de Equipo");
        this.TablaRegistroRep.addColumn("Descripcion de la Reparacion");
        this.TablaRegistroRep.addColumn("Tecnico");
        this.TablaRegistroRep.addColumn("Fecha de Ingreso");
           
        this.VistaRegistroReparacion.jtRegistroRep.setModel(TablaRegistroRep);
        
        
    }  
        
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnEnviarReparacion)
        {
            this.VistaRegistroReparacion.btnRegistroRep.addActionListener(this);
            
            this.VistaRegistroReparacion.setLocationRelativeTo(null);
            this.VistaRegistroReparacion.setVisible(true);
            
            
        }
        
        if(e.getSource()==this.VistaRegistroReparacion.btnRegistroRep)
        {
            
            this.ModeloRegistroRep.AgregarReparacion(this.VistaRegistroReparacion.txtcodigoEquipo.getText(),
                    this.VistaRegistroReparacion.txtDescripcion.getText(), this.VistaRegistroReparacion.txtTecnico.getText(),
                    this.VistaRegistroReparacion.txtfecha.getText());
            
            
            this.TablaRegistroRep.addRow(new Object[]{this.ModeloRegistroRep.RegisReparacion.get(0),
            this.ModeloRegistroRep.RegisReparacion.get(0).getCodigoE(),
            this.ModeloRegistroRep.RegisReparacion.get(0).getDescriRep(),
              this.ModeloRegistroRep.RegisReparacion.get(0).getTecnico(),
                this.ModeloRegistroRep.RegisReparacion.get(0).getFecha()});
                
            
            this.ModeloRegistroRep.AgregarReparacion(this.VistaRegistroReparacion.txtcodigoEquipo.getText(),
                    this.VistaRegistroReparacion.txtDescripcion.getText(),
                    this.VistaRegistroReparacion.txtTecnico.getText(),
                    this.VistaRegistroReparacion.txtfecha.getText());
            
            this.VistaRegistroReparacion.txtcodigoEquipo.setText("");
            this.VistaRegistroReparacion.txtDescripcion.setText("");
            this.VistaRegistroReparacion.txtTecnico.setText("");
            this.VistaRegistroReparacion.txtfecha.setText("");
        }
    }  
}
