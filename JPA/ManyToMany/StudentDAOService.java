package com.jinglun.JPA.Demo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Transactional
public class StudentDAOService {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public long insert(Student student) {
		entityManager.persist(student);
		return student.getId();
	}

}
