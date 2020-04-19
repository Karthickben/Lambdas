package com.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainTester {
	
	public static void main(String[] args) {
		List<IntermediateReportFormat> ls = new ArrayList<>();
		ls.add(new IntermediateReportFormat("Karthick", 'A', 2));
		ls.add(new IntermediateReportFormat("dev", 'C', 2));
		ls.add(new IntermediateReportFormat("Rupa", 'B', 2));
		ls.add(new IntermediateReportFormat("Karthick", 'B', 4));
		ls.add(new IntermediateReportFormat("Rupa", 'C', 1));
		ls.add(new IntermediateReportFormat("dev", 'B', 3));
		ls.add(new IntermediateReportFormat("Karthick", 'C', 5));
		ls.add(new IntermediateReportFormat("Rupa", 'A', 6));
		ls.add(new IntermediateReportFormat("dev", 'A', 4));
		
		 ls.sort(Comparator.comparing(IntermediateReportFormat::getName).thenComparing(IntermediateReportFormat::getBand));
		
	     ls.forEach(System.out::println);
		
		   Map<Character, Double> TotalPointsByPoint = ls.stream().collect(Collectors
				   .groupingBy(IntermediateReportFormat::getBand,
						   Collectors.averagingInt(IntermediateReportFormat::getPoints)));
		   
		   
		  Map<Character, List<Integer>> PointslistByBand = ls.stream()
				  .collect(Collectors.groupingBy(IntermediateReportFormat::getBand,
				   Collectors.mapping(IntermediateReportFormat::getPoints, Collectors.toList())));
		  
		  
		   
		List<String> nameList = ls.stream().map(IntermediateReportFormat::getName).distinct()
				.collect(Collectors.toList());
		System.out.println(PointslistByBand+" SUM: "+TotalPointsByPoint+" names: "+nameList+"\n -----------------------------------");
		
		
		
	ArrayList<Integer> pointsByName = ls.stream()
		.collect(Collectors.mapping(IntermediateReportFormat::getPoints,Collectors.toCollection(ArrayList::new)));
		
	 System.out.println(pointsByName);
	 
	 
		OptionalDouble  numberOfPeopleInEachBand = ls.stream()
				.mapToInt(e-> e.getPoints())
				.average();
				
		
		System.out.println(numberOfPeopleInEachBand.getAsDouble());
		
		
		
		
		
		
		
		
		 
	}

}
