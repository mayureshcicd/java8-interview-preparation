package com.jav8.training.interview.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LogicalCoreJavaInterview {

	public static void main(String[] args) {

		showPalindromeOne();
		findDuplicateCharacterAndCoundFromString("shreeswamisamartha");
		
		FindFirstNonRepeatingCharacterInAString("SWISS");

		showPalindrom();

		Fibonacci(15);

		FindMaxNumberFromString("12,34,56,90.50,0,88,100,1,3,5,4");

		RemovingDuplicateCharacterFromString("MasterM");
		
		findDuplicateCharacterFromString("MasterM");
		
		CollectorsGroupingBy();

		CollectorsGroupingBy(List.of("java", "java", "spring", "spring", "spring", "developer"));

		MergeTwoArrayAndSortsWithIntArray();

		MergeTwoArrayAndSortsWithList();
 
		showAnagrams();
 
		generateArmstrongNumbers(5);

		isArmStrongNumber(153);

		showPerfectNumber();

		showPrime();

		showFactorial(1);
		
		reverseNumberOrderArray(4,5,1, 2, 3);
		 
		reverseNumberOrder(1234);
		
		showSwapValues();
		
		showBubbleSort();
		
		selectionSort(4,5,1, 2, 3);
		
		insertionSort(4,5,1, 2, 3);
		
		FindMinorMaxNumber();
		
		FindMinorMaxCharOrString();
		
		FindMinorMaxObjectByFieldValue();
	}
	static void FindMinorMaxObjectByFieldValue()
	{
		List<Employee> employees = List.of(new Employee(1,"A"),
				new Employee(2,"B"),
				new Employee(3,"C"),
				new Employee(4,"D"));

		 
		Comparator<Employee> comparator = Comparator.comparing( Employee::getId );
		 
		Employee minObject = employees.stream().min(comparator).get();
		Employee maxObject = employees.stream().max(comparator).get();
		System.out.println("Min  Object "+minObject);
		System.out.println("Max  Object "+maxObject);
	}
	static void FindMinorMaxNumber()
	{
		Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
		          .max(Comparator.comparing(Integer::valueOf))
		          .get();
		System.out.println("Max  Number "+maxNumber);
		Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
		          .min(Comparator.comparing(Integer::valueOf))
		          .get();
		System.out.println("Min  Number "+minNumber);
	}
	static void FindMinorMaxCharOrString()
	{
		String maxChar = Stream.of("H", "T", "D", "I", "J")
		            .max(Comparator.comparing(String::valueOf))
		            .get();
		System.out.println("Max Char "+maxChar); 
		String minChar = Stream.of("H", "T", "D", "I", "J")
		            .min(Comparator.comparing(String::valueOf))
		            .get();
		System.out.println("Min Char "+minChar);
	}
	static void selectionSort(int... i)
	{
		Arrays.sort(i);	 
		System.out.println("Ascending : = "+IntStream.of(i).boxed().collect(Collectors.toList()));
		System.out.println("Descending : = "+IntStream.of(i).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
		
	}
	static void insertionSort(int... array) {
		System.out.println("Ascending : = "+IntStream.of(array).boxed().collect(Collectors.toList()));
	    for (int j = 1; j < array.length; j++) {
	        int current = array[j];
	        int i = j-1;
	        while ((i > -1) && (array[i] > current)) {
	            array[i+1] = array[i];
	            i--;
	        }
	        array[i+1] = current;
	    }
	    System.out.println("Descending : = "+IntStream.of(array).boxed().collect(Collectors.toList()));
	}
	static void showSwapValues()
	{
		swapValuesUsingXOROperator(1,2);
		swapValuesUsingXOROperator(-1,2);
		swapValuesUsingXOROperator(1,-2);
		swapValuesUsingXOROperator(-1,-2);
		
	}
	static void showBubbleSort()
	{
		bubbleSorted(5, 4, 3, 7, 6, 9, 11, 10, 21);
		bubbleSort(5, 4, 3, 7, 6, 9, 11, 10, 21);
	}
	static void bubbleSort(int... array) 
	{
		
	    BiConsumer<int[], Integer> swapValueIf = (a, j) -> {
	        if (a[j] > a[j + 1]) {
	            int temp = a[j];
	            array[j] = a[j + 1];
	            array[j + 1] = temp;
	        }
	    };

	    IntStream.range(0, array.length - 1)
	            .forEach(i -> 
	            		
	            		IntStream.range(0, array.length - 1)
	            		.forEach(j -> swapValueIf.accept(array, j))
	                    
	            		);
	    
	    System.out.println("Ascending : = "+IntStream.of(array).boxed().collect(Collectors.toList()));
	    System.out.println("Descending : = "+IntStream.of(array).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
	}

	static void bubbleSorted(int... i)
	{
	
		List<Integer> copiedList = IntStream.of(i).boxed().collect(Collectors.toList());
		copiedList.add(Integer.MAX_VALUE);
		List<Integer> bubbleSorted = new ArrayList<>();

		copiedList.stream().reduce((c, e) -> {
		    if (c < e) {
		        bubbleSorted.add(c);
		        return e;
		    } else {
		        bubbleSorted.add(e);
		        return c;
		    }
		});

		  System.out.println("Ascending : = "+bubbleSorted.stream().sorted().collect(Collectors.toList()));
		  System.out.println("Descending : = "+bubbleSorted.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
	}
	static void swapValuesUsingXOROperator(int m, int n)
	{
		// Logic of XOR operator
		System.out.println("Before Swap Value of m is "+m+" and Value of n is "+n);
		m = m ^ n;
		n = m ^ n;
		m = m ^ n;
		System.out.println("After Swap Value of m is "+m+" and Value of n is "+n);
	}
	static void reverseNumberOrder(int value) {
		 
		System.out.println(IntStream.of(value).map(number -> {
			int reverse = 0;
			while (number != 0) {
				int remainder = number % 10;
				reverse = reverse * 10 + remainder;
				number = number / 10;
			}
			return reverse;
		}).findAny().getAsInt() );

	}

	static void reverseNumberOrderArray(int... i) {
		System.out.println(Arrays.stream(i).boxed().sorted().collect(Collectors.toList()));
		System.out.println(Arrays.stream(i).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
	}

	static void showPalindromeOne() {
		palindromeOne("abcca");
		palindromeOne("abccax");
	}

	static void showPalindrom() {
		palindrom("madan");
		palindrom("madam");
		Permutations("xyz");
	}

	static void showAnagrams() {
		System.out.println(checkAnagrams("BATAACCA", "TABBBCBB"));
		System.out.println(checkAnagrams("SILENT", "LISTEN"));
		System.out.println(checkAnagrams("SILENT", "LISNEN"));
		System.out.println(checkAnagrams("AA", "AA"));
		System.out.println(checkAnagramString("BATAACCA", "TABBBCBB"));
		System.out.println(checkAnagramString("SILENT", "LISTEN"));
		System.out.println(checkAnagramString("SILENT", "LISNEN"));
		System.out.println(checkAnagramString("AA", "AA"));
		
	}

	static void showPerfectNumber() {
		System.out.println(findPerfectNumber(5));
		System.out.println(findPerfectNumber(6));
	}

	static void showPrime() {
		System.out.println(isPrime(3));
		System.out.println(isPrime(51));
		System.out.println(isPrime(7));
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(153));
	}

	static void showFactorial(int number) {
		for (int i = 1; i < number; i++) {
			System.out.println(Factorial(1));
		}

	}

	static String Factorial(int number) {
		return IntStream.rangeClosed(2, number).reduce(1, (x, y) -> x * y) + " is Factorial ";
	}

	static String isPrime(int number) {

		return (number > 1 && IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0)) == true
				? "prime Number"
				: "Sorry Not prime Number";
	}

	static String findPerfectNumber(int n) {
		return IntStream.of(IntStream.range(1, n).filter(i -> n % i == 0).sum()).filter(value -> value == 6).findFirst()
				.isEmpty() ? "Sorry Not perfect Number" : "perfect Number";
	}

	static void palindromeOne(String input) {
		int n = input.length();
		int count = 0;
		for (int i = 0; i < n / 2; i++) {
			if (input.charAt(i) != input.charAt(n - i - 1)) {
				count++;
			}
		}
		if (count <= 1)
			System.out.println("Yes, It is palindrome One");
		else
			System.out.println("Sorry, It is not palindrome One");
	}

	static void FindFirstNonRepeatingCharacterInAString(String input) {
		String fn = "";
		for (char c : input.toCharArray()) {
			if (input.indexOf(c) == input.lastIndexOf(c)) {
				fn = String.valueOf(c);
				break;
			}
		}
		System.out.println("Found " + fn);
	}

	static void palindrom(String input) {
		if (input.toLowerCase().trim().equals(new StringBuilder().append(input).reverse().toString()))
			System.out.println("Palindrome ");
		else
			System.out.println("Sorry");
	}

	static void Permutations(String input) {
		List<String> ref = new ArrayList<String>();
		Permutations5("", input, ref);
		System.out.println(ref);
	}

	static void Permutations5(String cont, String input, List<String> ref) {
		if (input.isEmpty()) {
			ref.add(cont + input);
			return;
		}
		for (int i = 0; i < input.length(); i++) {
			Permutations5(cont + input.charAt(i), input.substring(0, i) + input.substring(i + 1), ref);
		}
	}

	static void Fibonacci(int input) {
		List<Integer> ref = new ArrayList<Integer>();
		for (int i = 0; i < input; i++) {
			ref.add(Fibonacci7(i));
		}

		System.out.println(ref);
	}

	static int Fibonacci7(int input) {
		if (input <= 1)
			return input;
		else
			return Fibonacci7(input - 1) + Fibonacci7(input - 2);

	}

	static void FindMaxNumberFromString(String input) {
		Double maxValue = Arrays.stream(input.split(",")).mapToDouble(v -> Double.parseDouble(v)).max().getAsDouble();
		System.out.println("Find Max Number From String " + maxValue);
		List<Double> accendingValue = Arrays.stream(input.split(",")).mapToDouble(v -> Double.parseDouble(v)).boxed()
				.sorted().collect(Collectors.toList());
		System.out.println("Find Soring Number From String in Ascending " + accendingValue);
		List<Double> descandingValue = Arrays.stream(input.split(",")).mapToDouble(v -> Double.parseDouble(v)).boxed()
				.sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Find Soring Number From String in Descending " + descandingValue);
	}

	static void RemovingDuplicateCharacterFromString(String input) {
		String noDuplicates = Arrays.asList(input.split("")).stream().distinct().collect(Collectors.joining());
		System.out.println("Removing Duplicate Character From String " + noDuplicates);
		
		

	}
	
	static void findDuplicateCharacterAndCoundFromString(String input) {
		Map<String, Long> duplicates=Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 
		System.out.println("Duplicate Character From String " + duplicates);
		
	}
	static void findDuplicateCharacterFromString(String input) {
		Map < Character, Long > duplicates = input
	            .chars().mapToObj(c -> (char) c)
	            .collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet().stream()
	            .filter(d->d.getValue()>1).collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
		System.out.println("Duplicate Character From String " + duplicates);
		
	}
	static void CollectorsGroupingBy(List<String> lst) {
		System.out.println("Grouping By with String " + lst.stream().collect(Collectors.groupingBy(li -> li, Collectors.counting())));
	}

	static void MergeTwoArrayAndSortsWithIntArray() {
		int[] array1 = { 11, 34, 66, 75 };
		int[] array2 = { 1, 5, 19, 50, 89, 100 };
		int[] mergeArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray();
		List<Integer> list = Arrays.stream(mergeArray).boxed().sorted().collect(Collectors.toList());

		System.out.println("\nThe sorted array is: ");
		for (int num : list) {
			System.out.print(num + " ");
		}
		int n1 = array1.length;
		int n2 = array2.length;
		int[] mereged = new int[n1 + n2];
		System.arraycopy(array1, 0, mereged, 0, n1);
		System.arraycopy(array2, 0, mereged, n1, n2);

		Arrays.sort(mereged);

		System.out.println("\nThe Ascending sorted array is: ");
		for (int num : mereged) {
			System.out.print(num + " ");
		}

		int[] arrDesc = Arrays.stream(mereged).boxed().sorted(Collections.reverseOrder()).mapToInt(i -> i).toArray();

		System.out.println("\nThe sorted descending array is: ");
		for (int num : arrDesc) {
			System.out.print(num + " ");
		}
	}

	static void MergeTwoArrayAndSortsWithList() {
		int[] array1 = { 11, 34, 66, 75 };
		int[] array2 = { 1, 5, 19, 50, 89, 100 };
		int[] mergeArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray();
		List<Integer> list = Arrays.stream(mergeArray).boxed().sorted().collect(Collectors.toList());

		System.out.println("\nThe Ascending sorted array  is: ");
		for (int num : list) {
			System.out.print(num + " ");
		}

		list = Arrays.stream(mergeArray).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());

		System.out.println("\nThe Descending sorted array is: ");
		for (int num : list) {
			System.out.print(num + " ");
		}

	}

	static void CollectorsGroupingBy() {
		LogicalCoreJavaInterview cg = new LogicalCoreJavaInterview();

		List<Student> stu = List.of(cg.new Student(1, "Ravi"), cg.new Student(2, "Mayuresh"),
				cg.new Student(3, "Shrawan"), cg.new Student(4, "Harshal"));

		Map<Integer, String> stuMap = stu.stream().collect(Collectors.toMap(l -> l.getId(), l -> l.getName()));
		System.out.println(stuMap);
	}

	class Student {
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

	private static void isArmStrongNumber(int number) {
		System.out.println(IntStream.of(number).filter((value) -> {
			int armStrongNumber = 0, rem = 0, n = value;
			while (n > 0) {
				rem = n % 10;
				armStrongNumber = (rem * rem * rem) + armStrongNumber;
				n = n / 10;
			}
			return value == armStrongNumber;
		}).findAny().isPresent() ? "number is armstrong " : "number is not armstrong");

	}

	private static void generateArmstrongNumbers(int series) {
		System.out
				.println(Stream.iterate(1, i -> ++i)
						.filter(i -> i == Stream.of(String.valueOf(i).split("")).map(Integer::valueOf)
								.map(n -> (n * n * n)).mapToInt(n -> n).sum())
						.limit(series).collect(Collectors.toList()));
		;
	}

	private static String checkAnagrams(String s1, String s2) {
		s1 = Stream.of(s1.trim().toLowerCase().split("")).sorted().collect(Collectors.joining());
		s2 = Stream.of(s2.trim().toLowerCase().split("")).sorted().collect(Collectors.joining());

		return checkResult(s1.equals(s2));
	}
	private static String checkAnagramString(String s1, String s2) {
		boolean check=false;
		if (s1.length()==s2.length())
		{
			check=true;
			for (char c:s1.toCharArray())
			{
				if (s1.chars().filter(ch -> ch == c).count()!=s2.chars().filter(ch -> ch == c).count())
				{
					check=false;
					break;
				}
			}
			return checkResult(check);
		}
		return checkResult(check);
	}
	private static String checkResult(boolean check) {
		return (check == true) ? "Yes It is Anagrams" : "Sorry It is not Anagrams";
	}
	/**
	 * https://www.youtube.com/watch?v=XYEYcz2oXtE
	 * 
	 * https://www.javatpoint.com/list-of-logical-programs-in-java
	 * https://mindmajix.com/program-logics-in-java
	 * https://www.programiz.com/java-programming/examples
	 * https://www.programiz.com/java-programming/operators
	 * https://www.programiz.com/java-programming/examples/pyramid-pattern
	 * https://javaconceptoftheday.com/java-interview-programs-with-solutions/
	 * https://www.w3resource.com/java-exercises/string/index.php
	 * https://www.javaguides.net/2020/04/java-oops-quiz-coding-programs.html
	 * 
	 * https://codegym.cc/groups/posts/java-syntax
	 * https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82
	 * https://beginnersbook.com/2017/09/java-examples/
	 */

}
