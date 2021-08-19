package TechProEd;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Sorular {
    public static void main(String[] args) {
       //1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.


        System.out.println("*******Geçerli Tarih ve Saati Görüntüle**********\n");




        LocalDateTime zaman = LocalDateTime.now();//Bulunduğun bölgede tarihi ve saatten saliseye kadar...
        System.out.println("\n");
        LocalDate tarih =LocalDate.now();
        System.out.println(tarih);
        System.out.println("\n");
        LocalTime saat =LocalTime.now();
        System.out.println(saat);
        System.out.println(zaman);// Cıktıdaki "T" tarihi zamandan ayırmak için kullanılmıştır.. console da göreceksiniz.

        LocalDate ekle = LocalDate.now().plusDays(1); // Bir gün sonrayı bulmak icin bunu yıl ay olarak da deneyebilirsiniz.
        System.out.println("Yarın günlerden ayın kaçı " + ekle);
        LocalTime S_ekle =LocalTime.now().plusHours(2).minusHours(4);
        System.out.println(S_ekle);

        System.out.println("\n");
        LocalDate Hesapla = LocalDate.now().plusYears(1).plusDays(45).minusYears(15);
        System.out.println("Hesapladim :) " +Hesapla);
        LocalTime t=LocalTime.of(15, 45); //
        System.out.println(t);

        System.out.println("CompareTo(Karşılaştırma)\n");

        System.out.println("Yıl farkı : "+ zaman.toLocalDate().compareTo(LocalDate.of(2015,02,20)));
        System.out.println("parse yöntemi :" + zaman.toLocalDate().compareTo(LocalDate.parse("2018-02-20")));      //   yıl farkını yine alır parse yöntemi ile

        System.out.println("Kaç yaşındayım : " +zaman.toLocalDate().compareTo(LocalDate.of(1989,02,01))); // yaş bulunabilir .
        System.out.println("*****************\n");
        LocalDate dt = LocalDate.of(2010,02,05);

        Period gün =Period.between(ekle,dt);
        System.out.println(gün);

        LocalDateTime Zaman = LocalDateTime.now();
        System.out.println(" Normal: " + Zaman);
        DateTimeFormatter TersCevir = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter Ters2Cevir = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");

        String formattedDate = Zaman.format(TersCevir);

        System.out.println(" Ters cevirdiğimiz zaman : " + formattedDate);


        String formatla = zaman.format(Ters2Cevir);
        System.out.println(formatla);



    }
}
