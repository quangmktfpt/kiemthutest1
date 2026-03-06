package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test cho lớp CountNumbers
 * Sử dụng kỹ thuật biên và phân vùng tương đương
 */
@DisplayName("CountNumbers - Unit Tests")
public class CountNumbersTest {

    private CountNumbers countNumbers;

    @BeforeEach
    public void setUp() {
        countNumbers = new CountNumbers();
    }

    /**
     * Test Case 1: Mảng với nhiều số chẵn và lẻ
     * Phân vùng tương đương: Mảng bình thường có cả số chẵn và lẻ
     */
    @Test
    @DisplayName("Test với mảng bình thường có cả số chẵn và lẻ")
    public void testCountEvenNumbersWithMixedNumbers() {
        // Arrange
        int[] numbers = {1, 2, 3, 4, 5, 6};

        // Act
        int result = countNumbers.countEvenNumbers(numbers);

        // Assert
        assertEquals(3, result, "Nên có 3 số chẵn (2, 4, 6)");
    }

    /**
     * Test Case 2: Mảng chỉ chứa số chẵn
     * Phân vùng tương đương: Mảng toàn số chẵn
     */
    @Test
    @DisplayName("Test với mảng chỉ chứa số chẵn")
    public void testCountEvenNumbersWithOnlyEvenNumbers() {
        // Arrange
        int[] numbers = {2, 4, 6, 8, 10};

        // Act
        int result = countNumbers.countEvenNumbers(numbers);

        // Assert
        assertEquals(5, result, "Tất cả 5 phần tử đều là số chẵn");
    }

    /**
     * Test Case 3: Mảng chỉ chứa số lẻ
     * Phân vùng tương đương: Mảng toàn số lẻ
     */
    @Test
    @DisplayName("Test với mảng chỉ chứa số lẻ")
    public void testCountEvenNumbersWithOnlyOddNumbers() {
        // Arrange
        int[] numbers = {1, 3, 5, 7, 9};

        // Act
        int result = countNumbers.countEvenNumbers(numbers);

        // Assert
        assertEquals(0, result, "Không có số chẵn nào");
    }

    /**
     * Test Case 4: Mảng rỗng
     * Kỹ thuật biên: Trường hợp biên với mảng rỗng
     */
    @Test
    @DisplayName("Test với mảng rỗng")
    public void testCountEvenNumbersWithEmptyArray() {
        // Arrange
        int[] numbers = {};

        // Act
        int result = countNumbers.countEvenNumbers(numbers);

        // Assert
        assertEquals(0, result, "Mảng rỗng không có số chẵn");
    }
}

