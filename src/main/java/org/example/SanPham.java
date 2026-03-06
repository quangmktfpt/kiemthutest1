package org.example;

import java.util.Objects;

/**
 * Lớp đại diện cho một sản phẩm
 */
public class SanPham {

    private int idSP;
    private String ten;
    private int soLuong;
    private double donGia;
    private String moTa;

    // Constructor không tham số
    public SanPham() {
    }

    // Constructor đầy đủ
    public SanPham(int idSP, String ten, int soLuong, double donGia, String moTa) {
        this.idSP = idSP;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.moTa = moTa;
    }

    // Getters
    public int getIdSP() {
        return idSP;
    }

    public String getTen() {
        return ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    // Setters
    public void setIdSP(int idSP) {
        this.idSP = idSP;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SanPham sanPham = (SanPham) o;
        return idSP == sanPham.idSP &&
                soLuong == sanPham.soLuong &&
                Double.compare(sanPham.donGia, donGia) == 0 &&
                Objects.equals(ten, sanPham.ten) &&
                Objects.equals(moTa, sanPham.moTa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSP, ten, soLuong, donGia, moTa);
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "idSP=" + idSP +
                ", ten='" + ten + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}

