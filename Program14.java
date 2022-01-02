import java.util.Scanner;
class Demo
{
    public int CountFour(int iNo)
    {
        int iDigit=0,iCount=0;

        while(iNo != 0)
        {
            iDigit=iNo%10;
            if(iDigit == 4)
            {
                iCount++;
            }
            iNo=iNo/10;
        }
        return iCount;
    }

}
class Program14
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number");
        int iValue=sobj.nextInt();

        Demo dobj=new Demo();

        int iRet=dobj.CountFour(iValue);

        System.out.println("Count of four is "+iRet);


    }
}