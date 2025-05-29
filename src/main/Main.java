package main;

public class Main {
    public static void main(String[] args) {
        NumberProcessor np = new NumberProcessor();
        int[] numbers = {10, 20, 30, 40};
        String result = np.processNumbers(numbers);
        System.out.println(result);
    }
}
