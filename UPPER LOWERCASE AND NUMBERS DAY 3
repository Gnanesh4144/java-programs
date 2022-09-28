import java.util.*;
class alphabet
{   
    public static void main(String[] args)
    {
		   int c=0,x=0,co=0;
       List<Character>caps = new ArrayList<>();
       List<Character>smals = new ArrayList<>();
	     List<Character>num = new ArrayList<>();
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter * to exit...");
       System.out.print("Enter any charecter : ");
       char n=sc.next().charAt(0);
       while(n!='*')
	     {	
		      if(Character.isUpperCase(n))
		      {
			        caps.addAll(Arrays.asList(n));
			        x++;
		      }
		      else if(Character.isLowerCase(n))
		      {
              smals.addAll(Arrays.asList(n));
              co++;
          }
          else if(n>='0' && n<='9')
          {
              num.addAll(Arrays.asList(n));
              c++;
          }
          System.out.print("Enter the number : ");
          n=sc.next().charAt(0);
        }
        System.out.println("Upper cases= "+caps);
	      System.out.println("Lower cases = "+smals);
	      System.out.println("Numbers = "+num);
        System.out.println("Total count of Upper cases= "+x);
        System.out.println("Total count of Lower cases= "+co);
	      System.out.println("Total count of Numbers= "+c);
    }
}
