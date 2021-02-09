package com.jinglun.JPA.Demo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseDAOService {
	@PersistenceContext
	EntityManager entityManager;
	
	public long insert(Course course) {
		entityManager.persist(course);
		return course.getId();
	}

}






