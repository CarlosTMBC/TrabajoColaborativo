/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.EntregaModel;
import Vistas.frmEntregarEquipo;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author umg
 */
public class EntregaController implements ActionListener{
    
    frmPrincipal VistaPrincipal;
    frmEntregarEquipo VistaEntrega;
    EntregaModel ModeloEntrega;
    public DefaultTableModel TablaEntrega = new DefaultTableModel();

    public EntregaController(frmPrincipal VistaPrincipal, frmEntregarEquipo VistaEntrega, EntregaModel ModeloEntrega) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaEntrega = VistaEntrega;
        this.ModeloEntrega = ModeloEntrega;
        
        this.TablaEntrega.addColumn("CODIGO");
        this.TablaEntrega.addColumn("PERSONA");
        this.TablaEntrega.addColumn("FECHA");
        this.TablaEntrega.addColumn("DESCRIPCION");
        
        this.VistaEntrega.jtUsuarios.setModel(TablaEntrega);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==this.VistaPrincipal.btnEntregarEquipo)
        {
            this.VistaEntrega.btnEntregar.addActionListener(this);
            
            this.VistaEntrega.setLocationRelativeTo(null);
            this.VistaEntrega.setVisible(true);
            
            
        }
        
        if(e.getSource()==this.VistaEntrega.btnEntregar)
        {
            
            this.ModeloEntrega.AgregarEntrega(this.VistaEntrega.txtCodigo.getText(),
                    this.VistaEntrega.txtPersonaRecibe.getText(), this.VistaEntrega.txtFechaEntrega.getText(),
                    this.VistaEntrega.txtDescripcion.getText());
            
            
            this.TablaEntrega.addRow(new Object[]{this.ModeloEntrega.ListaEntrega.get(0).getCodequipo(),
            this.ModeloEntrega.ListaEntrega.get(0).getPersonarecibe(),
            this.ModeloEntrega.ListaEntrega.get(0).getFechaentrega(),
            this.ModeloEntrega.ListaEntrega.get(0).getDesolucion()});
                
            
            this.ModeloEntrega.AgregarEntrega(this.VistaEntrega.txtCodigo.getText(),
                    this.VistaEntrega.txtPersonaRecibe.getText(), this.VistaEntrega.txtFechaEntrega.getText(),
                    this.VistaEntrega.txtDescripcion.getText());
           
            this.VistaEntrega.txtCodigo.setText("");
            this.VistaEntrega.txtPersonaRecibe.setText("");
            this.VistaEntrega.txtFechaEntrega.setText("");
            this.VistaEntrega.txtDescripcion.setText("");
        }
    }  
 }
   