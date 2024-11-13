package com.xwokz.flower.constants;

public enum FlowerConnection {
	URL("jdbc:mysql://localhost:3306/flower"), USERNAME("root"), PASSWORD("Ajay@787898");

	private final String value;

	private FlowerConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
