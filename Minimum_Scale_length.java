import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for( i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int min=a[0];
        int j=1;
        while(j<n)
        {
            if(a[j]%min==0)
            {
                j++;
            }
            else
            {
                min=a[j]%min;
            }
        }
        System.out.println(min);
            
    }
}