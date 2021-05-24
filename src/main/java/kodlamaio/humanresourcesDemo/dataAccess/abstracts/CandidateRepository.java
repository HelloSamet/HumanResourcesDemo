package kodlamaio.humanresourcesDemo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.humanresourcesDemo.entities.concretes.Candidate;


public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

}
