package oops.designPatterns.structural.adaptor.adaptors;

import oops.designPatterns.structural.adaptor.employees.Employee;
import oops.designPatterns.structural.adaptor.employees.EmployeeLDAP;

public class EmployeeLDAPAdapter implements Employee {

    private EmployeeLDAP instance;

    public EmployeeLDAPAdapter(EmployeeLDAP employeeLdap) {
        this.instance = employeeLdap;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", First name: " + getFirstName() + ", Last name: " + getLastName() + ", Email: " + getEmail();
    }
}
