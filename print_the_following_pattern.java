import java.util.Scanner;
class Patt
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for( i=0;i<n;i++)
        {
            for( j=n;j>0;j--)
            {
                System.out.printf("%d ",j);
                
            }
            
            System.out.println();
        }
    }
}