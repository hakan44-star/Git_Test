package OOP_JavaVakti;

public class Employee {
    private String name;
    private double salary;
    private int workHours, hireYear;

    Employee(int hireYear, int workHours, double salary, String name) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }

    public double tax(){

     if (this.salary>=1000){
         return 1000*0.3;
     }
     return 0.0;

}
}
