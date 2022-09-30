import java.util.Scanner;
import java.io.*;
public class fibo 
{
   public static void main(String[] args)
   {
      int count=0,n,m,n1,n2,x;
      Scanner sc= new Scanner(System.in);
	System.out.print("Enter choice(1.Positive , 2.Negative): ");
      x = sc.nextInt();
      System.out.print("Enter the N value: ");
      m = sc.nextInt();
	n1=0;
	if(x==1)
	{
		n2=1;
		while(count<m)
		{
			System.out.print(n1+" ");
			n=n1+n2;
			n1=n2;
			n2=n;
			count=count+1;
		}
	}
	if(x==2)
	{
      	n2=-1;
		while(count<m)
		{
			System.out.print(n1+" ");
			n=n1+n2;
			n1=n2;
			n2=n;
			count=count+1;
		}
	}
   }
}
