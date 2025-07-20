package com.jav8.training.learn.mapperInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayListToMap {

	public static Function<User, Boolean> emailValidator = (user) -> {
		return user.getEmail() != null && user.getEmail().contains("@");
	};

	public static BiFunction<User, User, User> upperCaseUser = (user1, user2) -> {
		String name = user1.getName().toUpperCase();
		user1.setName(name);
		return user1;
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lst = new ArrayList<>();
		lst.add("sekhar");
		lst.add("sekhar");
		lst.add("sekhar");
		lst.add("battula");
		lst.add("battula");
		lst.add("java");
		lst.add("java");
		lst.add("java");
		Map<String, Long> stringCount = lst.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(stringCount);

		Map<String, Long> count = lst.stream().collect(Collectors.groupingBy(li -> li, Collectors.counting()));
		System.out.println(count);

		Map<String, Long> map = lst.stream()
				.collect(Collectors.groupingBy(li -> li, HashMap::new, Collectors.counting()));
		System.out.println(map);

		Map<String, Long> lMap = lst.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(lMap);
/*
		System.out.println(count);

		User user1 = new User();
		user1.setEmail("ek@gmail.com");
		user1.setId("id1");
		user1.setName("sekhar");

		User user2 = new User();
		user2.setEmail("ek@gmail.com");
		user2.setId("id2");
		user2.setName("sekhar");

		Boolean validEmail = emailValidator.apply(user1);

		User resultUser = upperCaseUser.apply(user1, user1);
		System.out.println(resultUser.getName());
		*/
	}
}