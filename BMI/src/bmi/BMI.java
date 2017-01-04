/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author Nikodem
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Kalkulator liczący BMI ");
        
        Scanner odczyt = new Scanner (System.in);
      System.out.println("Podaj swoją wagę w kg: ");
      float waga = odczyt.nextFloat();
      System.out.println("Podaj swój wzrost w cm: ");
     float wzrost = odczyt.nextFloat();
    
      float BMI = waga / (wzrost * wzrost)*10000;
      
    
        if (BMI<18.9)
        {System.out.println(BMI + " Niedowaga: jedz więcej :) ");}

        else if (BMI>18.5&&BMI<24.9)
        {System.out.println(BMI + " Waga prawidłowa: brawo TY");}

        else 
        { System.out.println(BMI + " Nadwaga: jedz mniej :(" );}
   }}

  


    
 