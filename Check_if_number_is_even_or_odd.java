import java.util.Scanner;
class odd
{
    public static void main(String args[])
    {
        int i;
        Scanner sc= new Scanner(System.in);
        i=sc.nextInt();
        if(i%2==0)
        {
            System.out.println("Even");
        }
        else
{
    System.out.println("Odd");
}
sc.close();
        
    }
}