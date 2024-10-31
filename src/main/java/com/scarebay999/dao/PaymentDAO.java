package com.scarebay999.dao;

import java.util.List;

import com.scarebay999.dao.GenericDAO;
import com.scarebay999.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


