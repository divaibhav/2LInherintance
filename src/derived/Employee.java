/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 22-Oct-20
 *  Time: 4:41 PM
 */
package derived;

import base.Person;

public class Employee extends Person {
    private int empId;
    private long salary;

    public Employee(int empId, long salary) {
        //java will supply a call to default constructor or the no-argument constructor
        this.empId = empId;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    @Override
    public void display(){
        super.display();
        System.out.println(empId);
        System.out.println(salary);

    }
}
