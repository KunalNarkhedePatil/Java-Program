import java.util.Scanner;
class Demo
{
    public void  Display(int iNo1)
    {
        int iCnt=0;

        for(iCnt=1;iCnt<=iNo1;iCnt++)
        {
            System.out.println("Jay Ganesh");
        }
    }
}
class Program2
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number");

        int iValue=sobj.nextInt();

        Demo dobj=new Demo();

        dobj.Display(iValue);
    }
}