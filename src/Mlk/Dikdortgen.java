package Mlk;

public class Dikdortgen extends Sekil{


    private double kisaKenar;
    private double uzunKenar;

    public Dikdortgen(double kisaKenar, double uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    public Dikdortgen() {

    }

    @Override
    public double Cevre() {
        return 2*(this.kisaKenar+this.uzunKenar);
    }

    @Override
    public double Alan() {
        return this.uzunKenar*this.uzunKenar;
    }

    @Override
    public String toString() {
        return "Dikdortgen [Cevre()=" + Cevre() + ", Alan()=" + Alan() + "]";
    }

}
