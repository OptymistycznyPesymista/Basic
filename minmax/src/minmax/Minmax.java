/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmax;

import java.util.Scanner;

/**
 *
 * @author Nikodem
 */
public class Minmax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        System.out.println(" Program wypisuje max i min liczbę z podanych trzech liczb");
        
        Scanner odczyt = new Scanner (System.in);
      System.out.println("Podaj liczbe calkowita ");
      int a = odczyt.nextInt();
      System.out.println("Podaj liczbe calkowita ");
      int b = odczyt.nextInt();
      System.out.println("Podaj liczbe calkowita ");
      int c = odczyt.nextInt();
      
      if (a>b&&c>b)
      {System.out.println("Najmniejsza liczba to " + b);
      if (a>c)
      System.out.println("Najwieksza liczba to " + a);
      else
          System.out.println("Najwieksza liczba to" + c);
      }
      
      if (b>a&&c>a)
          {System.out.println("Najmniejsza liczba to " + a);
      if (b>c)
      System.out.println("Najwieksza liczba to " + b);
      else
          System.out.println("Najwieksza liczba to" + c);
      
      if (b>c&&a>c)
          {System.out.println("Najmniejsza liczba to " + c);
      if (b>a)
      System.out.println("Najwieksza liczba to " + b);
      else
          System.out.println("Najwieksza liczba to" + a);
      
      
      
      if (b<c&&b<a)
          {System.out.println("Najmniejsza liczba to " + b);
      if (c>a)
      System.out.println("Najwieksza liczba to " + c);
      else
          System.out.println("Najwieksza liczba to" + a);
        
    }

