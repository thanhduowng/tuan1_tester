package main;

public class NumberProcessor {

    // Phương thức xử lý mảng số nguyên
    public String processNumbers(int[] numbers) {
        int evenCount = 0;
        int sum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {  // Lệnh rẽ nhánh: kiểm tra chẵn lẻ
                evenCount++;
            }
            sum += num;
        }

        if (sum > 100) {
            return "Sum is greater than 100, even numbers: " + evenCount;
        } else {
            return "Sum is 100 or less, even numbers: " + evenCount;
        }
    }
}
