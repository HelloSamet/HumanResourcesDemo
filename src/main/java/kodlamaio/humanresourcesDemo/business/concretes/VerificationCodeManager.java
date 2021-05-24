package kodlamaio.humanresourcesDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.humanresourcesDemo.business.abstracts.VerificationCodeService;
import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.humanresourcesDemo.dataAccess.abstracts.VerificationCodeRepository;
import kodlamaio.humanresourcesDemo.entities.concretes.VerificationCode;
@Service
public class VerificationCodeManager implements VerificationCodeService {
	
	private VerificationCodeRepository verificationCodeRepository;
	
	@Autowired
	public VerificationCodeManager(VerificationCodeRepository verificationCodeRepository) {
		super();
		this.verificationCodeRepository = verificationCodeRepository;
	}


	@Override
	public DataResult<List<VerificationCode>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<VerificationCode>>(this.verificationCodeRepository.findAll(),"Listed VerificationCode");
	}

}
