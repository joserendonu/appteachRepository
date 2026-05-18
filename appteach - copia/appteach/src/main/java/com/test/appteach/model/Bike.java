package com.test.appteach.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
		@Id
	 	private int id;

	    private String marca;
	    private int modelo;
}
