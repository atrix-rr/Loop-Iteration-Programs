import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a no.");
        int num=sc.nextInt();

        int sum=0;
        int digit;
        
        while(num>0)
        {
            digit=num%10;
            sum=num+digit;
            num=num/10;
        }
        System.out.println("The sum is:"+sum);
    }
}