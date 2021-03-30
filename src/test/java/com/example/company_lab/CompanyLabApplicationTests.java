package com.example.company_lab;

import com.example.company_lab.models.Department;
import com.example.company_lab.models.Employee;
import com.example.company_lab.models.Project;
import com.example.company_lab.repositories.DepartmentRepository;
import com.example.company_lab.repositories.EmployeeRepository;
import com.example.company_lab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompanyLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment() {
		Department department = new Department("Software Engineering");
		departmentRepository.save(department);

		Employee employee = new Employee("Barry", "Scott", department);
		employeeRepository.save(employee);
	}

	@Test
	public void addEmployeesAndProjects(){
		Department department = new Department("Software Engineering");
		departmentRepository.save(department);

		Employee employee = new Employee("Barry", "Scott", department);
		employeeRepository.save(employee);

		Project project = new Project(1, "The Company Project");
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);
	}

}
