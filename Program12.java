import java.util.Scanner;

import javax.swing.text.AbstractDocument.ElementEdit;
class Demo
{
    public Boolean CheckZero(int iNo)
    {
        int iDigit=0;

        while(iNo != 0)
        {
            iDigit=iNo % 10;

            if(iDigit == 0)
            {
                return true;
            }

            iNo=iNo/10;
        }
        return false;
    }
}
class Program12
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number ");

        int iValue=sobj.nextInt();

        Demo dobj=new Demo();

        boolean bRet=dobj.CheckZero(iValue);

        if(bRet==true)
        {
            System.out.println("It Contain Zero");
        }
        else
        {
            System.out.println("There is no zero");
        }
    }
}