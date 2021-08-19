package Builder;

public class Varargs_StringBuilder {
    public static void main(String[] args) {

        toplama(2,5);
        toplama (3,5);
        toplama (4,5);
        toplama (5,6,32,45);

        StringBuilder obj = new StringBuilder();

        obj.append("haka_tetik");
        System.out.println(obj.length());
        System.out.println(obj.capacity());




        System.out.println(obj);





    }

    public static void toplama (int sayi,int...var){
        System.out.println("Varargs'a dahil olmayan argument : "+sayi);

        int toplam =0;
        for (int each : var){

            toplam+=each;


        }
        System.out.println(sayi*toplam);
    }
}
