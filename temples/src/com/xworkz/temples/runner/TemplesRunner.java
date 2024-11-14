
package com.xworkz.temples.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.temples.constants.ConnectionConst;
import com.xworkz.xworkz.temples.Dto.TemplesDto;

public class TemplesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TemplesDto templeDto1=new TemplesDto(1, "Kashi Vishwanath Temple", "contact@kashivishwanath.org", "password456", "Kashi Vishwanath Mandir, Varanasi", "Varanasi, Uttar Pradesh", "8000000", "Available", "0542-2392035");
		TemplesDto templeDto2=new TemplesDto(2, "Somnath Temple", "contact@somnath.org", "password789", "Prabhas Patan, Saurashtra", "Somnath, Gujarat", "2000000", "Available", "02876-220234");
    	TemplesDto templeDto3=new TemplesDto(3, "Golden Temple", "info@goldentemple.org", "passwordabc", "Harmandir Sahib, Amritsar", "Amritsar, Punjab", "1500000", "Available", "0183-2554777");
    	TemplesDto templeDto4=new TemplesDto(4, "Meenakshi Temple", "info@meenakshi.org", "passwordxyz", "South Chidambaram Street, Madurai", "Madurai, Tamil Nadu", "4000000", "Available", "0452-2354999");
    	TemplesDto templeDto5=new TemplesDto(5, "Jagannath Temple", "contact@jagannathpuri.org", "passwordpass", "Puri, Odisha", "Puri, Odisha", "3500000", "Available", "06752-222169");
    	TemplesDto templeDto6=new TemplesDto(6, "Badrinath Temple", "info@badrinath.org", "pass12345", "Badrinath, Chamoli District", "Badrinath, Uttarakhand", "1000000", "Limited", "01382-250129");
    	TemplesDto templeDto7=new TemplesDto(7, "Ramanathaswamy Temple", "contact@ramanathaswamy.org", "mypassword", "Ramanathapuram, Tamil Nadu", "Ramanathapuram, Tamil Nadu", "1800000", "Available", "04567-230565");
		TemplesDto templeDto8=new TemplesDto(8, "Dwarkadhish Temple", "info@dwarkadhish.org", "securepassword", "Dwarka, Gujarat", "Dwarka, Gujarat", "3000000", "Available", "02892-226357");
		TemplesDto templeDto9=new TemplesDto(9, "Sree Padmanabhaswamy Temple", "contact@padmanabhaswamy.org", "mypassword123", "East Fort, Thiruvananthapuram", "Thiruvananthapuram, Kerala", "5000000", "Available", "0471-2463194");
		
		Connection connection=null;
		PreparedStatement pst=null;
		
try {
			
			connection=DriverManager.getConnection(ConnectionConst.URL.getValue(), ConnectionConst.USERNAME.getValue(), ConnectionConst.PASSWORD.getValue());
			pst=connection.prepareStatement("insert into product_table values(?,?,?,?,?,?,?,?,?,?)");
			for(TemplesDto dto:dtos)
			{
				pst.setInt(1,dto.getId() );
				pst.setString(2, dto.getName());
				pst.setString(3, dto.getEmail());
				pst.setString(4, dto.getPassword());
				pst.setLong(5,dto.getaddress());
				pst.setString(6, dto.getlocation());
				pst.setString(7, dto.getincome());
				pst.setInt(8, dto.getparking());
				pst.setString(9, dto.getphoneNo());
				
				pst.addBatch();
			}
			int[] count=pst.executeBatch();
			for(int c:count)
			{
				if(c>0)
				{
					System.out.println("saved");
				}
				else
				{
					System.out.println("not saved");
				}
			}
			
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}