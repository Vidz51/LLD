package oops.designPatterns.structural.adaptor.adaptors;

import oops.designPatterns.structural.adaptor.employees.Employee;
import oops.designPatterns.structural.adaptor.employees.EmployeeCSV;

public class EmployeeCSVAdapter implements Employee {

    private EmployeeCSV instance;

    public EmployeeCSVAdapter(EmployeeCSV employeeCSV) {
        this.instance = employeeCSV;
    }

    @Override
    public String getId() {
        return String.valueOf(instance.getId());
    }

    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", First name: " + getFirstName() + ", Last name: " + getLastName() + ", Email: " + getEmail();
    }
}
