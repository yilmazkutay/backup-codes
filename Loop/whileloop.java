package Loop;

import java.util.Scanner;

public class whileloop {
   public static void main(String[] args) {
       
   // koşul doğru olduğu sürece çalışır.

   int i = 10;

   while (i <= 100) {

      System.out.println("i = " + i);
      i += 3;
      
   }

    Scanner scanner = new Scanner(System.in);
    scanner.close();
    
    System.out.print("Bir sayı giriniz: "); 

    int sayi = scanner.nextInt();

    int fakt = 1;

    while (sayi > 1) {

       fakt *= sayi;
       sayi--;

    }

System.out.println("Faktoriyel = " + fakt);

   }
  
}