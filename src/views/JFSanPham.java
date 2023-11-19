/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import domainmodels.ChatLieu;
import domainmodels.ChiTietSP;
import domainmodels.DeGiay;
import domainmodels.Dem;
import domainmodels.KhoiLuong;
import domainmodels.MauSac;

import domainmodels.NSX;
import domainmodels.SanPham;
import domainmodels.Size;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import repositorys.GiayRepository;
import repositorys.impl.AnhRepository;
import repositorys.impl.ChatLieuRepository;
import repositorys.impl.ChiTietSPRepository;
import repositorys.impl.DeGiayRepository;
import repositorys.impl.DemRepository;
import repositorys.impl.KhoiLuongRepository;
import repositorys.impl.MauSacRepository;
import repositorys.impl.NhaSanXuatRepository;
import repositorys.impl.NhanVienRepository;
import repositorys.impl.SanPhamRepository;
import repositorys.impl.SizeRepository;

/**
 *
 * @author Admin
 */
public class JFSanPham extends javax.swing.JPanel {

    int index = 0;
    String strHinhAnh = null;
    DefaultTableModel defaultTableModel = new DefaultTableModel();

    private NhaSanXuatRepository nhaSanXuatRepository = new NhaSanXuatRepository();
    private ChiTietSPRepository chiTietSPRepository = new ChiTietSPRepository();

    private GiayRepository ctsp;
    private DefaultTableModel tblModelCTSP = new DefaultTableModel();
    private List<ChiTietSP> listCTSP = new ArrayList<>();

    private javax.swing.table.DefaultTableModel model;

    private ChiTietSPRepository ctspRp = new ChiTietSPRepository();

    private NhaSanXuatRepository nsxr = new NhaSanXuatRepository();
    private KhoiLuongRepository klr = new KhoiLuongRepository();
    private MauSacRepository msr = new MauSacRepository();
    private SizeRepository sizer = new SizeRepository();
    private SanPhamRepository spr = new SanPhamRepository();
    private NhanVienRepository nvr = new NhanVienRepository();
    private DeGiayRepository degiayr = new DeGiayRepository();
    private DemRepository demr = new DemRepository();
    private AnhRepository anhr = new AnhRepository();
    private ChatLieuRepository chatlieur = new ChatLieuRepository();

    private DefaultComboBoxModel cbbModelKhoiLuong = new DefaultComboBoxModel();
    private DefaultComboBoxModel cbbModelMauSac = new DefaultComboBoxModel();
    private DefaultComboBoxModel cbbModelNSX = new DefaultComboBoxModel();
    private DefaultComboBoxModel cbbModelSize = new DefaultComboBoxModel();

    private DefaultComboBoxModel cbbModelSanPham = new DefaultComboBoxModel();
    private DefaultComboBoxModel cbbModelNhanVien = new DefaultComboBoxModel();
    private DefaultComboBoxModel cbbModelDem = new DefaultComboBoxModel();
    private DefaultComboBoxModel cbbModelDeGiay = new DefaultComboBoxModel();
    private DefaultComboBoxModel cbbModelAnh = new DefaultComboBoxModel();
    private DefaultComboBoxModel cbbModelChatLieu = new DefaultComboBoxModel();

    private JPanel childPanel;

    /**
     * Creates new form JFSanPham
     */
    public JFSanPham() {
        initComponents();

        listCTSP = ctspRp.getAll();
        load(listCTSP);

        loadCBBNSX();
        loadCBBKhoiLuong();
        loadCBBMauSac();
        loadCBBSize();
        loadCBBSanPham();
        loadCBBChatLieu();
        loadCBBDeGiay();
        loadCBBDem();

    }

