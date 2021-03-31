package co.edu.iudigital.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.app.model.entity.Gender;

@RestController
@RequestMapping("/gender")
@CrossOrigin("*")
public class GenderController {
	//inyección de dependencias desde el services
	@Autowired
	private GenderController genderService;
	
	@GetMapping
	public List<Gender> GetAll(){
		return genderService.GetAll();
		
	}
	
	

}
