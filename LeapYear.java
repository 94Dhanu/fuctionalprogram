import java.util.Scanner;
public class LeapYear 
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = sobj.nextInt();
        boolean flag = false;
        if((year % 400 == 0)||(year % 4 == 0))
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }
        else
        {
            flag = false;
        }
        if(flag)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
    }
}