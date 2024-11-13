package com.xworkz.books.constants;

public enum BooksCoonection {

	URL("jdbc:mysql://localhost:3306/books"), USERNAME("root"), PASSWORD("Ajay@787898");

	private final String value;

	private BooksCoonection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
