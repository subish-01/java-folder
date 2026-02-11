package Conditionals;

import java.util.Scanner;

public class Fahrenheit 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the fahrenheit in your area: ");
        double fahrenheit = scan.nextDouble();
        double celcius = (fahrenheit - 32)/1.8;
        System.out.println("The celcius in your area is : "+celcius);
        scan.close();
    }
}
