package videovom.xworkz.video.constants;

public enum ConnectionVideo {
	URL("jdbc:mysql://localhost:3306/bag"), USERNAME("root"), PASSWORD("Ajay@787898");

	private final String value;

	private ConnectionVideo(String value) {

		this.value = value;
	}

	public String getValue() {
		return value;
	}

}


