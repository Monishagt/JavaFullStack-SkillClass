package com.pes.Lab5;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Lab5Application implements CommandLineRunner{
	@Autowired
	CustomerDao customerDao;
	@Autowired
	EmployeeDao employeeDao;
	

	
	
	public static void main(String[] args) {
		SpringApplication.run(Lab5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Customer c1= new Customer(1,"Anya","anyaa3@gmail.com","Karnataka",6005726241l);
		Customer c2= new Customer(2,"Sanya","sanyaa3@gmail.com","Karnataka",7985726241l);
		Customer c4= new Customer(3,"Manya","manyaa3@gmail.com","Karnataka",7985726256l);
		customerDao.save(c1);
		customerDao.save(c2);
		customerDao.save(c4);
		
        customerDao.delete(c2);
        Optional<Customer> c3 = customerDao.findById(3);

        Optional<Customer> customerToUpdateOptional = customerDao.findById(2);
        customerToUpdateOptional.ifPresent(customerToUpdate -> {
            // Update the customer's email
            customerToUpdate.setEmail("updatedemail@gmail.com");
            customerDao.save(customerToUpdate);
            System.out.println("Customer Updated: " + customerToUpdate);
        });


		System.out.println(c3);
				System.out.println("lab1 Doen");
				
		Employee e1 = new Employee(1,"Sofia","California",565623);
		Employee e2 = new Employee(2,"Amber","London",522623);
		Employee e3 = new Employee(1,"John","New york",565673);
		employeeDao.save(e1);
		employeeDao.save(e2);
		employeeDao.save(e3);
		
	       
        

		
	}

}