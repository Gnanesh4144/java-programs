import java.util.*;
import java.util.Map;
import java.util.HashMap;
class romannum
{   
	private static final Map<Character,
	Integer> roman = new HashMap<Character, 
	Integer>() 
	{
		{

    			put('I', 1);
	
    			put('V', 5);

   			put('X', 10);
  
    			put('L', 50);

    			put('C', 100);

    			put('D', 500);

    			put('M', 1000);
		}
	};
	private static int romanToInt(String s)
	{

    		int sum = 0;
	     int n = s.length();
	     for(int i = 0; i < n; i++) 
		{
        		if (i!=n-1 && roman.get(s.charAt(i))<roman.get(s.charAt(i+1)))
        		{
				sum += roman.get(s.charAt(i + 1))-roman.get(s.charAt(i));
		          i++;
        		} 
        		else
        		{
            		sum += roman.get(s.charAt(i));
        		}
    		}
    		return sum;
	}
 
	// Driver Code
	public static void main(String[] args) 
	{
		 // Considering inputs given are valid
    		String input;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter roman number: ");
		input=sc.nextLine();
		for(int i=0; i<input.length();i++)
		{
			char h=input.charAt(i);
			if(h=='I' || h=='V'  || h=='X'||h=='L'|| h=='C'|| h=='D'|| h=='M')
			{
				System.out.print("");
			}
			else
			{
				System.out.print("Invalid");
				return;
			}
		}
    		System.out.print("Integer form of Roman Numeral is " + romanToInt(input));
	}
}