public class EmployeeWage
{
public static void main(String[] args)
{
System.out.println("Welcome to Employee wage computation program");
final int isPresent=1;
int empStatus = (int)(Math.random()*2);
System.out.println(empStatus);
if(empStatus==isPresent)
{
	System.out.println("Employee is present");
}
else
{
	System.out.println("Employee is absent");	
}
}
}