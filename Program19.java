import java.util.Scanner;
class Demo
{
    public int Multiplication(int iNo)
    {
        int iDigit=0,iMult=1;

        while(iNo != 0)
        {
            iDigit=iNo % 10;
            iMult=iMult*iDigit;
            iNo=iNo/10;   
        }
        return iMult;
    }
}
class Program19
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number");

        int ivalue=sobj.nextInt();

        Demo dobj=new Demo();

        int iRet=dobj.Multiplication(ivalue);

        System.out.println("Multiplication of all Digit are "+iRet);




    }
}