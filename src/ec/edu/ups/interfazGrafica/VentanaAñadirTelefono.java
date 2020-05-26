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
public class VentanaAñadirTelefono extends Frame{
    
    //Paneles
    private Panel panelPrincipal;
    private Panel panelRegistro;
    private Panel panelBotones;

    //Botones
    private Button bAñadir;
    private Button bVolver;

    //Textos
    private Label codigo;
    private Label numero;
    private Label tipo;
    private Label operadora;

    public VentanaAñadirTelefono() {
        
        this.setTitle("Añadir Telefono");
        this.setSize(600, 400);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        
        panelPrincipal = new Panel(new BorderLayout());
        panelRegistro = new Panel(new GridLayout(4, 2, 10, 25));
        panelBotones = new Panel();

        bAñadir = new Button("Añadir");
        bVolver = new Button("Volver");

        codigo = new Label("Codigo:", Label.CENTER);
        numero = new Label("Numero:", Label.CENTER);
        tipo = new Label("Tipo:", Label.CENTER);
        operadora = new Label("Operadora:", Label.CENTER);
        
        panelRegistro.add(codigo);
        panelRegistro.add(new TextField());
        panelRegistro.add(numero);
        panelRegistro.add(new TextField());
        panelRegistro.add(tipo);
        panelRegistro.add(new TextField());
        panelRegistro.add(operadora);
        panelRegistro.add(new TextField());
        panelBotones.add(bAñadir);
        panelBotones.add(bVolver);
        
        panelPrincipal.add(panelRegistro, BorderLayout.CENTER);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);
        panelPrincipal.add(new Panel(), BorderLayout.EAST);
        panelPrincipal.add(new Panel(), BorderLayout.WEST);

        this.add(panelPrincipal);
    }
}
