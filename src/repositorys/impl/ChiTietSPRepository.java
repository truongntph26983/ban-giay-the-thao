/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.impl;

import domainmodels.ChiTietSP;
import java.util.ArrayList;
import java.util.List;
import repositorys.GiayRepository;
import java.sql.*;
import utilitys.JDBCHelper;

/**
 *
 * @author acer
 */
public class ChiTietSPRepository extends GiayRepository<ChiTietSP, String> {

    String select_by_sql = "SELECT spct.id,spct.ma,spct.ten,NSX.Ten,MauSac.Ten,KhoiLuong.Ten,KichCo.Ten,ChatLieu.Ten,DeGiay.Ten,Dem.Ten,Anh.Ten\n"
            + ",NhanVien.ten,spct.mota,spct.soluongton,spct.gia,spct.maqr,spct.nguoitao,spct.nguoisua,spct.ngaytao,spct.ngaysua,SanPham.Ten\n"
            + "  FROM [dbo].[SanPhamChiTiet] spct \n"
            + "  inner join NSX on spct.idnsx = NSX.id\n"
            + "  inner join MauSac on spct.idmausac = MauSac.id\n"
            + "  inner join KhoiLuong on spct.idkhoiluong = KhoiLuong.id\n"
            + "  inner join KichCo on spct.idkichco = KichCo.id\n"
            + "  inner join ChatLieu on spct.idchatlieu = ChatLieu.id\n"
            + "  inner join DeGiay on spct.iddegiay = DeGiay.id\n"
            + "  inner join Dem on spct.iddem = Dem.id\n"
            + "  inner join Anh on spct.idanh = Anh.id\n"
            + "  inner join NhanVien on spct.idnhanvien = NhanVien.id\n"
            + "  inner join SanPham on spct.idsanpham  = SanPham.id";

    @Override
    public void insert(ChiTietSP entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(ChiTietSP entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(ChiTietSP entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ChiTietSP> getAll() {       
        return selectBySQL(select_by_sql);       
    }

    @Override
    public ChiTietSP selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ChiTietSP> selectBySQL(String sql, Object... args) {
        List<ChiTietSP> chiTietSPs = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                ChiTietSP ctsp = new ChiTietSP();
                ctsp.setId(rs.getString(1));
                ctsp.setMa(rs.getString(2));
                ctsp.setTen(rs.getString(3));
                ctsp.setIdNSX(rs.getString(4));
                ctsp.setIdMauSac(rs.getString(5));
                ctsp.setIdKhoiLuong(rs.getString(6));
                ctsp.setIdSize(rs.getString(7));
                ctsp.setIdChatLieu(rs.getString(8));
                ctsp.setIdDeGiay(rs.getString(9));
                ctsp.setIdDem(rs.getString(10));
                ctsp.setIdAnh(rs.getString(11));
                ctsp.setIdNhanVien(rs.getString(12));
                ctsp.setMoTa(rs.getString(13));
                ctsp.setSoLuongTon(rs.getInt(14));
                ctsp.setGia(rs.getInt(15));
                ctsp.setMaQR(rs.getString(16));
                ctsp.setNgayTao(rs.getString(17));
                ctsp.setNgaySua(rs.getString(18));
                ctsp.setNguoiTao(rs.getString(19));
                ctsp.setNguoiSua(rs.getString(20));
                ctsp.setIdSanPham(rs.getString(21));

                chiTietSPs.add(ctsp);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return chiTietSPs;
    }

}
