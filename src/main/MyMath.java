package main;

public class MyMath {
    public static int findMin(int... numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (result > numbers[i]) {
                result = numbers[i];
            }
        }
        return result;
    }
}
