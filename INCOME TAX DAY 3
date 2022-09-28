import java.util.*;
class ta{
    public static void main(String[] args){
        double x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount:");
        double amount = input.nextDouble();
        if(amount<=0)
	      {
		        System.out.println("Invalid");
		        return;
        } 
        if(amount<=150000)
        {
            System.out.println("No Tax");
		        return;    
        }
            x=amount-150000;
            if(x<=150000)
		{
			y=x*0.1;
			System.out.println("Tax: "+y);
			return;
		}
		if(x>150000 && x<=300000)
		{
			y=x*0.1;
			System.out.println("Tax: "+y);
			return;
		}
		if(x>300000 && x<=500000)
		{
			y=x*0.2;
			System.out.println("Tax: "+y);
			return;
		}
		if(x>500000)
		{
			y=x*0.3;
			System.out.println("Tax: "+y);
			return;
		}
          	if(amount==0||amount<0||x<0)
        	{
          		System.out.println("Invalid");    
        	}
    }
}
