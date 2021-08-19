package Yazılım_Bilimi;

import java.util.Scanner;

public class WhileDöngüsü {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi = scan.nextInt();
         int toplam =0;
         do {
             toplam+=sayi%10;
             sayi =sayi/10;
         }while(sayi>0);
        System.out.println("Rakamlarin toplami " +toplam
        );

    }
}
