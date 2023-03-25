package com.piseth.java.school.voter.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

import com.piseth.java.school.voter.Person;
import com.piseth.java.school.voter.Voter;

public class VoterService {
	private Set<Voter> voters = new HashSet<>();
	private static int count = 0;
	
	public void register(Person person) {
		validate(person);
		Voter voter = new Voter();
		voter.setPerson(person);
		voter.setLocation("Phnom Penh");
		count++;
		voter.setCode("PP"+ count);
		voters.add(voter);
		FileService.save(voter.toString());
	}
	
	public void displayVoters() {
		for(Voter voter : voters) {
			System.out.println(voter);
		}
	}
	
	private void validate(Person person) {
		if(person == null) {
			throw new RuntimeException("Person cannot be null");
		}
		if(person.getIdCard() == null) {
			throw new RuntimeException("Don't have id card, cannot vote");
		}
		Period period = Period.between(person.getDateOfBirth(), LocalDate.now());
		if(period.getYears() < 18) {
			throw new RuntimeException("Not adult, cannot vote");
		}
	}
}
