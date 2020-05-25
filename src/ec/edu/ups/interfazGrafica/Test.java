/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfazGrafica;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Point;
import java.awt.TextField;

/**
 *
 * @author ariel
 */
public class Test {
    
    public static void main(String[] args) {
       
       Ventana ventanaPrincipal = new Ventana("Agenda Telefonica UPS");
       
       Panel panelPrincipal = new Panel(new GridLayout(0, 3));
       Panel panelVacio = new Panel();
       Panel panelBotones = new Panel(new GridLayout(5, 0, 0, 15));
       
       Button bRegistrarse = new Button("Registrarse");
       Button bIniciarSesion = new Button("Iniciar secion");
       Button bUsuariosRegistrados = new Button("Usuarios Registrados");
       Button bTelefonosRegistrados = new Button("Telefonos Registrados");
       Button bSalir = new Button("Salir");
       
       panelBotones.add(bRegistrarse);
       panelBotones.add(bIniciarSesion);
       panelBotones.add(bUsuariosRegistrados);
       panelBotones.add(bTelefonosRegistrados);
       panelBotones.add(bSalir);
       
       panelPrincipal.add(panelVacio);
       panelPrincipal.add(panelBotones);
       
       ventanaPrincipal.add(panelPrincipal);
        
    }
}
