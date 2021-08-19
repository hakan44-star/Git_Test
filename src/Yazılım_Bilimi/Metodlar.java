package Yazılım_Bilimi;

import java.util.Scanner;

public class Metodlar {
    public static void main(String[] args) {

        System.out.println("Murat");


        toplama(5,6);

        cikarma();
        selamlama();
        faktöryel();


    }

    public static void faktöryel() {

        Scanner scan = new Scanner(System.in);
        System.out.println( "Bir sayi giriniz");
        int sayi =scan.nextInt();
        int faktoriyel =1;
        while(sayi>0){
            faktoriyel =faktoriyel*sayi;
            sayi--;


        }
        System.out.println("Faktöriyel : " +faktoriyel);




    }

    public static void selamlama() {
        System.out.println("Merhaba nasılsınız ? ");
        System.out.println("Selamlar ....");


    }


    public  static int toplama(int i, int i1) {
        return i +i1;

    }
     static void cikarma() {

        int sayi1 =10 ;
        int sayi2 =25;

        int sonuc = (sayi1- sayi2);
        System.out.println(sonuc); }
}
