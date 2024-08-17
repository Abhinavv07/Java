package OOPs;

class EmployeeDetails {
    private String name;
    private char grade;
    private String uid;
    private double salary;

    public EmployeeDetails(){
        this.name = " ";
        this.grade = ' ';
        this.uid = " ";
        this.salary = 0.0D;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public char getGrade() {
        return this.grade;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return this.uid;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString(){
        return "Name of Employee :- " + getName() + "\nGrade :- " + getGrade() + "\nUID :- " + getUid() + "\nSalary :- " + getSalary();
    }
}

public class Employee {
    public static void main(String[] args) {
        EmployeeDetails e = new EmployeeDetails();
        e.setName("Arnold");
        e.setGrade('A');
        e.setUid("4RT5T6grg");
        e.setSalary(454784.00);

        System.out.println(e.toString());
    }
}
