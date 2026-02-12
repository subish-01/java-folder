package Conditionals;
import java.util.Arrays;
import java.util.Scanner;
class Solution 
{
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the size of an array: ");
            int size = scan.nextInt();
            int[] array = new int[size];
            for(int i = 0; i<array.length;i++)
            {
                System.out.print("Enter the "+(i+1)+" Element in array: ");
                array[i] = scan.nextInt();
            }
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
            System.out.print("Enter the largest Element to be found: ");
            int largest = scan.nextInt();
            System.out.println("The "+largest+" largest Element is "+array[array.length-largest]);
            scan.close();
        }
}

