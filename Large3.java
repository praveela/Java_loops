import java.util.*;
class Large3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the three values");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int large=( c > (a > b ? a : b) ? c : ((a > b) ? a : b));
        int smallest=(c < (a < b ? a : b) ? c : ((a < b) ? a : b));  
        System.out.println("The Smallest Number:"+smallest);
        System.out.println("The Largest Number:"+large);
        System.out.println("Average of all three Number:"+(a+b+c)/3);

    }
}