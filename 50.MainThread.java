import java.io.*;
import java.util.*;
class MainThread
{
     public static void main(String[] args)
     {
          try
          {
               Fibonacci fib = new Fibonacci();
               fib.start();
               fib.sleep(4000);
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}
class fibot extends Thread
{
     public static void main(String[] args)
     {
          try
          {
               int a=0, b=1, c=0;
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Scanner sc=new Scanner(System.in);
               System.out.print("Enter the Limit for fibonacci: ");
	
               // n = Integer.parseInt(br.readLine());
	if(!sc.hasNextInt())
	{
		System.out.print("Invalid");
		return;
	}
	int n=sc.nextInt();
	if(n<=0)
	{
		System.out.print("Invalid");
		return;
	}
               System.out.println("Fibonacci series:");
               while (n>0)
               {
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    c=a+b;
                    n=n-1;
               }
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}