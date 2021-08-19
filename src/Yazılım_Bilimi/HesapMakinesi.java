package Yazılım_Bilimi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*************************************");
        String islemler ="1.Toplama işlemi \n"
                +"2.Çıkarma işlemi\n"+
                "3.Çarpma işlemi\n"
                + "4.Bölme işlemi";


        System.out.println(islemler);
        System.out.println("******************************************");
        System.out.println("İşlemi seçiniz : ");
        String islem = scan.nextLine();
         int a ,b;
        switch (islem){

            case "1":
                System.out.println("Birinci sayi : ");
                 a = scan.nextInt();
                System.out.println("İkinci sayi : ");
                 b = scan.nextInt();
                System.out.println("Toplam : " +(a+b));
                break;
            case "2":
                System.out.println("Birinci sayi : ");
                 a = scan.nextInt();
                System.out.println("İkinci sayi : ");
                  b = scan.nextInt();
                System.out.println("Kalan : " +(a-b));
                break;
            case "3":
                System.out.println("Birinci sayi : ");
                  a = scan.nextInt();
                System.out.println("İkinci sayi : ");
                 b = scan.nextInt();
                System.out.println("Çarpim : " +(a*b));
                break;
            case "4":
                System.out.println("Birinci sayi : ");
                  a = scan.nextInt();
                System.out.println("İkinci sayi : ");
                 b = scan.nextInt();
                System.out.println("Bölüm  : " +(a/b));
                break;
            default:
                System.out.println("Lütfen geçerli bir secim yapınız");

        }
    }
}
