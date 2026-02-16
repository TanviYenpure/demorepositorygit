package in.core.bean;

import java.util.Objects;

public class Employee implements Comparable<Employee>
{
	private String employeename;
	private String employeeId;
	private String employeedesignation;
	private double employeesalary;
	
	public Employee(String employeename, String employeeId, String employeedesignation, double employeesalary)
	{
		this.employeename = employeename;
		this.employeeId = employeeId;
		this.employeedesignation = employeedesignation;
		this.employeesalary = employeesalary;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Employee)
		{
			Employee otheremp=(Employee) obj;
			return this.employeeId.equals(otheremp.employeeId);
		}
		return false;
	}
	@Override
	public int hashCode() 
	{
		return employeeId.hashCode();
	}

	@Override
	public int compareTo(Employee emp)
	{
		return this.employeeId.compareTo(emp.employeeId)	;	
	}
	

	@Override
	public String toString()
	{
		return "\n Name=" + employeename + 
				",\n Id=" + employeeId + ",\n"
				+ " designation="+ employeedesignation + 
				",\n salary=" + employeesalary +"\n"+
				"----------------------------------------------------"
				;
	}
	

}
