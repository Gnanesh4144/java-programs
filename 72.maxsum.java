import java.io.*;
// Java program to print largest contiguous array sum
import java.util.*;
  
class maxsum
{
    public static void main (String[] args)
    {
	Scanner sc=new Scanner(System.in);
	 System.out.print("Enter no. of elements: ");
	int m=sc.nextInt();
	int a[] = new int[m];
	 System.out.println("Enter elements: ");
	for(int x=0;x<m;x++)
	{
		a[x]=sc.nextInt();
	}
        System.out.println("Maximum contiguous sum is " +
                                       maxSubArraySum(a));
    }
    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
  
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}