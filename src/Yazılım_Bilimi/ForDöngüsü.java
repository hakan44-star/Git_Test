package Yazılım_Bilimi;

import java.time.chrono.JapaneseChronology;
import java.util.Scanner;

public class ForDöngüsü {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <=15; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println( " ");



        }

        for (int l = 2; l < 100; l*=2) {
            System.out.println(l);

        }


        int faktoriyel =1;
        System.out.println("lütfen bir sayi giriniz : ");
        int sayi =scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            faktoriyel *=i;
            System.out.println(" Faktöryel = " + faktoriyel + " sayi : " +i);

        }

        System.out.println("Faktöryel :" +faktoriyel);
    }
}
