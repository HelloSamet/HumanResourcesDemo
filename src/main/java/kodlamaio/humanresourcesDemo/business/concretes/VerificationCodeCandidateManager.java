package kodlamaio.humanresourcesDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.humanresourcesDemo.business.abstracts.VerificationCodeCandidateService;
import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.humanresourcesDemo.dataAccess.abstracts.VerificationCodeCandidateRepository;
import kodlamaio.humanresourcesDemo.entities.concretes.VerificationCodeCandidate;
@Service
public class VerificationCodeCandidateManager implements VerificationCodeCandidateService {
	
	private VerificationCodeCandidateRepository verificationCodeCandidateRepository;
	@Autowired
	public VerificationCodeCandidateManager(VerificationCodeCandidateRepository verificationCodeCandidateRepository) {
		super();
		this.verificationCodeCandidateRepository = verificationCodeCandidateRepository;
	}

	@Override
	public DataResult<List<VerificationCodeCandidate>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<VerificationCodeCandidate>>(this.verificationCodeCandidateRepository.findAll(), "VerificationcodeCandidate");
	}

}
