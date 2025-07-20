package com.jav8.training.learn.competitorUse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompetitorDemo {

	public static void main(String[] args) {
		List<List<Competitor>> anotherListOfListCompetitor = new ArrayList<>();
		anotherListOfListCompetitor.add(new ArrayList<>(
		    Arrays.asList(new Competitor(1, "Cat 00", 93),new Competitor(1, "Cat 00", 193), new Competitor(2, "Dog 18", 40), new Competitor(3, "Pig 90", 90)))); //93 + 40 + 90 = 223

		anotherListOfListCompetitor.add(new ArrayList<>(
		    Arrays.asList(new Competitor(1, "Cat 23", 20), new Competitor(2, "Dog 30", 68), new Competitor(3, "Pig 78", 32)))); //20 + 68 + 32 = 120

		anotherListOfListCompetitor.add(new ArrayList<>(
		    Arrays.asList(new Competitor(1, "Cat 10", 11), new Competitor(4, "Cow 99", 90)))); //11 + 90 = 101


		List<Competitor> minListCompetitor = anotherListOfListCompetitor.stream()
		        .min(Comparator.comparingInt(l -> l.stream().mapToInt(Competitor::getPower).sum()))
		        .orElse(Collections.emptyList());
		
		System.out.println(minListCompetitor);

		List<Competitor> maxListCompetitor = anotherListOfListCompetitor.stream()
		        .max(Comparator.comparingInt(l -> l.stream().mapToInt(Competitor::getPower).sum()))
		        .orElse(Collections.emptyList());
		
		System.out.println(maxListCompetitor);
	}

}
