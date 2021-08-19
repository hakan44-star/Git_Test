package TechProEd;

public class C03_ArabaMain {
    public static void main(String[] args) {
        CO4_Araba volvo = new CO4_Araba("xc90", "beyaz", -3000, -2020);
        CO4_Araba Audi = new CO4_Araba("07", "bej", -3000, -2021);
        CO4_Araba honda = new CO4_Araba();

        honda.model = "Account";
        honda.renk = "gris";
        honda.setYil(1999);
        honda.setMotor(1400);
        System.out.println("Honda yil :" +honda.getYil());
        System.out.println("Honda motoru :"+honda.getMotor());
        System.out.println("volvo motor :"+volvo.getMotor());
        System.out.println(Audi.getYil());
    }
}
