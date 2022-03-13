package Inheritance.Company;

public class yazilimci extends calisan { // SubClass

    private String diller;

    public yazilimci(String ad, String soyad, int id, String diller) {
       super(ad, soyad, id);
 
       this.diller = diller;
    }

    public void format_at(String isletim_sistemi) {

       System.out.println(getAd() + " " + isletim_sistemi + " yüklemekte");
    }

    @Override
    public void bilgiler() {
        
       super.bilgiler();

       System.out.println("Yazılımcının bildiği diller: " + diller);
    }

}