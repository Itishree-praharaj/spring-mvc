package com.jsp.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springmvc.entities.product;
@Repository
public class studentDao {
@Autowired
public  EntityManagerFactory entityManagerFactory;

public  void saveStudent(student student) {
	EntityManager entityManagaer = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManagaer.getTransaction();
	
	entityTransaction.begin();
	entityManagaer.persist(student);
	entityTransaction.commit();
}
public List<student> fetchAllstudents (){
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	Query query = entityManager.createQuery("select p from student p");
			return query.getResultList();
}
}
 