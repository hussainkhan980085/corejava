package com.konic.java.offline.project1;

public class BasePerson {

	protected int id;
	protected String name;

	protected BasePerson(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
