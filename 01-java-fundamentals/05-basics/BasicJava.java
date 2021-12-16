import java.util.ArrayList;

public class BasicJava {
    public Integer printRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
        return null;
    }

    public Integer printOddRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        return null;
    }

    public Integer sigma(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public String iterateArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        return null;
    }

    public Integer findMax(int[] x) {
        int max = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }
}
