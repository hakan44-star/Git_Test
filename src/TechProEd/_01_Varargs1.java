package TechProEd;

public class _01_Varargs1 {

    public static void main(String[] args) {

        int sayi1=10;
        int sayi2 =20;
        int sayi3=35;

        ikiSayiTopla(sayi1,sayi2);
        ucSayiTopla(sayi1,sayi2,sayi3);
    }

    private static void ucSayiTopla(int sayi1,int sayi2,int sayi3) {
        System.out.println("Üc sayinin toplamı : "+(sayi1+sayi2+sayi3));

    }

    private static void ikiSayiTopla(int sayi1,int sayi2) {
        System.out.println("iki sayinin toplamı :" +(sayi1+sayi2));



    }

    public static void topla (int...sayi){
        int toplam =0;
        for(int i :sayi){
            toplam+=i;
        }

        System.out.println("varargs toplam : "+  toplam);

    }
}
