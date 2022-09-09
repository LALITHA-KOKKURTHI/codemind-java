import java.util.Scanner;
class Temp
{
    public static void main(String args[])
    {
        float a;
        float b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=(float)(32+(a*9/5));
        System.out.format("%.2f",b);
        sc.close();
        
    }
}