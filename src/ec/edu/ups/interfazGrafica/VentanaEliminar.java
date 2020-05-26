/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfazGrafica;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

/**
 *
 * @author ariel
 */
public class VentanaEliminar extends Frame{
    
    //Paneles
    private Panel panelPrincipal;
    private Panel panelEliminar;
    private Panel panelBoton;
    
    //Botones
    private Button botonEliminar;
    private Button botonVolver;
    
    //Texto
    private Label codigo;

    public VentanaEliminar() {
        
        this.setTitle("Eliminar Telefono");
        this.setSize(400, 120);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        
        panelPrincipal = new Panel(new BorderLayout());
        panelEliminar = new Panel(new GridLayout(1, 3, 20, 0));
        panelBoton = new Panel();
        
        botonEliminar = new Button("Eliminar");
        botonVolver = new Button("Volver");
        
        codigo = new Label("Codigo:");
        
        panelBoton.add(botonVolver);
        
        panelEliminar.add(codigo);
        panelEliminar.add(new TextField());
        panelEliminar.add(botonEliminar);
        
        panelPrincipal.add(panelEliminar, BorderLayout.CENTER);
        panelPrincipal.add(panelBoton, BorderLayout.SOUTH);
        panelPrincipal.add(new Panel(), BorderLayout.EAST);
        panelPrincipal.add(new Panel(), BorderLayout.WEST);
        
        this.add(panelPrincipal);
    }
    
}
