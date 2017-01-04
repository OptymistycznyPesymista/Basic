/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author Nikodem
 */
public class ConverterCelsjusztoFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println(" Program przelicza stopnie z Celsjusza na Fahrenheita");
        
         Scanner odczyt = new Scanner(System.in);
         System.out.println("Podaj temperaturę w Celsjuszach");
        double Celsjusz = odczyt.nextDouble();
        
        
     double Fahrenheit = 1.8*Celsjusz+32.0;
        
     System.out.println("Stopnie w Fahrenheitach:");
     System.out.println(Fahrenheit);
        
    }
    
}
