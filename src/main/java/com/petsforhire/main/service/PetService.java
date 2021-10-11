package com.petsforhire.main.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petsforhire.main.model.Pet;
import com.petsforhire.main.repo.PetRepository;

@Service
public class PetService implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	PetRepository petRepository;
	
	public int save(Pet pet) {
		try {
			petRepository.save(pet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Pet> listAllPets() {
		return petRepository.findAll();
	}
	
	public Pet findById(Long petID) {
		return petRepository.findById(petID).get();
	}
	
	public int deletePetById(Long petID) {
		 petRepository.deleteById(petID);
		 return 0;
	}
	
}
