import java.util.*;
class Prime{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                k=1;
                break;
            }
        }
        if(k==0)
        {
            System.out.println("The given number"+n+" is a Prime Number");
        }
        else
        {
            System.out.println("The given number"+n+" is NOT a Prime Number");
        }
    }
}