import java.util.Scanner;
class Demo
{
    public boolean CheckEven(int iNo)
    {
       if(iNo % 2 == 0)
       {
           return true;
       }
       else
       {
           return false;
       }
    }
}
class Program10
{
    public static void main(String arg[])
    {
       Scanner sobj=new Scanner(System.in);

       System.out.println("Enter the Number");
       int iValue=sobj.nextInt();

       Demo dobj=new Demo();


       boolean bRet=dobj.CheckEven(iValue);

       if(bRet==true)
       {
           System.out.println("Number is Even");
       }
       else
       {
           System.out.println("Number is not Even");
       }

    }
}