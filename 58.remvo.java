import java.util.*;
 
public class remvo{
 
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();
        Set<Character> vowelsSet = new HashSet<>();
        vowelsSet.add('A');
        vowelsSet.add('E');
        vowelsSet.add('I');
        vowelsSet.add('O');
        vowelsSet.add('U');
        vowelsSet.add('a');
        vowelsSet.add('e');
        vowelsSet.add('i');
        vowelsSet.add('o');
        vowelsSet.add('u');
 
        StringBuffer resultStr = new StringBuffer();
 
        char[] charArray = str.toCharArray();
        for (Character chr : charArray) {
            if (!vowelsSet.contains(chr))
                resultStr.append(chr);
        }
 
        System.out.println("Original String is : " + str);
        System.out.println("String without vowels is : " + resultStr);
 
    }
}