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
public class Productdao {
	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	public void saveProduct(product product) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
	}
	public List<product> fetchAllProducts(){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select p from Product p");
		return query.getResultList();
	}	

}
