/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 22-Oct-20
 *  Time: 4:32 PM
 */
package main;

import base.Person;
import derived.Employee;
import derived.Student;

public class MyMain {
    public static void main(String[] args) {
        Person p = new Student("vaibhav", "diva", 11, "BE",4, 7);
        Person p1= new Employee(123,45678);
        p.display();
        p1.display();

    }
}
