package Yazılım_Bilimi;

import java.util.Scanner;

public class AtmProgramı {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int bakiye = 1000;
        String islemler = "1.islem : Bakiye Öğrenme\n"
                + "2.islem : Para Cekme\n"
                + "3.İslem :Para Yatirma : \n"
                + "Cikis için q'a basın ";


        System.out.println("***********************************");
        System.out.println(islemler);
        System.out.println("***********************************");

        while (true) {
            System.out.println("İslem seciniz :");
            String islem = scan.nextLine();

            if (islem.equals("q")) {System.out.println("Programdan cıkılıyor............");
                break;}
            else if (islem.equals("1")) {System.out.println("Bakiyeniz : " + bakiye);}
            else if (islem.equals("2")) {System.out.println("Çekmek istediğiniz tutar ");
                int tutar = scan.nextInt();
                scan.nextLine();

                if (bakiye - tutar < 0) {
                    System.out.println("Yeterli Bakiye Yok" + bakiye);

                } else {bakiye = bakiye - tutar;
                    System.out.println("Yeni bakiyeniz :" + bakiye);}
            } else if (islem.equals("3")) {
                System.out.println("Yatirmak istediğiniz  tutar giriniz");
                int tutar = scan.nextInt();
                scan.nextLine();
                bakiye += tutar;
                System.out.println("Yeni bakiyeniz " + bakiye);


            } else {System.out.println("Kullanıcı yanliş giris yapmıştır .Lütfen tekrar deneyiniz ! ");}}}}
