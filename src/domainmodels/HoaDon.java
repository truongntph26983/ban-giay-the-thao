/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodels;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public class HoaDon {
    private UUID Id;
    private UUID IdKhachHang;
    private UUID IdNhanVien;
    private UUID IdLichSuHoaDon;
    private UUID IdHoaDonChiTiet;
    private UUID IdThanhToan;
    private UUID IdVoucher;
    private String Ma;
    private int HinhThuc;
    private Double TongTien;
    private Double TienShip;
    private Date NgayTao;
    private Date NgaySua;
    private String NguoiTao;
    private String NguoiSua;
    private int TrangThai;
    private String TenNguoiDat;
    private String SDTNguoiDat;
    private String TenNguoiNhan;
    private String SDTNguoiNhan;
    private String DiaChiNhan;
    private Date NgayDatHang;
    private Date NgayNhanHang;

    public HoaDon() {
    }

    public HoaDon(UUID Id, UUID IdKhachHang, UUID IdNhanVien, UUID IdLichSuHoaDon, UUID IdHoaDonChiTiet, UUID IdThanhToan, UUID IdVoucher, String Ma, int HinhThuc, Double TongTien, Double TienShip, Date NgayTao, Date NgaySua, String NguoiTao, String NguoiSua, int TrangThai, String TenNguoiDat, String SDTNguoiDat, String TenNguoiNhan, String SDTNguoiNhan, String DiaChiNhan, Date NgayDatHang, Date NgayNhanHang) {
        this.Id = Id;
        this.IdKhachHang = IdKhachHang;
        this.IdNhanVien = IdNhanVien;
        this.IdLichSuHoaDon = IdLichSuHoaDon;
        this.IdHoaDonChiTiet = IdHoaDonChiTiet;
        this.IdThanhToan = IdThanhToan;
        this.IdVoucher = IdVoucher;
        this.Ma = Ma;
        this.HinhThuc = HinhThuc;
        this.TongTien = TongTien;
        this.TienShip = TienShip;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.NguoiTao = NguoiTao;
        this.NguoiSua = NguoiSua;
        this.TrangThai = TrangThai;
        this.TenNguoiDat = TenNguoiDat;
        this.SDTNguoiDat = SDTNguoiDat;
        this.TenNguoiNhan = TenNguoiNhan;
        this.SDTNguoiNhan = SDTNguoiNhan;
        this.DiaChiNhan = DiaChiNhan;
        this.NgayDatHang = NgayDatHang;
        this.NgayNhanHang = NgayNhanHang;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID Id) {
        this.Id = Id;
    }

    public UUID getIdKhachHang() {
        return IdKhachHang;
    }

    public void setIdKhachHang(UUID IdKhachHang) {
        this.IdKhachHang = IdKhachHang;
    }

    public UUID getIdNhanVien() {
        return IdNhanVien;
    }

    public void setIdNhanVien(UUID IdNhanVien) {
        this.IdNhanVien = IdNhanVien;
    }

    public UUID getIdLichSuHoaDon() {
        return IdLichSuHoaDon;
    }

    public void setIdLichSuHoaDon(UUID IdLichSuHoaDon) {
        this.IdLichSuHoaDon = IdLichSuHoaDon;
    }

    public UUID getIdHoaDonChiTiet() {
        return IdHoaDonChiTiet;
    }

    public void setIdHoaDonChiTiet(UUID IdHoaDonChiTiet) {
        this.IdHoaDonChiTiet = IdHoaDonChiTiet;
    }

    public UUID getIdThanhToan() {
        return IdThanhToan;
    }

    public void setIdThanhToan(UUID IdThanhToan) {
        this.IdThanhToan = IdThanhToan;
    }

    public UUID getIdVoucher() {
        return IdVoucher;
    }

    public void setIdVoucher(UUID IdVoucher) {
        this.IdVoucher = IdVoucher;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public int getHinhThuc() {
        return HinhThuc;
    }

    public void setHinhThuc(int HinhThuc) {
        this.HinhThuc = HinhThuc;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }

    public Double getTienShip() {
        return TienShip;
    }

    public void setTienShip(Double TienShip) {
        this.TienShip = TienShip;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Date getNgaySua() {
        return NgaySua;
    }

    public void setNgaySua(Date NgaySua) {
        this.NgaySua = NgaySua;
    }

    public String getNguoiTao() {
        return NguoiTao;
    }

    public void setNguoiTao(String NguoiTao) {
        this.NguoiTao = NguoiTao;
    }

    public String getNguoiSua() {
        return NguoiSua;
    }

    public void setNguoiSua(String NguoiSua) {
        this.NguoiSua = NguoiSua;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getTenNguoiDat() {
        return TenNguoiDat;
    }

    public void setTenNguoiDat(String TenNguoiDat) {
        this.TenNguoiDat = TenNguoiDat;
    }

    public String getSDTNguoiDat() {
        return SDTNguoiDat;
    }

    public void setSDTNguoiDat(String SDTNguoiDat) {
        this.SDTNguoiDat = SDTNguoiDat;
    }

    public String getTenNguoiNhan() {
        return TenNguoiNhan;
    }

    public void setTenNguoiNhan(String TenNguoiNhan) {
        this.TenNguoiNhan = TenNguoiNhan;
    }

    public String getSDTNguoiNhan() {
        return SDTNguoiNhan;
    }

    public void setSDTNguoiNhan(String SDTNguoiNhan) {
        this.SDTNguoiNhan = SDTNguoiNhan;
    }

    public String getDiaChiNhan() {
        return DiaChiNhan;
    }

    public void setDiaChiNhan(String DiaChiNhan) {
        this.DiaChiNhan = DiaChiNhan;
    }

    public Date getNgayDatHang() {
        return NgayDatHang;
    }

    public void setNgayDatHang(Date NgayDatHang) {
        this.NgayDatHang = NgayDatHang;
    }

    public Date getNgayNhanHang() {
        return NgayNhanHang;
    }

    public void setNgayNhanHang(Date NgayNhanHang) {
        this.NgayNhanHang = NgayNhanHang;
    }
         
    
}
