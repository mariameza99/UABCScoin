/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uabcscoin;

import Controller.CtrolLogin;
import Model.Usuario;
import View.VLogin;

/**
 *
 * @author sears
 */
public class UABCScoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        VLogin view = new VLogin();
        CtrolLogin controller = new CtrolLogin(view);
        controller.init();
    }
    
}
