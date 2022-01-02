import java.util.Scanner;
class Demo
{
    public void Display(int iStart,int iEnd)
    {
       int i=0;
       System.out.println("OutPut is ");
       for(i=0;i<iEnd;i++)
       {
           System.out.print(iStart+" ");
       }
    }
}
class Program9
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter first number");
        int iValue1=sobj.nextInt();

        System.out.println("Enter the Second number");
        int iValue2=sobj.nextInt();

        Demo dobj=new Demo();

        dobj.Display(iValue1, iValue2);

        System.out.println();


    }
}