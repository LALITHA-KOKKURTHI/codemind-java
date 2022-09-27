import java.util.Scanner;
class Patt
{
    public static void main(String args[])
    {
        int n,i,j,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for( i=0;i<n;i++)
        {
            for( j=1;j<n-1;j++)
            {
                System.out.printf("%d",j);
                
            }
            for( k=1;k<n-2;k++)
            {
                System.out.printf("%d",k);
            }
            System.out.println();
        }
    }
}