import java.util.*;
class Pattern6{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i+=2)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-2;i>0;i-=2)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}