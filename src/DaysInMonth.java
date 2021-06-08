import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a month number:");
		num=sc.nextInt();
		if(num==1)
		{
			System.out.println("January has 31st days");
		}
		else
			if(num==2)
			{
				System.out.println("Febury has 28th days");
			}
			else
				if(num==3)
				{
					System.out.println("March has 31st days");
				}
				else
					if(num==4)
					{
						System.out.println("April has 3th days");
					}
					else 
						if(num==5)
						{
							System.out.println("May has 31st days");
						}
					else
						if(num==6)
						{
							System.out.println("June has 30th days");
						}
						else if(num==7)
						{
							System.out.println("July has 31st days");
						}
						else if(num==8)
						{
							System.out.println("August has 31st days");
						}
						else
							if(num==9)
							{
								System.out.println("Sepetember has 30th days");
							}
							else if(num==10)
							{
								System.out.println("Octomber has 31st days");
							}
							else if(num==11)
							{
								System.out.println("November has 30th days");
							}
							else if(num==12)
							{
								System.out.println("December has 31st days");
							}
							else
							{
								System.out.println("Please enter valid month number");
							}
	}

}
