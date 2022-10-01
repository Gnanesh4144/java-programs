import java.util.*;
public class threprim implements Runnable 
{    
    	public void run() 
	{  
     	int i,m=0,flag=0;
		Scanner sc=new Scanner(System.in);      
		System.out.print("Enter number: ");
		if(!sc.hasNextInt())
		{
			System.out.println("Invalid");
			return;  	
		}
  		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid");
			return;  	
		}
  		m=n/2;      
  		if(n==0||n==1)
		{  
   			System.out.println(n+" is not prime number");      
  		}
		else
		{  
   			for(i=2;i<=m;i++)
			{      
    				if(n%i==0)
				{      
     				System.out.println(n+" is not prime number");      
     				flag=1;      
     				break;      
    				}      
   			}      
   			if(flag==0)  
			{ 
				System.out.println(n+" is prime number"); 
			}  
  		}  
    	}  
   	public static void main(String[] args) 
	{  
     	threprim ex = new threprim();  
        	Thread t1= new Thread(ex);  
        	t1.start();  
        	
    	}  
}  