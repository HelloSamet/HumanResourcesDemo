package kodlamaio.humanresourcesDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.humanresourcesDemo.business.abstracts.EmployerService;
import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.humanresourcesDemo.dataAccess.abstracts.EmployerRepository;
import kodlamaio.humanresourcesDemo.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerRepository employerRepository;
	
	@Autowired
	public EmployerManager(EmployerRepository employerRepository) {
		super();
		this.employerRepository = employerRepository;
	}


	@Override
	public DataResult<List<Employer>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employer>>(this.employerRepository.findAll(), "Listed Employer");
	}

}
