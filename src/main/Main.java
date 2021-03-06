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
        System.out.println("-----------------------------");
        int[] arr = {5,2,8,4,1,-1,7};
        int min = MyMath.findMin(arr);
        System.out.println("min = " + min);
        System.out.println("-----------------------------");
        long start = System.currentTimeMillis();
        double v = MyCalc.calcPi(1_000_000_000);
        long finish = System.currentTimeMillis();
        System.out.println("v = " + v);
        System.out.println("P = " + Math.PI);
        System.out.println(finish-start);
    }
}
