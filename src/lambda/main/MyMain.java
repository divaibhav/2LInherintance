/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 27-Oct-20
 *  Time: 4:22 PM
 */
package lambda.main;

import lambda.myinterface.MyFunctionalInterface;

public class MyMain {
    public static void main(String[] args) {
        MyFunctionalInterface reference = (a,b) -> {
         return a + b;
        } ;
        int result = reference.operation(10,20);

        System.out.println("result = " + result);
    }
}
