import java.util.*;
class pq{
public static void main(String args[])
{
    try{
Scanner inp=new Scanner(System.in);
System.out.print("\n Enter Number of Numbers to be Calculated: ");
int n=inp.nextInt();
int i,sum=0;
int arr[]=new int[n];   
System.out.println(" Enter: ");
for(i=0;i<n;i++)   
{
arr[i]=inp.nextInt();
}

System.out.println();
for(i=0;i<n;i++)
{
System.out.print(arr[i]);
sum=sum+arr[i];       

if(i<(n-1))
 System.out.print(" + ");
else
 System.out.print( " = ");
 
} 

System.out.print(sum);

}
catch(Exception e){
    System.out.println("invalid input \n ArrayIndexOutOfBoundsException caught");
}
}
}