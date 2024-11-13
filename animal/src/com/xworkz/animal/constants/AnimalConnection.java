package com.xworkz.animal.constants;

public enum AnimalConnection {
	URL("jdbc:mysql://localhost:3306/animal"), USERNAME("root"), PASSWORD("Ajay@787898");

	private final String value;

	private AnimalConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
