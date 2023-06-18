import java.util.Scanner;
public class Demo 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the charecter:");
        char ch=obj.next().charAt(0);
        int a=ch;
        System.out.println(a);
        for(int i=0;i<=256;i++)
        {
            System.out.printf("%d:%c",i,i);
            System.out.println();
        }
    }    
}
