package com.example.company_lab;

import com.example.company_lab.models.Department;
import com.example.company_lab.models.Employee;
import com.example.company_lab.repositories.DepartmentRepository;
import com.example.company_lab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompanyLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Department department = new Department("Software Engineering");
		departmentRepository.save(department);

		Employee employee = new Employee("Barry", "Scott", department);
		employeeRepository.save(employee);

	}

}
