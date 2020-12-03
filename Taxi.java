import java.util.*;
public class Taxi
{
    public static int Mini(int n)
    {
        int sum=0;
        if(n>75)
        {
            return n*8;
        }
        else
        {
            sum=50;
            int n2=n-3;
            if(n2<=15)
            {
                sum=sum+(n2*10);
            }
            else
            {
                sum=sum+(15*10);
                n2=n2-15;
                sum=sum+(n2*8);
            }
            return sum;
        }
    }
    public static int Sedan(int n)
    {
        int sum=0;
        if(n>100)
        {
            return n*10;
        }
        else
        {
            sum=80;
            int n2=n-5;
            if(n2<=15)
            {
                sum=sum+(n2*12);
            }
            else
            {
                sum=sum+(15*12);
                n2=n2-15;
                sum=sum+(n2*10);
            }
            return sum;
        }
    }
    public static int SUV(int n)
    {
        int sum=100;
        int n2=n-5;
        if(n2<=15)
        {
            sum=sum+(n2*15);
        }
        else
        {
            sum=sum+(15*15);
            n2=n2-15;
            sum=sum+(n2*12);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Mini - Rs."+Mini(n));
        System.out.println("Sedan - Rs."+Sedan(n));
        System.out.println("SUV - Rs."+SUV(n));
    }
}