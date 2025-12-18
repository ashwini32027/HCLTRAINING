import java.util.*;

public class First {
    static int add(Scanner sc)
{
  System.out.println("Please enter first number");
  int first=sc.nextInt();
  System.out.println("Please enter second number");
  int second=sc.nextInt();
  System.out.println("The sum of two number is ");
  return first+second;
}
static int Sub(Scanner sc)
{
	  System.out.println("Please enter first number");
	  int first=sc.nextInt();
	  System.out.println("Please enter second number");
	  int second=sc.nextInt(); 
	  System.out.println("The Subtract of two number is ");
	  return first-second;

}
static int mul(Scanner sc)
{
	  System.out.println("Please enter first number");
	  int first=sc.nextInt();
	  System.out.println("Please enter second number");
	  int second=sc.nextInt();
	  System.out.println("The multiply of two number is ");
	  return first*second;

}
static int div(Scanner sc)
{
	  System.out.println("Please enter first number");
	  int first=sc.nextInt();
	  System.out.println("Please enter second number");
	  int second=sc.nextInt();
	  System.out.println("The divide  of two number is ");
	  return first/second;

}
static int rem(Scanner sc)
{
	  System.out.println("Please enter first number");
	  int first=sc.nextInt();
	  System.out.println("Please enter second number");
	  int second=sc.nextInt(); 
	  System.out.println("The remainder of two number is ");
	  return first%second;

}
static int square(Scanner sc)
{
	  System.out.println("Please enter  number");
	  int first=sc.nextInt();
	 
	  return (int) Math.pow(first,2);

}
static int cube(Scanner sc)
{
	  System.out.println("Please enter  number");
	  int first=sc.nextInt();
	  return (int) Math.pow(first,3);
	 
}
static int absoutee(Scanner sc)
{
	  System.out.println("Please  first number");
	  int first=sc.nextInt();
	  return Math.abs(first);
	  
}
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int result=0;

        while(true)
        {
            System.out.println("Click button number to perform task");
            System.out.println("Click 1 to perform Addition");
            System.out.println("Click 2 to perform Subtract");
            System.out.println("Click 3 to perform multiply");
            System.out.println("Click 4 to perform divide");
            System.out.println("Click 5 to perform remainder");
            System.out.println("Click 6 to perform square");
            System.out.println("Click 7 to perform cube");
            System.out.println("Click 8 to perform Absolute");
            System.out.println("Click 9 to exit from program");

            int click=sc.nextInt();
            switch(click)
            {
            case 1:result= add(sc);
            break;
            case 2:result=Sub(sc);
            break;
            case 3:result=mul(sc);
            break;
            case 4:result=div(sc);
            break;
            case 5:result=rem(sc);
            break;
            case 6: result=square(sc);
            break;
            case 7:result=cube(sc);
            break;
            case 8:result=absoutee(sc);
            break;
            case 9:
            System.out.println("System exit.........");
            System.exit(0);
            default:System.out.println("Choose valid method");
        }
        System.out.println(result);

            

        }
    }
    
}
