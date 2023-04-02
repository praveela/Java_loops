import java.util.Scanner;

class Gpgrs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char gr;
        double gp;
        int a,b;
        System.out.println("marks obtained ");
        a=sc.nextInt();
        System.out.println("total marks: ");
        b=sc.nextInt();
        
        float p=((float)a/b)*100;
        if(p<=59){
            gr='F';
            gp=0.0;
        }
        else if(p>59 && p<=69){
            gr='D';
            gp=1.0;
        }
        else if(p>69 && p<=79){
            gr='C';
            gp=2.0;
        }
        else if(p>79 && p<=89){
            gr='B';
            gp=3.0;
        }
        else{
            gr='A';
            gp=4.0;
        }
       System.out.println("Percentage: "+String.format("%.2f",p)+"%");
       System.out.println("Grade "+gr+" GPA "+gp);

    }
}