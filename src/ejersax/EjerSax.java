/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejersax;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alu2017440
 */
public class EjerSax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salir = false;
        
        do{
            try {
                int option = 0;
                Templates.menu();
                
                option = Control.pedirEntero("Que quiere hacer?");
                
                switch(option){
                    case 1:
                        System.out.println("Estructura del fichero");
                        Templates.saxParser();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        salir = true;
                        break;
                        
                }
            } catch (IOException ex) {
                Logger.getLogger(EjerSax.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }while(!salir);
    }
    
}
