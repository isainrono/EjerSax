/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejersax;


import Model.Arbol;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import persisting.MyHandler;

/**
 *
 * @author alu2017440
 */
public class Templates {
    
    public static void menu(){
        System.out.println(" ============================= ");
        System.out.println("              MENU             ");
        System.out.println(" ============================= \n");
        System.out.println(" 1 -- Estructura fichero");
        System.out.println(" 2 -- Numero de Arboles");
        System.out.println(" 3 -- Arboles con todos los nodos completos");
        System.out.println(" 4 -- Informacion de arboles por parametros");
        System.out.println(" 5 -- Salir");
    }
    
    public static void saxParser() throws IOException{
        String fileName;
       
        try {
            SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
            MyHandler myHandler = new MyHandler();
            
            fileName = Control.pedirCadena("escriba el nombre del fichero");
            parser.parse(new File(fileName + ".xml"), myHandler);
            ArrayList<Arbol> elemetList = myHandler.getElemetList();
            for(Arbol e:elemetList){
                System.out.println(e.getElementName());
            }
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Templates.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(Templates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
}
