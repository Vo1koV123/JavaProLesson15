package task;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        ArrayValueCalculator calculator = new ArrayValueCalculator();
        try {
            int result = calculator.doCalc(array);
            System.out.println("The sum of all elements in the array is: " + result);
        } catch (ArraySizeException e) {
            System.err.println("ArraySizeException: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.err.println("ArrayDataException: " + e.getMessage());
        }
    }
}
