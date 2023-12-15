/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base.pkgfinal;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author danie
 */
public class BaseFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        
        Controlador c = new Controlador(vista, modelo);
        //c.iniciar();
        vista.setVisible(true);
    }
    
}
