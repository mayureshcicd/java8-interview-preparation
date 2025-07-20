package com.jav8.training.learn.streamException;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamExceptionDemo {

	public static void main(String[] args) {
		List<String> lst = List.of("1", "2", "abc");
		lst.forEach(consume(s -> System.out.println(s)));
		
		lst.stream().filter(filter(s->s.startsWith("a"))).forEach(consume(s -> System.out.println(s)));
		
		lst.forEach(handleEx(s -> System.out.println(Integer.parseInt(s)), NumberFormatException.class));
		List<Integer> lst1=List.of(1,0);
		lst1.forEach(handleEx(s -> System.out.println(10/s), NumberFormatException.class));
		lst1.forEach(handleEx(s -> System.out.println(10/s), ArithmeticException.class));
		
		lst1.forEach(checkEx(s -> {
			
			Thread.sleep(s);
			System.out.println(10/s);}));
	}

	static <Target> Consumer<Target> consume(Consumer<Target> target)
	{
		return obj->{			
			target.accept(obj);
		};
		
	}
	static <Target> Predicate<Target> filter(Predicate<Target> target)
	{
		return obj->{			
			return target.test(obj);
		};
		
	}
	static <Target, ExObj extends Exception> Consumer<Target> handleEx(Consumer<Target> target,
			Class<ExObj> exObjClass) {
		return obj -> {

			try {
				target.accept(obj);
			} catch (Exception e) {
				try {
					ExObj exObj = exObjClass.cast(e);
					System.out.println("Exception : " + exObj.getMessage());
				} catch (Exception e2) {
					throw e2;
				}

			}
		};
	}
	
	static <Target> Consumer<Target> checkEx(CheckException<Target, Exception> handlerConsumer)
	{
		return obj -> {

			try {
				handlerConsumer.accept(obj);
			} catch (Exception ex) {
				System.out.println("Exception : " + ex.getMessage());
				throw new 	RuntimeException(ex);

			}
		};
	}
}
