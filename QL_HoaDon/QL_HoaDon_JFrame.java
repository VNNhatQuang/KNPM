/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QL_HoaDon;

import java.text.SimpleDateFormat;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author quang
 */
public class QL_HoaDon_JFrame extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public QL_HoaDon_JFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        PnThemHD = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNgayLapHD = new com.toedter.calendar.JDateChooser();
        btnClearAll = new javax.swing.JButton();
        txtMaHD = new javax.swing.JTextField();
        txtMaSP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnThemHD = new javax.swing.JButton();
        txtTenKH = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnThemSP = new javax.swing.JButton();
        txtTenNV = new javax.swing.JTextField();
        PnTimKiemHD = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý Hóa đơn");

        jTabbedPane.setToolTipText("");

        jLabel8.setText("Tổng Tiền :");

        jLabel9.setText("Ngày lập đơn hàng :");

        txtTongTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTongTien.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel2.setText("Mã Hóa đơn :");

        txtNgayLapHD.setDateFormatString("dd-MM-yyyy");

        btnClearAll.setText("Clear All");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });

        txtMaHD.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMaHD.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtMaSP.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMaSP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSPActionPerformed(evt);
            }
        });

        jLabel3.setText("Tên Khách hàng :");

        txtDonGia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDonGia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel4.setText("Nhân viên bán hàng :");

        txtSoLuong.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSoLuong.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });

        jLabel5.setText("Mã SP :");

        txtTenSP.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTenSP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel6.setText("Tên SP :");

        btnThemHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemHD.setText("Thêm Hóa Đơn");
        btnThemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHDActionPerformed(evt);
            }
        });

        txtTenKH.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTenKH.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Số Lượng", "Đơn Giá", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSanPham);

        jLabel7.setText("Số lượng :");

        jLabel10.setText("Đơn giá :");

        btnThemSP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemSP.setText("Thêm Sản Phẩm");
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        txtTenNV.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTenNV.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout PnThemHDLayout = new javax.swing.GroupLayout(PnThemHD);
        PnThemHD.setLayout(PnThemHDLayout);
        PnThemHDLayout.setHorizontalGroup(
            PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnThemHDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnThemHDLayout.createSequentialGroup()
                        .addComponent(btnClearAll)
                        .addGap(18, 18, 18)
                        .addComponent(btnThemHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnThemHDLayout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                    .addGroup(PnThemHDLayout.createSequentialGroup()
                        .addGroup(PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnThemHDLayout.createSequentialGroup()
                                .addGroup(PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5)
                                .addGroup(PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaHD)
                                    .addComponent(txtTenKH)))
                            .addGroup(PnThemHDLayout.createSequentialGroup()
                                .addGroup(PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNgayLapHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTenNV))))
                        .addGap(27, 27, 27)
                        .addGroup(PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnThemHDLayout.createSequentialGroup()
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDonGia))
                            .addComponent(txtTenSP)
                            .addComponent(txtMaSP))))
                .addContainerGap())
        );
        PnThemHDLayout.setVerticalGroup(
            PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnThemHDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTenKH)
                        .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenNV)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSoLuong)
                        .addComponent(jLabel10)
                        .addComponent(jLabel7))
                    .addComponent(txtDonGia, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNgayLapHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClearAll))
                    .addComponent(btnThemSP))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        PnThemHDLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDonGia, txtMaHD, txtMaSP, txtNgayLapHD, txtSoLuong, txtTenKH, txtTenNV, txtTenSP});

        jTabbedPane.addTab("Thêm Hóa Đơn", PnThemHD);

        btnClear.setText("Clear All");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông tin Hóa Đơn");

        txtSearch.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setText("🔎"); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtResult.setColumns(20);
        txtResult.setRows(5);
        jScrollPane1.setViewportView(txtResult);

        javax.swing.GroupLayout PnTimKiemHDLayout = new javax.swing.GroupLayout(PnTimKiemHD);
        PnTimKiemHD.setLayout(PnTimKiemHDLayout);
        PnTimKiemHDLayout.setHorizontalGroup(
            PnTimKiemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnTimKiemHDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnTimKiemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnTimKiemHDLayout.createSequentialGroup()
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                        .addGap(63, 63, 63))
                    .addGroup(PnTimKiemHDLayout.createSequentialGroup()
                        .addComponent(txtSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PnTimKiemHDLayout.setVerticalGroup(
            PnTimKiemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnTimKiemHDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnTimKiemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnTimKiemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Tìm kiếm Hóa Đơn", PnTimKiemHD);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtResult.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int fin=0;
        double tongTien=0;
        try {
            FileInputStream fileInt = new FileInputStream("./src/QL_HoaDon/CSDL_HĐ/MHĐ_" + txtSearch.getText() + ".data");
            ObjectInputStream intput = new ObjectInputStream(fileInt);
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

            String maHD = intput.readObject().toString();
            String tenKH = intput.readObject().toString();
            String tenNV = intput.readObject().toString();
            Date ngayLapHD = (Date) intput.readObject();
            txtResult.append("Mã HĐ: " + maHD + "\nTên KH: " + tenKH + "\nTên NV bán hàng: " + tenNV + "\nNgày lập HĐ: " + df.format(ngayLapHD));

            txtResult.append("\n\nCác Sản phẩm đã mua :");
            for(int i=0; i<100; i++) {
                int stt = Integer.parseInt(intput.readObject().toString());
                String maSP = intput.readObject().toString();
                String tenSP = intput.readObject().toString();
                int soLuong = Integer.parseInt(intput.readObject().toString());
                double donGia = Double.parseDouble(intput.readObject().toString());
                double thanhTien = Double.parseDouble(intput.readObject().toString());
                txtResult.append("\n\tSTT: " + stt + "\n\tMã SP: " + maSP + "\n\tTên SP: " + tenSP + "\n\tSố lượng: " + soLuong + "\n\tĐơn giá: " + donGia + " VND / cái" + "\n\tThành tiền: " + thanhTien + " VND\n\t----------");
                tongTien+=thanhTien;
            }

            fileInt.close();
            intput.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Không tìm thấy Hóa đơn");
            fin++;
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(QL_HoaDon_JFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(fin==0) {
                txtResult.append("\nTổng tiền: " + tongTien + " VND");
                txtResult.append("\n\n////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n\n");
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnClearAllActionPerformed

    private void txtMaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSPActionPerformed

    private void txtSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongActionPerformed

    private void btnThemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHDActionPerformed
        int len = tblSanPham.getRowCount();
        ChiTietHoaDon[] cthd = new ChiTietHoaDon[len];
        for(int i=0; i<tblSanPham.getRowCount(); i++) {
            String maSP = (String)tblSanPham.getValueAt(i, 1);
            int soLuong = (int)tblSanPham.getValueAt(i, 3);
            double donGia = (double)tblSanPham.getValueAt(i, 4);

            cthd[i] = new ChiTietHoaDon(maSP, soLuong, donGia);
        }

        try {
            FileOutputStream fileOut = new FileOutputStream("./src/QL_HoaDon/CSDL_HĐ/MHĐ_" + txtMaHD.getText() + ".data");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Ghi thông tin hóa đơn (Mã HĐ, Tên KH, Tên NV, Ngày lập HĐ,..)
            out.writeObject(txtMaHD.getText());
            out.writeObject(txtTenKH.getText());
            out.writeObject(txtTenNV.getText());
            out.writeObject(txtNgayLapHD.getDate());

            // Ghi chi tiết hóa đơn (table)
            for(int row=0; row < tblSanPham.getRowCount(); row++) {
                for(int col=0; col<tblSanPham.getColumnCount(); col++) {
                    out.writeObject(tblSanPham.getValueAt(row, col).toString());
                }
            }

            txtTongTien.setText("Đã thêm HĐ : MHĐ _" + txtMaHD.getText() + ".data");

            out.close();
            fileOut.close();

        } catch(IOException e) {

        }
    }//GEN-LAST:event_btnThemHDActionPerformed

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        try {
            HoaDon hd = new HoaDon(
                txtMaHD.getText()
                , txtTenKH.getText()
                , txtTenNV.getText()
                , txtNgayLapHD.getDate()
                , txtMaSP.getText()
                , Integer.parseInt(txtSoLuong.getText())
                , Integer.parseInt(txtDonGia.getText())
            );

            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();

            model.insertRow(model.getRowCount(), new Object[]{
                tblSanPham.getRowCount()+1
                , hd.getMaSP()
                , txtTenSP.getText()
                , hd.getSoLuong()
                , hd.getDonGia()
                , hd.ThanhTien()
            }
        );

        double tongTien=0;
        for(int i=0; i<tblSanPham.getRowCount(); i++) {
            tongTien += (double)tblSanPham.getValueAt(i, 5);
        }

        txtTongTien.setText(String.valueOf(Math.round(tongTien)) + " VND");

        } catch(NumberFormatException e) {

        }
    }//GEN-LAST:event_btnThemSPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QL_HoaDon_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QL_HoaDon_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QL_HoaDon_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QL_HoaDon_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QL_HoaDon_JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnThemHD;
    private javax.swing.JPanel PnTimKiemHD;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnThemHD;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaSP;
    private com.toedter.calendar.JDateChooser txtNgayLapHD;
    private javax.swing.JTextArea txtResult;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
