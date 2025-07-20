package com.jav8.training.learn.collectionFlatMap;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserCollectionMapDemo {

	public static void main(String[] args) {
		
		List<User> users=Stream.of(
				new User(1,"Abc","HR",1000,List.of("100","200")),
				new User(2,"def","HR",4000,List.of("300","400")),
				new User(3,"ghi","ADMIN",10000,List.of("500","600")),
				new User(4,"jkl","ADMIN",5000,List.of("700","800")),
				new User(5,"mno","TL",15000,List.of("900","1000"))
				).collect(Collectors.toList());
		
		Map<Integer,String> lms=users.stream().collect(Collectors.toMap(k->k.getId(), v->v.getName()));
		Map<Integer,List<String>> lmss=users.parallelStream().collect(Collectors.toMap(k->k.getId(), v->v.getPhone()));
		List<String> names=users.parallelStream().map(v->v.getName()).collect(Collectors.toList());
		System.out.println(lms);
		System.out.println(lmss);
		System.out.println(names);
		
		List<List<String>> phones=users.parallelStream().map(v->v.getPhone()).collect(Collectors.toList());
		System.out.println(phones);
		List<String> phoneList=users.parallelStream().flatMap(v->v.getPhone().stream()).collect(Collectors.toList());
		System.out.println(phoneList);
		
		Map<String, List<User>>dta=users.stream().collect(Collectors.groupingBy(li->li.getDept()));
		System.out.println(dta);

		Comparator<User> u=Comparator.comparing(User::getSalary);
		Comparator<User> u1=Comparator.comparing(e->e.getSalary());
		
		var e=users.stream().collect(Collectors.groupingBy(li->li.getDept(),Collectors.reducing(BinaryOperator.maxBy(u1))));
		System.out.println(e);
		
		var ew=users.stream().collect(Collectors.groupingBy(li->li.getDept(),Collectors.maxBy(Comparator.comparing(ep->ep.getSalary()))));
		System.out.println(ew);
	}

}
