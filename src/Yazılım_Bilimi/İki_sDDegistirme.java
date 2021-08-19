package Yazılım_Bilimi;




import java.util.Scanner;

public class İki_sDDegistirme {
    public static void main(String[] args) {

        //Kullanıcıdan aldığınız iki sayının değerini değiştiriniz.
        Scanner scan = new Scanner(System.in);

       int birinci_sayi;
       int ikinci_sayi;

        System.out.println("Birinci sayi : ");
        birinci_sayi = scan.nextInt();

        System.out.println("İkinci sayi : ");
        ikinci_sayi = scan.nextInt();
        System.out.println("Değiştirilmeden önce ....");
        System.out.println("Birinci sayi : "+ birinci_sayi +" İkinci sayi " + ikinci_sayi);
        int gecici_sayi = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici_sayi;
        System.out.println("Değiştirildikten sonra ....");
        System.out.println("Birinci sayi : "+ birinci_sayi +" İkinci sayi " + ikinci_sayi);






    }
}
