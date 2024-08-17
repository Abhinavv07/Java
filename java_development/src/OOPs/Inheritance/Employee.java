package OOPs.Inheritance;
import java.util.*;
class salaryCalculation {
    private int UID;
    private String name;
    private char grade;
    private double salary;
    double hra, da;
    double totalSalary;

    public salaryCalculation() {
        this.UID = 0;
        this.name = "";
        this.grade = ' ';
        this.salary = 0.0D;
    }

    void setName(String name) {
        this.name = name;
    }
    void setUID(int UID) {
        this.UID = UID;
    }
    void setGrade(char grade) {
        this.grade = grade;
    }
    void setSalary(double salary) {
        this.salary = salary;
    }

    double computeSalary() {
        hra = 0.12 * salary;
        da = 0.14 * salary;
        totalSalary = salary + hra + da;
        return totalSalary;

    }

    String getName() {
        return this.name;
    }
    char getGrade() {
        return this.grade;
    }
    int getUID() {
        return this.UID;
    }
}
public class Employee {
    public static void main(String[] args) {
        salaryCalculation e1 = new salaryCalculation();

        e1.setGrade('A');
        System.out.println("Grade of Employee 1 :- " + e1.getGrade());

        e1.setName("Lalu Prasad");
        System.out.println("Name of employee 1 :- " + e1.getName());

        e1.setUID(2345687);
        System.out.println("UID of first employee :- " + e1.getUID());

        e1.setSalary(70000.0);
        System.out.println("Total salary :- " + e1.computeSalary());
    }

}
