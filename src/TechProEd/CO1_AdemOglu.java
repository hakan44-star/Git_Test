package TechProEd;

public class CO1_AdemOglu {


    String name ;
    String SurName;
    private int age ;


    public static void main(String[] args) {

    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

        if (age>0){
            this.age=age;

        }else this.age =--age;
    }
}




