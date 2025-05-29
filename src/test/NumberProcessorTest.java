package test;

import static org.junit.jupiter.api.Assertions.*;

import main.NumberProcessor;
import org.junit.jupiter.api.Test;

public class NumberProcessorTest {

    @Test
    public void testProcessNumbers_LessThanOrEqual100() {
        NumberProcessor np = new NumberProcessor();
        int[] nums = {1, 2, 3, 4}; // sum = 10, evenCount = 2
        String result = np.processNumbers(nums);
        assertEquals("Sum is 100 or less, even numbers: 2", result);
    }

    @Test
    public void testProcessNumbers_GreaterThan100() {
        NumberProcessor np = new NumberProcessor();
        int[] nums = {50, 60}; // sum = 110, evenCount = 2
        String result = np.processNumbers(nums);
        assertEquals("Sum is greater than 100, even numbers: 2", result);
    }

    @Test
    public void testProcessNumbers_EmptyArray() {
        NumberProcessor np = new NumberProcessor();
        int[] nums = {};
        String result = np.processNumbers(nums);
        assertEquals("Sum is 100 or less, even numbers: 0", result);
    }

    @Test
    public void testProcessNumbers_AllOdd() {
        NumberProcessor np = new NumberProcessor();
        int[] nums = {1, 3, 5, 7}; // sum = 16, evenCount = 0
        String result = np.processNumbers(nums);
        assertEquals("Sum is 100 or less, even numbers: 0", result);
    }

    @Test
    public void testProcessNumbers_AllEven_SumEquals100() {
        NumberProcessor np = new NumberProcessor();
        int[] nums = {40, 60}; // sum = 100, evenCount = 2
        String result = np.processNumbers(nums);
        assertEquals("Sum is 100 or less, even numbers: 2", result);
    }
}
