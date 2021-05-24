package kodlamaio.humanresourcesDemo.business.abstracts;

import java.util.List;

import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.entities.concretes.VerificationCodeCandidate;

public interface VerificationCodeCandidateService {
	DataResult<List<VerificationCodeCandidate>> getAll();
}
