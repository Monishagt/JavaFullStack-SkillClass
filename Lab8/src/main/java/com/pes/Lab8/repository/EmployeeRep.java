package com.pes.Lab8.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pes.Lab8.model.Employee;
public interface EmployeeRep extends JpaRepository<Employee,Long> {
	

}
