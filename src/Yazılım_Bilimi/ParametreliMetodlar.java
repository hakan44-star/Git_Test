package Yazılım_Bilimi;

public class ParametreliMetodlar {
    public static void Selamlama(String isim ) {
        System.out.println("Selamlar ...." + isim);


    }

    public static void main(String[] args) {
   Selamlama("kahraman");

   toplama(2,5,6);

        System.out.println(cikarma(6,4));
    }

    private static int cikarma(int a ,int b) {
        return a-b;


    }

    public static void toplama( int a ,int b ,int c) {

      System.out.println("Toplamlarının sonucu  :" + (a+b+c));
    }

    
    

}
