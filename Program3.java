import java.util.Scanner;
class Demo
{
   public void Display(int iNo1)
   {
       int iCnt=0;
       System.out.println("Numbers are ");
       for(iCnt=iNo1;iCnt>=1;iCnt--)
       {
           System.out.println(iCnt+" ");
       }
   }
}
class Program3
{
    public static void main(String agr[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number");

        int iValue1=sobj.nextInt();

        Demo dobj=new Demo();

        dobj.Display(iValue1);

    }
}