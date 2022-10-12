import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int k=0;k<x;k++)
        {
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=1;i<n;i++)
        {
            if(a[i-1]>a[i])
            {
                c++;
            }
        }
        if(c==0)
        {
            System.out.println('0');
        }
        else
        {
            int min=a[0],max=a[0];
            for(int j=0;j<n;j++)
            {
                if(a[j]>max)
                {
                    max=a[j];
                }
                if(a[j]<min)
                {
                    min=a[j];
                }
            }
            System.out.println(max-min);
        }
        }
          
    }
}