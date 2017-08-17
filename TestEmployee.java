class Employee
{
	int employeeId;
	String firstName;
	String lastName;

	String getFullName()
	{
		return "Full Name : "+ firstName+" " +lastName;
	}
}
class PartTimeEmployee
{
	double noOfHour;
	int payPerHour;

	String getMonthlySalary()
	{
		return "Monthly Salary :  "+ noOfHour*payPerHour;
	}

}
class FullTimeEmployee
{
	int annualSalary;

	String getMonthlySalary()
	{
	
		return " Monthly Salary : "+annualSalary/12;
	}
}
class TestEmployee
{
	public static void main(String[] args)
	{
		PartTimeEmployee ptr = new PartTimeEmployee();
		ptr.employeeId = 123;
		ptr.firstName = "Ram";
		ptr.lastName = " pal";
		ptr.noOfHour = 53.30;
		ptr.payPerHour = 40;

		System.out.println(ptr.employeeFullName());
		System.out.println(ptr.getMonthlySalary());

		FullTimeEmployee ftr = new FullTimeEmployee();
		ftr.employeeId = 124;
		ftr.firstName = "Raj";
		ftr.lastName = " Mouli";
		ftr.annualSalary = 425000;

		System.out.println(ftr.fullName());
		System.out.println(ftr.getMonthlySalary());


	}
}