/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Test;

import ec.edu.ups.interfazGrafica.VentanaAñadirTelefono;
import ec.edu.ups.interfazGrafica.VentanaEditar;
import ec.edu.ups.interfazGrafica.VentanaEliminar;
import ec.edu.ups.interfazGrafica.VentanaIniciarSecion;
import ec.edu.ups.interfazGrafica.VentanaPrincipal;
import ec.edu.ups.interfazGrafica.VentanaRegistro;
import ec.edu.ups.interfazGrafica.VentanaTelefonos;
import ec.edu.ups.interfazGrafica.VentanaUsuario;
import ec.edu.ups.interfazGrafica.VentanaUsuarios;

/**
 *
 * @author ariel
 */
public class Test {
    public static void main(String[] args) {
        
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        VentanaRegistro ventaRegistro = new VentanaRegistro();
        VentanaIniciarSecion ventanIniciarSecion = new VentanaIniciarSecion();
        VentanaUsuarios ventanaUsuarios = new VentanaUsuarios();
        VentanaTelefonos ventanaTelefonos = new VentanaTelefonos();
        VentanaUsuario ventanaUsuario = new VentanaUsuario();
        VentanaAñadirTelefono ventanaAñadirTelefono = new VentanaAñadirTelefono();
        VentanaEditar ventanaEditar = new VentanaEditar();
        VentanaEliminar ventanaEliminar = new VentanaEliminar();
    }
}
