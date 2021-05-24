package kodlamaio.humanresourcesDemo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.humanresourcesDemo.entities.concretes.VerificationCodeEmployer;

public interface VerificationCodeEmployerRepository extends JpaRepository<VerificationCodeEmployer, Integer> {

}
