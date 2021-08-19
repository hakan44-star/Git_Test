package Yazılım_Bilimi;

import java.util.Scanner;

public class MAximum_sayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayi : ");
        int a = scan.nextInt();
        System.out.println("İkinci sayi : ");
        int b = scan.nextInt();
        System.out.println("Ücüncü sayi : ");
        int c = scan.nextInt();

        int max =1;

        if (a>=b && a>=c){
            max =a;
        }

        else if (b>=a && b>=c){
            max =b;
        }

        else {
           max =c;
        }
        System.out.println("Maximum sayi :" +max);


    }
}
