package main;

public class MyCalc {
    public static double calcPi(int n) {
        double s = 0;
        int z = +1;
        for (int i = 0; i < n; i++) {
            s += z*4.0/(2*i+1);
            z = -z;
        }
        return s;
    }
}
