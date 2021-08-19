package SifirdanZirveye;

public class Ogrenci {

    public boolean aktif;
    int ogrenciNo;
    String soyİsim ;
    int sinif;
    String okulAdi;


    public Ogrenci() {

    }
    public Ogrenci(boolean aktif, int ogrenciNo, String soyİsim, int sinif, String okulAdi) {
        this.aktif = aktif;
        this.ogrenciNo = ogrenciNo;
        this.soyİsim = soyİsim;
        this.sinif = sinif;
        this.okulAdi = okulAdi;
    }


    public String isimler (){

        return "Ogrenci no : " + ogrenciNo + "\nSoyisim : " +soyİsim;
    }



}
