package com.scarebay999.dao;

import java.util.List;

import com.scarebay999.dao.GenericDAO;
import com.scarebay999.domain.Bid;





public interface BidDAO extends GenericDAO<Bid, Integer> {
  
	List<Bid> findAll();
	






}


