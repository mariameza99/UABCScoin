/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuario;
import View.VLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author sears
 */
public class CtrolLogin implements ActionListener{

    private VLogin view;

    public CtrolLogin(VLogin view) {
        this.view = view;
    }
    
    public void init(){
        this.view.jButton1.addActionListener(this);
        this.view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.view.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String email = this.view.jTextField1.getText();
        String password = String.valueOf(this.view.jPasswordField1.getPassword());
        
        Usuario usuario = Usuario.findbyLogin(email, password);
        
        if(usuario != null){
            
        }
    }
    
}
