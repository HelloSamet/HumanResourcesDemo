package kodlamaio.humanresourcesDemo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.humanresourcesDemo.entities.concretes.EmployeeConfirmEmployer;

public interface EmployeeConfirmEmployerRepository extends JpaRepository<EmployeeConfirmEmployer, Integer> {

}
