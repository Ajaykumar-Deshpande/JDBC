package com.xworkz.teacher.query;

public class TeacherInsert {
	String insertQuery = "INSERT INTO teacher_table VALUES"
			+ "(1, 'Dr. Rahul Sharma', 'rahul.sharma@example.com', '9876543210', 'Mumbai, Maharashtra', 'password123', 'Professor', '1980-05-15', 'Awarded Best Teacher 2020', 'Mathematics', 'Ph.D. in Mathematics', 'A1', '45'),"
			+ "(2, 'Ms. Priya Kumar', 'priya.kumar@example.com', '9888887777', 'Bangalore, Karnataka', 'password456', 'Assistant Professor', '1985-07-22', 'Excellence in Research', 'Physics', 'M.Sc. in Physics', 'B2', '35'),"
			+ "(3, 'Mr. Anil Verma', 'anil.verma@example.com', '9998887777', 'Delhi, Delhi', 'password789', 'Lecturer', '1990-02-10', 'Best Innovator Award', 'Chemistry', 'M.Sc. in Chemistry', 'C3', '40'),"
			+ "(4, 'Dr. Rina Patel', 'rina.patel@example.com', '9887776666', 'Ahmedabad, Gujarat', 'password987', 'Professor', '1982-11-20', 'Top Educator 2021', 'Biology', 'Ph.D. in Biology', 'D4', '30'),"
			+ "(5, 'Mr. Vikram Singh', 'vikram.singh@example.com', '9000123456', 'Lucknow, Uttar Pradesh', 'password654', 'Assistant Professor', '1988-04-18', 'Innovative Teaching Award', 'English', 'M.A. in English', 'E5', '50'),"
			+ "(6, 'Ms. Sunita Reddy', 'sunita.reddy@example.com', '9977554433', 'Hyderabad, Telangana', 'password321', 'Lecturer', '1995-09-01', 'Student Choice Award', 'History', 'M.A. in History', 'F6', '25'),"
			+ "(7, 'Mr. Sandeep Joshi', 'sandeep.joshi@example.com', '9887766555', 'Pune, Maharashtra', 'password222', 'Professor', '1978-12-05', 'Best Teacher in Science', 'Computer Science', 'M.Tech in Computer Science', 'G7', '60'),"
			+ "(8, 'Dr. Neelam Bhatia', 'neelam.bhatia@example.com', '9756443322', 'Chandigarh, Punjab', 'password333', 'Assistant Professor', '1983-08-12', 'Research Excellence Award', 'Literature', 'Ph.D. in Literature', 'H8', '40'),"
			+ "(9, 'Mr. Ajay Malhotra', 'ajay.malhotra@example.com', '9666332211', 'Delhi, Delhi', 'password444', 'Lecturer', '1991-06-14', 'Best Debater Award', 'Political Science', 'M.A. in Political Science', 'I9', '55'),"
			+ "(10, 'Ms. Aarti Joshi', 'aarti.joshi@example.com', '9988776655', 'Kolkata, West Bengal', 'password555', 'Professor', '1980-03-23', 'Top Educator Award', 'Sociology', 'Ph.D. in Sociology', 'J10', '48'),"
			+ "(11, 'Mr. Rajesh Kumar', 'rajesh.kumar@example.com', '9999888777', 'Chennai, Tamil Nadu', 'password666', 'Assistant Professor', '1986-01-25', 'Innovation in Teaching', 'Economics', 'M.A. in Economics', 'K11', '42'),"
			+ "(12, 'Dr. Priyanka Mehta', 'priyanka.mehta@example.com', '9777888899', 'Bhopal, Madhya Pradesh', 'password777', 'Professor', '1984-10-30', 'Best Teacher Award 2020', 'Psychology', 'Ph.D. in Psychology', 'L12', '45'),"
			+ "(13, 'Mr. Ravi Yadav', 'ravi.yadav@example.com', '9888998877', 'Jaipur, Rajasthan', 'password888', 'Lecturer', '1992-05-17', 'Excellence in Teaching', 'Geography', 'M.A. in Geography', 'M13', '38'),"
			+ "(14, 'Ms. Manju Sharma', 'manju.sharma@example.com', '9955332211', 'Noida, Uttar Pradesh', 'password999', 'Assistant Professor', '1987-11-10', 'Best Educator 2021', 'Economics', 'M.A. in Economics', 'N14', '50'),"
			+ "(15, 'Dr. Kavita Singh', 'kavita.singh@example.com', '9638527410', 'Mumbai, Maharashtra', 'password112', 'Professor', '1981-02-28', 'International Teaching Award', 'English Literature', 'Ph.D. in English Literature', 'O15', '45'),"
			+ "(16, 'Mr. Harish Rao', 'harish.rao@example.com', '9328776655', 'Hyderabad, Telangana', 'password223', 'Lecturer', '1993-12-01', 'Outstanding Teacher Award', 'Mathematics', 'M.Sc. in Mathematics', 'P16', '42'),"
			+ "(17, 'Ms. Kiran Verma', 'kiran.verma@example.com', '9455667788', 'Indore, Madhya Pradesh', 'password334', 'Assistant Professor', '1990-07-15', 'Best Educator in the State', 'Physics', 'M.Sc. in Physics', 'Q17', '38'),"
			+ "(18, 'Mr. Subodh Kumar', 'subodh.kumar@example.com', '9611122233', 'Patna, Bihar', 'password445', 'Professor', '1979-09-11', 'Excellence in Teaching Physics', 'Chemistry', 'M.Sc. in Chemistry', 'R18', '60'),"
			+ "(19, 'Ms. Seema Rao', 'seema.rao@example.com', '9500332211', 'Bhubaneswar, Odisha', 'password556', 'Lecturer', '1994-03-06', 'Best New Teacher', 'History', 'M.A. in History', 'S19', '32'),"
			+ "(20, 'Mr. Vinod Gupta', 'vinod.gupta@example.com', '9233445566', 'Lucknow, Uttar Pradesh', 'password667', 'Assistant Professor', '1989-06-25', 'Excellence in Mathematics Teaching', 'Mathematics', 'M.Sc. in Mathematics', 'T20', '45')";

	public String getInsertQuery() {
		return insertQuery;

	}
}
