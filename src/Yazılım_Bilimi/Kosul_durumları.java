package Yazılım_Bilimi;

import java.util.Scanner;

public class Kosul_durumları {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz : ");
        int yas = scan.nextInt();


        if (yas >0  ){

            if (yas<=18){
            System.out.println("Bu mekana giremezsiniz");}

            else if (yas>=18){
                System.out.println("girebilirsiniz");
            }

            else {
                System.out.println("lÜTFEN GECERLİ BİR RAKAM GİRİNİZ");
            }

        }


    }
}
