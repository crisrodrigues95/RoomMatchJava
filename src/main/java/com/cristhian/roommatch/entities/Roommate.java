package com.cristhian.roommatch.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

import com.cristhian.roommatch.enuns.Sex;
import com.cristhian.roommatch.enuns.YesNo;

public abstract class  Roommate implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String cpf;
	private String email;
	private String password;
	private String telephone;
	private Integer sex;
	private String whreeWork;
	private String whereStudies;
	private LocalDate birthDate;
	private Integer petQuantity;
	private Integer haveCar;
	private Integer havePet;
	private Integer isVegan;
	private Integer isVegetarian;
	private Integer cooks;
	private Integer smokes;

	public Roommate(String name, String cpf, String email, String password, String telephone, Sex sex, String whreeWork,
			String whereStudies, LocalDate birthDate, Integer petQuantity, YesNo haveCar, YesNo havePet,
			YesNo isVegan, YesNo isVegetarian, YesNo cooks, YesNo smokes) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.password = password;
		this.telephone = telephone;
		setSex(sex);
		this.whreeWork = whreeWork;
		this.whereStudies = whereStudies;
		this.birthDate = birthDate;
		this.petQuantity = petQuantity;
		setHaveCar(haveCar);
		setHavePet(havePet);
		setIsVegan(isVegan);
		setIsVegetarian(isVegetarian);
		setCooks(cooks);
		setSmokes(smokes);

	}

	public Integer getPetQuantity() {
		return petQuantity;
	}

	public void setPetQuantity(Integer petQuantity) {
		this.petQuantity = petQuantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Sex getSex() {
		return Sex.valueOf(sex);
	}

	public void setSex(Sex sex) {
		if (sex != null) {
			this.sex = sex.getCode();
		}
	}
	
	public String getWhreeWork() {
		return whreeWork;
	}

	public void setWhreeWork(String whreeWork) {
		this.whreeWork = whreeWork;
	}

	public String getWhereStudies() {
		return whereStudies;
	}

	public void setWhereStudies(String whereStudies) {
		this.whereStudies = whereStudies;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Roommate() {

	}

	public YesNo getHaveCar() {
		return YesNo.valueOf(haveCar);
	}

	public YesNo getHavePet() {
		return YesNo.valueOf(havePet);
	}

	public YesNo getisVegan() {
		return YesNo.valueOf(isVegan);
	}

	public YesNo getIsVegetarian() {
		return YesNo.valueOf(isVegetarian);
	}

	public YesNo getCooks() {
		return YesNo.valueOf(cooks);
	}

	public YesNo getSmokes() {
		return YesNo.valueOf(smokes);
	}

	public void setHaveCar(YesNo yesorNo) {
		if (yesorNo != null) {
			this.haveCar = yesorNo.getCode();
		}
	}

	public void setHavePet(YesNo yesorNo) {
		if (yesorNo != null) {
			this.havePet = yesorNo.getCode();
		}
	}

	public void setIsVegan(YesNo yesorNo) {
		if (yesorNo != null) {
			this.isVegan = yesorNo.getCode();
		}
	}

	public void setIsVegetarian(YesNo yesorNo) {
		if (yesorNo != null) {
			this.isVegetarian = yesorNo.getCode();
		}
	}

	public void setCooks(YesNo yesorNo) {
		if (yesorNo != null) {
			this.cooks = yesorNo.getCode();
		}
	}

	public void setSmokes(YesNo yesorNo) {
		if (yesorNo != null) {
			this.smokes = yesorNo.getCode();
		}
	}
	
	public Integer yearsOld( ) {
		LocalDate today = LocalDate.now();
		Period years = Period.between(getBirthDate(), today);
		return years.getYears();
	}

	@Override
	public String toString() {
		return "Roommate [name=" + name + ", cpf=" + cpf + ", email=" + email + ", password=" + password
				+ ", telephone=" + telephone + ", whreeWork=" + whreeWork + ", whereStudies=" + whereStudies
				+ ", birthDate=" + birthDate + ", yearsOld=" + yearsOld() + ", petQuantity=" + petQuantity + ", getHaveCar()=" + getHaveCar()
				+ ", getHavePet()=" + getHavePet() + ", getisVegan()=" + getisVegan() + ", getIsVegetarian()="
				+ getIsVegetarian() + ", getCooks()=" + getCooks() + ", getSmokes()=" + getSmokes() + "]";
	}

}
