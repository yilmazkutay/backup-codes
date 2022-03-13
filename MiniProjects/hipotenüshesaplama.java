package MiniProjects;

import java.util.Scanner;

public class hipotenüshesaplama { // hipotenüs hesaplama
    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);
     scanner.close();

     int a;
     int b;

     System.out.println("Birinci Kenar: ");
     a = scanner.nextInt();

     System.out.println("İkinci Kenar: ");
     b = scanner.nextInt();

     double h = Math.sqrt(a * a + b * b); // Math.sqrt ifadesi karekök almaya yarar.

     System.out.println("Hipotenüs: " + h);

    }

}