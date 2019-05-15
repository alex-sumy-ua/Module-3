package com.plachkovskyy.model;

public class CalculatorModel {

    private static int a;
    private static int b;
    private static int operation;
    private static int res;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public static int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public CalculatorModel(int a, int b, int operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public static int result(int operation) { // 1+ 2- 3* 4:
        switch (operation) {
            case (1):
                res = a + b;
                break;
            case (2):
                res = a - b;
                break;
            case (3):
                res = a * b;
                break;
            case (4):
                res = a / b;
                break;
            default:
                break;
        }
        return res;
    }

}
