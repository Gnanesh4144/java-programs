import java.util.*;
public class compo
{
	public static void main(String[] args) 
	{
		int i,j,n,c,count=0,co=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("No. of integers: ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements: ");
		for(i=0;i<n;i++)
		{
		    if(!sc.hasNextInt())
		    {
		        System.out.println("Enter only integers");
		        return;
		    }
		    a[i]=sc.nextInt();
		    if(a[i]<0)
		    {
		        System.out.println("Enter only positive integers");
		        return;
		    }
		}
		for(i=0;i<n;i++)
		{
		    if(a[i]==1)
		    {
		        System.out.println("1 is not a prime nor a composite");
		    }
		}
		//System.out.print("Prime: ");
		for(i=0;i<n;i++)
		{
		    c=0;
    		for(j=1;j<=a[i];j++)
    		{
    		    if(a[i]%j==0)
    		    {
    		        c++;
    		    }
    		}
    		if(c==2)
    		{
    	        count++;
    	        //System.out.print(" "+a[i]);
    	    }
		}
		System.out.print("\nComposite: ");
		for(i=0;i<n;i++)
		{
		    c=0;
    		for(j=1;j<=a[i];j++)
    		{
    		    if(a[i]%j==0)
    		    {
    		        c++;
    		    }
    		}
    		if(c>2)
    		{
    	        co++;
    	        System.out.print(" "+a[i]);
    	    }
		}
		//System.out.print("\nNo. of Prime= "+count);
		System.out.print("\nNo. of Composite= "+co);
	}
}
