import java.util.Arrays;

public class CheckMax<T extends Comparable<T>> {
    T val1, val2, val3;

    public CheckMax(T take1, T take2, T take3) {
        this.val1 = take1;
        this.val2 = take2;
        this.val3 = take3;
    }
    public CheckMax() {
    }
    //@method internally call the static method
    public  T maximum() {
        return CheckMax.findMaximum(val1, val2, val3);
    }

    /**
     * following method checks the maximum values out of three parameters
     * if 1st is max then return 1st number
     * if 2nd is max then return 2nd number
     * if 3rd is max then return 3rd number
     */
    public static <T extends Comparable<T>> T findMaximum(T num1, T num2, T num3) {
        T max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        printMax(max);
        return max;
    }
    //@method entends previous findMaximum and allow more the 3 inputs
    public static <T extends Object & Comparable<T>> T findMaximum(T ... elements) {
        Arrays.sort(elements);
        T max = elements[0];
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        printMax(max);
        return max;
    }

    //@method is to print the value
    private static <T> void printMax(T max) {
        System.out.printf("Max value is:" + max + "\n");
    }
}