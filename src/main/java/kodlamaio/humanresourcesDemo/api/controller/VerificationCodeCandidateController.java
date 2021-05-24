package kodlamaio.humanresourcesDemo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.humanresourcesDemo.business.abstracts.VerificationCodeCandidateService;
import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.entities.concretes.VerificationCodeCandidate;
@RestController
@RequestMapping("/api/verificationcodecandidates")
public class VerificationCodeCandidateController {
	private VerificationCodeCandidateService verificationCodeCandidateService;
	
	@Autowired
	public VerificationCodeCandidateController(VerificationCodeCandidateService verificationCodeCandidateService) {
		super();
		this.verificationCodeCandidateService = verificationCodeCandidateService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<VerificationCodeCandidate>> getAll(){
		return this.verificationCodeCandidateService.getAll();
	}
}
