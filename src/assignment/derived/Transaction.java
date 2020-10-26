/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 26-Oct-20
 *  Time: 1:47 PM
 */
package assignment.derived;

import assignment.myinterface.Account;
import assignment.myinterface.BaseAccount;

public class Transaction implements BaseAccount {
    @Override
    public Account createAccount(String name, String email) {
        return null;
    }

    @Override
    public boolean withdrawal(int amount) {
        return false;
    }

    @Override
    public boolean deposit(int amount) {
        return false;
    }

    @Override
    public int deleteAccount(int accountNo) {
        return 0;
    }
}
