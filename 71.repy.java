import java.util.Scanner;
public class repy
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N : ");
	int n=sc.nextInt();	 
              System.out.print("Enter Symbol : ");
              char c = sc.next().charAt(0);
              int  i=n,j;
	while(i>0)
               { j=0;
                    while(j++<n-i)
                       {
                               System.out.print(" "); 
                       }
                    
	         j=0;
                       while(j++<(i*2)-1)
                
                       {
                               System.out.print(c); 
                       }
                     System.out.println();
                     i--;
 
               }             
    }
}