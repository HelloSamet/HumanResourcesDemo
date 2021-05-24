package kodlamaio.humanresourcesDemo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.humanresourcesDemo.entities.concretes.EmployeeConfirm;

public interface EmployeeConfirmRepository extends JpaRepository<EmployeeConfirm, Integer> {

}
