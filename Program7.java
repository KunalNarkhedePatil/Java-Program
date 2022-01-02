import java.util.Scanner;
class Demo
{
   public void Display(int iNo)
   {
       int i=0;

       while(i<iNo)
       {
           System.out.print("*"+" ");
           i++;
       }
   }
}
class Program7
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number");


        int iValue=sobj.nextInt();
        

        Demo dobj=new Demo();

        dobj.Display(iValue);

        System.out.println();



    }
}