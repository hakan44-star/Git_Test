package Otel_Projesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Runner {
    // Bu projeye yeni fonksiyonlar ekleyin ornek olarak
    // Kullaniciya otel odasi ekleme ozelligi
    // Kullanicidan kisi sayisi alip kisi sayisina gore fiyat belirlenmesi
    // Hersey dahil mi, yarim pansiyon, sadece konaklama secenekleri
    public static void main(String[] args) {
        List<HotelRoom> hotelRooms = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Otel resepsiyonuna hosgeldiniz");
        HotelRoom hotelRoom1 = new HotelRoom();
        hotelRoom1.setOdaninMusaitlikDurumu(true);
        hotelRoom1.setOdaTipi("Suite Oda");
        hotelRoom1.setKatSayisi(25);
        hotelRoom1.setOdaFiyati(500);
        hotelRoom1.setOdaNumarasi(156);
        HotelRoom hotelRoom2 = new HotelRoom(false,  "Standart Oda", 250, 12, 56);
        //System.out.println(hotelRoom1);
        //System.out.println(hotelRoom2);
        hotelRooms.add(hotelRoom1);
        hotelRooms.add(hotelRoom2);
        System.out.println("Mevcut otel odalarimiz bunlar hangisinde kalmak istersiniz?");
        System.out.println(hotelRooms);
        int secim = scan.nextInt();
        System.out.println("Odemeniz gereken miktar " + hotelRooms.get(secim).getOdaFiyati());
        System.out.println("Hangi tarihler arasinda kalmak istersiniz?");
        String giris = scan.next();
        String cikis = scan.next();
        System.out.println("Otel basvurunuz basariyla tamamlandi. Giris tahiriniz " + giris + " Cikis tarihiniz: " + cikis
                + " Hotel odanizin ozellikleri " + hotelRooms.get(secim));
    }
}

