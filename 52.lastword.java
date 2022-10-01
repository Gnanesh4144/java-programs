import java.util.*;
public class lastword
 {  
 public static void main(String[] args) 
 {
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter the string:");
         String str1=sc.nextLine();
        System.out.println("Last word of the sentence is :"+ str1.substring (str1.lastIndexOf (' '), str1.length()));
        System.out.println("Length of the last word is:"+length_Of_last_word(str1));
    }

    public static int length_Of_last_word(String str1) {
        int length_word = 0;
        String[] words = str1.split(" ");
        if(words.length>0) {
            length_word = words[words.length-1].length();			
        } else {
            length_word = 0;
        }
        return length_word;
        
    }
}