import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int n,i,j,k;
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         k=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int s=0,c=0;
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                s=s+a[j];
                if(k==s)
                {
                    c++;
                }
                if(c>k)
                {
                    break;
                }
            }
            s=0;
        }
        System.out.println(c);
            
    }
}