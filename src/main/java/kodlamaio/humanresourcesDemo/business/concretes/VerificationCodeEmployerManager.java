package kodlamaio.humanresourcesDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.humanresourcesDemo.business.abstracts.VerificationCodeEmployerService;
import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.humanresourcesDemo.dataAccess.abstracts.VerificationCodeEmployerRepository;
import kodlamaio.humanresourcesDemo.entities.concretes.VerificationCodeEmployer;
@Service
public class VerificationCodeEmployerManager implements VerificationCodeEmployerService{
	
	private VerificationCodeEmployerRepository verificationCodeEmployerRepository;
	@Autowired
	public VerificationCodeEmployerManager(VerificationCodeEmployerRepository verificationCodeEmployerRepository) {
		super();
		this.verificationCodeEmployerRepository = verificationCodeEmployerRepository;
	}

	@Override
	public DataResult<List<VerificationCodeEmployer>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<VerificationCodeEmployer>>(this.verificationCodeEmployerRepository.findAll(), "VerificationCodeEmployer");
	}

}
