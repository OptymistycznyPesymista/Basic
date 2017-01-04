/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tax;

import java.util.Scanner;

/**
 *
 * @author Nikodem
 */
public class Tax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println(" Program liczący podatek dochodowy od osób fizycznych");
        
        Scanner odczyt = new Scanner (System.in);
      System.out.println("Podaj swój dochód");
      int dochod = odczyt.nextInt();
      double tax;
      
      if (dochod<85528) {
         tax = dochod*0.18-556.02;
      System.out.println("Podatek wynosi " + tax);}
      
      else {
      tax = 14839.02+0.32*dochod;
      System.out.println("Podatek wynosi " + tax);
      
              }
     
              }
}


    
