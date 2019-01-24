import java.util.Scanner;
 class Array
{
	public static void main(String args[])
	{
		int arr[] = new int[5];	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements of the array:\n");
		for(int i = 0; i<5; i++)
		{
			arr[i] = scan.nextInt();
		}
		for(int i = 0; i<5; i++)
		{
			if(arr[i]>10||arr[i]<100)
			{
			System.out.println("wrong entry!!! plz enter again");
			arr[i] = scan.nextInt();
			}}
			for(int i = 0; i<5; i++)
		{
			if(arr[i]==arr[i+1])
			{
			arr[i]  = scan.nextInt();
			}}
	System.out.println("array is");
	for(int i=0;i<5;i++)
{
	System.out.println(arr[i]);
}	}
	}

