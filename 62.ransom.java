import java.util.*;
class ransom
{
    	public static boolean canConstruct(String ransomNote, String magazine)
 	{
        		if (ransomNote==null || ransomNote.length() == 0)
		{ 
			return true;	
		}
        		if (magazine==null || magazine.length() == 0) 
		{
			return false;
        		}
		boolean flag=false;
        		boolean visited[]=new boolean[magazine.length()];
        		Arrays.fill(visited,Boolean.FALSE);
        		for(int i=0;i<ransomNote.length();i++)
		{
            		flag=false;
            		for(int j=0;j<magazine.length();j++)
			{
                			if(ransomNote.charAt(i)==magazine.charAt(j) && !visited[j] )
				{
                    				visited[j]=true;
                    				flag=true;
                    				break;
                			}
            		}
        		}
        		return flag;
    	}
	public static void main(String[] args) 
	{
		String ransomNote;
		String magazine;
		Scanner sc=new Scanner(System.in);
		System.out.print("ransomNote= ");
		ransomNote=sc.nextLine();	
		System.out.print("magazine= ");	
		magazine=sc.nextLine();
		System.out.println(canConstruct(ransomNote, magazine));
	}
}