package OOPs.Inheritance;

class StudentProperties {
    private String name;
    private char sec;
    private int rollNo;

    public StudentProperties(String name, char sec, int rollNo) {
        this.name = name;
        this.sec = sec;
        this.rollNo = rollNo;
    }

    void study() {
        System.out.println("Studying...");
    }

    void sleep() {
        System.out.println("Sleeping......");
    }

    @Override
    public String toString() {
        return "Name :- " + name + "\n" + "Section :- " + sec + "\n" + "Roll Number :- " + rollNo;
    }
}

class student1 extends StudentProperties {
    public student1(String name, char sec, int rollNo) {
        super(name, sec, rollNo);
    }

}

class student2 extends StudentProperties {
    public student2(String name, char sec, int rollNo) {
        super(name, sec, rollNo);
    }

}

class student3 extends StudentProperties {
    public student3(String name, char sec, int rollNo) {
        super(name, sec, rollNo);
    }

}

public class Student {
    public static void main(String[] args) {
        student1 s1 = new student1("Narendra Modi", 'c', 06);
        System.out.println(s1.toString());
        s1.sleep();
        s1.study();

        student2 s2 = new student2("Lionel Messi", 'c', 07);
        System.out.println(s2.toString());
        s2.sleep();
        s2.study();

        student3 s3 = new student3("Cristiano Ronaldo", 'c', 07);
        System.out.println(s3.toString());
        s3.sleep();
        s3.study();
    }
}
