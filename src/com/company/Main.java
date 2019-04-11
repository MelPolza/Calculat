package com.company;

public class Main {


    public static void main(String[] args){
        Input input  = new Input();
        input.setMethod("console");
        String value1=input.setInput();
        String value2=input.setInput();
        char operation = input.getOperation();
        Calc calc = new Calc();
        String result = calc.calc(value1,value2,operation);
        System.out.println("Result of program implementation: "+result);}

}
