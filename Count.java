import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0,c1=0;
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                c++;
            }
            else
            {
                c1++;
            }
        }
            System.out.format("%d %d",c,c1);
            
    }
}