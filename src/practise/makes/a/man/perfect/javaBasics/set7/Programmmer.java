package practise.makes.a.man.perfect.javaBasics.set7;

class Writer
{
    public  static void write()
    {
        System.out.println("Writing...");
    }
}
class Author extends Writer
{
    public  static void write()
    {
        System.out.println("Writing book");
    }
}

public class Programmmer extends Author
{
    public  static void write()
    {
        System.out.println("Writing code");
    }

    public static void main(String[] args)
    {
        Author a = new Programmmer();
        a.write();
    }
}


/**
 Since static methods can’t be overridden,
 it doesn’t matter which class object is created.
 As a is a Author referenced type, so always Author class
 method is called. If we remove write() method from Author class
 then Writer class method is called, as Author class extends Writer class.
 */