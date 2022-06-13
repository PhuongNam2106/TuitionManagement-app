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
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;



public class NhapHocLayout extends javax.swing.JPanel {

    SinhVienController svController;
    Connect connect;

    /**
     * Creates new form NhapHocLayout
     */
    public NhapHocLayout() {
        setSize(1000, 600);
        initComponents();
        connect = new Connect();
        svController = new SinhVienController();
        rbNam.setSelected(true);
        initComboboxKhoa();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHoten = new javax.swing.JTextField();
        txtQueQuan = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        txtGmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnXacNhan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbKhoa = new javax.swing.JComboBox<>();
        rbNam = new javax.swing.JRadioButton();
        rBnu = new javax.swing.JRadioButton();
        jdNgaySinh = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(232, 240, 254));
        setPreferredSize(new java.awt.Dimension(950, 450));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Họ Tên");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Ngày Sinh");

        txtHoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHotenActionPerformed(evt);
            }
        });

        txtQueQuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQueQuanActionPerformed(evt);
            }
        });

        txtSdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSdtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Quê quán");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Số điện thoại");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Gmail");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Giới Tính");

        btnXacNhan.setBackground(new java.awt.Color(76, 139, 245));
        btnXacNhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnXacNhan.setText("Xác Nhận");
        btnXacNhan.setPreferredSize(new java.awt.Dimension(50, 23));
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Khoa");

        cbKhoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cơ Khí", "Công Nghệ Thông Tin", "Điện Tử ", "Ngoại Ngữ", "Công Nghệ Ô Tô", "Quản Lý Kinh Doanh" }));

        rbNam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbNam.setText("Nam");
        rbNam.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbNamStateChanged(evt);
            }
        });
        rbNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNamActionPerformed(evt);
            }
        });

        rBnu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rBnu.setText("Nữ");
        rBnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBnuActionPerformed(evt);
            }
        });

        jdNgaySinh.setDateFormatString("dd/MM/yyyy\n");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtSdt)
                    .addComponent(txtHoten, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(jdNgaySinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQueQuan, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbNam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rBnu)))
                .addGap(131, 131, 131))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(372, 372, 372))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(rbNam)
                                .addComponent(rBnu))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 25, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtQueQuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQueQuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQueQuanActionPerformed

    private void txtSdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSdtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtSdtActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        // TODO add your handling code here:
        if (txtHoten.getText().trim().equals("") || txtQueQuan.getText().trim().equals("")  || txtSdt.getText().trim().equals("") || txtGmail.getText().trim().equals("") ) {
            JOptionPane.showMessageDialog(txtHoten, "Không được bỏ trống trường nào !!!");          
        }else{
            int malop = -1;
            switch (cbKhoa.getSelectedIndex()) {
                case 0:
                   
                     {
                        ResultSet resultSet = connect.queryData("select malop from lophoc where malop = (select min(malop) from lophoc WHERE makhoa = 'CK' AND sosv<70);");
                        try {
                            while (resultSet.next()) {
                                malop = resultSet.getInt("malop");
                            }

                        } catch (SQLException ex) {
                            Logger.getLogger(NhapHocLayout.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    break;

                case 1: {
                    ResultSet resultSet = connect.queryData("select malop from lophoc where malop = (select min(malop) from lophoc WHERE makhoa = 'CNH' AND sosv<70);");
                    try {
                        while (resultSet.next()) {
                            malop = resultSet.getInt("malop");
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(NhapHocLayout.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                case 2: {
                    ResultSet resultSet = connect.queryData("select malop from lophoc where malop = (select min(malop) from lophoc WHERE makhoa = 'CNM' AND sosv<70);");
                    try {
                        while (resultSet.next()) {
                           malop = resultSet.getInt("malop");
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(NhapHocLayout.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                case 3: {
                    ResultSet resultSet = connect.queryData("select malop from lophoc where malop = (select min(malop) from lophoc WHERE makhoa = 'OO' AND sosv<70);");
                    try {
                        while (resultSet.next()) {
                           malop = resultSet.getInt("malop");
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(NhapHocLayout.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                case 4: {
                    ResultSet resultSet = connect.queryData("select malop from lophoc where malop = (select min(malop) from lophoc WHERE makhoa = 'IT' AND sosv<2);");
                    try {
                        while (resultSet.next()) {
                            malop = resultSet.getInt("malop");
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(NhapHocLayout.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
//                case 5: {
//                    ResultSet resultSet = connect.queryData("select malop from lophoc where malop = (select min(malop) from lophoc WHERE makhoa = 'DT' AND sosv<70);");
//                    try {
//                        while (resultSet.next()) {
//                             malop = resultSet.getInt("malop");
//                        }
//
//                    } catch (SQLException ex) {
//                        Logger.getLogger(NhapHocLayout.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//                break;
//                case 6: {
//                    ResultSet resultSet = connect.queryData("select malop from lophoc where malop = (select min(malop) from lophoc WHERE makhoa = 'KT' AND sosv<70);");
//                    try {
//                        while (resultSet.next()) {
//                             malop = resultSet.getInt("malop");
//                        }
//
//                    } catch (SQLException ex) {
//                        Logger.getLogger(NhapHocLayout.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//                break;
//                case 7: {
//                    ResultSet resultSet = connect.queryData("select malop from lophoc where malop = (select min(malop) from lophoc WHERE makhoa = 'NN' AND sosv<70);");
//                    try {
//                        while (resultSet.next()) {
//                             malop = resultSet.getInt("malop");
//                        }
//
//                    } catch (SQLException ex) {
//                        Logger.getLogger(NhapHocLayout.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//                break;
//                case 8: {
//                    ResultSet resultSet = connect.queryData("select malop from lophoc where malop = (select min(malop) from lophoc WHERE makhoa = 'QLKD' AND sosv<70);");
//                    try {
//                        while (resultSet.next()) {
//                            malop = resultSet.getInt("malop");
//                        }
//
//                    } catch (SQLException ex) {
//                        Logger.getLogger(NhapHocLayout.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//                break;
            }
            String gioitinh;
            if (rbNam.isSelected()) {
                gioitinh = "Nam";
            } else {
                gioitinh = "Nữ";
            }
            // init default pass
            String password = txtHoten.getText().split("\\s+")[txtHoten.getText().trim().split("\\s+").length-1] + "2022";
        
            String hoten = txtHoten.getText().trim();
            SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            String ngaysinh = df.format(jdNgaySinh.getDate());
            String quequan = txtQueQuan.getText().trim();
            String sdt = txtSdt.getText().trim();
            String gmail = txtGmail.getText().trim();
                if (svController.addSV(password,hoten,ngaysinh,gioitinh,quequan,sdt,gmail,malop)==1) {
                    JOptionPane.showMessageDialog(txtHoten, "Thành công!");
                    connect.UpdateData("UPDATE lophoc SET sosv = ((SELECT sosv FROM lophoc WHERE malop = " + malop +") + 1 ) where malop = " + malop);
                    clearField();
                } else {
                    JOptionPane.showMessageDialog(txtHoten, "Không thành công ! vui lòng thử lại ");
                };
        }


    }//GEN-LAST:event_btnXacNhanActionPerformed
    public void clearField(){
       txtHoten.setText("");
       txtGmail.setText("");
       txtQueQuan.setText("");
       txtSdt.setText("");
    }
    private void rbNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNamActionPerformed
        // TODO add your handling code here:
        rBnu.setSelected(false);
    }//GEN-LAST:event_rbNamActionPerformed

    private void rBnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBnuActionPerformed
        // TODO add your handling code here:
        rbNam.setSelected(false);
    }//GEN-LAST:event_rBnuActionPerformed

    private void rbNamStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbNamStateChanged
        // TODO add your handling code here:
        if (rbNam.isSelected()) {
            rBnu.setSelected(false);
        } else {
            rBnu.setSelected(true);
        }
    }//GEN-LAST:event_rbNamStateChanged

    private void txtHotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHotenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHotenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JComboBox<String> cbKhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.toedter.calendar.JDateChooser jdNgaySinh;
    private javax.swing.JRadioButton rBnu;
    private javax.swing.JRadioButton rbNam;
    private javax.swing.JTextField txtGmail;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtSdt;
    // End of variables declaration//GEN-END:variables

    private void initComboboxKhoa() {
        String[] arrKhoa = {"Cơ khí", "Công Nghệ Hóa", "Công Nghệ May", "Công Nghệ Ô tô", "Công Nghệ Thông Tin"};
        DefaultComboBoxModel model = new DefaultComboBoxModel(arrKhoa);
        cbKhoa.setModel(model);
    }
}