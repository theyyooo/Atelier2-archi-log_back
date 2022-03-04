package com.asi.exo01.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String surName;
	private String pwd;
	private String name;
	private float balance;
	
	public User(String surName, String pwd, String nom, float solde) {
		super();
		this.surName = surName;
		this.pwd = pwd;
		this.name = nom;
		this.balance = solde;
	}
	
	public User() {
		
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSolde() {
		return balance;
	}

	public void setSolde(float solde) {
		this.balance = solde;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNom() {
		return name;
	}

	public void setNom(String nom) {
		this.name = nom;
	}
}
