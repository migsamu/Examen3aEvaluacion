package org.iesfm.examen3.ej2.exceptions;

public class DepartmentNotFoundException extends Exception {

    private String nameDepartment;

    public DepartmentNotFoundException(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public DepartmentNotFoundException(String message, Throwable cause, String nameDepartment) {
        super(message, cause);
        this.nameDepartment = nameDepartment;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }
}
