package kodlamaio.humanresourcesDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.humanresourcesDemo.business.abstracts.EmployeeConfirmEmployerService;
import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.humanresourcesDemo.dataAccess.abstracts.EmployeeConfirmEmployerRepository;
import kodlamaio.humanresourcesDemo.entities.concretes.EmployeeConfirmEmployer;
@Service
public class EmployeeConfirmEmployerManager implements EmployeeConfirmEmployerService {
	private EmployeeConfirmEmployerRepository employeeConfirmEmployerRepository;
	
	@Autowired
	public EmployeeConfirmEmployerManager(EmployeeConfirmEmployerRepository employeeConfirmEmployerRepository) {
		super();
		this.employeeConfirmEmployerRepository = employeeConfirmEmployerRepository;
	}
	
	
	@Override
	public DataResult<List<EmployeeConfirmEmployer>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<EmployeeConfirmEmployer>>(this.employeeConfirmEmployerRepository.findAll(), "Listed EmployeeConfirmEmployer");
	}

}
