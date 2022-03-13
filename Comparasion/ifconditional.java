package Comparasion;

import java.util.Scanner;

public class ifconditional {
    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);
     scanner.close();

    System.out.println("Lütfen bir işlem giriniz:");
    int islem = scanner.nextInt();
  
    if (islem == 1) {

        System.out.println("1. işlem");

    }
    else if (islem == 2) {

        System.out.println("2. işlem");

    }
    else if (islem == 3) {

        System.out.println("3. işlem");

    }
    else if (islem == 4) {

        System.out.println("4. işlem");

    }
    else {

        System.out.println("Geçersiz işlem!");

    }

  }

}