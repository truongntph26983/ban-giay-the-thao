/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.impl;

import domainmodels.NSX;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;
import repositorys.GiayRepository;
import utilitys.JDBCHelper;
import java.sql.*;

/**
 *
 * @author acer
 */
public class NhaSanXuatRepository extends GiayRepository<NSX, UUID> {

    String insert_sql = "INSERT INTO NSX (Ten, Ma, TrangThai) VALUES (?,?,?)";
    String select_all_sql = "SELECT * FROM NSX";

    @Override
    public void insert(NSX entity) {
         JDBCHelper.update(insert_sql,entity.getTen(),entity.getMa(),entity.getTrangThai());
    }

    @Override
    public void update(NSX entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(NSX entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<NSX> getAll() {
        return selectBySQL(select_all_sql);
    }

    @Override
    public NSX selectById(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<NSX> selectBySQL(String sql, Object... args) {
        List<NSX> nxs1 = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                NSX nsx = new NSX();
                nsx.setId(rs.getString(1));
                nsx.setMa(rs.getString(2));
                nsx.setTen(rs.getString(3));
                nxs1.add(nsx);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return nxs1;
    }

}
