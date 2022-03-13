package Methods;

public class parameter {
    public static void toplama(int a, int b) {

       System.out.println("Toplam: " + (a+b));

    }
    public static void selamlama(String isim) {

       System.out.println("Selamlar " + isim );

    }

    public static void main(String[] args) {
        
       selamlama("Kutay");
       toplama(36, 54);

    }

}