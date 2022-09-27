import java.util.Scanner;
class Patt
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for( i=1;i<=n;i++)
        {
            for( j=1;j<=n;j++)
            {
                if(j==1 || i==j || i==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("
");
        }
    }
}