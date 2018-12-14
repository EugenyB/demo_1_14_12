package main;

public class MyMath {
    final static double PI = 3.1415926;

    public static int findMin(int... numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (result > numbers[i]) {
                result = numbers[i];
            }
        }
        return result;
    }

    public double areaOfCircle(double radius) {
        return PI * radius * radius;
    }
}
