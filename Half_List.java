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
        for(i=n-1;i>(n/2)-1;i--)
        {
            System.out.format("%d ",a[i]);
        }
        for(i=0;i<n/2;i++)
        {
            System.out.format("%d ",a[i]);
        }
            
    }
}