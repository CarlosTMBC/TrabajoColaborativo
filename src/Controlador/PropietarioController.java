package Controlador;

import Modelo.PropietarioModel;
import Vistas.frmPrincipal;
import Vistas.frmPropietarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class PropietarioController implements ActionListener{
    frmPrincipal VistaPrincipal;
    frmPropietarios VistaPropietario;
    PropietarioModel ModeloPropietarioUsuario;
    
    public DefaultTableModel TablaPropietario = new DefaultTableModel();

    public PropietarioController(frmPrincipal frmVistaPrincipal, frmPropietarios frmVistaPropietarioUsuario, PropietarioModel ModeloPropietarioUsuario) {
        this.VistaPrincipal = frmVistaPrincipal;
        this.VistaPropietario = frmVistaPropietarioUsuario;
        this.ModeloPropietarioUsuario = ModeloPropietarioUsuario;
        
        //PONER A LA ESCUCHA LOS BOTONES CORRESPONDIENTES
        this.VistaPrincipal.btnRegistroPropietario.addActionListener(this);
        
         this.TablaPropietario.addColumn("Apellidos");
         this.TablaPropietario.addColumn("NOMBRE");
         this.TablaPropietario.addColumn("TELEFONO");
         this.VistaPropietario.jtUsuariosPropietario.setModel(TablaPropietario);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnRegistroPropietario)
        {
            // PONER A LA ESCUCHA
            this.VistaPropietario.btnIngresarPropietario.addActionListener(this);
            // LEVANTAR VISTA PRINCIPAL
            this.VistaPropietario.setLocationRelativeTo(null);
            this.VistaPropietario.setVisible(true);
        }
        
        if(e.getSource()==this.VistaPropietario.btnIngresarPropietario)
        {
            this.ModeloPropietarioUsuario.IngresarPropietario(this.VistaPropietario.txtApellidos.getText(),
                    this.VistaPropietario.txtNombre.getText(), 
                    this.VistaPropietario.txtTelefono.getText());
         
            this.TablaPropietario.addRow(new Object[]{this.ModeloPropietarioUsuario.listaPropietario.get(0).getApellidos(),
            this.ModeloPropietarioUsuario.listaPropietario.get(0).getNombre(),
            this.ModeloPropietarioUsuario.listaPropietario.get(0).getTelefono()});
        
            
        }
    }
}    

    
    
