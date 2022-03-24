package com.netcracker;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {

    }
    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (imag > 0) {
            return "(" + real + "+" + imag + "i)";
        }
        else {
            return "(" + real + imag + "i)";
        }
    }

    public boolean isReal() {
        return real == 0.0;
    }
    public boolean isImaginary() {
        return imag == 0.0;
    }

    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }
    public boolean equals(MyComplex another) {
        return this.real == another.getReal() && this.imag == another.getImag();
    }
    
}