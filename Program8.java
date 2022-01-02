import java.util.Scanner;
class Demo
{
    public void Display(int iNo)
    {
        if(iNo < 10)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Demo");
        }
    }
}
class Program8
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number");

        int iValue=sobj.nextInt();

        Demo dobj=new Demo();

        dobj.Display(iValue);
    }

}