/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Zodiac;
import javax.swing.JOptionPane;

public class Function1 extends javax.swing.JFrame {

    public Function1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_years = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_days = new javax.swing.JTextField();
        txt_months = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cb_sex = new javax.swing.JComboBox<>();
        btn_thoat = new javax.swing.JButton();
        btn_Check = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_infomation = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_function1 = new javax.swing.JMenuItem();
        menu_function2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("XEM CUNG HOÀNG ĐẠO CỦA BẠN LÀ GÌ?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 390, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Giới tính");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 130, 30));
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 490, 40));
        getContentPane().add(txt_years, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 250, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ngày tháng năm dương lịch: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 30));
        getContentPane().add(txt_days, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 250, 40));
        getContentPane().add(txt_months, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 250, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Họ và tên");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 30));

        cb_sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "" }));
        getContentPane().add(cb_sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 280, 40));

        btn_thoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_thoat.setText("Thoát");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });
        getContentPane().add(btn_thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 110, 30));

        btn_Check.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Check.setText("Check");
        btn_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CheckActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Check, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 110, 30));

        txtA_infomation.setColumns(20);
        txtA_infomation.setRows(5);
        jScrollPane1.setViewportView(txtA_infomation);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 780, 150));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/z5497902255172_b6f2ad8928a6542938ce7483716242ad.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 490));

        jMenuBar1.setForeground(new java.awt.Color(255, 51, 255));

        jMenu1.setText("Chức Năng");

        menu_function1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_function1.setText("Tra cứu");
        menu_function1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_function1ActionPerformed(evt);
            }
        });
        jMenu1.add(menu_function1);

        menu_function2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_function2.setText("Lấy ngày của hệ thống");
        menu_function2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_function2ActionPerformed(evt);
            }
        });
        jMenu1.add(menu_function2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Chọn cung hoàng đạo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_function2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_function2ActionPerformed
        dispose();
        Function2 f2 = new Function2();
        f2.setVisible(true);

    }//GEN-LAST:event_menu_function2ActionPerformed

    private void menu_function1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_function1ActionPerformed
        this.setVisible(true);
    }//GEN-LAST:event_menu_function1ActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        dispose();

    }//GEN-LAST:event_btn_thoatActionPerformed

    private void btn_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CheckActionPerformed

        try {
            // Lấy thông tin từ giao diện
            String hoTen = txt_name.getText();
            String gioiTinh = (String) cb_sex.getSelectedItem();
            int day = Integer.parseInt(txt_days.getText());
            int month = Integer.parseInt(txt_months.getText());
            int year = Integer.parseInt(txt_years.getText());

            // Kiểm tra ngày và tháng có hợp lệ không
            if (day < 1 || day > 31 || month < 1 || month > 12) {
                JOptionPane.showMessageDialog(this, "Ngày tháng không hợp lệ. Vui lòng nhập lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return; // Dừng thực thi nếu ngày tháng không hợp lệ
            }

            // Kiểm tra số ngày trong tháng
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (day > daysInMonth[month - 1]) {
                JOptionPane.showMessageDialog(this, "Ngày không hợp lệ với tháng đã chọn. Vui lòng nhập lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return; // Dừng thực thi nếu ngày không hợp lệ với tháng
            }

            // Tạo một đối tượng CungHoangDao với ngày và tháng sinh đã nhập
            Zodiac ngaySinh = new Zodiac(day, month);

            // Kiểm tra cung hoàng đạo
            String cungHoangDao = ngaySinh.CHD();

            // Tạo chuỗi thông tin
            String info = "Họ tên: " + hoTen + "\n"
                    + "Giới tính: " + gioiTinh + "\n"
                    + "Ngày sinh: " + day + "\n"
                    + "Tháng sinh: " + month + "\n"
                    + "Năm sinh: " + year + "\n"
                    + "Cung hoàng đạo: " + cungHoangDao;

            // Hiển thị thông tin trong txtA_infomation
            txtA_infomation.setText(info);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số nguyên cho ngày và tháng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_CheckActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        Function3 f3 = new Function3();
        f3.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Function1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Check;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JComboBox<String> cb_sex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menu_function1;
    private javax.swing.JMenuItem menu_function2;
    private javax.swing.JTextArea txtA_infomation;
    private javax.swing.JTextField txt_days;
    private javax.swing.JTextField txt_months;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_years;
    // End of variables declaration//GEN-END:variables
}
