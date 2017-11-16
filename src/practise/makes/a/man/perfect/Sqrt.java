package practise.makes.a.man.perfect;

public class Sqrt
{

    public static void main(String[] args)
    {
        //Number for which square root is to be found
//        double number = Double.parseDouble(args[0]);

        //This method finds out the square root
        findSquareRoot(9);

    }

    /*This method finds out the square root without using
    any built-in functions and displays it */
    public static void findSquareRoot(double number)
    {

        boolean isPositiveNumber = true;
        double g1;

        //if the number given is a 0
        if(number==0)
        {
            System.out.println("Square root of "+number+" = "+0);
        }

        //If the number given is a -ve number
        else if(number<0)
        {
            number=-number;
            isPositiveNumber = false;
        }

        //Proceeding to find out square root of the number
        double squareRoot = number/2;
        do {
            g1=squareRoot;
            squareRoot = (g1 + (number/g1))/2;
        } while((g1-squareRoot)!=0);

        //Displays square root in the case of a positive number
        if(isPositiveNumber)
        {
            System.out.println("Square roots of "+number+" are ");
            System.out.println("+"+squareRoot);
            System.out.println("-"+squareRoot);
        }
        //Displays square root in the case of a -ve number
        else
        {
            System.out.println("Square roots of -"+number+" are ");
            System.out.println("+"+squareRoot+" i");
            System.out.println("-"+squareRoot+" i");
        }

    }
}