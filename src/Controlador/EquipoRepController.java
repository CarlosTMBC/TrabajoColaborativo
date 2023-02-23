
package Controlador;

import Modelo.EquipoRModel;
import Vistas.frmEquipo;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class EquipoRepController implements ActionListener {
    frmPrincipal VistaPrincipal;
    frmEquipo VistaEquiposR;
    EquipoRModel ModeloEquiposR;
    public DefaultTableModel TablaEquiposR = new DefaultTableModel();
    
    // LEVANTAR DE FORMA AUTOMATICA EL FORMULARIO PRINCIPAL

    public EquipoRepController(frmPrincipal VistaPrincipal, frmEquipo VistaEquiposR, EquipoRModel ModeloEquiposR) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaEquiposR = VistaEquiposR;
        this.ModeloEquiposR = ModeloEquiposR;
        this.VistaPrincipal.btnEquipo.addActionListener(this);
        
        
        this.TablaEquiposR.addColumn("MARCA");
        this.TablaEquiposR.addColumn("MODELO");
        this.TablaEquiposR.addColumn("TIPO");
        this.TablaEquiposR.addColumn("PROBLEMA");
           
        this.VistaEquiposR.jtIngresoComputadoras.setModel(TablaEquiposR);
        
        
    }  
        
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnEquipo)
        {
            this.VistaEquiposR.btnIngresar.addActionListener(this);
            
            this.VistaEquiposR.setLocationRelativeTo(null);
            this.VistaEquiposR.setVisible(true);
            
            
        }
        
        if(e.getSource()==this.VistaEquiposR.btnIngresar)
        {
            
            this.ModeloEquiposR.AgregarUsuarios(this.VistaEquiposR.txtMarca.getText(),
                    this.VistaEquiposR.txtModelo.getText(), this.VistaEquiposR.txtTComputadoras.getText(),
                    this.VistaEquiposR.txtProblema.getText());
            
            
            this.TablaEquiposR.addRow(new Object[]{this.ModeloEquiposR.ListaEquipoR.get(0),
            this.ModeloEquiposR.ListaEquipoR.get(0).getModelo(),
            this.ModeloEquiposR.ListaEquipoR.get(0).getTipoPc(),
            this.ModeloEquiposR.ListaEquipoR.get(0).getProblema()});
                
            
            this.ModeloEquiposR.AgregarUsuarios(this.VistaEquiposR.txtMarca.getText(),
                    this.VistaEquiposR.txtModelo.getText(), this.VistaEquiposR.txtTComputadoras.getText(),
                    this.VistaEquiposR.txtProblema.getText());
            this.VistaEquiposR.txtMarca.setText("");
            this.VistaEquiposR.txtModelo.setText("");
            this.VistaEquiposR.txtTComputadoras.setText("");
            this.VistaEquiposR.txtProblema.setText("");
        }
    }  
}
