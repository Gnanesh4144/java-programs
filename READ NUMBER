import java.util.*;
class avg{
    public static void main(String[] args)
    {
		double avg_p,avg_n,x=0,c=0;
       int sum=0,sum1=0,n;
       List<Integer>positive = new ArrayList<>();
       List<Integer>negative = new ArrayList<>();
       Scanner sc= new Scanner(System.in);
	System.out.println("Enter -1 to exit...");
	System.out.print("Enter the number : ");
	n=sc.nextInt();
    	while(n!=-1)
	{	
		if(n>0 && n<100)
		{
			positive.addAll(Arrays.asList(n));
			x++;
			sum=sum+n;
		}
		else if((n<0)&&(n>(-100)))
		{
			negative.addAll(Arrays.asList(n));
			c++;
                  sum1=sum1+n;
		}
		else
		{
			System.out.println("");
		}
		System.out.print("Enter the number : ");
		n=sc.nextInt();
	}
	avg_p=sum/x;
	avg_n=sum1/c;
        System.out.println("Positive= "+positive);
	System.out.println("Negative= "+negative);
        System.out.println("Average of positive numbers= "+avg_p);
        System.out.println("Average of negative numbers= "+avg_n);
    }
}
