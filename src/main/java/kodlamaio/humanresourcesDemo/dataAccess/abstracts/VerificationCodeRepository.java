package kodlamaio.humanresourcesDemo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.humanresourcesDemo.entities.concretes.VerificationCode;

public interface VerificationCodeRepository extends JpaRepository<VerificationCode, Integer> {

}
