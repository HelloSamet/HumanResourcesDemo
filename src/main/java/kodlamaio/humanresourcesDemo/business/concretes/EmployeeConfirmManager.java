package kodlamaio.humanresourcesDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.humanresourcesDemo.business.abstracts.EmployeeConfirmService;
import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.humanresourcesDemo.dataAccess.abstracts.EmployeeConfirmRepository;
import kodlamaio.humanresourcesDemo.entities.concretes.EmployeeConfirm;
@Service 
public class EmployeeConfirmManager implements EmployeeConfirmService {
	private EmployeeConfirmRepository employeeConfirmRepository;
	
	
	@Autowired
	public EmployeeConfirmManager(EmployeeConfirmRepository employeeConfirmRepository) {
		super();
		this.employeeConfirmRepository = employeeConfirmRepository;
	}
	
	
	@Override
	public DataResult<List<EmployeeConfirm>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<EmployeeConfirm>>(this.employeeConfirmRepository.findAll(),"Listed Employee");
	}

}
