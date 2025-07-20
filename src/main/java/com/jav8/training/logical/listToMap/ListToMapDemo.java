package com.jav8.training.logical.listToMap;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapDemo {

	public static void main(String[] args) {
		List<User> lst = List.of(new User(1, "ONE"), new User(2, "ABC"), new User(3, "CDE"), new User(4, "PQR"));

		Map<Integer, String> mlst = lst.stream().collect(Collectors.toMap(v -> v.getId(), v -> v.getName()));
		System.out.println(mlst);

		List<String> nms = List.of("java", "java", "core", "Spring", "Spring", "Spring", "shrawan", "shrawan",
				"shrawan", "shrawan");

		Map<String, Long> glst = nms.stream().collect(Collectors.groupingBy(li -> li, Collectors.counting()));
				//.entrySet().stream()
				//.sorted(Map.Entry.<String, Long>comparingByKey())
				 //.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				//.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
				//.collect(Collectors.toMap(e -> e.getKey(),e -> e.getValue()));
				//.collect(Collectors.toMap(e -> e.getKey(),e -> e.getValue(), (e1, e2) -> e1, LinkedHashMap::new));
 
		Map<String, Long> sorted = glst.entrySet().stream()
				  .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				  .collect(Collectors.toMap(e -> e.getKey(),e -> e.getValue(), (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(sorted);
		
		
		Map<String, Long> sortedByPrice = glst.entrySet().stream()
				  .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				  .collect(Collectors.toMap(e -> e.getKey(),e -> e.getValue()));

		System.out.println(sortedByPrice);
				 

	}
	

}
