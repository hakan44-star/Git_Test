package Yazılım_Bilimi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int giris_hakki = 3;

        String sys_kullanici_adi = "Hakan Tetik";
        String sys_parola = "12345";
        System.out.println("************************");
        System.out.println("Kullanici girişine hoşgeldiniz .....");
        System.out.println("************************");
        while (true) {
            System.out.println("Kullanici adi :");
            String kullanici = scan.nextLine();
            System.out.println("Parola : ");
            String parola = scan.nextLine();

            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("Hoşgeldiniz  " + kullanici);
                break;
            }

             else if(kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){
                System.out.println("parolaniz yanlis Lütfen tekrar deneyiniz ");
                giris_hakki =giris_hakki-1;//giris_hakki-=1;
            }
            else if(! kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("Kullanici adiniz yanlis Lütfen tekrar deneyiniz ");
                giris_hakki =giris_hakki-1;//giris_hakki-=1;
            }

            else {
                System.out.println("Kullanici adıniz ve parolaniz yanlis");
                giris_hakki =giris_hakki-1;
            }

            if (giris_hakki ==0){
                System.out.println("Giris hakkiniz bitti . Tekrar bekleriz");
                break;

            }
        }

    }
}
