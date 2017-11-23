package practise.makes.a.man.perfect.javaBasics.set6;

class First1
{
    int i = 10;

    public First1(int j)
    {
        System.out.println(i);
        this.i = j * 10;
    }
}

class Second1 extends First1
{
    public Second1(int j)
    {
        super(j);
        System.out.println(i);
        this.i = j * 20;
    }
}

public class MainClass1
{
    public static void main(String[] args)
    {
        Second1 n = new Second1(20);
        System.out.println(n.i);
    }
}