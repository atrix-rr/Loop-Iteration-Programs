import java.util.*;
class Print5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing Even from 1 to 50");
        int i=1;
        while(i<=50)
        {
            if(i%2==0)
            {
                System.out.println(i);
                i++;
            }
        }
    }
}