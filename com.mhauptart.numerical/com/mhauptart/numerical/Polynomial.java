package com.mhauptart.numerical;

public class Polynomial{
    int degree;
    double coefficients[];    
    double basepoints[];

    public Polynomial(int degree2,double[] coefficientsArr,double[] basepointsArr){
        this.degree = degree2;
        coefficients = new double[degree + 1];
        basepoints = new double[degree];
        for(int i = 0;i <= degree;i++){
            coefficients[i] = coefficientsArr[i];
        }
        for(int i = 0;i < degree;i++){
            basepoints[i] = basepointsArr[i];
        }
    };

    public Polynomial(int degree2,double[] coefficientsArr){
        this.degree = degree2;
        coefficients = new double[degree + 1];
        basepoints = new double[degree];
        for(int i = 0;i <= degree;i++){
            coefficients[i] = coefficientsArr[i];
        }
        for(int i = 0;i < degree;i++){
            basepoints[i] = 0;
        }
    };

    public double evaluate(double evalValue){
        double y = coefficients[degree];
        for(int i = degree-1;i >= 0;i--){
            y = y * (evalValue - basepoints[i]) + coefficients[i];
        }

        return y;

    }


    


}