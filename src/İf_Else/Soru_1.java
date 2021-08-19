package İf_Else;

import java.util.Scanner;

public class Soru_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki tam sayı giriniz ");
        int sayi1=scan.nextInt();
        int sayi2 =scan.nextInt();

        if (sayi1>=0&& sayi2>0){
            if (sayi1+sayi2 <1000){
                System.out.println("Numaralarin  toplami :" +(sayi1+sayi2));
            }

            else {
                System.out.println("OverFlow");
            }
        }

    }
}
