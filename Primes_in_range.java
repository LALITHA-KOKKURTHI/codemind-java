import java.util.Scanner;
class Solution
{
   boolean prime(int n)
    {
        if(n==1)
        {

            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
        
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int c=0;
        for(int i=m;i<n+1;i++)
        {
            if(s.prime(i))
            {
              c+=1;
            }
        }
        System.out.println(c);
    }
}