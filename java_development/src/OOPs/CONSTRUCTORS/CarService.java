package OOPs.CONSTRUCTORS;

import java.util.Scanner;

public class CarService
{
    String carType, customerName, customerNumber;
    double km, bill;

    public CarService()
    {
        carType = " ";
        customerName = " ";
        customerNumber = " ";
        km = 0.0D;
        bill = 0.0D;
    }

    void accept_data()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer name");
        customerName = sc.nextLine();

        System.out.println("Enter Customer Number");
        customerNumber = sc.nextLine();

        System.out.println("Enter car type");
        carType = sc.nextLine();

        System.out.println("Enter distance");
        km = sc.nextDouble();
    }

    void calculate()
    {
        //for Ac car
        if(carType.equalsIgnoreCase("ac"))
        {
            if(km <= 5)
                bill = km * 150;
            else if(km > 5)
                bill = (km * 150) + (km * 10.75);
        }
        else
        {
            if(km <= 5)
                bill = km * 120;
            else if(km > 5)
                bill = (km * 120) + (km * 8.25);
        }
    }

    void display()
    {
        System.out.println("Name os customer :- " + customerName);
        System.out.println("Number of customer :- " + customerNumber);
        System.out.println("Car type :- " + carType);
        System.out.println("BILL :- " + bill);
    }

    public static void main(String args[])
    {
        CarService cr = new CarService();
        cr.accept_data();
        cr.calculate();
        cr.display();
    }
}
