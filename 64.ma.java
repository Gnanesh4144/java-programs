import java.util.*;
class matrixmultiple
{  
  	public static void main(String args[])
	{  
    		int m,n,x,y,r=0,desc;
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
    		Scanner s = new Scanner(System.in);
    		System.out.print("Enter number of rows in first matrix:");
    		m= s.nextInt();
    		System.out.print("Enter number of columns in first matrix:");
    		n= s.nextInt();
    		int a[][] = new int[m][n];
		int ro[] = new int[m];
		System.out.println("Enter values for matrix A : \n");
    		for (int i = 0; i < m; i++)
	 	{
                        	for (int j = 0; j < n; j++)
			{ 
                			a[i][j] = s.nextInt();
			}
        		}
		for ( x = 0; x < m; x++)
	 	{
			r=0;
           			for (y= 0; y< n; y++)
			{ 
                			if(a[x][y]==1)
				{
					r++;
				}       
			}
			ro[x]=r;
			System.out.println("Row "+x+" :"+r);
			list1.add(r);
			list2.add(x);
        		}
		/*for(x=0;x<m;x++)
		{
			System.out.println(ro[x]);
		}*/
		System.out.println("Soldiers= "+list1);
		System.out.println("Row numbers="+list2);
		Collections.sort(list1);  
	}
}