package practise.makes.a.man.perfect.javaBasics.set7;

public class MyStuff
{
    String name;

    MyStuff(String n) {
        name = n;
    }

    public static void main(String[] args)
    {
        MyStuff m1 = new MyStuff("guitar");
        MyStuff m2 = new MyStuff("tv");
        System.out.println(m2.equals(m1));
    }

    @Override
    public boolean equals(Object obj)
    {
        MyStuff m = (MyStuff) obj;
        if (m.name != null)  { return true;  }
        return false;
    }
}


/**
 The output is true and MyStuff does NOT fulfill the Object.equals() contract.
 Explanation : As equals(Object obj) method in Object class, compares two
 objects on the basis of equivalence relation. But here we are just confirming
 that the object is null or not, So it doesn’t fulfill Object.equals()
 contract. As m1 is not null, true will be printed.

 */