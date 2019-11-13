package com.tb.work;

public class Employee
{
	private String name;
	private int age;
	private String contact;
	public Employee(String name, int age, String contact)
	{
		this.name = name;
		this.age = age;
		this.contact=contact;
	}
	public String toString()
	{
		return "\n Name = " +this.name+ "\n Age = " +this.age+ "\n Contact = " +this.contact;
	}
}
