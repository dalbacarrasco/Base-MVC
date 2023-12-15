/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author danie
 */
public class Controlador implements ActionListener{
    private Vista view;
    private Modelo model;
    
    public Controlador(Vista view, Modelo model){
        this.view = view;
        this.model = model;
        this.view.btn_multiplicar.addActionListener(this);
    }
    
    public void iniciar(){
        view.setTitle("MVC");
        view.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setNumUno(Integer.parseInt(view.txt_num_uno.getText()));
        model.setNumDos(Integer.parseInt(view.txt_num_dos.getText()));
        
        view.txt_resultado.setText(String.valueOf(model.multiplicar()));
    }
    
}
