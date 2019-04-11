package com.company;

import java.io.Console;
import java.util.Scanner;

public class Input {
    private Scanner consoleIn = new Scanner(System.in);
    private String method= "console";
    Input(String method){
        this.setMethod(method);
    }
    Input(){}
    public void setMethod(String method){
        method=this.method;
    }
    public String getMethod(){
        return method;
    }

    public String setInput(){
        String input="";
        if (this.getMethod().equals("console")){
            input=this.getConsoleInput();

        }
        return input;
    }
    public String getConsoleInput() {


        System.out.println("Enter the value:");
        String input = consoleIn.nextLine();
        return input.toUpperCase();

    }

    public  char getOperation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operation:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("You made a mistake when entering the operation. Try again!");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public Scanner getConsoleIn() {
        return consoleIn;
    }

    public void setConsoleIn(Scanner consoleIn) {
        this.consoleIn = consoleIn;
    }
}

