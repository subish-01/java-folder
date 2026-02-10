import java.util.Scanner;
public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st number: "); //user input number 1
        Double num1 = scan.nextDouble();
        System.out.print("Enter the 2nd number: "); //user input number 2
        Double num2 = scan.nextDouble();
        Double add = num1+num2; //addition of two numbers
        Double subtract = num1-num2; //subtraction of two numbers
        Double multiplication = num1*num2; //multiplication of two numbers
        Double division = num1/num2; //division of two numbers
        Double remainder = num1%num2;
        System.out.println("The addition of two numbers is : "+add);
        System.out.println("The subtraction of two numbers is : "+subtract);
        System.out.println("The multiplication of two numbers is :"+multiplication);
        System.out.println("The division of two numbers is : "+division);
        System.out.println("The remainder of two numbers is : "+remainder);
        scan.close();
    }
}
