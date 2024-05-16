/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngo2024;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author gylle
 */
public class Validering {
    
    public static boolean textFaltHarVarde(JTextField ruta){
        boolean resultat = true;
        
        if(ruta.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null,"inmatningsrutan är tom");
              resultat = false;
        }
    return resultat;
    }
   public static boolean isHelTal(JTextField ruta){
       boolean resultat = true;
       
       try{
       String inStrang = ruta.getText();
       Integer.parseInt(inStrang);
       ruta.requestFocus();
       
   }
      catch(NumberFormatException e){
          JOptionPane.showMessageDialog(null, "Var god ange heltal");
          resultat = false;
      }
       return resultat;
   }
}
