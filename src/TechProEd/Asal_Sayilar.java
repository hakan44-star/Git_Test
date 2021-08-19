package TechProEd;

import java.util.Scanner;

public class Asal_Sayilar {
    public static void main(String[] args) {

        System.out.println("*************Asal Sayilar************* \n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz : ");
        int sayi = scan.nextInt();


        int sayac = 0;//kontrol için bir değişken oluşturduk

        for (int i = 1; i <= sayi; i++) { //for döngüsü açtık sayimiza kadar sayacak
            if (sayi % i == 0) { //eğer sayı ile i bölündüğünde kalan 0 ise a bir artacak
                sayac++;
            }
        }
        if (sayac == 2) //a, 2 olmuşsa yani sadece bir ve kendisine bölünmüşse asaldır.
            System.out.println("Seçtiğiniz sayı asaldır.");
        else //eğer daha fazla çıkmışsa asal değildir.
            System.out.println("Seçtiğiniz sayı asal değildir.");
    }
}




