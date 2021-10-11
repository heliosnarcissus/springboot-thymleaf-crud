package com.petsforhire.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petsforhire.main.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
