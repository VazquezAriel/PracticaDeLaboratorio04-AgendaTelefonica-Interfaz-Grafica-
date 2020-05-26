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

/**
 *
 * @author ariel
 */
public class VentanaUsuario extends Frame {

    //Paneles
    private Panel panelPrincipal;
    private Panel panelBotones;
    private Panel panelSubBotones;
    private Panel panelUsuario;
    private Panel panelUsuario2;

    //Botones
    private Button botonAñadir;
    private Button botonTelefonos;
    private Button botonEditar;
    private Button botonEliminar;
    private Button botonEditarDatos;
    private Button botonElminarCuenta;
    private Button botonSalir;

    public VentanaUsuario() {
        
        this.setTitle("Usuario");
        this.setSize(600, 400);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        
        panelPrincipal = new Panel(new BorderLayout());
        panelUsuario = new Panel(new GridLayout(1, 2, 30, 0));
        panelUsuario2 = new Panel(new GridLayout(10, 1));
        panelBotones = new Panel(new GridLayout(4, 1, 0, 20));
        panelSubBotones = new Panel();
        
        botonAñadir = new Button("Añadir Telefono");
        botonTelefonos = new Button("Telefonos");
        botonEditar = new Button("Editar Telefonos");
        botonEliminar = new Button("Eliminar Telefono");
        botonEditarDatos = new Button("Editar Datos");
        botonElminarCuenta = new Button("Eliminar esta cuenta");
        botonSalir = new Button("Salir");
        
        panelBotones.add(botonAñadir);
        panelBotones.add(botonTelefonos);
        panelBotones.add(botonEditar);
        panelBotones.add(botonEliminar);
        
        panelSubBotones.add(botonEditarDatos);
        panelSubBotones.add(botonElminarCuenta);
        panelSubBotones.add(botonSalir);
        
        panelUsuario2.add(new Panel());
        panelUsuario2.add(new Label("Foto", Label.CENTER));
        panelUsuario2.add(new Panel());
        panelUsuario2.add(new Label("Cedula: 0302610076", Label.CENTER));
        panelUsuario2.add(new Label("Nombre: Ariel", Label.CENTER));
        panelUsuario2.add(new Label("Apellido: Vazquez", Label.CENTER));
        panelUsuario2.add(new Label("Correo Electronico: ariel.renato.av@gmail.com", Label.CENTER));
        panelUsuario2.add(new Label("Contraseña: Usuario1", Label.CENTER));
        panelUsuario2.add(new Panel());
        panelUsuario2.add(panelSubBotones);
        
        panelUsuario.add(panelUsuario2);
        panelUsuario.add(panelBotones);
        
        panelPrincipal.add(panelUsuario, BorderLayout.CENTER);
        panelPrincipal.add(new Panel(), BorderLayout.SOUTH);
        panelPrincipal.add(new Panel(), BorderLayout.EAST);
        panelPrincipal.add(new Panel(), BorderLayout.WEST);
        
        this.add(panelPrincipal);
    }
    
}
