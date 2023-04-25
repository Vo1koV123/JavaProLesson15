package task;

import java.util.Arrays;

public class ArrayValueCalculator {

    public int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        if (array.length != 4 || Arrays.stream(array)
                .anyMatch(a -> a.length != 4)) {
            throw new ArraySizeException("The array must have dimensions of 4x4.");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data in cell [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
        return sum;
    }


}
