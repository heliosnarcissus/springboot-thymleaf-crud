package com.petsforhire.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petsforhire.main.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

}
