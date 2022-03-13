package Inheritance.Company;

import java.util.Scanner;

public class Main { // Main
   public static void main(String[] args) {

      Scanner main = new Scanner(System.in);
      // Scanner closed error
      
      System.out.println("Çalışanlar programına hoş geldiniz :)");

      String islemler = "1: Yazılımcı işlemleri\n"
                   + "2: Yönetici işlemleri\n"
                   + "q: çıkış";

      System.out.println(islemler);

      while (true) {

        System.out.print("Hangi işlemi yapmak istiyorsunuz?: ");
        String islem = main.nextLine();

        if (islem.equals("q")) {

          System.out.println("Programdan çıkılıyor...");
          break;
        }

        else if (islem.equals("1")) {

          yazilimci yazilimci1 = new yazilimci("Ahmet", "Yılmaz", 678, "java, python");
          String yazilicimci_islemleri = "1: Format at\n"
                                       + "2: Yazılımcı bilgilerini göster";

          System.out.println(yazilicimci_islemleri);

          while (true) {

            System.out.print("Hangi işlemi yapmak istiyorsunuz?: ");
            String yazilimci_islem = main.nextLine();

             if (yazilimci_islem.equals("1")) {

               System.out.print("İşletim sistemi: ");
               String isletim_sistemi = main.nextLine();

               yazilimci1.format_at(isletim_sistemi);
             }

             else if (yazilimci_islem.equals("2")) {

               yazilimci1.bilgiler();
             }

             else {

               System.out.println("Böyle bir işlem bulunmamaktadır.");
             }

          }

        }

        else if (islem.equals("2")) {

          yönetici yönetici1 = new yönetici("Kutay", "Yılmaz", 12345, 128);

          String yönetici_islemleri = "1: Zam\n"
                                    + "2: Bilgiler";

          System.out.println(yönetici_islemleri);

          while (true) {

            System.out.print("Hangi işlemi yapmak istiyorsunuz?: ");
            String yönetici_islem = main.nextLine();

            if (yönetici_islem.equals("1")) {

              System.out.print("Yapılacak zam miktarı: ");
              int zam = main.nextInt();
              main.nextLine(); // olası scanner hatasının önüne geçmek için

              yönetici1.zam(zam);
            }

            else if (yönetici_islem.equals("2")) {

              yönetici1.bilgiler();
            }

            else {

              System.out.println("Böyle bir işlem bulunmamaktadır.");
            }

          }

        }

        else {

          System.out.println("Böyle bir işlem bulunmamaktadır!");
        }

      }             
       
   }
    
}