package com.ea.redsea.domain;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class BookHotel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private Date toDate;
	
	private Date fromDate;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private User user;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Hotel hotel;
}
