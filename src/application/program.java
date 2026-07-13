package application;

import model.entities.Department;

public class program {

    public static void main (String[] args) {

        Department department = new Department(1,"books");
        System.out.println(department);
    }
}
