import java.util.*;
class step {
    public static void main (String args[]){
        try{
        int ans = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value:");
        int n=sc.nextInt();
        for (ans=0; n > 0; ans++)
            if (n% 2 == 1) n--;
            else n /= 2;
        System.out.println("Number of steps:"+ans);
    }
    catch(Exception e){
        System.out.println("invalid input");
    }
}
}