package kodlamaio.humanresourcesDemo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.humanresourcesDemo.entities.concretes.VerificationCodeCandidate;

public interface VerificationCodeCandidateRepository extends JpaRepository<VerificationCodeCandidate, Integer> {

}
