import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int n,m,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int c=0;
        for(i=n;i<m+1;i++)
        {
            int x=0;
            for(j=i;j<m+1;j++)
            {
                x+=j;
                if(x%2!=0)
                {
                    c++;
                }
            }
        }
        
            System.out.println(c);
            
    }
}