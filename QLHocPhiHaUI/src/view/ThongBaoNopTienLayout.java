/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.SinhVienController;

import database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.sothuhocphi;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;


public class ThongBaoNopTienLayout extends javax.swing.JPanel {

    Connect connect;

    /**
     * Creates new form ThongBaoNopTienLayout
     */
    public ThongBaoNopTienLayout() {
        initComponents();
        setSize(1000, 650);
        connect = new Connect();
        hienthids();

    }

    private void hienthids() {
        List<sothuhocphi> list = new ArrayList<>();
        list.clear();
        DefaultTableModel model = (DefaultTableModel) bangthongbao.getModel();
        model.setRowCount(0);
        // truy vấn database và thêm vài list
        ResultSet resultset = connect.queryData("select * from sohocphi");
        try {
            while (resultset.next()) {
                sothuhocphi st = new sothuhocphi(resultset.getString("stt"), resultset.getString("hocky"), 
                        resultset.getString("namhoc"), resultset.getString("tungay"),
                        resultset.getString("denngay"), resultset.getString("thongbao"));
                list.add(st);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        // thêm sv từ list vào bảng
        for (sothuhocphi i : list) {
            Object[] row = {i.getStt(), i.getKy(), i.getNamhoc(), i.getTungay(), i.getDenngay(), i.getNoidung()};
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtky = new javax.swing.JTextField();
        txtnamhoc = new javax.swing.JTextField();
        txttungay = new javax.swing.JTextField();
        txtdenngay = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtthongbao = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bangthongbao = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtso = new javax.swing.JTextField();
        btnxuatthongbao = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 240, 254));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Kỳ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Năm học");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Từ ngày");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Đến ngày");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Nội dung thông báo");

