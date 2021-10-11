package com.petsforhire.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petsforhire.main.model.Pet;
import com.petsforhire.main.model.User;
import com.petsforhire.main.service.PetService;
import com.petsforhire.main.service.UserService;


@Controller
@RequestMapping("/api")
public class PageController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	PetService petService;

	@GetMapping("/home")
	public String viewHomePage(Model model) {
//		List<Product> listProducts = service.listAll();
//		model.addAttribute("listProducts", listProducts);
		return "index";
	}
	
	//@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/newshit")
	public String addNewShit(Model model) {
//		List<Product> listProducts = service.listAll();
//		model.addAttribute("listProducts", listProducts);
		return "newshit";
	}
	
	@GetMapping("/register")
	public String goToSignUp(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		
		return "register";
	}
	
	@PostMapping("/save")
	public String saveUser(@ModelAttribute("user") User user) {
		
		String password = user.getPassword();
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		user.setPassword(passwordEncoder.encode(password));
		
		userService.save(user);
		
		System.out.println(user.toString());
		
		return "redirect:/";
	}
	
	@GetMapping("/login")
	public String viewLoginPage(Model model) {
//		List<Product> listProducts = service.listAll();
//		model.addAttribute("listProducts", listProducts);
		
		return "index";
	}
	
	@PostMapping("/login")
	public String loginUser(Model model) {
//		List<Product> listProducts = service.listAll();
//		model.addAttribute("listProducts", listProducts);
		
		return "login";
	}
	
	@PostMapping("/savepet")
	public String addPet(@ModelAttribute("pet") Pet pet) {
		
	//	pet.setIsAvailable(1);
		
		petService.save(pet);
		System.out.println("saving pet -> "+pet.toString());
		return "redirect:/";
	}
	
	@GetMapping("/createpet")
	public String addNewPet(Model model) {
		Pet pet = new Pet();
		model.addAttribute("pet",pet);
		
		return "addpet";
	}
	
	@GetMapping("/listpets")
	public String viewPetList(Model model) {
		List<Pet> listPets = petService.listAllPets();
		model.addAttribute("listPets",listPets);
		
		return "listpets";
	}
	
}
