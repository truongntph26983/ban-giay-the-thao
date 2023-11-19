/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.impl;

import domainmodels.Size;
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
public class SizeRepository extends GiayRepository<Size, UUID> {

    String select_by_sql = "select * from KichCo";

    @Override
    public void insert(Size entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Size entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Size entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Size> getAll() {
        return selectBySQL(select_by_sql); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Size selectById(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Size> selectBySQL(String sql, Object... args) {
        List<Size> sizes = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                Size szs = new Size();
                szs.setId(rs.getString(1));      
                szs.setMa(rs.getString(3));
                szs.setTen(rs.getString(2));
                sizes.add(szs);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return sizes;
    }

//    public static void main(String[] args) {
//        SizeRepository sz = new SizeRepository();
//        List<Size> sizeRepository = sz.getAll();
//        System.out.println(sizeRepository);
//    }

}
