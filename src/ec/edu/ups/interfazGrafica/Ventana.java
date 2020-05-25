/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfazGrafica;

import java.awt.Frame;

/**
 *
 * @author ariel
 */
public class Ventana extends Frame{
    
    public Ventana(String titulo) {
        this.setTitle(titulo);
        this.setSize(600, 400);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }
    
}
