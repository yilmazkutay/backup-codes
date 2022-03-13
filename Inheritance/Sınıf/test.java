package Inheritance.Sınıf;

import java.util.Scanner;

public class test {
   public static void main(String[] args) {

      Scanner main = new Scanner(System.in);
      // Scanner closed error

      String islemler = "1. işlem => Öğrenci\n"
                      + "2. işlem => Öğretmen\n"
                      + "Çıkış yapmak için q tuşuna basın.";

      System.out.println(islemler);

      while (true) {
 
        System.out.print("Hangi işleme devam etmek istiyorsunuz: ");
        String islem = main.nextLine();

        if (islem.equals("q")) {

          System.out.println("Sistemden çıkılıyor...");
          break;
        }

        else if (islem.equals("1")) {

           System.out.println("Öğrenci işlemlerine hoş geldiniz.");
           öğrenci öğrenci1 = new öğrenci("Kutay", "Yılmaz", 16, 661);

           String öğrenci_islemleri = "1: Bilgiler\n"
                                    + "2: Sınavdan aldığı puanlar\n"
                                    + "Çıkış için q'ya basın.";

           System.out.println(öğrenci_islemleri);

           while (true) {

             System.out.print("Hangi işlemi yapmak istiyorsunuz?: ");
             String ö_islem = main.nextLine();

             if (ö_islem.equals("q")) {

               System.out.println("Öğrenci sisteminden çıkılıyor...");
               break;
             }

             else if (ö_islem.equals("1")) {

               öğrenci1.öğrenci_bilgileri();
             }

             else if (ö_islem.equals("2")) {

               öğrenci1.sınav_sonucları();
             }

             else {

               System.out.println("Böyle bir işlem bulunamadı!");
             }

           }

        }

        else if (islem.equals("2")) {
 
           System.out.println("Öğretmen işlemlerine hoş geldiniz.");
           öğretmen öğretmen1 = new öğretmen("Çınar", "Cevizoğlu", 43, 1023, 5000);

           String öğretmen_islemleri = "1: Bilgiler\n"
                                     + "2: Konu\n"
                                     + "Çıkış için q'ya basın.";

           System.out.println(öğretmen_islemleri);

           while (true) {

             System.out.print("Hangi işlemi yapmak istiyorsunuz?: ");
             String ört_islem = main.nextLine();

             if (ört_islem.equals("q")) {

               System.out.println("Öğretmen sisteminden çıkılıyor...");
               break;
             }

             else if (ört_islem.equals("1")) {

               öğretmen1.öğrenci_bilgileri();
             }

             else if (ört_islem.equals("2")) {

               öğretmen1.müfredat("Bitkiler");
             }

             else {

               System.out.println("Böyle bir işlem bulunamadı!");
             }

           }

        }

      }
 
   }

}