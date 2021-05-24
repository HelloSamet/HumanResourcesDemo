package kodlamaio.humanresourcesDemo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.humanresourcesDemo.business.abstracts.VerificationCodeEmployerService;
import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.entities.concretes.VerificationCodeEmployer;
@RestController
@RequestMapping("/api/verificationcodeemployers")
public class VerificationCodeEmployerController {
	private VerificationCodeEmployerService verificationCodeEmployerService;

	
	@Autowired
	public VerificationCodeEmployerController(VerificationCodeEmployerService verificationCodeEmployerService) {
		super();
		this.verificationCodeEmployerService = verificationCodeEmployerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<VerificationCodeEmployer>> getAll(){
		return this.verificationCodeEmployerService.getAll();
	}
}
