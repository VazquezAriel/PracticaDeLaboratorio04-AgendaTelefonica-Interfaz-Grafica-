/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfazGrafica;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

/**
 *
 * @author ariel
 */
public class VentanaRegistro {

    public static void main(String[] args) {
        Ventana ventanaRegistro = new Ventana("Registro");

        Panel panelPrincipal = new Panel(new BorderLayout());
        Panel panelRegistro = new Panel(new GridLayout(6, 2, 10, 10));
        Panel panelBotones = new Panel();

        Button bRegistrar = new Button("Registrar");
        Button bVolver = new Button("Volver");

        Label cedula = new Label("Cedula:", Label.CENTER);
        Label nombre = new Label("Nombre:", Label.CENTER);
        Label apellido = new Label("Apellido:", Label.CENTER);
        Label correoElectronico = new Label("Correo Electronico:", Label.CENTER);
        Label contraseña = new Label("Contraseña:", Label.CENTER);

        panelRegistro.add(cedula);
        panelRegistro.add(nombre);
        panelRegistro.add(new TextField());
        panelRegistro.add(nombre);
        panelRegistro.add(new TextField());
        panelRegistro.add(apellido);
        panelRegistro.add(new TextField());
        panelRegistro.add(correoElectronico);
        panelRegistro.add(new TextField());
        panelRegistro.add(contraseña);
        panelRegistro.add(new TextField());
        panelBotones.add(bRegistrar);
        panelBotones.add(bVolver);

        panelPrincipal.add(panelRegistro, BorderLayout.CENTER);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);
        panelPrincipal.add(new Panel(), BorderLayout.EAST);
        panelPrincipal.add(new Panel(), BorderLayout.WEST);
        
        ventanaRegistro.add(panelPrincipal);
    }
}
