package com.capgemini.samples;

public class Calculator {
    private App app;

    public Calculator(App app) {
        this.app = app;
    }

    public int minus(int i, int j) {
        return app.minus(i, j);
    }
}
