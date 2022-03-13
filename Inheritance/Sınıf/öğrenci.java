package Inheritance.Sınıf;

public class öğrenci {
 
   private String ad;
   private String soyad;
   private int yas;
   private int no;

   private int matematik = 85;
   private int fizik = 78;
   private int kimya = 90;

   public öğrenci(String ad, String soyad, int yas, int no) {

      this.ad = ad;
      this.soyad = soyad;
      this.yas = yas;
      this.no = no;
   }

   public String getAd() {
      return ad;
   }

   public void setAd(String ad) {
      this.ad = ad;
   }

   public String getSoyad() {
      return soyad;
   }

   public void setSoyad(String soyad) {
      this.soyad = soyad;
   }

   public int getYas() {
      return yas;
   }

   public void setYas(int yas) {
      this.yas = yas;
   } 

   public int getNo() {
      return no;
   }

   public void setNo(int no) {
      this.no = no;
   }

   public void öğrenci_bilgileri() {

      System.out.println("Adı: " + ad);
      System.out.println("Soyadı: " + soyad);
      System.out.println("Yaşı: " + yas);
      System.out.println("Numarası: " + no);
   }

   public void sınav_sonucları() {

      System.out.println("Matematik sınavı: " + matematik);
      System.out.println("Fizik sınavı: " + fizik);
      System.out.println("Kimya sınavı: " + kimya);
   }
 
}