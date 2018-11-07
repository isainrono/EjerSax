/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persisting;

import Model.Arbol;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author alu2017440
 */
public class MyHandler extends DefaultHandler{
    
    private ArrayList<Arbol> elemetList = new ArrayList<>(); 
    private Arbol actualElementName;

    public ArrayList<Arbol> getElemetList() {
        return elemetList;
    }
    
    

    @Override
    public void characters(char[] chars, int i, int i1) throws SAXException {
        String text = new String(chars);
        String content = text.substring(i, i + i1);
        actualElementName.setElementName(content);
    }

    @Override
    public void endElement(String string, String string1, String string2) throws SAXException {
        String element = "";
        
        if(string2.equalsIgnoreCase(element)){
            System.out.println(string2);
            elemetList.add(actualElementName);
        }
    }

    @Override
    public void startElement(String string, String string1, String string2, Attributes atrbts) throws SAXException {
        String element = "";
        
        if(string2.equalsIgnoreCase(element)){
            System.out.println(string2);
            actualElementName = new Arbol();
        }
    }

    
    

    
    
}
