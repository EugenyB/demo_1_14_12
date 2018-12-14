package main;

public class Matrix {
    public double[][] sum(double[][] a, double[][] b) {
        if (a.length!=b.length || a[0].length!=b[0].length) {
            throw new IllegalArgumentException("matrixes are different in sizes");
        }
        double[][] res = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }

    public double[][] product(double[][] a, double[][] b) {
        if (a[0].length!=b.length) {
            throw new IllegalArgumentException("matrixes are different in sizes");
        }
        double[][] res = new double[a.length][b.length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    res[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        return res;
    }

    public void print(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%6.3f ", a[i][j]);
            }
            System.out.println();
        }
    }
}
