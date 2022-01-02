import java.util.Scanner;
class Demo
{
   public int Divide(int iNo1,int iNo2)
   {
       return iNo1/iNo2;
   }
}
class Program1
{
    public static void main(String arg[])
    {
       Scanner sobj=new Scanner(System.in);

       System.out.println("Enter the First Number");
       int iValue1=sobj.nextInt();

       System.out.println("Enter the Second Number");
       int iValue2=sobj.nextInt();

       Demo dobj=new Demo();

       float iRet=dobj.Divide(iValue1,iValue2);

       System.out.println("Division of Two number is "+iRet);


    }
}