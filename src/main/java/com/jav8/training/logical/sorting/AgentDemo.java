package com.jav8.training.logical.sorting;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AgentDemo {

	public static void main(String[] args) {
		List<Agent> agentList=List.of(
				new Agent(6,"U6",7000.00),
				new Agent(1,"U1",1000.00),
				new Agent(2,"U2",2000.00),
				new Agent(3,"U3",3000.00),
				new Agent(4,"U4",4000.00),
				new Agent(7,"U7",8000.00),
				new Agent(5,"U5",5000.00)
				);

		
		 agentList.stream()
				  .sorted(Comparator.comparing(Agent::getSal).reversed())
				 .limit(3)
				  .collect(Collectors.toList()).forEach(e->{
			System.out.println(e.toString());
			
		});
		System.out.println("---------------------------------------------\t");
			
		 agentList.stream().filter(e->e.getSal()>2000.00)
				  .sorted(Comparator.comparing(Agent::getSal).reversed())
			 
				  .collect(Collectors.toList()).forEach(e->{
			System.out.println(e.toString());
			
		});
		 agentList.stream()
		 .filter(e->e.getSal()>10000)
		 .map(e->e.getName())
		 .collect(Collectors.toList());
		 
		 
	}

}
