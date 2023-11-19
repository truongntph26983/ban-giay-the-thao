/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.impl;

import domainmodels.ChatLieu;
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
public class ChatLieuRepository extends GiayRepository<ChatLieu, UUID> {

    String select_by_sql = "select * from ChatLieu";

    @Override
    public void insert(ChatLieu entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(ChatLieu entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(ChatLieu entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ChatLieu> getAll() {
        return selectBySQL(select_by_sql); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ChatLieu selectById(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ChatLieu> selectBySQL(String sql, Object... args) {
        List<ChatLieu> chatLieus = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                ChatLieu cl = new ChatLieu();
//                cl.setId(rs.getString(1));
                cl.setMa(rs.getString(3));
                cl.setTen(rs.getString(2));
                chatLieus.add(cl);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return chatLieus;
    }

}
