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
public class VentanaUsuarios extends Frame{
    
    //Paneles
    private Panel panelPrincipal;
    private Panel panelUsuarios;
    private Panel panelBotones;
    private Panel panelBuscar;
    
    //Botones
    private Button botonBuscar;
    private Button botonVover;
    
    //Textos
    private Label cedula;
    private Label usuario1;
    private Label usuario2;
    private Label usuario3;
    private Label usuario4;
    private Label usuario5;

    public VentanaUsuarios() {
        
        this.setTitle("Usarios");
        this.setSize(600, 400);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        
        panelPrincipal = new Panel(new BorderLayout());
        panelUsuarios = new Panel(new GridLayout(6, 1, 0, 10));
        panelBotones = new Panel(new GridLayout(2, 1, 0, 2 ));
        panelBuscar = new Panel(new GridLayout(1, 3, 20, 0));
        
        botonBuscar = new Button("Buscar");
        botonVover = new Button("Volver");
       
        usuario1 = new Label("Usuario 1 : Pablo Alvarado      Cedula:.......................................................................................................................................................");
        usuario2 = new Label("Usuario 2 : Pedro Veles         Cedula:.......................................................................................................................................................");
        usuario3 = new Label("Usuario 3 : Juan Perez          Cedula:.......................................................................................................................................................");
        usuario4 = new Label("Usuario 4 : Maria Calle         Cedula:.......................................................................................................................................................");
        usuario5 = new Label("Usuario 5 : Ariel Vazquez       Cedula:.......................................................................................................................................................");
        cedula = new Label("Cedula o Correo Electronico", Label.CENTER);
        
        panelBotones.add(botonBuscar);
        panelBotones.add(botonVover);
        
        panelBuscar.add(cedula);
        panelBuscar.add(new TextField());
        panelBuscar.add(panelBotones);
        
        panelUsuarios.add(panelBuscar);
        panelUsuarios.add(usuario1);
        panelUsuarios.add(usuario2);
        panelUsuarios.add(usuario3);
        panelUsuarios.add(usuario4);
        panelUsuarios.add(usuario5);
        
        panelPrincipal.add(panelUsuarios, BorderLayout.CENTER);
        panelPrincipal.add(new Panel(), BorderLayout.SOUTH);
        panelPrincipal.add(new Panel(), BorderLayout.EAST);
        panelPrincipal.add(new Panel(), BorderLayout.WEST);
        
        this.add(panelPrincipal);
        
    }
    
}
