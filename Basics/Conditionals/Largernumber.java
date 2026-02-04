package Conditionals;
import java.util.Scanner;
public class Largernumber 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();
        if(num1 > num2)
        {
            System.out.println("The greatest number is "+num1);
        }
        else if(num1 == num2)
        {
            System.out.println("The numbers "+num1+" and "+num2+" are equal");
        }
        else
        {
            System.out.println("The greatest number is "+num2);
        }
    }
}
