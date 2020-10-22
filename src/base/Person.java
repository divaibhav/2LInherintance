/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 22-Oct-20
 *  Time: 4:17 PM
 */
package base;

public class Person {
    private String name;
    private String email;
    //no-argument constructor

    public Person() {
        System.out.println("no-args constructor called");
        name = null;
        email = null;
    }

    //parameterized constructor
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void display(){
        System.out.println(name);
        System.out.println(email);
    }
}
