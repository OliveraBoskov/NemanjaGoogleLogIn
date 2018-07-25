package com.execom.pomodoro.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Pomodoro")
public class Pomodoro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany
	private List<Team> listOfTeams = new ArrayList<>();

	public Pomodoro(List<Team> listOfTeams) {
		super();
		this.listOfTeams = listOfTeams;
	}

	public Pomodoro() {
		super();
	}

	public List<Team> getListOfTeams() {
		return listOfTeams;
	}

	public void setListOfTeams(List<Team> listOfTeams) {
		this.listOfTeams = listOfTeams;
	}
	
	

}
