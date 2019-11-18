package com.concordia.app.dao;

import java.util.List;

import com.concordia.app.vo.transaction;

public interface IReservation {

	void add(transaction transaction);
	transaction findById(int reservationId);
	transaction findByStatus(String status);
	List<transaction> findReservation();
	//transaction update(transaction status);
	void delete(int reservationId);
}
