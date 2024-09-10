import javax.swing.*;
public class Main extends JFrame
{
    public Main()
    {


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,400);
        setVisible(true);


    }
    public static void main(String args[])
    {
        long t1 = System.nanoTime();
        new Main();
        long t2 = System.nanoTime();
        System.out.println(t2-t1);
    }
}