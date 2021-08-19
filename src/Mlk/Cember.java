package Mlk;

public class Cember extends Sekil {

    private double yariCap ;

    public Cember(double yariCap) {
        this.yariCap = yariCap;
    }




    @Override
    public double Cevre() {
        int Cevre = (int) (2*3.14*yariCap);
        return Cevre;
    }



    @Override
    public String toString() {
        return "Cember [yaricap=" + yariCap + ", Cevre()=" + Cevre() + "]";
    }

}
