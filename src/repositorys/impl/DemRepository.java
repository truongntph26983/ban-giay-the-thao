/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.impl;

import domainmodels.Dem;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import repositorys.GiayRepository;
import utilitys.JDBCHelper;

/**
 *
 * @author acer
 */
public class DemRepository extends GiayRepository<Dem, String> {

    String select_by_sql = "select * from Dem";

    @Override
    public void insert(Dem entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Dem entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Dem entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Dem> getAll() {
        return selectBySQL(select_by_sql); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Dem selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//    @Override
//    public List<Dem> selectBySQL(String sql, Object... args) {
//        List<Dem> dems = new ArrayList<>();
//        try {
//            ResultSet rs = JDBCHelper.query(sql, args);
//            while (rs.next()) {
//                Dem dem = new Dem();
//                dem.setId(rs.getString(1));
//                dem.setMa(rs.getString(2));
//                dem.setTen(rs.getString(3));
//                dems.add(dem);
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return dems;
//    }

    @Override
    public List<Dem> selectBySQL(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }
}


