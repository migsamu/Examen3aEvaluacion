package org.iesfm.examen3.ej2;

import org.iesfm.examen3.ej2.exceptions.DepartmentNotFoundException;

import java.util.*;

public class Company {
    private String name;
    private Map<String, Department> departments;

    public Company(String name, Map<String, Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public int getEmployeeNumberByDepartment(String nameDepartment) throws DepartmentNotFoundException {
        if (!departments.containsKey(nameDepartment)) {
            throw new DepartmentNotFoundException(nameDepartment);
        }
        return departments.get(nameDepartment).getEmployeesNumber();
    }

    public Set<Employee> getEmployees(String nameDepartment) throws DepartmentNotFoundException {
        if (!departments.containsKey(nameDepartment)) {
            throw new DepartmentNotFoundException(nameDepartment);
        }
        Set<Employee> result = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee employee2) {
                return employee.getNif().compareTo(employee2.getNif());
            }
        });
        result.addAll(departments.get(nameDepartment).getEmployees());

        return result;
    }

    public int getAllEmployees() {
        int numberEmployees = 0;
        for (Department department : departments.values()) {
            numberEmployees += department.getEmployeesNumber();
        }
        return numberEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(departments, company.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, departments);
    }
}
