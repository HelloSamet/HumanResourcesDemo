package kodlamaio.humanresourcesDemo.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="employee_confirms")
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeConfirm {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	
	@Column(name="employee_id")
	private int employeeId;
	
	@Column(name="is_confirmed")
	private boolean isConfirmed;
	
	
	@Column(name="confirmed_date")
	private Date confirmedDate;
}
