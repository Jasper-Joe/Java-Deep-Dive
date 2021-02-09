package com.jinglun.JPA.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestingCommandLine implements CommandLineRunner{
	
	@Autowired
	private StudentDAOService studentDAOService;
	
	@Autowired
	private CourseDAOService courseDAOService;

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student("Kevin","male");
		Course math = new Course("math");
		courseDAOService.insert(math);
		
		Course english = new Course("english");
		courseDAOService.insert(english);
		
		
		
		
		student.getLikedCourses().add(math);
		student.getLikedCourses().add(english);
		
		Student mike = new Student("Mike","male");
		mike.getLikedCourses().add(english);
		
		studentDAOService.insert(student);
		studentDAOService.insert(mike);
		
		
		
		
		
	}

}
