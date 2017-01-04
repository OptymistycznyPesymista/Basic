/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprzedazratalna;

import java.util.Scanner;

/**
 *
 * @author Nikodem
 */
public class SprzedazRatalna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(" Program wyliczający wysokość miesięcznej raty za zakupiony sprzęt");
        
        Scanner odczyt = new Scanner (System.in);
        System.out.println("Podaj cenę towaru: (od 100zł do 10k zł) ");
        float price = odczyt.nextFloat();
        System.out.println("Podaj ilość rat: (od 6 do 48) ");
        int installment = odczyt.nextInt();
        float rata;
        
        if (price>100 && price<10000 && installment>6 && installment<48){
            
         if (installment>=6 && installment<=12)  
         { rata = (float) ((price/installment) * 0.025) + price/installment;
           System.out.println("Rata wynosi " + rata);
         } 
         
         if (installment>=13 && installment<=24)
          { rata = (float) ((price/installment) * 0.5) + price/installment;
            System.out.println("Rata wynosi " + rata);
          }    
         
         if (installment>=25 && installment<=48)
            { rata = (float) ((price/installment) * 0.1)+price/installment;
            System.out.println("Rata wynosi " + rata);
            }
        
        }
        
        else { 
            System.out.println(" Proszę podać dane jeszcze raz zgodne z przedziałem ");  
                    System.out.println("Podaj cenę towaru: (od 100zł do 10k zł) "); 
            price = odczyt.nextInt();
             System.out.println("Podaj ilość rat: (od 6 do 48) ");
            installment = odczyt.nextInt();
        }
    }
    
}
