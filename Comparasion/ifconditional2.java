package Comparasion;

import java.util.Scanner;

public class ifconditional2 {
    public static void main(String[] args) {
        
     // koşul sağlanınca if, sağlanmadığı taktirde else çalışır.

      Scanner scanner = new Scanner(System.in);
      scanner.close();

      System.out.println("Lütfen bir sayı giriniz:");
      int sayi = scanner.nextInt();

       if (sayi < 0) {

        System.out.println("Negatif");
      
       }
       else {

        System.out.println("Pozitif veya sıfır");

       }

   }

}