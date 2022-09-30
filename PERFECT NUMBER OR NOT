import java.util.*;
class perfect_
{
	public static void main(String[] args)
	{
		long n,i,c=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Given number: ");
		if(!sc.hasNextLong())
		{
			System.out.println("Invalid");
			return;
		}
		n=sc.nextLong();
		if(n>0)
		{
			for(i=2;i<n;i++)
			{
				if(n%i==0)
				{
					c=c+i;
				}
			}
			if(c==n)
			{
				System.out.println("Perfect number");
			}
			else
			{
				System.out.println("Not Perfect number");
			}
		}
		else
		{
			System.out.print("Invalid");
			return;
		}
	}
}
