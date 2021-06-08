import java.util.Scanner;
public class CalElectricityBill {

	public static void main(String[] args) 
	{
		float unit,bill,diff;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter units");
		unit=sc.nextFloat();
		if(unit<=50)

		{
			bill=(float)(unit*0.50);
			System.out.println("Your bill is:"+bill);
			
		}
		else if(unit<=150)
		{
			diff=(float)unit-50;
			bill=(float)((diff*0.75)+50*0.50);
			System.out.println("Your bill is:"+bill);

		}
		else if(unit<=250)
		{
			diff=(float)unit-150;
			bill=(float)((diff*1.20)+(50*0.50)+(100*0.75));
			System.out.println("Your bill is:"+bill);
		}
		else
		{
			diff=unit-250;
			bill=(float)((diff*1.50)+(50*0.50)+(100*0.75)+(100*1.20));
			System.out.println("Your bill is:"+bill);

		}
	}

}
