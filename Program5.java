import java.util.Scanner;
class Demo
{
    public void DispalyPattern(int iNo1)
    {
        for(int i=0;i<iNo1;i++) 
        {
            System.out.print("*"+" ");
        }
    }
}
class Program5
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number ");

        int iValue=sobj.nextInt();

        Demo dobj=new Demo();

        dobj.DispalyPattern(iValue);
        System.out.println();
    }
}