package Calculator;
import java.util.*;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a, b, c, selection;
        System.out.println("Please enter any two digits");
        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println("Make a selection");
        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.division");
        System.out.println("4.multiplication");

//      picking user selection
        selection = scan.nextInt();

        while (selection>4)
        {
            System.out.println("Please enter correct selection");
            selection=scan.nextInt();
        }

        ThisCalculator calc = new ThisCalculator();
        if(selection == 1)
        {
           c = calc.add(a, b);
            System.out.println("Your answer is "+ c);
        }

        else if (selection == 2)
        {
            c = calc.subtract(a, b);
            System.out.println("Your answer is "+ c);
        }

        else if (selection == 3)
        {
            c = calc.divide(a, b);
            System.out.println("Your answer is "+ c);
        }

        else if (selection == 4)
        {
            c = calc.multiply(a, b);
            System.out.println("Your answer is "+ c);
        }
    }
}
