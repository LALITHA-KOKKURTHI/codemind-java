import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        float v=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(float i=1;i<=n;i++)
        {
            v=v+(1/i);
            
        }
        System.out.format("%.2f",v);
    }
}