import java.util.*;
class di
{
	public static void main(String[] args)
	{
		int x,sum=0,i,g;
		String n;
		Scanner c=new Scanner(System.in);
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter N value:  ");
		if(!sc.hasNextInt())
		{
			System.out.println("Invalid ");
			return;
		}
		x=sc.nextInt();
		if(x<=0)
		{
			System.out.println("Invalid ");
			return;
		}
		System.out.print("Enter "+x+" digit value:  ");
		n=c.nextLine();
		if(x!=n.length())
		{
			System.out.println("Invalid");
			return;
		}
		int s=Integer.parseInt(n);
		g=s;
		while (g > 0 || sum > 9)  
		{  
			if (g == 0)   
			{  
				g = sum;  	
				sum = 0;  
			}    
			sum = sum + g % 10;  
			g = g / 10;  
		}  

		System.out.println("Sum of  "+x+" digit value = "+(sum));
	}
}
