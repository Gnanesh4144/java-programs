import java.util.*;

class dup
{
	public static void removeDuplicates(int[] a)
 	{
  		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		int n;
  		for (int i=0;i<a.length; i++)
		{
			set.add(a[i]);
		}
      		System.out.println("Non-duplicate items:");
  		System.out.print(set);
 	}
	public static void main(String[] args)
 	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of elements: ");
		if(!sc.hasNextInt())
		{	
			System.out.print("Invalid");
			return;
		}
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			System.out.print("Enter elements: ");
			if(!sc.hasNextInt())
			{	
				System.out.print("Invalid");
				return;
			}
		      a[i]=sc.nextInt();
		}
 		removeDuplicates(a);
 	}
}
