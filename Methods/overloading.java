package Methods;

public class overloading {

    public static void toplama(int a, int b) {
        
       System.out.println("Toplam = " + (a+b));
    }

    public static void toplama(int a, int b, int c) {
        
       System.out.println("Toplam = " + (a+b+c));
    }

    public static void main(String[] args) {
        
       toplama(2, 3);
       toplama(2, 3, 4);
        
    }

}