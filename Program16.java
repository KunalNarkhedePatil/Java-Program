import java.util.Scanner;
class Demo
{
   public int CountEven(int iNo)
   {
       int iDigit=0,iCount=0;

       while(iNo != 0)
       {
           iDigit=iNo%10;

           if(iDigit % 2 == 0)
           {
               iCount++;
           }
           iNo=iNo/10;
       }
       return iCount;
   }
}
class Program16
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number");
        int iValue=sobj.nextInt();

        Demo dobj=new Demo();

        int iRet=dobj.CountEven(iValue);

        System.out.println("Count of even number "+iRet);
    }
}