        txtky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkyActionPerformed(evt);
            }
        });

        txtdenngay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdenngayActionPerformed(evt);
            }
        });

        txtthongbao.setColumns(20);
        txtthongbao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtthongbao.setRows(5);
        jScrollPane1.setViewportView(txtthongbao);

        jButton1.setBackground(new java.awt.Color(76, 139, 245));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Thông Báo");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnsua.setBackground(new java.awt.Color(76, 139, 245));
        btnsua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsua.setForeground(new java.awt.Color(255, 255, 255));
        btnsua.setText("Sửa Thông Báo");
        btnsua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setBackground(new java.awt.Color(76, 139, 245));
        btnxoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnxoa.setForeground(new java.awt.Color(255, 255, 255));
        btnxoa.setText("Xóa");
        btnxoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        bangthongbao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Kỳ", "Năm học", "Từ ngày", "Đến ngày", "Nội dung"
            }
        ));
        bangthongbao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bangthongbaoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bangthongbao);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Thông báo số:");

        txtso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsoActionPerformed(evt);
            }
        });

        btnxuatthongbao.setBackground(new java.awt.Color(76, 139, 245));
        btnxuatthongbao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnxuatthongbao.setForeground(new java.awt.Color(255, 255, 255));
        btnxuatthongbao.setText("Xuất Thông Báo");
        btnxuatthongbao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnxuatthongbao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxuatthongbaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnxuatthongbao))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txttungay)
                                            .addComponent(txtky)
                                            .addComponent(txtso, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(141, 141, 141))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnsua)
                                        .addGap(27, 27, 27)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnamhoc)
                                            .addComponent(txtdenngay, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(185, 185, 185))
                    .addComponent(jScrollPane1))
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtky, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtnamhoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttungay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdenngay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(55, 55, 55)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxuatthongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void resetform() {
        txtso.setText("");
        txtky.setText("");
        txtnamhoc.setText("");
        txttungay.setText("");
        txtdenngay.setText("");
        txtthongbao.setText("");

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        if (txtky.getText().equals("") || txtnamhoc.getText().equals("") || txttungay.getText().equals("")
                || txtdenngay.getText().equals("") || txtthongbao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Dữ liệu không được để trống",
                    "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            String sqlthongbao = " INSERT INTO `sohocphi` (`stt`, `hocky`, `namhoc`, `tungay`, `denngay`, `thongbao`) VALUES ('"
                    + txtso.getText() + "', '" + txtky.getText() + "', '" + txtnamhoc.getText() + "', '" + txttungay.getText() + "', '"
                    + txtdenngay.getText() + "', '" + txtthongbao.getText() + "');";
            if (connect.UpdateData(sqlthongbao) == 1) {
                JOptionPane.showMessageDialog(jButton1, "thành công");

            } else {
                JOptionPane.showMessageDialog(jButton1, "không thành công");

            };
            resetform();
            hienthids();
        }
    }

    private void txtkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkyActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {
        if (txtso.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Số thông báo không được để trống",
                    "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            String sqlxoa = "DELETE FROM `sohocphi` WHERE stt='" + txtso.getText() + "'";
            int n = JOptionPane.showConfirmDialog(null, "bạn có chắc chắn xóa không?", "", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                if (connect.UpdateData(sqlxoa) == 1) {
                    JOptionPane.showMessageDialog(jButton1, "xóa thành công");

                } else {
                    JOptionPane.showMessageDialog(jButton1, "không có thông báo số '" + txtso.getText() + "'");
                }
            } else {
                JOptionPane.showMessageDialog(jButton1, "xóa không thành công");
            }
            resetform();
            hienthids();
        }
    }

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {
        if (txtky.getText().equals("") || txtnamhoc.getText().equals("") || txttungay.getText().equals("")
                || txtdenngay.getText().equals("") || txtthongbao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Dữ liệu không được để trống",
                    "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            String sqlsua = "UPDATE `sohocphi` SET `stt`='" + txtso.getText() + "',`thongbao`='" + txtthongbao.getText()
                    + "',`tungay`='" + txttungay.getText() + "',`denngay`='" + txtdenngay.getText() + "',`hocky`='" + txtky.getText()
                    + "',`namhoc`='" + txtnamhoc.getText() + "' WHERE stt='" + txtso.getText() + "'";
            if (connect.UpdateData(sqlsua) == 1) {
                JOptionPane.showMessageDialog(jButton1, "sửa thành công");

            } else {
                JOptionPane.showMessageDialog(jButton1, "không thành công");

            };
            resetform();
            hienthids();
        }
    }

    private void bangthongbaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bangthongbaoMouseClicked
        // TODO add your handling code here:
        int row = bangthongbao.getSelectedRow();
        if (row >= 0) {
            txtso.setText(bangthongbao.getModel().getValueAt(row, 0).toString());
            txtky.setText(bangthongbao.getModel().getValueAt(row, 1).toString());
            txtnamhoc.setText(bangthongbao.getModel().getValueAt(row, 2).toString());
            txttungay.setText(bangthongbao.getModel().getValueAt(row, 3).toString());
            txtdenngay.setText(bangthongbao.getModel().getValueAt(row, 4).toString());
            txtthongbao.setText(bangthongbao.getModel().getValueAt(row, 5).toString());
        }

    }//GEN-LAST:event_bangthongbaoMouseClicked

    private void btnxuatthongbaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxuatthongbaoActionPerformed
        // Create Blank document
        XWPFDocument document = new XWPFDocument();
        // Create new Paragraph
        XWPFParagraph paragraph1 = document.createParagraph();
        XWPFRun run = paragraph1.createRun();
        run.setText("          BỘ CÔNG THƯƠNG                                Cộng hòa xã hội chủ nghĩa Việt Nam");

        XWPFParagraph paragraph2 = document.createParagraph();
        run = paragraph2.createRun();
        run.setText("TRƯỜNG ĐH CÔNG NGHIỆP HÀ NỘI                       Độc lập- Tự do- Hạnh phúc ");
        XWPFParagraph paragraph3 = document.createParagraph();
        run = paragraph3.createRun();
        run.setText("    Thông báo số:" + txtso.getText() + "                         Hà Nội, ngày " + txttungay.getText() + " ");
        XWPFParagraph paragraph4 = document.createParagraph();
        run = paragraph4.createRun();
        run.setText("                                       ----THÔNG BÁO---                          ");
        XWPFParagraph paragraph5 = document.createParagraph();
        run = paragraph5.createRun();
        run.setText(" Trường DDH CNHN thông báo đến sinh viên toàn trường  nộp học phí kỳ: " + txtky.getText() + " năm học: "
                + txtnamhoc.getText() + " nội dung như sau:" + txtthongbao.getText() + "  ");
        XWPFParagraph paragraph6 = document.createParagraph();
        run = paragraph6.createRun();
        run.setText(" Thời gian nộp học phí từ ngày:" + txttungay.getText() + "           đến ngày " + txtdenngay.getText() + " ");
        XWPFParagraph paragraph7 = document.createParagraph();
        run = paragraph7.createRun();
        run.setText(" Nơi nhận                                                          Hiệu trưởng ");
        XWPFParagraph paragraph8 = document.createParagraph();
        run = paragraph8.createRun();
        run.setText(" -các phòng ban ");

        // Write the Document in file system
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(new File("Thông Báo số '" + txtso.getText() + "'.docx"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ThongBaoNopTienLayout.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            document.write(out);
        } catch (IOException ex) {
            Logger.getLogger(ThongBaoNopTienLayout.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ThongBaoNopTienLayout.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            document.close();
        } catch (IOException ex) {
            Logger.getLogger(ThongBaoNopTienLayout.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Đã xuất thông báo");
         JOptionPane.showMessageDialog(jButton1, "Đã xuất thông báo ra file word!");

    }//GEN-LAST:event_btnxuatthongbaoActionPerformed

    private void txtdenngayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdenngayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdenngayActionPerformed

    private void txtsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangthongbao;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton btnxuatthongbao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtdenngay;
    private javax.swing.JTextField txtky;
    private javax.swing.JTextField txtnamhoc;
    private javax.swing.JTextField txtso;
    private javax.swing.JTextArea txtthongbao;
    private javax.swing.JTextField txttungay;
    // End of variables declaration//GEN-END:variables
}
