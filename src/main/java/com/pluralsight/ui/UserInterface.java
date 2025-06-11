package com.pluralsight.ui;

import com.pluralsight.Console;
import com.pluralsight.models.Employee;

public class UserInterface {

    public UserInterface() {
        this.console = new Console();
    }

    private Employee currentEmployee;
    private Console console;

    public void display() {
        System.out.println("Welcome to the Northwind Manager!");
        currentEmployee = loginUser();
        System.out.println("Welcome, " + this.currentEmployee.getFirstName() + "!");
        showHomeMenu();
    }



    private Employee loginUser() {
        String s = console.promptForString("Hit Enter to login as Matt", true);
        Employee e = new Employee(1, "Matt", "Christenson");
        return e;
    }

    private void showHomeMenu() {
        System.out.println("Home Menu here");
    }
}
