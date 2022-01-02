import java.util.Scanner;
class Demo
{
    public int Difference(int iNo)
    {
        int iDigit=0,iEven=0,iOdd=0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 == 0)
            {
                iEven=iEven+iDigit;
            }
            else
            {
                iOdd=iOdd+iDigit;
            }
            iNo=iNo/10;
        }
        return iEven-iOdd;
    }
}
class Program20
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number");

        int iValue=sobj.nextInt();

        Demo dobj=new Demo();

        int iRet=dobj.Difference(iValue);

        System.out.println("Difference is "+iRet);


    }
}