/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.impl;

import domainmodels.KhoiLuong;
import domainmodels.MauSac;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import repositorys.GiayRepository;
import utilitys.JDBCHelper;

/**
 *
 * @author acer
 */
public class KhoiLuongRepository extends GiayRepository<KhoiLuong, UUID> {

    String select_by_sql = "select * from KhoiLuong";

    @Override
    public void insert(KhoiLuong entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(KhoiLuong entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(KhoiLuong entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<KhoiLuong> getAll() {
        return selectBySQL(select_by_sql);
    }

    @Override
    public KhoiLuong selectById(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<KhoiLuong> selectBySQL(String sql, Object... args) {
        List<KhoiLuong> khoiLuongs = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                KhoiLuong kl = new KhoiLuong();
                kl.setId(rs.getString(1));
                kl.setMa(rs.getString(2));
                kl.setTen(rs.getString(3));            
                khoiLuongs.add(kl);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return khoiLuongs;
    }

}
