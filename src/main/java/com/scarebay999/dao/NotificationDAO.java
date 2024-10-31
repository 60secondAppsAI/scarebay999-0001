package com.scarebay999.dao;

import java.util.List;

import com.scarebay999.dao.GenericDAO;
import com.scarebay999.domain.Notification;





public interface NotificationDAO extends GenericDAO<Notification, Integer> {
  
	List<Notification> findAll();
	






}


