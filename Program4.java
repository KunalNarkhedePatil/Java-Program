import java.util.Scanner;
class Demo
{
     public int iNo1;
     public Demo(int iNo1)   
     {
         this.iNo1=iNo1;
     }

     public boolean Check()
     {
         if(this.iNo1 % 5 == 0)
         {
             return true;
         }
         else
         {
             return false;
         }
     }
}
class Program4
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number");
        
        int iValue=sobj.nextInt();

        Demo dobj=new Demo(iValue);


        boolean bRet=dobj.Check();

        if(bRet==true)
        {
            System.out.println("Number is divisible by 5");
        }
        else
        {
            System.out.println("Number is Not divisible by 5");
        }


    }
}