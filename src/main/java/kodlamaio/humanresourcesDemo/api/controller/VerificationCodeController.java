package kodlamaio.humanresourcesDemo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.humanresourcesDemo.business.abstracts.VerificationCodeService;
import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.entities.concretes.VerificationCode;
@RestController
@RequestMapping("/api/verificationcodes")
public class VerificationCodeController {
	private VerificationCodeService verificationCodeService;
	
	
	@Autowired
	public VerificationCodeController(VerificationCodeService verificationCodeService) {
		super();
		this.verificationCodeService = verificationCodeService;
	}
	
	
	
	@GetMapping("/getall")
	public DataResult<List<VerificationCode>> getAll(){
		return this.verificationCodeService.getAll();
	}
}