    private void loadCBBKhoiLuong() {
        cbbModelKhoiLuong = (DefaultComboBoxModel) cbbKhoiLuong.getModel();
        cbbModelKhoiLuong.removeAllElements();
        try {
            List<KhoiLuong> khoiLuongs = klr.getAll();
            for (KhoiLuong khoiLuong : khoiLuongs) {
                cbbModelKhoiLuong.addElement(khoiLuong);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu khối lượng");
        }
    }

    private void loadCBBNSX() {
        cbbModelNSX = (DefaultComboBoxModel) cbbNSX.getModel();
        cbbModelNSX.removeAllElements();
        try {
            List<NSX> nsxs = nsxr.getAll();
            for (NSX nsx1 : nsxs) {
                cbbModelNSX.addElement(nsx1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu Nhà Sản Xuất");
        }
    }

    private void loadCBBMauSac() {
        cbbModelMauSac = (DefaultComboBoxModel) cbbMauSac.getModel();
        cbbModelMauSac.removeAllElements();
        try {
            List<MauSac> mauSacs = msr.getAll();
            for (MauSac mauSac : mauSacs) {
                cbbModelMauSac.addElement(mauSac);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu Màu Sắc");
        }
    }

    private void loadCBBSize() {
        cbbModelSize = (DefaultComboBoxModel) cbbSize.getModel();
        cbbModelSize.removeAllElements();
        try {
            List<Size> sizes = sizer.getAll();
            for (Size sz : sizes) {
                cbbModelSize.addElement(sz);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu Size ");
        }
    }

    private void loadCBBSanPham() {
        cbbModelSanPham = (DefaultComboBoxModel) cbbSanPham.getModel();
        cbbModelSanPham.removeAllElements();
        try {
            List<SanPham> sanPhams = spr.getAll();
            for (SanPham sps : sanPhams) {
                cbbModelSanPham.addElement(sps);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu Sản Phẩm");
        }
    }

    private void loadCBBChatLieu() {
        cbbModelChatLieu = (DefaultComboBoxModel) cbbChatLieu.getModel();
        cbbModelChatLieu.removeAllElements();
        try {
            List<ChatLieu> chatlieus = chatlieur.getAll();
            for (ChatLieu cls : chatlieus) {
                cbbModelChatLieu.addElement(cls);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu Chất Liệu");
        }
    }

    private void loadCBBDeGiay() {
        cbbModelDeGiay = (DefaultComboBoxModel) cbbDeGiay.getModel();
        cbbModelDeGiay.removeAllElements();
        try {
            List<DeGiay> deGiays = degiayr.getAll();
            for (DeGiay dgs : deGiays) {
                cbbModelDeGiay.addElement(dgs);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu Đế Giày");
        }
    }

    private void loadCBBDem() {
        cbbModelDem = (DefaultComboBoxModel) cbbDem.getModel();
        cbbModelDem.removeAllElements();
        try {
            List<Dem> dems = demr.getAll();
            for (Dem dem1 : dems) {
                cbbModelDem.addElement(dem1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu Đệm");
        }
    }

    private void load(List<ChiTietSP> ctsp1) {
        tblModelCTSP = (DefaultTableModel) tb_ctsp.getModel();
        tblModelCTSP.setRowCount(0);
        for (ChiTietSP chiTietSP : ctsp1) {
            tblModelCTSP.addRow(chiTietSP.todataRow());
        }
    }


    ChiTietSP getModel() {
        ChiTietSP model = new ChiTietSP();

        NSX nsx = (NSX) this.cbbNSX.getSelectedItem();
        MauSac mauSac = (MauSac) this.cbbMauSac.getSelectedItem();
        KhoiLuong khoiLuong = (KhoiLuong) this.cbbKhoiLuong.getSelectedItem();
        Size size = (Size) this.cbbSize.getSelectedItem();
        SanPham sanPham = (SanPham) this.cbbSanPham.getSelectedItem();
        ChatLieu chatLieu = (ChatLieu) this.cbbChatLieu.getSelectedItem();
        DeGiay deGiay = (DeGiay) this.cbbDeGiay.getSelectedItem();
        Dem dem = (Dem) this.cbbDem.getSelectedItem();

        model.setMa(txtMa.getText());
        model.setTen(txtTen.getText());
        model.setIdNSX(nsx.getId());
        model.setIdMauSac(mauSac.getId());
        model.setIdKhoiLuong(khoiLuong.getId());
        model.setIdSize(size.getId());
        model.setIdSanPham(sanPham.getId());
        model.setIdChatLieu(chatLieu.getId());
        model.setIdDeGiay(deGiay.getId());
        model.setIdDem(dem.getId());
        model.setSoLuongTon(Integer.valueOf(txtSoLuongTon.getText()));
        model.setGia(Integer.valueOf(txtGia.getText()));
        model.setMoTa(txtMoTa.getText());

        return model;

    }

    void insert() {
        ChiTietSP chiTietSP = getModel();
        try {
            chiTietSPRepository.insert(chiTietSP);
            JOptionPane.showMessageDialog(this, "thêm thanh cong");
            listCTSP = ctspRp.getAll();
            load(listCTSP);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "thêm thất bại");
        }
    }

    void update() {
        ChiTietSP chiTietSP = getModel();
        try {
            chiTietSPRepository.update(chiTietSP);
            JOptionPane.showMessageDialog(this, "sửa thanh cong");
            listCTSP = ctspRp.getAll();
            load(listCTSP);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "sửa thất bại");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtMa = new javax.swing.JTextField();
        txtSoLuongTon = new javax.swing.JTextField();
        cbbNSX = new javax.swing.JComboBox<>();
        txtGia = new javax.swing.JTextField();
        cbbKhoiLuong = new javax.swing.JComboBox<>();
        cbbSanPham = new javax.swing.JComboBox<>();
        cbbSize = new javax.swing.JComboBox<>();
        cbbMauSac = new javax.swing.JComboBox<>();
        cbbChatLieu = new javax.swing.JComboBox<>();
        cbbDeGiay = new javax.swing.JComboBox<>();
        cbbDem = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_ctsp = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnADD = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        jLabel1.setText("Tìm Kiếm");

        jLabel3.setText("Tên");

        jLabel4.setText("Mã");

        jLabel5.setText("NSX");

        jLabel6.setText("Màu Sắc");

        jLabel7.setText("Khối Lượng");

        jLabel8.setText("Sản Phẩm");

        jLabel9.setText("Size");

        jLabel10.setText("Chất Liệu");

        jLabel11.setText("Đế Giày");

        jLabel12.setText("Đệm");

        jLabel13.setText("Giá");

        jLabel14.setText("Số Lượng Tồn");

        jLabel15.setText("Mô Tả");

        txtMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaActionPerformed(evt);
            }
        });

        cbbKhoiLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbKhoiLuongActionPerformed(evt);
            }
        });

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane1.setViewportView(txtMoTa);

        tb_ctsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "NSX", "Màu Sắc", "Khối Lượng", "Size", "Chất Liệu", "Đế Giày", "Đệm", "Mô Tả", "Số Lượng Tồn", "Giá", "Sản Phẩm"
            }
        ));
        tb_ctsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ctspMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_ctsp);

