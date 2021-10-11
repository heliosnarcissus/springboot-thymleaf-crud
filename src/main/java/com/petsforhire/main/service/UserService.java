package com.petsforhire.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petsforhire.main.model.Pet;
import com.petsforhire.main.model.User;
import com.petsforhire.main.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public void save(User user) {
		try {
			userRepository.save(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<User> listAllUsers(){
		return userRepository.findAll();
	}
	
	public User getUser(Long userId){
		return userRepository.findById(userId).get();
	}
	
	public int deleteUserById(Long userId) {
		userRepository.deleteById(userId);
		return 0;
	}

}
