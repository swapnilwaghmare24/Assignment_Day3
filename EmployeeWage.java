public class EmployeeWage
{
public static void main(String[] args)
{
System.out.println("Welcome to Employee wage computation program");
final int ISPRESENT=1;
final int WAGE_PER_HOUR=20;
final int FULL_DAY_HOUR=8;
int dailyWage=0;
int empStatus = (int)(Math.random()*2);
System.out.println(empStatus);
if(empStatus==ISPRESENT)
{
	System.out.println("Employee is present");
	dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
	System.out.println("Daily Wage of Employee is "+dailyWage);
}
else
{
	System.out.println("Employee is absent");	
}
}
}