        jButton1.setText("CTSP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        btnADD.setText("ADD");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });

        jButton4.setText("Sửa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Delete");

        jRadioButton3.setText("Sản Phẩm Hoạt Động");

        jRadioButton4.setText("Sản Phẩm Ngừng Hoạt Động");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnADD)
                                .addGap(29, 29, 29)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cbbNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(txtTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(cbbSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cbbMauSac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbbSize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbbKhoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addGap(26, 26, 26)
                                .addComponent(jRadioButton4))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbbChatLieu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbbDeGiay, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbbDem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSoLuongTon)
                                .addComponent(txtGia)
                                .addComponent(jScrollPane1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(cbbChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(cbbDeGiay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbbNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(cbbDem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtSoLuongTon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel14))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbKhoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel13))
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbbSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(btnADD)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tb_ctspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ctspMouseClicked
        int row = tb_ctsp.getSelectedRow();
        ChiTietSP ctsp1 = listCTSP.get(row);
        txtTen.setText(ctsp1.getTen());
        txtMa.setText(ctsp1.getMa());
        cbbNSX.setSelectedItem(ctsp1.getIdNSX());
        txtMoTa.setText((ctsp1.getMoTa()));
//        txtSoLuongTon.setText(ctsp1.);
    }//GEN-LAST:event_tb_ctspMouseClicked

    private void cbbKhoiLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbKhoiLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbKhoiLuongActionPerformed

    private void txtMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaActionPerformed

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        insert();
    }//GEN-LAST:event_btnADDActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        update();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADD;
    private javax.swing.JComboBox<String> cbbChatLieu;
    private javax.swing.JComboBox<String> cbbDeGiay;
    private javax.swing.JComboBox<String> cbbDem;
    private javax.swing.JComboBox<String> cbbKhoiLuong;
    private javax.swing.JComboBox<String> cbbMauSac;
    private javax.swing.JComboBox<String> cbbNSX;
    private javax.swing.JComboBox<String> cbbSanPham;
    private javax.swing.JComboBox<String> cbbSize;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tb_ctsp;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtSoLuongTon;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    private void showTable(List<ChiTietSP> listCTSP) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
