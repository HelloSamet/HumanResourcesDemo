package kodlamaio.humanresourcesDemo.business.abstracts;

import java.util.List;

import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.entities.concretes.EmployeeConfirmEmployer;

public interface EmployeeConfirmEmployerService {
	DataResult<List<EmployeeConfirmEmployer>> getAll();
}
