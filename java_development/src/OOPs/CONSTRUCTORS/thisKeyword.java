package OOPs.CONSTRUCTORS;
class Test
{
    int i;
    public Test() {
        i = 25;
    }

    public void changeValue(int i)
    {
        this.i = i;
    }
    public void showValue()
    {
        System.out.println("vlaue of i is " + i);
    }
}
public class thisKeyword
{
    public static void main(String[] args) {
        Test t = new Test();
        t.changeValue(10);
        t.showValue();
    }
}
