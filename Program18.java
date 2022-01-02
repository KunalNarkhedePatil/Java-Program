import java.util.Scanner;
class Demo
{
    public int Range(int iNo)
    {
        int iDigit=0,iCount=0;

        while(iNo != 0)
        {
            iDigit=iNo%10;

            if(iDigit > 3 && iDigit < 7)
            {
                iCount++;
            }
            iNo=iNo/10;
        }
        return iCount;
    }
}
class Program18
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number");

        int iValue=sobj.nextInt();

        Demo dobj=new Demo();

        int iRet=dobj.Range(iValue);

        System.out.println("Count is "+iRet);
    }
}