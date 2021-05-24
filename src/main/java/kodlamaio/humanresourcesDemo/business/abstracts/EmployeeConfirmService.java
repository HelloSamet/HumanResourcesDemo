package kodlamaio.humanresourcesDemo.business.abstracts;

import java.util.List;

import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.entities.concretes.EmployeeConfirm;

public interface EmployeeConfirmService {
	DataResult<List<EmployeeConfirm>> getAll();
}
