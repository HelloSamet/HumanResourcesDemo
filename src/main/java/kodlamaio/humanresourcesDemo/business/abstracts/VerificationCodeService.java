package kodlamaio.humanresourcesDemo.business.abstracts;

import java.util.List;

import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.entities.concretes.VerificationCode;

public interface VerificationCodeService {
	DataResult<List<VerificationCode>> getAll();
}
