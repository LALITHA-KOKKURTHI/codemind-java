import java.util.Scanner;
class Temp
{
    public static void main(String args[])
    {
        double a,b,c,d,e;
        
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        d=(a+b+c)/2;
        e=Math.sqrt(d*(d-a)*(d-b)*(d-c));
        System.out.format("%.2f",e);
        sc.close();
        
    }
}