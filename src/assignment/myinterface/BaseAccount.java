/*
Create an interface to which contain methods createAccount(String name, String email),
withdrawal(int amount), deposit(int amount), deleteAccount(int accountNo).


Create a derived class from given interface and then create a main class to ask user to create account and deposit and
withdraw some amt.
 */
package assignment.myinterface;

public interface BaseAccount {
    Account createAccount(String name, String email);
    boolean withdrawal(int amount);
    boolean deposit(int amount);
    int deleteAccount(int accountNo);
}
