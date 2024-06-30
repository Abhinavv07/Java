package school;

public class Area {
    Area(double side) {
        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        System.out.println("Area of Equilateral Triangle :- " + area);
    }

    Area(double base, double height) {
        double area = 0.5 * (base * height);
        System.out.println("Area of Isosceles triangle :- " + area);
    }

    Area(double s1, double s2, double s3) {
        double s = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        System.out.println("Area of scalene Triangle :- " + area);
    }

    public static void main(String[] args) {
        Area a1 = new Area(4);
        Area a2 = new Area(4,5);
        Area a3 = new Area(4,5,6);

    }
}
