package TechProEd;

public class CO4_Araba {

    String model;
    String renk;
    private int motor;
    private int yil;
    public CO4_Araba(){};
    public CO4_Araba(String model, String renk, int motor, int yil) {
        super();
        setModel(model);
        setMotor(motor);
        setRenk(renk);
        setYil(yil);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {

        if(motor>0){
            this.motor=motor;
        }else this.motor=-motor;


        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil>0){
            this.yil=yil;

        }else this.yil =-yil;

        this.yil = yil;
    }
}
