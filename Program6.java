import java.util.Scanner;
class Demo
{
    public void Display(int iNo1)
    {
        for(int i=0;i<iNo1;i++)
        {
            System.out.print("*"+" ");
        }
    }
}
class Program6
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Numebr ");
        int iValue1=sobj.nextInt();


        Demo dobj=new Demo();

        dobj.Display(iValue1);

        System.out.println();




    }
}