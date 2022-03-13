package Inheritance.Company;

public class yönetici extends calisan { // SubClass

   private int sirket_bünyesi;
  
   public yönetici(String ad, String soyad, int id, int sirket_bünyesi) {
      super(ad, soyad, id);

      this.sirket_bünyesi = sirket_bünyesi;
   }

   @Override
   public void bilgiler() {
    
      super.bilgiler();
    
      System.out.println("Sorumlu olduğu personel sayısı: " + sirket_bünyesi); 
   }

   public void zam(int zam_miktari) {

      System.out.println(getAd() + " adlı çalışanımıza " + zam_miktari + " kadar zam yapılacaktır");
   }

}