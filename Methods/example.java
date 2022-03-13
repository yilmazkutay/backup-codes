package Methods;

import java.util.Scanner;

public class example {
    public static void selamlama() {
       
       System.out.println("Merhaba,");
       System.out.println("Nasılsınız?");

    }

    public static void faktoriyel() {

      Scanner scanner = new Scanner(System.in);
      scanner.close();

      System.out.print("Bir sayı giriniz: ");
      int sayi = scanner.nextInt();

      int faktoriyel = 1;

      while (sayi > 0) {

           faktoriyel *= sayi;
           sayi--;

      }

    System.out.println("Faktoriyel: " + faktoriyel);


    }
    public static void main(String[] args) {
        
    selamlama();
    faktoriyel();

    }

}