import java.util.*;
class Factorial2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=5;
        while(i>=1)
        {
            System.out.println(i);
            i*=i--;
        }
    }       
}