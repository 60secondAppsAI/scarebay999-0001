package com.scarebay999.dao;

import java.util.List;

import com.scarebay999.dao.GenericDAO;
import com.scarebay999.domain.Feedback;





public interface FeedbackDAO extends GenericDAO<Feedback, Integer> {
  
	List<Feedback> findAll();
	






}


