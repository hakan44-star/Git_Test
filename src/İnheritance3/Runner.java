package İnheritance3;

public class Runner {


    /*
Hayvanların beslenme,barınma, boyut ve solunum özellikleri  ile ilgili methodlar barınıran Hayvan isminde bir class oluşturalım

-Hayvan sınıfının SubClassı bir Kuş Classı oluşturalım ve bu class ucma ve barınma methodlarını içersin

-Hayvan sınıfının SubClassı bir Balık Classı oluşturalım ve bu class yuzme ve Solunum methodlarını içersin

-kuş sınıfının SubClassı bir Güversin Classı oluşturalım ve bu class beslenme ve boyut methodlarını içersin

-Balık sınıfının SubCLassı bir JaponBaligi classı oluşturalım ve bu class solunum methodu içersin ve bu methodu Superclasstan alsın

--Runner class oluşturalım ve oluşturduğumuz methoları çağıralım.*/

    public static void main(String[] args) {
        Hayvan h=new Hayvan();
        h.barinma();
        h.beslenme();
        h.boyut();
        h.solunum();

        Kus k=new Kus();
        k.ucma();
        k.barinma();

        Balik b=new Balik();
        b.yuzme();
        b.solunum();
        Güvercin g=new Güvercin();
        g.beslenme();
        g.boyut();

        JaponBaligi j=new JaponBaligi();
        j.solunum();





    }
}
