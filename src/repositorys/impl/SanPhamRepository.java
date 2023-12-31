/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.impl;

import domainmodels.MauSac;
import domainmodels.SanPham;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

import java.util.List;
import java.util.UUID;
import repositorys.GiayRepository;
import utilitys.JDBCHelper;

/**
 *
 * @author acer
 */
public class SanPhamRepository extends GiayRepository<SanPham, UUID> {

    String select_by_sql = "select * from SanPham";

    @Override
    public void insert(SanPham entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(SanPham entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(SanPham entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<SanPham> getAll() {
        return selectBySQL(select_by_sql); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SanPham selectById(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<SanPham> selectBySQL(String sql, Object... args) {
        List<SanPham> sanPhams = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                SanPham sp = new SanPham();
//                sp.setId(rs.getString(1));
                sp.setMa(rs.getString(2));
                sp.setTen(rs.getString(3));
                sanPhams.add(sp);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return sanPhams;
    }

}
