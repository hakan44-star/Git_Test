package Yazılım_Bilimi;

public class MetodOverloading {
    public static void main(String[] args) {
       toplama(4,5,8);
       toplama(4,5);
    }

public static void toplama(int a, int b) {
    System.out.println("Toplamlarının sonucu  :" + (a+b));
    }


    public static void toplama( int a ,int b ,int c) {

        System.out.println("Toplamlarının sonucu  :" + (a+b+c));
    }
}
