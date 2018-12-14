package main;

public class Main {

    public static void main(String[] args) {
	    double[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

	    double[][] b = {
                {7,8,9},
                {4,5,6},
                {1,2,3}
        };

	    Matrix matrix = new Matrix();
        double[][] sum = matrix.sum(a, b);
        matrix.print(sum);
        System.out.println("-------------------------");
        double[][] product = matrix.product(a, b);
        matrix.print(product);
        ///
    }
}
