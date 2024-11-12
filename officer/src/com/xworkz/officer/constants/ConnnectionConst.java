package com.xworkz.officer.constants;

public enum ConnnectionConst {
	URL("jdbc:mysql://localhost:3306/officer"), USERNAME("root"), PASSWORD("Ajay@787898");

	private final String value;

	private ConnnectionConst(String value) {
		this.value = value;

	}

	public String getValue() {
		return value;
	}

}
