package com.xworkz.xworkz.temples.Dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class TemplesDto {
	private int id;
	private String name;
	private String email;
	private String password;
	private String address;
	private String location;
	
	private String income;
	private String parking;
	private String  phoneNo;
	

}
