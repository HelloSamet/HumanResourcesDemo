package kodlamaio.humanresourcesDemo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.humanresourcesDemo.business.abstracts.EmployeeConfirmEmployerService;
import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.entities.concretes.EmployeeConfirmEmployer;
@RestController
@RequestMapping("/api/employeeconfirmemployers")
public class EmployeeConfirmEmployerController {
	private EmployeeConfirmEmployerService employeeConfirmEmployerService;
	@Autowired
	public EmployeeConfirmEmployerController(EmployeeConfirmEmployerService employeeConfirmEmployerService) {
		super();
		this.employeeConfirmEmployerService = employeeConfirmEmployerService;
	}
	@GetMapping("/getall")
	public DataResult<List<EmployeeConfirmEmployer>> getAll(){
		return this.employeeConfirmEmployerService.getAll();
	}
}
