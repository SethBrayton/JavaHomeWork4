public class Equation {
    public static void main(String[] args) {
        int n = 10;
        int[] a = {6, 1, 2, 8, 3, 4, 7, 10, 5};

        int missing = findMissingNumber(a, n);
        System.out.println("Ответ: " + missing);
    }

    public static int findMissingNumber(int[] a, int n) {
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int i = 0; i < a.length; i++) {
            arraySum += a[i];
        }

        int missingNumber = totalSum - arraySum;
        return missingNumber;
    }
}