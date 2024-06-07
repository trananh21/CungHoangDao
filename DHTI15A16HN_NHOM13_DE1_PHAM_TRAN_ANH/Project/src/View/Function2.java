/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.ZodiacSign;
import com.formdev.flatlaf.json.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Function2 extends javax.swing.JFrame {

    /**
     * Creates new form Function2
     */
    public Function2() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_information = new javax.swing.JTextArea();
        btn_layngayhethong = new java.awt.Button();
        btn_thoat = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtA_information.setColumns(20);
        txtA_information.setRows(5);
        jScrollPane1.setViewportView(txtA_information);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 77, 734, 120));

        btn_layngayhethong.setLabel("Lấy ngày hệ thống");
        btn_layngayhethong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_layngayhethongActionPerformed(evt);
            }
        });
        getContentPane().add(btn_layngayhethong, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 140, 40));

        btn_thoat.setLabel("Thoát");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });
        getContentPane().add(btn_thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 220, 140, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LẤY NGÀY HỆ THỐNG");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 330, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/z5498749127758_8586e444fc65b786c1df7ec15241fcf9.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 280));

        jMenu1.setText("Chức Năng");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Tra Cứu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Lấy ngày của hệ thống");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Chọn cung hoàng đạo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_layngayhethongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_layngayhethongActionPerformed
        try {
            handleSystemDate();
        } catch (java.text.ParseException ex) {
            Logger.getLogger(Function2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_layngayhethongActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        dispose();
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        Function1 f1 = new Function1();
        f1.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        dispose();
        Function3 f3 = new Function3();
        f3.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed
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

    private void handleSystemDate() throws java.text.ParseException {
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateStr = sdf.format(currentDate);
        String zodiac = getZodiacSign(currentDate);
        txtA_information.setText("Cung hoàng đạo của ngày hôm nay (" + dateStr + ") là: " + zodiac);
    }

    private String getZodiacSign(Date date) throws java.text.ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");
        String dateStr = sdf.format(date);
        for (ZodiacSign zodiac : zodiacSigns) {
            try {
                Date startDate = sdf.parse(zodiac.getStartDate());
                Date endDate = sdf.parse(zodiac.getEndDate());
                Date current = sdf.parse(dateStr);
                if ((current.equals(startDate) || current.after(startDate)) && (current.equals(endDate) || current.before(endDate))) {
                    return zodiac.getName();
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

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
            java.util.logging.Logger.getLogger(Function2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Function2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Function2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Function2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Function2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_layngayhethong;
    private java.awt.Button btn_thoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtA_information;
    // End of variables declaration//GEN-END:variables
}
