import java.util.*;
public class Second {
	static void Insert(int arr[],Scanner sc)
	{
		System.out.println("Enter index number where you want Insert value ");
		int index=sc.nextInt();
		if(index>arr.length)
		{
			System.out.println("Sorry index is more than the array length ");
			return ;
		}
		System.out.println("Enter value ");
		int value=sc.nextInt();
		arr[index]=value;
		System.out.println("New value updated at index is "+arr[index]);
	}
	static void Delete(int arr[],Scanner sc)
	{
		System.out.println("Enter index number where you want Delete value ");
		int index=sc.nextInt();
		if(index>arr.length)
		{
			System.out.println("Sorry index is more than the array length ");
			return ;
		}
		int value=arr[index];
		System.out.println(" value deleted at index is "+value);
			
	}
	static void Search(int arr[],Scanner sc)
	{
		System.out.println("Enter number to search");
		int num=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				System.out.println("Element found at index "+i);
				
			}
		}
System.out.println("Element not found");	
		
	}
	static void binarysearch(int arr[],Scanner sc)
	{
        Arrays.sort(arr);
		System.out.println("Enter element to search by binary search");
		int data=sc.nextInt();
		int first=0;
		int last=arr.length-1;
		while(first<=last)
		{

			int mid=(first+last)/2;
			if(arr[mid]==data)
			{
				System.out.println("Element found at index "+mid);
            return;
			}
			else if(arr[mid]<data)
			{
				first=mid+1;
			}
			else
			{
				last=mid-1;
			}
		}
        System.out.println("Element not found");	

        
	}
	static void maxnum(int arr[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("The max number is "+max);

	}
	static void counteven(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		System.out.println("The total number of counteven is "+ count);

	}
	static void countodd(int arr[])
	{
		int count=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				count++;
			}
		}
		System.out.println("The total number of countodd" +count);
	}
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[]= {10,12,73,372,38,22,774,99};
        while(true)
        {
        	 System.out.println("--MENU--");
             System.out.println(" Click Number for operation ");
             System.out.println("1 Insert");
             System.out.println("2 Delete");
             System.out.println("3 Linear Search");
             System.out.println("4 Binary Search");
             System.out.println("5 Max Value");
             System.out.println("6 count even ");
             System.out.println("7 count odd");
             System.out.println("8 Exit");
             int choice=sc.nextInt();
            switch(choice)
           {
            case 1:Insert(arr,sc);
            break;
            case 2:Delete(arr,sc);
            break;
            case 3:Search(arr,sc);
            break;
            case 4:binarysearch(arr,sc);
            break;
            case 5:maxnum(arr);
            break;
            case 6:counteven(arr);
            break;
            case 7:countodd(arr);
            break;
            case 8:
            	System.out.println("Existing from System");
            	System.exit(0);
            default:System.out.println("Choose proper key");
            
           }
        }
        }
}
