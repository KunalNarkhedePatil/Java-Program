import java.util.Scanner;
import java.util.function.IntToDoubleFunction;
class Demo
{
    public int Count(int iNo)
    {
        int iCount=0;
        int iDigit=0;

        while(iNo != 0)
        {
            iDigit=iNo%10;
            if(iDigit < 6)
            {
                iCount++;
            }
            iNo=iNo/10;
        }
        return iCount;
    }
}
class Program15
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number");

        int iValue=sobj.nextInt();

        Demo dobj=new Demo();
        int iRet=dobj.Count(iValue);

       System.out.println("Count is "+iRet);
    }
}