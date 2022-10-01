import java.util.*;
class odd
{  
    public static void main(String [] args)
    {
          int n,x,z;
		Scanner sc=new Scanner(System.in);
		System.out.print("N: ");
		if(!sc.hasNextInt())
		{
			System.out.print("Invalid");
			return;
		}
		n=sc.nextInt();
		if(n<=0)
		{
			System.out.print("Invalid");
			return;
		}
		x=n*2;
		z=(2 * x - 1);
		System.out.println(n+" Odd number after "+n+" odd numbers = "+z );
    }
}