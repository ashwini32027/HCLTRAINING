import java.util.*;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Pnb bank= new Pnb(sc);
        while(true)
		{
			System.out.println("--PUNJAB NATIONAL BANK--");
			System.out.println("1 Create bank account");
			System.out.println("2 deposit");
			System.out.println("3 Withdrawal");
			System.out.println("4 Balance enquiry");
			System.out.println("5 Account details");
			System.out.println("Enter number for Operation");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:bank.account();
				break;
				default:System.out.println();
			}

		}
	}

}

class Pnb{
	Scanner sc;
	private dob;
	private name;
	
	private Pnb(Scanner sc)
	{
		this.sc=sc;
	}
	 void account()
	{
		System.out.println("Welcome to Punjab National Bank ");
		System.out.println("Create your Account at Pnb Bank Garhwa");
		System.out.println("Please Enter Your name");
		String ok=sc.next();
		System.out.println("Please Enter Your DOB");
		String dob=sc.next();

	}
}