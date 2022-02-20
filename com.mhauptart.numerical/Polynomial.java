package com.mhauptart.numerical;

public class Polynomial{
    int degree = 0;
    double coefficients[] = {};
    //double evalValue = 0;
    double basepoints[] = {};

    public Polynomial(int degree,double coefficients[],double basepoints[]){};

    public double evaluate(double evalValue){
        double y = coefficients[degree];
        for(int i = degree-1;i >= 0;i--){
            y = y * (evalValue = basepoints[i]) + coefficients[i];
        }

        return y;

    }


    


}