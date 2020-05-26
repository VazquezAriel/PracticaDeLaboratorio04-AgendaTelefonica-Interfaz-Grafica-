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
public class VentanaEditar extends Frame{
    
    //Paneles
    private Panel panelPrincipal;
    private Panel panelEditar;
    private Panel panelBotones;
    private Panel panelCodigo;
    
    //Botones
    private Button bGuardar;
    private Button bVolver;
    private Button bBuscar;
    
    //Textos
    private Label codigo;
    private Label numero;
    private Label tipo;
    private Label operadora;

    public VentanaEditar() {
        
        this.setTitle("Editar Telefono");
        this.setSize(600, 400);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        
        panelPrincipal = new Panel(new BorderLayout());
        panelEditar = new Panel(new GridLayout(5, 2, 15, 25));
        panelBotones = new Panel();
        panelCodigo = new Panel(new GridLayout(1, 2, 25, 0));
        
        bGuardar = new Button("Guardar");
        bVolver = new Button("Volver");
        bBuscar = new Button("Buscar");
        
        codigo = new Label("Codigo", Label.CENTER);
        numero = new Label("Numero", Label.CENTER);
        tipo = new Label("Tipo", Label.CENTER);
        operadora = new Label("Operadora", Label.CENTER) ;       
        
        panelBotones.add(bGuardar);
        panelBotones.add(bVolver);
        
        panelCodigo.add(codigo);
        panelCodigo.add(new TextField());
        
        panelEditar.add(new Panel());
        panelEditar.add(new Panel());
        panelEditar.add(panelCodigo);
        panelEditar.add(bBuscar);
        panelEditar.add(numero);
        panelEditar.add(new TextField());
        panelEditar.add(tipo);
        panelEditar.add(new TextField());
        panelEditar.add(operadora);
        panelEditar.add(new TextField());
        
        panelPrincipal.add(panelEditar, BorderLayout.CENTER);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);
        panelPrincipal.add(new Panel(), BorderLayout.EAST);
        panelPrincipal.add(new Panel(), BorderLayout.WEST);
        
        this.add(panelPrincipal);
        
        
    }
    
}
