/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 22-Oct-20
 *  Time: 4:32 PM
 */
package main;

import derived.Employee;
import derived.Student;

public class MyMain {
    public static void main(String[] args) {
        Student obj = new Student("vaibhav", "diva", 11, "BE",4, 7);
        obj.display();
        Employee emp = new Employee();
        emp.display();
    }
}
