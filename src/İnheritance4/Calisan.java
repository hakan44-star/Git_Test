package İnheritance4;

public class Calisan {

    String isim;
    int maas;
    String departman;

    public Calisan(String isim, int maas, String departman) {
        super();
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }

    public void BilgileriGoster() {
        System.out.println(this.departman);
        System.out.println(this.isim);
        System.out.println(this.maas);
    }




}
