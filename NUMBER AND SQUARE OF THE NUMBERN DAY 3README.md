import java.util.*;
public class square
{
	public static void main(String[] args)
	{
		int l,u,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the lower range: ");
		l=sc.nextInt();
		System.out.print("Enter the upper range: ");
		u=sc.nextInt();
		if(l>u)
		{
			System.out.println("Invalid range");
			return;
		}
		System.out.print("[ ");
		for(i=l;i<=u;i++)
		{
			System.out.print("("+i+","+(i*i)+"),");
		}
		System.out.print("]");
	}
}
