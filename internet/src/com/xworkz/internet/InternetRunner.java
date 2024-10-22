package com.xworkz.internet;

public class InternetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.xworkz.internet.Internet");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
