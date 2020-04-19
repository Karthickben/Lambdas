package com.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Employee {
	
	private static List<Employee> emplist;
	private int id;
	private int experience;
	private int salary;
	private Optional<Passport> passport;
	
	
	
	public Employee() {
		super();
	}
   
	

	public Employee(int id, int experience, int salary) {
		super();
		this.id = id;
		this.experience = experience;
		this.salary = salary;
	}



	static{
		emplist= new ArrayList<>();
		emplist.add(new Employee(1, 1000, 300,new Passport()));
		emplist.add(new Employee(3, 1300, 100,new Passport()));
		emplist.add(new Employee(5, 1500, 500,null));
		emplist.add(new Employee(4, 1400, 150,new Passport()));
		emplist.add(new Employee(2, 1200, 300,null));
	
		
	}
	
	
	public Employee(int id, int experience, int salary,Passport passport2) {
		super();
		this.id = id;
		this.experience = experience;
		this.salary = salary;
		this.passport= Optional.ofNullable(passport2);
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void filter(Predicate<Employee> filterCondition) {
		
	  emplist.stream().filter(filterCondition).forEach(System.out::println);
	}


	public static List<Employee> getEmplist() {
		return emplist;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", experience=" + experience + ", salary=" + salary + "]";
	}


	public Optional<Passport> getPassport() {
		return passport;
	}


	public void setPassport(Optional<Passport> passport) {
		this.passport = passport;
	}
	
	
	
	

}
