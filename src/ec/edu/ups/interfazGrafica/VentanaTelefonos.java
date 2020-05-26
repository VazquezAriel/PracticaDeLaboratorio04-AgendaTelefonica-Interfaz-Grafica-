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
public class VentanaTelefonos extends Frame{
    
    //Paneles
    private Panel panelPrincipal;
    private Panel panelTelefonos;
    private Panel panelBotones;
    private Panel panelBuscar;
    
    //Botones
    private Button botonBuscar;
    private Button botonVover;
    
    //Textos
    private Label codigo;
    private Label telefono1;
    private Label telefono2;
    private Label telefono3;
    private Label telefono4;
    private Label telefono5;

    public VentanaTelefonos() {
        
        this.setTitle("Telefonos");
        this.setSize(600, 400);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        
        panelPrincipal = new Panel(new BorderLayout());
        panelTelefonos = new Panel(new GridLayout(6, 1, 0, 10));
        panelBotones = new Panel(new GridLayout(2, 1, 0, 2 ));
        panelBuscar = new Panel(new GridLayout(1, 3, 20, 0));
        
        botonBuscar = new Button("Buscar");
        botonVover = new Button("Volver");
       
        telefono1 = new Label("Telefono 1 :         Numero:  0987512  .......................................................................................................................................................");
        telefono2 = new Label("Telefono 2 :         Numero:  0348411  .......................................................................................................................................................");
        telefono3 = new Label("Telefono 3 :         Numero:  1648521  .......................................................................................................................................................");
        telefono4 = new Label("Telefono 4 :         Numero:  1796211  .......................................................................................................................................................");
        telefono5 = new Label("Telefono 5 :         Numero:  2132742  .......................................................................................................................................................");
        codigo = new Label("Codigo", Label.CENTER);
        
        panelBotones.add(botonBuscar);
        panelBotones.add(botonVover);
        
        panelBuscar.add(codigo);
        panelBuscar.add(new TextField());
        panelBuscar.add(panelBotones);
        
        panelTelefonos.add(panelBuscar);
        panelTelefonos.add(telefono1);
        panelTelefonos.add(telefono2);
        panelTelefonos.add(telefono3);
        panelTelefonos.add(telefono4);
        panelTelefonos.add(telefono5);
        
        panelPrincipal.add(panelTelefonos, BorderLayout.CENTER);
        panelPrincipal.add(new Panel(), BorderLayout.SOUTH);
        panelPrincipal.add(new Panel(), BorderLayout.EAST);
        panelPrincipal.add(new Panel(), BorderLayout.WEST);
        
        this.add(panelPrincipal);
        
    }
    
}
