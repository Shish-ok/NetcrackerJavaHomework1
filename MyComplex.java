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
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }
    public double argument() {
        if (real > 0) {
            return Math.atan(imag / real);
        }
        else if (real < 0 && imag < 0) {
            return -Math.PI + Math.atan(imag / real);
        }
        else if (real == 0 && imag > 0) {
            return Math.PI / 2;
        }
        else if (real == 0 && imag < 0) {
            return -Math.PI / 2;
        }
        else {
            return Math.PI + Math.atan(imag / real);
        }
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }
    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        double real = this.real * right.real - this.imag * right.imag;
        double imag = this.real * right.real + this.imag * right.imag;
        this.real = real;
        this.imag = imag;
        return this;
    }

    public MyComplex devide(MyComplex right) {
        double real = (this.real * right.real + this.imag * right.imag) / (right.real * right.real + right.imag * right.imag);
        double imag = (right.real * this.imag - right.real * right.imag) / (right.real * right.real + right.imag * right.imag);
        this.real = real;
        this.imag = imag;
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(this.real, -this.imag);
    }
}
