import java.util.*;
class grade
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double to,p,c,m,ph,a;
		System.out.print("Enter the python marks: ");
		p=sc.nextDouble();
		System.out.print("Enter the c programming marks: ");
		c=sc.nextDouble();
		System.out.print("Enter the Maths marks: ");
		m=sc.nextDouble();
		System.out.print("Enter the Physics marks: ");
		ph=sc.nextDouble();
	      if(p<0 || c<0 || m<0 || ph<0 || p>100 || c>100 || m>100 || ph>100)
		{
			System.out.print("Invalid input");	
			return;
		}
		if(p<50 || c<50 || m<50 || ph<50)
		{
			System.out.print("Grade: Fail");	
			return;
		}
		to=p+c+m+ph;
		a=(to/400)*100;
		System.out.println("Total= "+to);
		System.out.println("Aggregate= "+a);
		if(a>=75)
		{
			System.out.println("Distincttion");
		}
		if(a>=60 && a<75)
		{
			System.out.println("First Division");
		}
		if(a>=50 && a<60)
		{
			System.out.println("Second Division");
		}
	}
}
