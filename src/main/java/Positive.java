public class Positive {
    public static int sum(int[] arr) {
        int sumPositiveNumbers = 0;
        for (int i : arr) {
            if (i > 0) {
                sumPositiveNumbers += i;
            }
        }
        return sumPositiveNumbers;
    }
}
