import java.util.*;
class alp
{
    static int max= 26;
    static void sortString(String str)
    {
	int i,j;
        	int charCount[] = new int[max];
        	for (i = 0; i < str.length(); i++)
        	{
            	charCount[str.charAt(i) - 'a']++;
        	}
        	for ( i = max-1; i >= 0; i--)
        	{
            	for ( j = 0; j < charCount[i]; j++)
            	{
                		System.out.print((char) ('a' + i));
            	}
        	}
    }
    public static void main(String[] args)
    {
    	String s;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter word= ");
	s=sc.nextLine();
        	sortString(s);
    }
}
