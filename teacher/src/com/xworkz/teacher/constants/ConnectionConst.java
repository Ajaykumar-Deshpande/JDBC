package com.xworkz.teacher.constants;

public enum ConnectionConst {
	URL("jdbc:mysql://localhost:3306/teacher"), USERNAME("root"), PASSWORD("Ajay@787898");

	private final String value;

	private ConnectionConst(String value) {
		this.value = value;

	}

	public String getValue() {
		return value;
	}

}



