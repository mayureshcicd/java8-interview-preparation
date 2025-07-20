package com.jav8.training.learn.stream.ftmap;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.jav8.training.learn.stream.module.Candidate;

public class CandidateDemo {

	public static void main(String[] args) {

		printListWithFullName();
		printOnlyFullName();
	}

	static List<Candidate> getCandidates() {
		return List.of(new Candidate(1, "mayuresh", "ratnaparkhi"), new Candidate(2, "ashutosh", "ratnaparkhi"));
	}

	static void printListWithFullName() {
		getCandidates().stream().flatMap(i -> {

			i.setFullName(getname.apply(i.getFname() , i.getLname()));
			return Stream.of(i);
		}).collect(Collectors.toList()).forEach(i -> {

			System.out.println(i.getId() + " " + i.getFname() + " " + i.getLname() + " " + i.getFullName());
		});
		System.out.println("----------------------------------------------------------------------------------------\n\n");
	}
	
	static void printOnlyFullName() {
		getCandidates().stream().flatMap(i -> {

			i.setFullName(getname.apply(i.getFname() , i.getLname()));
			return Stream.of(i.getFullName());
		}).collect(Collectors.toList()).forEach(i -> {

			System.out.println(i);
		});
	}
	static BiFunction<String, String, String> getname=(fname,lname)->{
		
		return fname.substring(0, 1).toUpperCase()
		.concat(fname.substring(1, fname.length())).concat(" ").concat(lname
				.substring(0, 1).toUpperCase().concat(lname.substring(1, lname.length())));
		 
	};
	
}
