/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngo2024;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.regex.Pattern;

/**
 *
 * @author gylle
 */
public class Validering {

    public static boolean textFaltHarVarde(JTextField ruta) {
        boolean resultat = true;

        if (ruta.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "inmatningsrutan är tom");
            resultat = false;
        }
        return resultat;
    }

    public static boolean isHelTal(JTextField ruta) {
        boolean resultat = true;

        try {
            String inStrang = ruta.getText();
            //test
            int tal = Integer.parseInt(inStrang);
            //Integer.parseInt(inStrang);
            ruta.requestFocus();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Var god ange heltal");
            resultat = false;
        }
        return resultat;
    }

    //Validering för AdminProjektHantera
    //Validering för datum. 
    public static boolean isValidDate(JTextField ruta) {
        boolean resultat = true;
        // ÅÅÅÅ-MM-DD
        String datePattern = "^\\d{4}-\\d{2}-\\d{2}$";

        if (!Pattern.matches(datePattern, ruta.getText())) {
            JOptionPane.showMessageDialog(null, "Datumet måste vara i formatet ÅÅÅÅ-MM-DD");
            resultat = false;
        }
        return resultat;

    }

    //Validering för kostnad
    public static boolean isValidCost(JTextField ruta) {
        boolean resultat = true;

        try {
            String inStrang = ruta.getText();
            int kostnad = Integer.parseInt(inStrang);
            if (kostnad < 0) {
                throw new NumberFormatException();
            }
            ruta.requestFocus();
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Fyll i en giltig kostnad(positivt heltal)");
            resultat = false;

        }
        return resultat;

    }

}
