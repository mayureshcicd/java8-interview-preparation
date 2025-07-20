package com.jav8.training.learn.stream.ftmap;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.jav8.training.learn.stream.module.Staff;

public class StaffFlatMapFilterDemo {

	public static void main(String[] args) {
		showFilterWithAndData();
		showFilterWithOrData();

		Set<String> lst=new HashSet<String>();
		
		getOnlyEmailsUsingMapWithStream().forEach(e->{
			e.distinct().forEach(s->{
				
				lst.add(s);
				
				});			
		});
		lst.forEach(s->{
			
			System.out.println(s);
		});			
		
		System.out.println("-------------------------------------------------------------\n\n");
		
		getOnlyEmailsUsingMapWithStream().forEach(e->{
			e.distinct().forEach(s->{
				
				System.out.println(s);
			});			
		});
		
		System.out.println("-------------------------------------------------------------\n\n");
		
		getOnlyEmailsUsingMapWithouStream().forEach(e->{
			e.forEach(s->{
				
				System.out.println(s);
			});			
		});
		System.out.println("-------------------------------------------------------------\n\n");
		getOnlyEmailsUsingMapAndFlatMap().forEach(e->{
			System.out.println(e);			
		});
		System.out.println("-------------------------------------------------------------\n\n");
		getOnlyEmailsUsingFlatMap().forEach(e->{
			System.out.println(e);			
		});
		
		
		

	}
	private static List<Staff> getStaffs()
	{
		return List.of(new Staff(1,"Ram",List.of("ram@ram.com","dev@ram.com","ayodhya@ram.com")),
				new Staff(2,"Laxman",List.of("laxman@ram.com","ram@ram.com","dev@ram.com","ayodhya@ram.com")),
				new Staff(3,"Bharat",List.of( "dev@ram.com","ayodhya@ram.com")),
				new Staff(4,"Shatrughan",List.of( "dev@ram.com","ayodhya@ram.com")),
				new Staff(5,"Dashrath",List.of("ram@ram.com","dev@ram.com","ayodhya@ram.com")),
				new Staff(6,"Parshuram",List.of("ram@ram.com","dev@ram.com","ayodhya@ram.com")),
				new Staff(7,"Hanuman",List.of("hanuman@ram.com","ram@ram.com","dev@ram.com","ayodhya@ram.com")),
				new Staff(8,"Seeta",List.of("seeta@ram.com","ram@ram.com","dev@ram.com","ayodhya@ram.com"))
				
				);
	}
	static void showFilterWithAndData()
	{
		getStaffs().stream().filter(s->s.getName().toLowerCase().contains("ram")==true &&  s.getEmails().stream().anyMatch(m->m.startsWith("dev")))
		.collect(Collectors.toList()).forEach(e->{
			System.out.println(e.getId()+" "+e.getName()+" "+e.getEmails());
			
		});
		System.out.println("-------------------------------------------------------------\n\n");
	}
	static void showFilterWithOrData()
	{
		getStaffs().stream().filter(s->s.getName().toLowerCase().contains("ram")==true  
				|| s.getEmails().stream().anyMatch(m->m.startsWith("hanuman"))
				|| s.getEmails().stream().anyMatch(m->m.startsWith("seeta"))		
						)
		.collect(Collectors.toList()).forEach(e->{
			System.out.println(e.getId()+" "+e.getName()+" "+e.getEmails());
			
		});
		System.out.println("-------------------------------------------------------------\n\n");
	}
	

	static List<Stream<String>> getOnlyEmailsUsingMapWithStream()
	{
		return getStaffs().stream().map(e->e.getEmails().stream()).distinct()
				.collect(Collectors.toList());
	}
	static List<List<String>> getOnlyEmailsUsingMapWithouStream()
	{
		return getStaffs().stream().map(e->e.getEmails()).distinct()
				.collect(Collectors.toList());
	}
	
	// how to use map with flatMap 
	static List<String> getOnlyEmailsUsingMapAndFlatMap()
	{
		return getStaffs().stream().map(e->e.getEmails().stream())
				
				.flatMap(e->e)
				.distinct()
				.collect(Collectors.toList());
	}
	
	// how to use flatMap  and stream  
	static List<String> getOnlyEmailsUsingFlatMap()
	{
		return getStaffs().stream().flatMap(e->e.getEmails().stream())				 
				.distinct()
				.collect(Collectors.toList());
	}
}
