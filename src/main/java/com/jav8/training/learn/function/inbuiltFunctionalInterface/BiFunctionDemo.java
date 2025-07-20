package com.jav8.training.learn.function.inbuiltFunctionalInterface;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionDemo {

	public static void main(String[] args) {

		List<String> ls1 = List.of("b", "c", "a");
		List<String> ls2 = List.of("d", "f", "e");
		
		
		System.out.println(distinctList.apply(ls1, ls2));
		System.out.println(distinctStream.andThen(sortList).apply(ls1, ls2));
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);
		map.put("Six", 6);
		map.put("Seven", 7);
		map.put("Eight", 8);
		map.put("Nine", 9);
		map.put("Ten", 10);
		System.out.println(map);
		map.replaceAll(increaseValue);
		System.out.println(map);
		map.forEach(readconsumer);
		
		Map<String, Integer> sortedByPrice = map.entrySet().stream()
				  .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				  .collect(Collectors.toMap(e -> e.getKey(),e -> e.getValue()));

		System.out.println(sortedByPrice);
		
		List<String> nms = List.of("java", "java", "core", "Spring", "Spring", "Spring", "shrawan", "shrawan",
				"shrawan", "shrawan");
		nms.forEach(readconsume);
		readconsume.accept("I am Consumer");
		Map<String, Long> glst = nms.stream().collect(Collectors.groupingBy(li -> li, Collectors.counting()));
		System.out.println(glst);
		System.out.println("Matching String "+check.test("One","One"));
		System.out.println("Matching String "+check.test("one","One"));
	}

	static BiFunction<String, Integer, Integer> increaseValue = (key, value) -> {

		return value+100;
	};
	static BiFunction<List<String>, List<String>, List<String>> distinctList = (l1, l2) -> {

		return Stream.of(l1, l2).flatMap(List::stream).sorted().distinct().collect(Collectors.toList());
	};
	
	static BiFunction<List<String>, List<String>, List<String>> distinctStream = (ls1, ls2) -> {

		return Stream.concat(ls1.stream(), ls2.stream()).distinct().collect(Collectors.toList());
	};
	static Function<List<String>,List<String>> sortList=(l1)->{
		
		return l1.stream().sorted().collect(Collectors.toList());
	};
	static BiConsumer<String, Integer> readconsumer=(key,value)->{System.out.println("Key "+key+" Value "+value);};
	static  Consumer<String> readconsume=(value)->{System.out.println(" Value "+value);};
	
	static BiPredicate<String, String> check=(s1,s2)->{
		
		return s1.equals(s2);
	};
}
