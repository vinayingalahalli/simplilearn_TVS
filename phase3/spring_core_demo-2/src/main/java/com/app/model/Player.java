package com.app.model;

import java.util.List;

public class Player {

	private int id;
	private String name;
	private Address permanentAddress;
	private List<Team> teamList;

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public List<Team> getTeamList() {
		return teamList;
	}

	public void setTeamList(List<Team> teamList) {
		this.teamList = teamList;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", permanentAddress=" + permanentAddress + ", teamList="
				+ teamList + "]";
	}

}
