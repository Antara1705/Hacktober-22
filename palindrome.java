import java.util.*;

public class palindrome
{
    public static void main(String args[])
    {
        int n,r=0,d,n1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        
        n1=n;
        
        while(n>0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        
        if(n1==r)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}