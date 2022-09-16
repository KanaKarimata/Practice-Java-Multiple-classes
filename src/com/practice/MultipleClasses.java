package com.practice;
import com.logic.CalcLogic;

public class MultipleClasses {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        int total = CalcLogic.add(a, b);
        int delta = CalcLogic.minus(a, b);
        System.out.println("total>" + total + ", delta>" + delta);
    }


}
