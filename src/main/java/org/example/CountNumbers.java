package org.example;

/**
 * Lớp chứa hàm đếm số lượng phần tử chẵn trong mảng
 */
public class CountNumbers {

    /**
     * Đếm số lượng phần tử là số chẵn trong mảng
     * @param numbers mảng số nguyên
     * @return số lượng phần tử chẵn
     */
    public int countEvenNumbers(int[] numbers) {
        if (numbers == null) {
            return 0;
        }

        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

