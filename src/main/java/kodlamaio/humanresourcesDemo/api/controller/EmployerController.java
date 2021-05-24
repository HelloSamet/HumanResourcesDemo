package kodlamaio.humanresourcesDemo.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.humanresourcesDemo.business.abstracts.EmployerService;
import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.entities.concretes.Employer;
@RestController
@RequestMapping("/api/employers")
public class EmployerController {
	
	private EmployerService employerService;

	
	
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
}
