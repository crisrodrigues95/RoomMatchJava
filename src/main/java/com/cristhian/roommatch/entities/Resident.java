package com.cristhian.roommatch.entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import com.cristhian.roommatch.enuns.Sex;
import com.cristhian.roommatch.enuns.YesNo;


public class Resident extends Roommate {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	
	
	private static final long serialVersionUID = 1L;
	
	private Long idResident;
	/*private Room room;*/
	
	public Resident() {
		
	}
	
	
	public Resident(Long idResident, String name, String cpf, String email, String password, String telephone, Sex sex, String whreeWork,
			String whereStudies, LocalDate birthDate, Integer petQuantity, YesNo haveCar, YesNo havePet,
			YesNo isVegan, YesNo isVegetarian, YesNo cooks, YesNo smokes) {
		super(name, cpf, email, password, telephone, sex, whreeWork, whereStudies, birthDate, petQuantity, haveCar,
				havePet, isVegan, isVegetarian, cooks, smokes);
		this.idResident = idResident;
	}


	public Long getIdResident() {
		return idResident;
	}


	public void setIdResident(Long idResident) {
		this.idResident = idResident;
	}


	@Override
	public String toString() {
		return "Resident [idResident=" + idResident +  ", getName()="
				+ getName() + ", getCpf()=" + getCpf() + ", getEmail()=" + getEmail() + ", getPassword()="
				+ getPassword() + ", getTelephone()=" + getTelephone() + ", getSex()=" + getSex() + ", getWhreeWork()="
				+ getWhreeWork() + ", getWhereStudies()=" + getWhereStudies() + ", getBirthDate()=" + getBirthDate() + ", yearsOld=" + yearsOld()+", getPetQuantity()=" + getPetQuantity() 
				+ ", getHaveCar()=" + getHaveCar() + ", getHavePet()=" + getHavePet() + ", getisVegan()=" + getisVegan()
				+ ", getIsVegetarian()=" + getIsVegetarian() + ", getCooks()=" + getCooks() + ", getSmokes()="
				+ getSmokes();
	}
	
	
	
	
	
	
	

}
