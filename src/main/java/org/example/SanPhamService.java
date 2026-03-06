package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Lớp Service quản lý các sản phẩm
 */
public class SanPhamService {

    private List<SanPham> sanPhams;

    public SanPhamService() {
        this.sanPhams = new ArrayList<>();
    }

    /**
     * Thêm mới một sản phẩm
     * @param sanPham sản phẩm cần thêm
     * @return true nếu thêm thành công, false nếu thất bại
     * @throws IllegalArgumentException nếu các trường bắt buộc trống
     */
    public boolean themSanPham(SanPham sanPham) throws IllegalArgumentException {
        // Validate các trường không được trống
        if (sanPham == null) {
            throw new IllegalArgumentException("Sản phẩm không được null");
        }

        if (sanPham.getTen() == null || sanPham.getTen().trim().isEmpty()) {
            throw new IllegalArgumentException("Tên sản phẩm không được trống");
        }

        if (sanPham.getMoTa() == null || sanPham.getMoTa().trim().isEmpty()) {
            throw new IllegalArgumentException("Mô tả sản phẩm không được trống");
        }

        if (sanPham.getSoLuong() < 0) {
            throw new IllegalArgumentException("Số lượng sản phẩm không được âm");
        }

        if (sanPham.getDonGia() < 0) {
            throw new IllegalArgumentException("Đơn giá sản phẩm không được âm");
        }

        return sanPhams.add(sanPham);
    }

    /**
     * Sửa thông tin một sản phẩm
     * @param idSP ID của sản phẩm cần sửa
     * @param sanPhamMoi sản phẩm với thông tin mới
     * @return true nếu sửa thành công, false nếu không tìm thấy
     */
    public boolean suaSanPham(int idSP, SanPham sanPhamMoi) {
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getIdSP() == idSP) {
                sanPhams.set(i, sanPhamMoi);
                return true;
            }
        }
        return false;
    }

    /**
     * Lấy danh sách tất cả sản phẩm
     * @return danh sách sản phẩm
     */
    public List<SanPham> getDanhSachSanPham() {
        return new ArrayList<>(sanPhams);
    }

    /**
     * Tìm sản phẩm theo ID
     * @param idSP ID cần tìm
     * @return sản phẩm nếu tìm thấy, null nếu không
     */
    public SanPham timSanPhamTheoID(int idSP) {
        for (SanPham sp : sanPhams) {
            if (sp.getIdSP() == idSP) {
                return sp;
            }
        }
        return null;
    }
}

