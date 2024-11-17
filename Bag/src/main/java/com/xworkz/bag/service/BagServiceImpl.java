package com.xworkz.bag.service;

import com.xworkz.bag.dto.BagDto;

public class BagServiceImpl implements BagService {

	@Override
	public boolean validateAndSave(BagDto bagDto) {
		boolean valid = true;
		if (bagDto != null) {

			String name = bagDto.getName();
			if (name != null && name.length() > 3) {
				System.out.println("Valid name");
			} else {
				System.err.println("InValid name");
				valid = false;
			}

			String email = bagDto.getEmail();
			if (email != null && email.endsWith(".com") && email.contains("@")) {
				System.out.println("valid email");
			} else {
				System.out.println("Invalid email");
				valid = false;
			}

			int age = bagDto.getAge();
			if (age > 18) {
				System.out.println("valid age");
			} else {
				System.out.println("invalid age");
				valid = false;
			}

			long contact = bagDto.getContact();
			if (contact > 9) {
				System.out.println("valid contact number");
			} else {
				System.out.println("invalid contact number");
				valid = false;
			}
		}
		return false;
	}

}
