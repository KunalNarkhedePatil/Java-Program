import java.util.Scanner;
class Demo
{
   public int CountTwo(int iNo)
   {
       int iCount=0,iDigit=0;

       while(iNo != 0)
       {
           iDigit=iNo%10;
           if(iDigit == 2)
           {
               iCount++;
           }
           iNo=iNo/10;
       }
       return iCount;
   }
}
class Program13
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number");

        int iValue=sobj.nextInt();

        Demo dobj=new Demo();

        int iRet=dobj.CountTwo(iValue);

        System.out.println("Count is "+iRet);
    }
}