import java.util.Scanner;

public class NumberTables {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num,cnt=1,sum;
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		while(cnt<=10)
		{
			System.out.println(num*cnt);
			cnt=cnt+1;
		}

	}

}
