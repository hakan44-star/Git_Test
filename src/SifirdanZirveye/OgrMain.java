package SifirdanZirveye;

public class OgrMain {

    public static void main(String[] args) {

    Ogrenci  ali = new Ogrenci();

        System.out.println("Ogrenci nesnesi oluşturuluyor");
         ali.soyİsim= "Yildiz";
         ali.ogrenciNo = 55;
         ali.aktif= true;
         ali.sinif =5;
         ali.okulAdi = "Melikşah ilkOkulu";

       Ogrenci Hasan = new Ogrenci(true,12, "Gülerce",2,"Gazi kemal");



        System.out.println();


        System.out.println(Hasan.ogrenciNo);

        System.out.println(Hasan.isimler());





    }
}
