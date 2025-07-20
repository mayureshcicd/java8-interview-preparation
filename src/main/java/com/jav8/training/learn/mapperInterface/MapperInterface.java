package com.jav8.training.learn.mapperInterface;
import java.util.Base64;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.springframework.util.StringUtils;

public interface MapperInterface {

	BiFunction<User,Employee,Employee> getBiFunctionEmployeeMap=(user,employee)->{
		employee.setEmail(user.getEmail());
		employee.setId(user.getId());
		employee.setName(user.getName());
		employee.setComments(String.valueOf(new Date()).concat(" BiFunction comments added"));
		return employee;
	};
	
	BiFunction<String,String,String> getbase64Token=(userName,password)->{
		
		return Base64.getEncoder().encodeToString(userName.concat(":").concat(password).getBytes());		
	};
	 
	Function<User,Employee> getFunctionEmployeeMap=(user)->{
		
		Employee employee=new Employee();
		var ebar =((StringUtils.hasLength(user.getId()))==false ?"":user.getId()).concat(((StringUtils.hasLength(user.getEmail())) ==false? "" : user.getEmail()));
		System.out.println(":::::::::::::::::::::::: "+ebar);
		employee.setEmail(user.getEmail());
		employee.setId(ebar);
		employee.setName(user.getName());
		employee.setComments(String.valueOf(new Date()).concat(" Function comments added"));
		return employee;
	};
	
	static <T, U, R> List<R> listCombiner(
			  List<T> list1, List<U> list2, BiFunction<T, U, R> combiner) {
			    List<R> result = new ArrayList<>();
			    for (int i = 0; i < list1.size(); i++) {
			        result.add(combiner.apply(list1.get(i), list2.get(i)));
			    }
			    return result;
			}
}
