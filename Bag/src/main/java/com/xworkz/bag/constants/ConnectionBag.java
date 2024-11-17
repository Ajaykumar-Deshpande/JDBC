package com.xworkz.bag.constants;

public enum ConnectionBag {
	URL("jdbc:mysql://localhost:3306/bag"), USERNAME("root"), PASSWORD("Ajay@787898");

	private final String value;

	private ConnectionBag(String value) {

		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
