import java.util.Scanner;
 
public class mamul
{  
	public static void main(String args[])
	{  
    		int m1,n1,m2,n2;
    		Scanner s = new Scanner(System.in);
    		System.out.print("Enter number of rows in first matrix:");
    		m1 = s.nextInt();
    		System.out.print("Enter number of columns in first matrix:");
    		n1 = s.nextInt();
    		System.out.print("Enter number of rows in second matrix:");
    		m2 = s.nextInt();
    		System.out.print("Enter number of columns in second matrix:");
    		n2 = s.nextInt();
  		if (n1!=m2) 
		{
        		System.out.println("Matrix multiplication is not possible");
    		}
    		else 
		{
        		int a[][] = new int[m1][n1];
        		int b[][] = new int[m2][n2];
        		int c[][] = new int[m1][n2];
 
        		System.out.println("Enter values for matrix A : \n");
        		for (int i = 0; i < m1; i++) 
			{
            		for (int j = 0; j < n1; j++)
				{ 
                		a[i][j] = s.nextInt();
				}
        		}
        		System.out.println("Enter values for matrix B : \n");
       		for (int i = 0; i < m2; i++) 
			{
            		for (int j = 0; j < n2; j++)
				{ 
               	 	b[i][j] = s.nextInt();
				}
        		}	
        		System.out.println("Matrix multiplication is : \n");
        		for(int i = 0; i < m1; i++) 
			{    
            		for(int j = 0; j < n2; j++)
				{    
              			c[i][j]=0;      
              			for(int k = 0; k < n1; k++)
					{      
                			c[i][j] += a[i][k] * b[k][j];      
             			}
              			System.out.print(c[i][j] + " ");  
            		}
            		System.out.println();
        		}    
    		}
  	}
}