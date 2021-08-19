package Yazılım_Bilimi;

import java.util.Scanner;

public class Hipotenüs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int a  ,b;
        System.out.println("Birinci Kenar : ");
        a =scan.nextInt();
        System.out.println("İkinci Kenar : ");
        b=scan.nextInt();

      double hipo = Math.sqrt(a*a+b*b);
        System.out.println("Dik üçğenin hipotenüsü : " + hipo);


    }
}
