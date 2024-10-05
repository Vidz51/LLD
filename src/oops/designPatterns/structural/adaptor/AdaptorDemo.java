package oops.designPatterns.structural.adaptor;

import oops.designPatterns.structural.adaptor.employees.Employee;

import java.util.List;

/**
 * The Adapter Design Pattern is a structural design pattern that allows incompatible interfaces to work together.
 * It acts as a bridge between two objects with different interfaces, enabling classes with incompatible interfaces to interact seamlessly.
 * The Adapter Pattern is often used to make existing classes work with others without modifying their source code.
 * When to Use:
 * When you want to use an existing class, but its interface doesn't match the one you need.
 * When you want to create a reusable class that cooperates with unrelated or unforeseen classes that don't necessarily have compatible interfaces.
 * To avoid modifying existing code, especially when it's from a third party or a library.
 */
public class AdaptorDemo {
    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        employees.forEach(e ->System.out.println(e));
    }
}
