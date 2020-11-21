package com.example.bookstore.repository.sp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.bookstore.entity.Store;
@Repository
public class StoreSP {
	@Autowired
	private EntityManager entityManager;
	public List<Store> getAllStore() {
	StoredProcedureQuery query = entityManager
		    .createStoredProcedureQuery("TEST_SP")
		    .registerStoredProcedureParameter(1, Store.class, 
		         ParameterMode.REF_CURSOR);
		 
		query.execute();
		 
		return query.getResultList();
	}
}
