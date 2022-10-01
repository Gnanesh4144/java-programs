import java.util.*;
public class common {
public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array1:");
         int n = s.nextInt();
        int array1[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
	if(!s.hasNextInt())
	{
		System.out.println("Invalid");
		return;
	}
            array1[i] = s.nextInt();
	if(array1[i]<0)
	{
		System.out.println("Invalid");
		return;
	}
        }
        System.out.print("Enter no. of elements you want in array2: ");
        int n1 = s.nextInt();
        int array2[] = new int[n1];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n1; i++)
        {
	if(!s.hasNextInt())
	{
		System.out.println("Invalid");
		return;
	}
            array2[i] = s.nextInt();
	if(array2[i]<0)
	{
		System.out.println("Invalid");
		return;
	}
        }
       System.out.println("Array1 : "+Arrays.toString(array1));
       System.out.println("Array2 : "+Arrays.toString(array2));
 
      System.out.println("Common element is : ");
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {
                 
                 System.out.print( array1[i]+" ,");
                 }

            }
        }
 
    }
}