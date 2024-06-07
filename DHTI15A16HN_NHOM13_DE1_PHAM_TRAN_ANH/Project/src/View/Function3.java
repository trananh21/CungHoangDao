/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.ZodiacSign;
import java.util.ArrayList;

public class Function3 extends javax.swing.JFrame {

    /**
     * Creates new form Function3
     */
    public Function3() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_information = new javax.swing.JTextArea();
        cb_cunghoangdao = new javax.swing.JComboBox<>();
        btn_check = new java.awt.Button();
        btn_thoat = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtA_information.setColumns(20);
        txtA_information.setRows(5);
        jScrollPane1.setViewportView(txtA_information);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 660, 127));

        cb_cunghoangdao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bạch Dương", "Kim Ngưu", "Song Tử", "Cự Giải", "Sư Tử", "Xử Nữ", "Thiên Bình", "Bọ Cạp", "Nhân Mã", "Ma Kết", "Bảo Bình", "Song Ngư" }));
        getContentPane().add(cb_cunghoangdao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, 35));

        btn_check.setLabel("Check");
        btn_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkActionPerformed(evt);
            }
        });
        getContentPane().add(btn_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 226, 168, 33));

        btn_thoat.setLabel("Thoát");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });
        getContentPane().add(btn_thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 226, 111, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CungHoangDao.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 700, 280));

        jMenu1.setText("Chức năng");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Tra cứu");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Lấy ngày của hệ thống");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("Chọn cung hoàng đạo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        dispose();
        Function2 f2 = new Function2();
        f2.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btn_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkActionPerformed
        handleZodiacSelection();

    }//GEN-LAST:event_btn_checkActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        dispose();
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        dispose();
        Function1 f1 = new Function1();
        f1.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    private static final ArrayList<ZodiacSign> zodiacSigns = new ArrayList<>();

    static {
        zodiacSigns.add(new ZodiacSign("Bạch Dương", "21/03", "19/04"));
        zodiacSigns.add(new ZodiacSign("Kim Ngưu", "20/04", "20/05"));
        zodiacSigns.add(new ZodiacSign("Song Tử", "21/05", "21/06"));
        zodiacSigns.add(new ZodiacSign("Cự Giải", "22/06", "22/07"));
        zodiacSigns.add(new ZodiacSign("Sư Tử", "23/07", "22/08"));
        zodiacSigns.add(new ZodiacSign("Xử Nữ", "23/08", "22/09"));
        zodiacSigns.add(new ZodiacSign("Thiên Bình", "23/09", "23/10"));
        zodiacSigns.add(new ZodiacSign("Thiên Yết", "24/10", "22/11"));
        zodiacSigns.add(new ZodiacSign("Nhân Mã", "23/11", "21/12"));
        zodiacSigns.add(new ZodiacSign("Ma Kết", "22/12", "19/01"));
        zodiacSigns.add(new ZodiacSign("Bảo Bình", "20/01", "18/02"));
        zodiacSigns.add(new ZodiacSign("Song Ngư", "19/02", "20/03"));
    }

    private String getPreviousZodiac(String zodiacName) {
        int size = zodiacSigns.size();
        for (int i = 0; i < size; i++) {
            if (zodiacSigns.get(i).getName().equals(zodiacName)) {
                return zodiacSigns.get((i - 1 + size) % size).getName();
            }
        }
        return "Không xác định";
    }

    private String getNextZodiac(String zodiacName) {
        int size = zodiacSigns.size();
        for (int i = 0; i < size; i++) {
            if (zodiacSigns.get(i).getName().equals(zodiacName)) {
                return zodiacSigns.get((i + 1) % size).getName();
            }
        }
        return "Không xác định";
    }

    private void handleZodiacSelection() {
        String selectedZodiac = (String) cb_cunghoangdao.getSelectedItem();
        if (selectedZodiac != null) {
            for (ZodiacSign zodiac : zodiacSigns) {
                if (zodiac.getName().equals(selectedZodiac)) {
                    String previousZodiac = getPreviousZodiac(selectedZodiac);
                    String nextZodiac = getNextZodiac(selectedZodiac);
                    txtA_information.setText("Cung " + selectedZodiac + " từ " + zodiac.getStartDate() + " đến " + zodiac.getEndDate() + ".\n"
                            + "Cung trước: " + previousZodiac + "\n"
                            + "Cung sau: " + nextZodiac);
                    break;
                }
            }
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Function3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_check;
    private java.awt.Button btn_thoat;
    private javax.swing.JComboBox<String> cb_cunghoangdao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtA_information;
    // End of variables declaration//GEN-END:variables
}
