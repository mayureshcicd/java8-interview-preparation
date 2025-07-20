package com.jav8.training.logical.findAge;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FindAgeWithDtoAndEntityDemo {

	public static void main(String[] args) {
		
		EmplolyeeDTO emplolyeeDTO=new EmplolyeeDTO("Jyoti","Nagar","1984-10-03");

		generateEntity(emplolyeeDTO);
		emplolyeeDTO=new EmplolyeeDTO("Jyoti","Nagar","1984-03-10");
		generateEntity(emplolyeeDTO);
		emplolyeeDTO=new EmplolyeeDTO("Jyoti","Nagar", "1984/10/03");
		generateEntity(emplolyeeDTO);
		emplolyeeDTO=new EmplolyeeDTO("Jyoti","Nagar",  "03/10/1984" );
		generateEntity(emplolyeeDTO);
		emplolyeeDTO=new EmplolyeeDTO("Jyoti","Nagar",  "10/03/1984" );
		generateEntity(emplolyeeDTO);
	}

	private static void generateEntity(EmplolyeeDTO emplolyeeDTO) {
		EmplolyeeEnity emplolyeeEnity=new EmplolyeeEnity();

		emplolyeeEnity.setName(emplolyeeDTO.getName());
		emplolyeeEnity.setAddress(emplolyeeDTO.getAddress());
		emplolyeeEnity.setDob(emplolyeeDTO.getDob());
		emplolyeeEnity.setAge(getAge(emplolyeeDTO.getDob()));
		System.out.println(getAge(emplolyeeDTO.getDob()));
		System.out.println(emplolyeeEnity);
	}

	public static String getAge(String input) {
		String[] patterns = {"yyyy-MM-dd", "dd/MM/yyyy", "MM/dd/yyyy", "yyyy/MM/dd"};

		for (String pattern : patterns) {
			try {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
				LocalDate birthDate = LocalDate.parse(input, formatter);
				return String.valueOf(Period.between(birthDate, LocalDate.now()).getYears());
			} catch (Exception e) {
				// Ignore and try next format
			}
		}

		System.err.println("Invalid or unsupported date format: " + input);
		return "";
	}


}
