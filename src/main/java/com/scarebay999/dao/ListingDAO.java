package com.scarebay999.dao;

import java.util.List;

import com.scarebay999.dao.GenericDAO;
import com.scarebay999.domain.Listing;





public interface ListingDAO extends GenericDAO<Listing, Integer> {
  
	List<Listing> findAll();
	






}


