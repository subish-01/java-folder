import java.util.Arrays;
import java.util.Scanner;
class Solution 
{
    // public int findKthLargest(int[] nums, int k) 
    // {
        
    // }
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            int[] nums = {3,2,1,5,6,4};
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            System.out.print("Enter the largest Element to be found: ");
            int largest = scan.nextInt();
            System.out.println("The "+largest+" largest Element is "+nums[nums.length-largest]);
            scan.close();
        }
}

