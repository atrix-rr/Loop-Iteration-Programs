import java.util.*;
class Factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int n=sc.nextInt();

        int f=1;
        while(n>=1)
        {
            f=f*n;
            n--;
        }
        System.out.println("Factorial:"+f);

    }
}