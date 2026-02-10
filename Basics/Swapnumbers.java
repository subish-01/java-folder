import java.util.Scanner;
public class Swapnumbers 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");    //10
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");    // 20
        int num2 = scan.nextInt();
        System.out.println("The two numbers before swapping : "+num1+ " and " +num2);
        int temp;
        //swapping numbers 
        temp = num1;    //temp = 10
        num1 = num2;    //num1 = 20
        num2 = temp;    //num2 = 10
        System.out.println("The two numbers after swapping: "+num1+ " and " +num2);
        scan.close();
    }
}
