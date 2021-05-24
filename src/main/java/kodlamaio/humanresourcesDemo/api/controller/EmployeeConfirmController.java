package kodlamaio.humanresourcesDemo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.humanresourcesDemo.business.abstracts.EmployeeConfirmService;
import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.entities.concretes.EmployeeConfirm;
@RestController
@RequestMapping("/api/employeeconfirms")
public class EmployeeConfirmController {
	private EmployeeConfirmService employeeConfirmService;
	
	
	@Autowired
	public EmployeeConfirmController(EmployeeConfirmService employeeConfirmService) {
		super();
		this.employeeConfirmService = employeeConfirmService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<EmployeeConfirm>> getAll(){
		return this.employeeConfirmService.getAll();
	}
}
