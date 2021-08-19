package TechProEd;

public class Dog extends Animal{

    @Override
    public void beslenme (){
        System.out.println("kemik ile beslenir");

    }

    @Override
  public  void tatli() {
        System.out.println("Fistik SARMA");
    }

    @Override
    protected String icecek() {
        System.out.println("Turşu suyu");
        return "yarasin";
    }

    @Override
    public short topla() {
        return 41+54;
    }

    @Override
    public Dog fatih() {
        return new Dog();
    }
}
