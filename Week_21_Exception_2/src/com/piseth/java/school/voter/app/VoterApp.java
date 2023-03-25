package com.piseth.java.school.voter.app;

import java.time.LocalDate;

import com.piseth.java.school.voter.Person;
import com.piseth.java.school.voter.service.VoterService;

public class VoterApp {

	public static void main(String[] args) {
		Person person = new Person(1L, "Van Dara", "M", LocalDate.of(2010, 1, 30), "N01187567");
		VoterService voterService = new VoterService();
		try {
			voterService.register(person);
			voterService.displayVoters();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Complete");
	}

}
