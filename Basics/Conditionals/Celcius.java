package Conditionals;

import java.util.Scanner;

public class Celcius 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the celcius in your area: ");
        double celcius = scan.nextDouble();
        double fahrenheit = celcius*1.8 + 32;
        System.out.println("Fahrenheit in your area is: "+fahrenheit);

    }
}
