/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 26-Oct-20
 *  Time: 1:42 PM
 */
package assignment.derived;

public class Account implements assignment.myinterface.Account {
    private int accountNo;
    private String name;
    private String email;
    private int balance;

    public int getAccountNo() {
        return accountNo;
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

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
