package Mlk;

public class Kare extends Dikdortgen {
    private double kisaKenar;

    public Kare(double kisaKenar, double uzunKenar, double kisaKenar1) {
        super(kisaKenar, uzunKenar);
        this.kisaKenar = kisaKenar1;
    }

    public Kare() {

    }

    public Kare(int i, int i1) {
    }

    @Override
    public double Cevre() {
        return super.Cevre();
    }

    @Override
    public double Alan() {
        return super.Alan();
    }
    @Override
    public String toString() {
        return "Kare [Cevre()=" + Cevre() + ", Alan()=" + Alan() + "]";
    }



}

