/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.impl;

import domainmodels.NhanVien;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;
import repositorys.GiayRepository;
import utilitys.JDBCHelper;

/**
 *
 * @author acer
 */
public class NhanVienRepository  extends GiayRepository<NhanVien, String> {

    String select_by_sql = "select * from NhanVien";

    @Override
    public void insert(NhanVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(NhanVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(NhanVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<NhanVien> getAll() {
        return selectBySQL(select_by_sql); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NhanVien selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<NhanVien> selectBySQL(String sql, Object... args) {
        List<NhanVien> nhanViens = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setId(rs.getString(1));
                nv.setMa(rs.getString(2));
                nv.setTen(rs.getString(3));
                nhanViens.add(nv);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return nhanViens;
    }

 
}
