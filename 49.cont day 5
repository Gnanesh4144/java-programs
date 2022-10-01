import java.util.Scanner;
class cont
{
   	int num;
   	int x;
   	cont(int num,int  x)//A constructor in Java is a special method that is used to initialize objects.
                          //The constructor is called when an object of a class is created.
	   {
      		this.num = num;//Return the current class object
      		this.x = x;
   	}
	public static void main(String args[])
	{
      		Scanner sc = new Scanner(System.in);
      		System.out.print("Enter integer : ");
		if(!sc.hasNextInt())
		{
			System.out.print("Invalid");
			return;
		}
      		int num = sc.nextInt();
      		System.out.print("Enter integer: ");
		if(!sc.hasNextInt())
		{
			System.out.print("Invalid");
			return;
		}
      		int x = sc.nextInt();      
      		cont obj = new cont(num, x);
      		System.out.println(obj.num);
      		System.out.println(obj.x);
   }
}
