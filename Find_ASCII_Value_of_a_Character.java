import java.util.Scanner;
class Value
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int value=ch;
        System.out.println(value);
        sc.close();
        
    }
}