import java.util.Scanner;
class Patt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j || i+j==n-1)
                {
                    System.out.printf("x");
                }
                else
                {
                    System.out.printf("0");
                }
                
            }
            
            System.out.println();
        }
    }
}