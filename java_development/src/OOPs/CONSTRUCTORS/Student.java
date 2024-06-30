package OOPs.CONSTRUCTORS;

public class Student
{
    private String studentName;
    private int rollNo;
    private double avg;
    private double totalMarks;
    private String rank;
    private int hindi,english,science,computer;

    Student(String studentName,int rollNo,int hindi,int english,int science,int computer)
    {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.hindi = hindi;
        this.science = science;
        this.english = english;
        this.computer = computer;
    }

    void calc_marks()
    {
       avg = (double) (science + english + hindi + computer) / 4;

       if(avg <= 45)
           rank = "PASS";
       else if(avg > 45 && avg <= 60)
           rank = "The Best";
       else if(avg > 60 && avg <= 75)
           rank = " DISTINCTION";
       else if(avg >= 90)
           System.out.println("EXCELLENT");
    }

    void dislay()
    {
        System.out.println("\t\t\t\t\t\t\t\t\t\tREPORT CARD OF X");
        System.out.println("Name of student :- " + studentName);
        System.out.println("Roll No :- " + rollNo);
        System.out.println("Average marks ;- " + avg);
        System.out.println("Total Marks :- " + (science + english + hindi + computer));
        System.out.println("Rank :- " + rank);
    }

    public static void main(String[] args)
    {
        Student s = new Student("Abhinav",06,50,50,50,50);
        s.calc_marks();
        s.dislay();


    }
}
