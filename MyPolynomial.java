package com.netcracker;

public class MyPolynomial {
    double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        String s = "";
        int n = coeffs.length;
        for (int i = n - 1; i > 1; --i) {
            s = s.concat(coeffs[i] + "x^" + (i));
            if (coeffs[i - 1] > 0) {
                s = s.concat("+");
            }
        }
        if (n > 1) {
            s = s.concat(coeffs[1] + "x+");
            if (coeffs[0] > 0) {
                s = s.concat("+");
            }
        }
        s = s.concat(coeffs[0] + "");
        return s;
    }

    public double evaluate(double x) {
        int n = coeffs.length;
        double eval = 0;
        for (int i = 0; i < n; ++i) {
            eval += coeffs[i] * Math.pow(x, i);
        }
        return eval;
    }

    public MyPolynomial add(MyPolynomial right) {
        int n;
        double[] result;
        boolean flag = true;
        if (right.coeffs.length < this.coeffs.length) {
            n = right.coeffs.length;
            result = new double[this.coeffs.length];
        }
        else {
            n = this.coeffs.length;
            result = new double[right.coeffs.length];
            flag = false;
        }
        for (int i = 0; i < n; ++i) {
            result[i] = this.coeffs[i] + right.coeffs[i];
        }
        if (flag) {
            for(int i = n; i < this.coeffs.length; ++i) {
                result[i] = this.coeffs[i];
            }
        }
        else {
            for(int i = n; i < right.coeffs.length; ++i) {
                result[i] = right.coeffs[i];
            }
        }
        return new MyPolynomial(result);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int thisDegree = this.coeffs.length;
        int rightDegree = right.coeffs.length;
        double[] result = new double[thisDegree + rightDegree];
        for (int i = 0; i < thisDegree; ++i) {
            for (int j = 0; j < rightDegree; ++j) {
                result[i+j] += (this.coeffs[i] * right.coeffs[j]);
            }
        }
        return new MyPolynomial(result);
    }
}
