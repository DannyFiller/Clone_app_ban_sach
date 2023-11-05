package com.example.app_ban_sach.Models;

public class HoaDon {
    private String HoaDon;
    private String maKhachHang;
    private String tenKhachHang;
    private double thanhTien;
    private String ngayThanhToan;

    public HoaDon(){}

    public HoaDon(String hoaDon, String maKhachHang, String tenKhachHang, double thanhTien, String ngayThanhToan) {
        HoaDon = hoaDon;
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.thanhTien = thanhTien;
        this.ngayThanhToan = ngayThanhToan;
    }

    public String getHoaDon() {
        return HoaDon;
    }

    public void setHoaDon(String hoaDon) {
        HoaDon = hoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }
}
