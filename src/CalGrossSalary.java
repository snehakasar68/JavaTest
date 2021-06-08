import java.util.Scanner;
public class CalGrossSalary {

	public static void main(String[] args) 
	{
		float salary,hra,da,grossSalary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Salary");
		salary=sc.nextFloat();
		if(salary<=10000)
		
		{
			hra=salary*20/100;
			da=salary*80/100;
			grossSalary=hra+da+salary;
			System.out.println("Your Gross Salary is: "+grossSalary);
		}
		else if(salary<=20000)
		{
			hra=salary*25/100;
			da=salary*90/100;
			grossSalary=hra+da+salary;
			System.out.println("Your Gross Salary is: "+grossSalary);
		}
		else
		{
			hra=salary*30/100;
			da=salary*95/100;
			grossSalary=hra+da+salary;
			System.out.println("Your Gross Salary is: "+grossSalary);
		}
		
		

	}

}
