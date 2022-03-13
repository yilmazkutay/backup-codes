package MiniProjects;

import java.util.Scanner;

public class bkihesaplama { // beden kitle indeksini hesaplama
    public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      scanner.close();

      System.out.println("Lütfen kilonuzu giriniz:");
      int kilo = scanner.nextInt();

      System.out.println("Lütfen boyunuzu giriniz:");
      double boy = scanner.nextDouble();

      double bki = kilo / (boy * boy);

      System.out.println("Beden Kitle İndeksiniz: " + bki);
 
    }

}