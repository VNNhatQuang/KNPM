/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_Hoa_Don;

import java.util.Date;

/**
 *
 * @author quang
 */
public class HoaDon extends ChiTietHoaDon {
    private String maHoaDon;
    private String maKH;
    private String maNV;
    private Date ngayLapHoaDon;
    private double tongTien;
    

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String maKH, String maNV, Date ngayLapHoaDon, double tongTien) {
        this.maHoaDon = maHoaDon;
        this.maKH = maKH;
        this.maNV = maNV;
        this.ngayLapHoaDon = ngayLapHoaDon;
        this.tongTien = tongTien;
    }

    public HoaDon(String maHoaDon, String maKH, String maNV, Date ngayLapHoaDon, double tongTien, String maSP, int soLuong, double donGia, double thanhTien) {
        super(maSP, soLuong, donGia, thanhTien);
        this.maHoaDon = maHoaDon;
        this.maKH = maKH;
        this.maNV = maNV;
        this.ngayLapHoaDon = ngayLapHoaDon;
        this.tongTien = tongTien;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }

    public void setNgayLapHoaDon(Date ngayLapHoaDon) {
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHoaDon=" + maHoaDon + ", maKH=" + maKH + ", maNV=" + maNV + ", ngayLapHoaDon=" + ngayLapHoaDon + ", tongTien=" + tongTien + ", maSP=" + this.getMaSP() + ", soLuong=" + this.getSoLuong() + ", donGia=" + this.getDonGia() + ", thanhTien=" + this.getThanhTien() + '}';
    }

    
}
