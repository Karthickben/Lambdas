package com.lambdas;


import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Author(author = "Karthick", methodName = "MAIN")
public class Tester {

	//// private static Function<Integer, Integer> cubeFunction = (e) -> e*e*e;

	public static void main(String args[]) {
		Employee ee = new Employee();
		Map<Integer, List<Employee>> collect1 = Employee.getEmplist().stream()
				.collect(Collectors.groupingBy(Employee::getExperience));
		System.out.println(collect1);

		System.out.println( Employee.getEmplist().stream()
				.collect(Collectors.partitioningBy(e-> e.getSalary()<300,Collectors.counting()))); 
		
		for(Employee emp: Employee.getEmplist()) {
			if(emp.getPassport().isPresent()) {
				System.out.println(emp.getPassport().get().getPassportNumber());
			}
		}

	}

	private static void getMaxSalary() {
		Employee eemp = new Employee();

		Predicate<Employee> employeeWithlessthan1yearExperience = (e) -> e.getExperience() < 1400;
		Function<Employee, Employee> increaseEmployeeSalary = (e) -> {
			e.setSalary(e.getSalary() + 250);
			return e;
		};

		// System.out.println(maxSalary.get());

		List<Employee> collect1 = Employee.getEmplist().stream().filter(employeeWithlessthan1yearExperience)
				.map(increaseEmployeeSalary).collect(Collectors.toList());

		Optional<Integer> maxSalary = collect1.stream().map(Employee::getSalary).reduce(Integer::max);

		Predicate<Employee> employeeWithMaxSalary = (e) -> e.getSalary() == maxSalary.get();

		Map<Integer, Employee> collect = collect1.stream().filter(employeeWithMaxSalary)
				// .collect(Collectors.toList());
				.collect(Collectors.toMap(Employee::getId, Function.identity()));
		// .entrySet());

		System.out.println(collect);
	}

}
