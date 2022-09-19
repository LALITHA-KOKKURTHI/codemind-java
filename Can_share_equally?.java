import java.util.Scanner;
class Equal
{
    public static void main(String args[])
    {
        int x,y,tot;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        tot=(1*x)+(2*y);
        if(x==0 && y%2==0)
        {
             System.out.println("YES");
        }
        else if(x==0 && y%2!=0)
        {
             System.out.println("NO");
        }
        else if(tot%2==0)
        {
             System.out.println("YES");
        }
        else
        {
             System.out.println("NO");
        }
        
    }
}