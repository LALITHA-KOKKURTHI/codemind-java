import java.util.Scanner;
class cir
{
    public static void main(String args[])
    {
        int a;
        float b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=(float)(3.14*a*a);
        System.out.format("%.2f",b);
        sc.close();
    }
}