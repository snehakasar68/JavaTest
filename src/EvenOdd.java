import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number:");
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println(a+" is Even number");
		}
		else
		{
			System.out.println(a+" is Odd number");
			
		}

	}

}
