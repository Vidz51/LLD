package oops.designPatterns.structural.adaptor;

import oops.designPatterns.structural.adaptor.adaptors.EmployeeCSVAdapter;
import oops.designPatterns.structural.adaptor.adaptors.EmployeeLDAPAdapter;
import oops.designPatterns.structural.adaptor.employees.Employee;
import oops.designPatterns.structural.adaptor.employees.EmployeeCSV;
import oops.designPatterns.structural.adaptor.employees.EmployeeDB;
import oops.designPatterns.structural.adaptor.employees.EmployeeLDAP;

import java.util.*;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
	
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
		employees.add(employeeFromDB);

		EmployeeLDAP employeeFromLdap = new EmployeeLDAP("chewie", "Solo", "Han", "han@solo.com");

		//We have to add the data of all the employees to the employees list
		//But it only accepts objects of type Employee
		/*
		To use the Adapter Design Pattern to add EmployeeLdap and EmployeeCSV to the list of Employee objects, we need to
		create adapter classes that will convert these different types of employees (i.e., EmployeeLdap and EmployeeCSV)
		into the Employee interface.
		 */
		Employee employeeLdapAdaptor = new EmployeeLDAPAdapter(employeeFromLdap);
		employees.add(employeeLdapAdaptor);

		EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");
		Employee employeeCSVAdaptor = new EmployeeCSVAdapter(employeeFromCSV);
		employees.add(employeeCSVAdaptor);
		


		
		return employees;
		
	}
	
}