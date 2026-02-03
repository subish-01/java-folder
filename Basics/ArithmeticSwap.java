import java.util.Scanner;
public class ArithmeticSwap
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();                          // user input number 1    8
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();                          //user input number 2     12

        // numbers before swapping 

        System.out.println("The two numbers before swapping are "+num1+ " and "+num2);

        // swapping using arithmetic operators

        num1 = num1+num2;      //20
        num2 = num1-num2;      //8
        num1 = num1-num2;       //12

        // numbers after swapping 

        System.out.println("The two numbers after swapping are "+num1+ " and "+num2);

        scan.close();
    }
}
