package com.tb.work;

public class Manager extends Employee
{
	private String salary;
	public Manager(String name, int age, String contact, String salary)
	{
		super(name, age, contact);
		this.salary = salary;
	}
	public String toStrirng()
	{
		return "\n Salary = " +this.salary;
	}
}
