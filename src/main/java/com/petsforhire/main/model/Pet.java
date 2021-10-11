package com.petsforhire.main.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pets")
public class Pet {
	
	public Pet(){}
	public Pet(Long petID, String petname, String petclass, BigDecimal petprice) {
		super();
		this.petID = petID;
		this.petname = petname;
		this.petclass = petclass;
		this.petprice = petprice;
	}
	
	/*dont use snake case, use small caps. else hibernate will use snake_case.
	 * 
	 * */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "petID")
	private Long petID;

	//@Column(name = "petName")
	private String petname;
	//@Column(name = "petClass")
	private String petclass;
	//@Column(name = "petPrice")
	private BigDecimal petprice;
	
	public Long getPetID() {
		return petID;
	}

	public void setPetID(Long petID) {
		this.petID = petID;
	}

	public String getPetname() {
		return petname;
	}

	public void setPetname(String petname) {
		this.petname = petname;
	}

	public String getPetclass() {
		return petclass;
	}

	public void setPetclass(String petclass) {
		this.petclass = petclass;
	}

	public BigDecimal getPetprice() {
		return petprice;
	}

	public void setPetprice(BigDecimal petprice) {
		this.petprice = petprice;
	}
	
	@Override
	public String toString() {
		return "Pet [petID=" + petID + ", petname=" + petname + ", petclass=" + petclass + ", petprice=" + petprice
				+ "]";
	}
}
