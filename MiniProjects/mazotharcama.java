package MiniProjects;

import java.util.Scanner;

public class mazotharcama { // km başına ne kadar mazot yakıldığını hesaplama
    public static void main(String[] args) {
       
     Scanner scanner = new Scanner(System.in);
     scanner.close();

     System.out.println("Aracınız km başına kaç kuruş yakıyor?");
     double kurus = scanner.nextDouble();

     System.out.println("Aracınızla kaç km yolculuk yaptınız?");
     int km = scanner.nextInt();

     System.out.println("Toplam tutar = " + (kurus * km) + " tl'dir.");

  }
    
}