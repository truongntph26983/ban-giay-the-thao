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
public class HoaDonChiTiet {
    private UUID Id;
    private UUID IdSanPhamChiTiet;
    private UUID IdHoaDon;
    private int SoLuong;
    private Double DonGia;
    private Date NgayTao;
    private Date NgaySua;
    private String NguoiTao;
    private String NguoiSua;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(UUID Id, UUID IdSanPhamChiTiet, UUID IdHoaDon, int SoLuong, Double DonGia, Date NgayTao, Date NgaySua, String NguoiTao, String NguoiSua) {
        this.Id = Id;
        this.IdSanPhamChiTiet = IdSanPhamChiTiet;
        this.IdHoaDon = IdHoaDon;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.NguoiTao = NguoiTao;
        this.NguoiSua = NguoiSua;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID Id) {
        this.Id = Id;
    }

    public UUID getIdSanPhamChiTiet() {
        return IdSanPhamChiTiet;
    }

    public void setIdSanPhamChiTiet(UUID IdSanPhamChiTiet) {
        this.IdSanPhamChiTiet = IdSanPhamChiTiet;
    }

    public UUID getIdHoaDon() {
        return IdHoaDon;
    }

    public void setIdHoaDon(UUID IdHoaDon) {
        this.IdHoaDon = IdHoaDon;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
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
    
    
}
