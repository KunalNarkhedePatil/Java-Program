import java.util.Scanner;
class Demo
{
    public void DisplayDigit(int iNo)
    {
        int iDigit=0;

        while(iNo != 0)
        {
            iDigit=iNo%10;
            System.out.println(iDigit);
            iNo=iNo/10;
        }
    }
}
class Program11
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number");

        int iValue=sobj.nextInt();

        Demo dobj=new Demo();

        dobj.DisplayDigit(iValue);
        System.out.println();
    }
}