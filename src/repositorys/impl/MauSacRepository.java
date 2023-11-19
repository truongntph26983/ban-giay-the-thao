/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.impl;

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
public class MauSacRepository extends GiayRepository<MauSac, UUID> {

    String select_by_sql = "select * from MauSac";
        String select_all_sql = "INSERT INTO NSX (Ten, Ma) VALUES (?,?)";


    @Override
    public void insert(MauSac entity) {
         JDBCHelper.update(select_by_sql,entity.getTen(),entity.getMa());
    }

    @Override
    public void update(MauSac entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(MauSac entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<MauSac> getAll() {
        return selectBySQL(select_by_sql); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MauSac selectById(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<MauSac> selectBySQL(String sql, Object... args) {
        List<MauSac> mauSacs = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                MauSac ms = new MauSac();
                ms.setId(rs.getString(1));
                ms.setMa(rs.getString(2));
                ms.setTen(rs.getString(3));
                mauSacs.add(ms);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return mauSacs;
    }

}
