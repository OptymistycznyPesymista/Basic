/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;


import java.io.IOException;
import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Nikodem
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println(" Prosty kalkulator wykonujacy operacje +, -, * i / na dwóch liczbach ");
        
        Scanner odczyt = new Scanner (System.in);
        System.out.println(" Podaj liczbe ");
        int a = odczyt.nextInt();
        
        
        System.out.println(" Podaj typ operacji: ");
        System.out.println(" ");
        System.out.println(" Dodawanie kliknij + ");
        System.out.println(" Odejmowanie kliknij - ");
        System.out.println(" Mnożenie kliknij * ");
        System.out.println(" Dzielenie kliknij / ");
        char operacja = (char) System.in.read();
        
        System.out.println(" Podaj liczbe ");
        int b = odczyt.nextInt();     
                
               
               
                switch (operacja){
                    case '+':
                    {
                        int suma = a+b;
                        System.out.println(" Suma wynosi: " + suma);
                        break;}
                        
                    case '-': 
                    {
                        int roznica = a-b;
                        System.out.println(" Roznica wynosi: " + roznica);
                        break;}
                    
                    case '*':  
                    { 
                        int iloczyn = a*b;
                        System.out.println(" Iloczyn wynosi: "  + iloczyn);
                        break;}
                        
                    case '/':
                    { 
                      if (b!=0) { 
                         float iloraz = a/b;
                          System.out.println(" Iloraz wynosi: " + iloraz);
                         
                      }
                      else {
                      {System.out.println(" Nie dzielimy przez 0!!!");}
                    }
                    break;}
                      default:
                      {
                          System.out.println(" Nie można wykonać żądanej operacji "); 
                      break;}
                }
       

        
    

}
   }
