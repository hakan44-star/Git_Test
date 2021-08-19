package OOP_JavaVakti;

public class Siniflar {//Claslar

    public static void main(String[] args) {
     //OOP
       HesapMakinesi m1 = new HesapMakinesi(15,6);
        System.out.println("Toplamlarinin sonucu : " + m1.toplama());
        System.out.println("Cikarma sonucu kalan : " +m1.cikarma());
        System.out.println("Bölüm sonucu :"+m1.bölme());
        System.out.println("çarpim sonucu: " +m1.carpma());



    }
}
