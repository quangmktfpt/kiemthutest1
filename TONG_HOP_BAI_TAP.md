# TÓM TẮT BÀI TẬP HOÀN THÀNH

## ✅ PHẦN 1: Viết unit test cho hàm đếm số chẵn (3 Điểm)

### File: `CountNumbers.java`
- Hàm `countEvenNumbers(int[] numbers)` - Đếm số lượng phần tử chẵn trong mảng

### File: `CountNumbersTest.java`
**4 Unit Test Cases (đúng yêu cầu):**

1. **Test mảng bình thường** (Phân vùng tương đương)
   - Input: {1, 2, 3, 4, 5, 6}
   - Expected: 3 (các số 2, 4, 6)

2. **Test mảng toàn số chẵn** (Phân vùng tương đương)
   - Input: {2, 4, 6, 8, 10}
   - Expected: 5

3. **Test mảng toàn số lẻ** (Phân vùng tương đương)
   - Input: {1, 3, 5, 7, 9}
   - Expected: 0

4. **Test mảng rỗng** (Kỹ thuật biên)
   - Input: []
   - Expected: 0

**Kết quả: ✅ 4/4 test PASSED**

**Kỹ thuật sử dụng:**
- ✅ Phân vùng tương đương: Mảng bình thường, toàn chẵn, toàn lẻ
- ✅ Kỹ thuật biên: Mảng rỗng

---

## ✅ PHẦN 2: Viết unit test cho SanPhamService (3 Điểm)

### File: `SanPham.java`
- Thuộc tính: idSP, ten, soLuong, donGia, moTa
- Constructor đầy đủ + Getters/Setters
- Implement equals(), hashCode(), toString()

### File: `SanPhamService.java`
**Các hàm:**
1. `themSanPham(SanPham)` - Thêm mới sản phẩm với validation
2. `suaSanPham(int, SanPham)` - Sửa thông tin sản phẩm
3. `timSanPhamTheoID(int)` - Tìm sản phẩm theo ID
4. `getDanhSachSanPham()` - Lấy danh sách

### File: `SanPhamServiceTest.java`
**3 Unit Test Cases (đúng yêu cầu):**

1. **Test thêm sản phẩm hợp lệ** ✅
   - Phân vùng tương đương: Dữ liệu đầy đủ
   - Tên, mô tả không trống, số lượng/giá >= 0

2. **Test tên sản phẩm trống** ❌
   - Validate: Tên sản phẩm không được để trống
   - Expected: Ném IllegalArgumentException

3. **Test số lượng sản phẩm âm** ❌
   - Kỹ thuật biên: Giá trị âm không hợp lệ
   - Expected: Ném IllegalArgumentException

**Kết quả: ✅ 3/3 test PASSED**

**Kỹ thuật sử dụng:**
- ✅ Phân vùng tương đương: Dữ liệu hợp lệ
- ✅ Kỹ thuật biên: Giá trị âm
- ✅ Validation testing: Các trường không được trống

---

## 📊 TỔNG KẾT

| Chức năng | Yêu cầu | Hoàn thành |
|-----------|---------|-----------|
| Phần 1: Unit test hàm đếm chẵn | 3 Điểm (4 test) | ✅ 4 test PASSED |
| Phần 2: Class SanPham + Service | 1 Điểm | ✅ Hoàn thành |
| Phần 2: Unit test thêm mới + Validation | 3 Điểm (3 test) | ✅ 3 test PASSED |
| **TỔNG CỘNG** | **7 Điểm** | **✅ HOÀN THÀNH** |

---

## 📁 CẤU TRÚC FILE

```
src/main/java/org/example/
├── CountNumbers.java          (Hàm đếm chẵn)
├── SanPham.java               (Model sản phẩm)
└── SanPhamService.java        (Service quản lý sản phẩm)

src/test/java/org/example/
├── CountNumbersTest.java      (4 test cases)
└── SanPhamServiceTest.java    (3 test cases)
```

---

**🎉 TẤT CẢ TEST ĐỀU PASS - SẢN PHẨM HOÀN THÀNH!**

