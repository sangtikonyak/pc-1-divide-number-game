package com.jap;

import java.util.InputMismatchException;

public class GameDemo {

    public String divideByNumber(int firstNumber, int secondNumber){
        //create local variable
        int sum=0;
        try {
            //write logic
            sum=firstNumber/secondNumber;
            //Handle specific exception
        }catch ( ArithmeticException e){
          return e.toString();
        }
        return String.valueOf(sum);
    }
    public static void main(String[] args) {
        GameDemo gameDemo=new GameDemo();
        System.out.println("gameDemo.divideByNumber(10,0) = " + gameDemo.divideByNumber(10, 0));
    }
}
