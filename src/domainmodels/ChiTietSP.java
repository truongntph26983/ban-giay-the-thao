/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodels;

import java.awt.Image;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author acer
 */
public class ChiTietSP {

    private String id;
    private String ma;
    private String ten;
    private String idNSX;
    private String idMauSac;
    private String idKhoiLuong;
    private String idSize;
    private String idChatLieu;
    private String idDeGiay;
    private String idDem;
    private String idAnh;
    private String idNhanVien;
    private String moTa;
    private Integer soLuongTon;
    private Integer gia;
    private String maQR;
    private String nguoiTao;
    private String nguoiSua;
    private String ngayTao;
    private String ngaySua;
    private String idSanPham;
    private Integer idkhuyenMai;

    public Object[] todataRow() {
        return new Object[]{id, ma, ten, idNSX, idMauSac, idKhoiLuong, idSize, idChatLieu, idDeGiay,
            idDem, idAnh, idNhanVien, moTa, soLuongTon, gia, maQR, nguoiTao, nguoiSua, ngayTao, ngaySua, idSanPham};
    }

    public ChiTietSP() {
    }

    public ChiTietSP(String id, String ma, String ten, String idNSX, String idMauSac, String idKhoiLuong, String idSize, String idChatLieu, 
            String idDeGiay, String idDem, String idAnh, Integer idkhuyenMai, String idNhanVien, String moTa, Integer soLuongTon, Integer gia, 
            String maQR,String ngayTao, String ngaySua,  String nguoiTao, String nguoiSua, String idSanPham) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.idNSX = idNSX;
        this.idMauSac = idMauSac;
        this.idKhoiLuong = idKhoiLuong;
        this.idSize = idSize;
        this.idChatLieu = idChatLieu;
        this.idDeGiay = idDeGiay;
        this.idDem = idDem;
        this.idAnh = idAnh;
        this.idkhuyenMai = idkhuyenMai;
        this.idNhanVien = idNhanVien;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.gia = gia;
        this.maQR = maQR;
        this.nguoiTao = nguoiTao;
        this.nguoiSua = nguoiSua;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.idSanPham = idSanPham;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getIdNSX() {
        return idNSX;
    }

    public void setIdNSX(String idNSX) {
        this.idNSX = idNSX;
    }

    public String getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(String idMauSac) {
        this.idMauSac = idMauSac;
    }

    public String getIdKhoiLuong() {
        return idKhoiLuong;
    }

    public void setIdKhoiLuong(String idKhoiLuong) {
        this.idKhoiLuong = idKhoiLuong;
    }

    public String getIdSize() {
        return idSize;
    }

    public void setIdSize(String idSize) {
        this.idSize = idSize;
    }

    public String getIdChatLieu() {
        return idChatLieu;
    }

    public void setIdChatLieu(String idChatLieu) {
        this.idChatLieu = idChatLieu;
    }

    public String getIdDeGiay() {
        return idDeGiay;
    }

    public void setIdDeGiay(String idDeGiay) {
        this.idDeGiay = idDeGiay;
    }

    public String getIdDem() {
        return idDem;
    }

    public void setIdDem(String idDem) {
        this.idDem = idDem;
    }

    public String getIdAnh() {
        return idAnh;
    }

    public void setIdAnh(String idAnh) {
        this.idAnh = idAnh;
    }

    public Integer getIdkhuyenMai() {
        return idkhuyenMai;
    }

    public void setIdkhuyenMai(Integer idkhuyenMai) {
        this.idkhuyenMai = idkhuyenMai;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public String getMaQR() {
        return maQR;
    }

    public void setMaQR(String maQR) {
        this.maQR = maQR;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public String getNguoiSua() {
        return nguoiSua;
    }

    public void setNguoiSua(String nguoiSua) {
        this.nguoiSua = nguoiSua;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(String ngaySua) {
        this.ngaySua = ngaySua;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

}
