package Otel_Projesi;

public class HotelRoom {
    private boolean odaninMusaitlikDurumu;
    private String odaTipi;
    private int odaFiyati;
    private int katSayisi;
    private int odaNumarasi;
    // PascalCase camelCase
    public HotelRoom(){
    }
    public HotelRoom(boolean odaninMusaitlikDurumu, String odaTipi, int odaFiyati, int katSayisi, int odaNumarasi) {
        this.odaninMusaitlikDurumu = odaninMusaitlikDurumu;
        this.odaTipi = odaTipi;
        this.odaFiyati = odaFiyati;
        this.katSayisi = katSayisi;
        this.odaNumarasi = odaNumarasi;
    }
    public boolean isOdaninMusaitlikDurumu(){
        return odaninMusaitlikDurumu;
    }
    public void setOdaninMusaitlikDurumu(boolean odaninMusaitlikDurumu){
        this.odaninMusaitlikDurumu = odaninMusaitlikDurumu;
    }
    public String getOdaTipi() {
        return odaTipi;
    }
    public void setOdaTipi(String odaTipi) {
        this.odaTipi = odaTipi;
    }
    public int getOdaFiyati() {
        return odaFiyati;
    }
    public void setOdaFiyati(int odaFiyati) {
        this.odaFiyati = odaFiyati;
    }
    public int getKatSayisi() {
        return katSayisi;
    }
    public void setKatSayisi(int katSayisi) {
        this.katSayisi = katSayisi;
    }
    public int getOdaNumarasi() {
        return odaNumarasi;
    }
    public void setOdaNumarasi(int odaNumarasi) {
        this.odaNumarasi = odaNumarasi;
    }
    @Override
    public String toString() {
        return "HotelRoom " +
                "odaninMusaitlikDurumu = " + odaninMusaitlikDurumu +
                " odaTipi = " + odaTipi +
                " odaFiyati = " + odaFiyati +
                " katSayisi = " + katSayisi +
                " odaNumarasi = " + odaNumarasi;
    }
}


















