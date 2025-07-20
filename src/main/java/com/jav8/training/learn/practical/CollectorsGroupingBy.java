package com.jav8.training.learn.practical;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsGroupingBy {

	public static void main(String[] args) {
		List<String> lst=List.of("Jyoti","Jyoti","Java","Java","mayur");
		Map<String, Long>dta=lst.stream().collect(Collectors.groupingBy(li->li,Collectors.counting()));
		System.out.println(dta);
		
		Set<String>uniqueNames=lst.stream().collect(Collectors.toSet());
		System.out.println("unique Names "+uniqueNames);
		
		
		Long totalrName = lst.stream()
				  .collect(Collectors.counting());
		
		System.out.println("Total Names "+totalrName);
		
		DoubleSummaryStatistics summary = lst.stream()
				  .collect(Collectors.summarizingDouble(li->li.length()));
		
		System.out.println("Average "+summary.getAverage());
		System.out.println("Count "+summary.getCount());
		System.out.println("Max "+summary.getMax());
		System.out.println("Min "+summary.getMin());
		System.out.println("Sum "+summary.getSum());
		
		
		
		
		
		
		
		
		CollectorsGroupingBy cg=new CollectorsGroupingBy();
		
		List<Student> stu=List.of(cg.new Student(1, "Jyoti"),cg.new Student(2, "Mayuresh"),cg.new Student(3, "Advik"),cg.new Student(4, "Saksham"));
		
		Map<Integer,String>stuMap=stu.stream().collect(Collectors.toMap(l->l.getId(), l->l.getName()));
		System.out.println(stuMap);
		
		Long x=stu.stream().collect(Collectors.counting());
		System.out.println("Total Elements "+x);
		
		List<String> names=stu.stream().map(l->l.getName()).sorted().collect(Collectors.toList());
		System.out.println("Total Names "+names);
		
		Integer additionOfId=stu.stream().collect(Collectors.summingInt(li->li.getId()));
		System.out.println("Total of Id "+additionOfId);
		
		String result = names.stream()
				  .collect(Collectors.joining(""));
		System.out.println("Joining  "+result);
		
		List<Student> d=stu.stream().filter(s->s.getId()>0 && s.getId()<3).map(s->s).collect(Collectors.toList());
		System.out.println("Total Filter Elements "+d);
		
		List<String> filterNames=stu.stream().filter(s->s.getId()>0 && s.getId()<3).map(s->s.getName()).collect(Collectors.toList());
		System.out.println("Total Filter names "+filterNames);
	}

	
	class Student{
		private int id;
		private String name;
		public Student(int id, String name) {
			this.id = id;
			this.name = name;
		}
	
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}
		
		
	}
}
