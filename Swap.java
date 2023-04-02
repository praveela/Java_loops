import java.util.*;
class Swap{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,temp;
        System.out.println("Enter the val of n:");
        n=sc.nextInt();
        System.out.println("Enter the val of m:");
        m=sc.nextInt();
        temp=n;
        n=m;
        m=temp;
        System.out.println("Enter the val of n:"+n);
        System.out.println("Enter the val of m:"+m);

    }
}