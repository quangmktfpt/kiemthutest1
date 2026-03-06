package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test cho lớp SanPhamService
 * Sử dụng kỹ thuật biên và phân vùng tương đương
 */
@DisplayName("SanPhamService - Unit Tests")
public class SanPhamServiceTest {

    private SanPhamService service;

    @BeforeEach
    public void setUp() {
        service = new SanPhamService();
    }

    /**
     * Test Case 1: Thêm sản phẩm hợp lệ
     * Phân vùng tương đương: Sản phẩm đầy đủ thông tin
     */
    @Test
    @DisplayName("Test thêm sản phẩm hợp lệ với đầy đủ thông tin")
    public void testThemSanPhamHopLe() {
        // Arrange
        SanPham sp = new SanPham(1, "Laptop", 5, 15000000, "Laptop chơi game");

        // Act
        boolean result = service.themSanPham(sp);

        // Assert
        assertTrue(result, "Thêm sản phẩm hợp lệ nên thành công");
        assertEquals(1, service.getDanhSachSanPham().size(), "Danh sách nên có 1 sản phẩm");
    }

    /**
     * Test Case 2: Thêm sản phẩm có tên trống
     * Validate: Các trường không được để trống
     */
    @Test
    @DisplayName("Test thêm sản phẩm với tên trống")
    public void testThemSanPhamTenTrong() {
        // Arrange
        SanPham sp = new SanPham(1, "", 5, 15000000, "Laptop chơi game");

        // Act & Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            service.themSanPham(sp);
        });

        assertEquals("Tên sản phẩm không được trống", exception.getMessage());
    }

    /**
     * Test Case 3: Thêm sản phẩm có số lượng âm
     * Kỹ thuật biên: Giá trị âm không hợp lệ
     */
    @Test
    @DisplayName("Test thêm sản phẩm với số lượng âm")
    public void testThemSanPhamSoLuongAm() {
        // Arrange
        SanPham sp = new SanPham(1, "Laptop", -1, 15000000, "Laptop chơi game");

        // Act & Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            service.themSanPham(sp);
        });

        assertEquals("Số lượng sản phẩm không được âm", exception.getMessage());
    }
}
