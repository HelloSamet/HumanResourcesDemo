package kodlamaio.humanresourcesDemo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.humanresourcesDemo.entities.concretes.JobPosition;

public interface JobPositionRepository extends JpaRepository<JobPosition, Integer> {

}
