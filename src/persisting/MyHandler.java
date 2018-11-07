/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persisting;

import Model.Arbol;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author alu2017440
 */
public class MyHandler extends DefaultHandler{
    
    private ArrayList<String> elemetList = new ArrayList<>(); 
    private Arbol actualElementName;
    private int treecounter = 0;
    private boolean isKeySet = false;
    private String key = "";

    public ArrayList<String> getElemetList() {
        return elemetList;
    }

    public int getTreecounter() {
        return treecounter;
    }
    

    @Override
    public void characters(char[] chars, int i, int i1) throws SAXException {
//        String text = new String(chars);
//        String content = text.substring(i, i + i1);
            String value = new String(chars, i, i1).trim();
            System.out.println(value);
            if(value.length() == 0){
                System.out.println("---------------");
            }
        
            
    }

    @Override
    public void endElement(String string, String string1, String string2) throws SAXException {
        String element = "";
        if(string2.equalsIgnoreCase("arbre")){
            treecounter++;
        }
        
        if(ejersax.ArbolController.elementController(elemetList, string2) <= 1){
            elemetList.add(string2);
        }

    }

    @Override
    public void startElement(String string, String string1, String string2, Attributes atrbts) throws SAXException {
        String element = "";
        
         if(ejersax.ArbolController.elementController(elemetList, string2) <= 1){
            elemetList.add(string2);
        }
        
    }

    
    

    
    
}
