/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ims.gui;


import ims.bll.InfoBLL;
import ims.dto.Infomation;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author NAT
 */
public class EmployeeList extends javax.swing.JFrame {
    InfoBLL bll = new InfoBLL();
    List<Infomation> iList;
    private String maNV;
    /** Creates new form EmployeeList */
    public EmployeeList() {
        initComponents();
        setInfoDialog();
        bll=new InfoBLL();
    }
    public  void setInfoDialog() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);        
        setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btNew = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btEdit = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btDel = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        btNew.setText("Thêm ");
        btNew.setFocusable(false);
        btNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });
        jToolBar1.add(btNew);
        jToolBar1.add(jSeparator1);

        btEdit.setText("Sửa");
        btEdit.setFocusable(false);
        btEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });
        jToolBar1.add(btEdit);
        jToolBar1.add(jSeparator2);

        btDel.setText("Xóa");
        btDel.setFocusable(false);
        btDel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btDel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelActionPerformed(evt);
            }
        });
        jToolBar1.add(btDel);
        jToolBar1.add(jSeparator3);

        jButton4.setText("In");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator4);

        btExit.setText("Thoát");
        btExit.setFocusable(false);
        btExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        jToolBar1.add(btExit);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 25));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ", "Họ Tên", "Ngày sinh", "Nơi sinh"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 830, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        Employee emGui= new Employee();
        emGui.setVisible(true);
        dispose();
    }//GEN-LAST:event_btNewActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btExitActionPerformed
    Infomation edit;

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        Employee e = new Employee(maNV);
        maNV = jTable1.getModel().getValueAt(selectedRow, 0).toString();
        String manv = jTable1.getModel().getValueAt(selectedRow, 0).toString();
        ArrayList<Infomation> iList = bll.readBLL(manv);
        Infomation inf;
        for(int i = 0; i< iList.size();i++){
            inf = iList.get(i);
            if(inf.getMaNV()>0){
                e.txtMaNV.setText(manv);                
            }
            
            if(inf.getMaCC()>0){
                e.txtMachamcong.setText(manv);
            }
            
            if(inf.getHovaten()!= null){
                e.txtHovaten.setText(inf.getHovaten());
            }
            
            if(inf.getTen()!= null){
                e.txtTen.setText(inf.getTen());
            }
            
            if(inf.getHovadem()!=null){
                e.txtHovaDem.setText(inf.getHovadem());
            }
            if(inf.getNoisinh()!= null){
                e.txtNoisinh.setText(inf.getNoisinh());
            }
            if(inf.getNguyenquan()!=null){
                e.txtNguyenquan.setText(inf.getNguyenquan());
            }
            if(inf.getNgaysinh()!=null){
                e.dNgaysinh.setDateFormatString(inf.getNgaysinh());
            }
            if(inf.getGioitinh()+"" !=null){
                e.cbGioitinh.setSelectedItem(inf.getGioitinh());
            }
            if(inf.getThanhpho()+"" !=null){
                e.cbTP.setSelectedItem(inf.getThanhpho());
            }
            if(inf.getCmnd()!=null){
                e.txtCMND.setText(inf.getCmnd());
            }
            if(inf.getNoicapcmnd()!=null){
                e.txtNoicap.setText(inf.getNoicapcmnd());
            }
            if(inf.getSohc()!=null){
                e.txtSohochieu.setText(inf.getSohc());
            }
            if(inf.getNoicaphc()!=null){
                e.txtNoicapHC.setText(inf.getNoicaphc());
            }
            if(inf.getVanhoa()!=null){
                e.txtTrinhdovanhoa.setText(inf.getVanhoa());
            }
        }
        e.setVisible(true);
        dispose();
    }//GEN-LAST:event_btEditActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:     
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        ArrayList<Infomation> infoListModel = bll.readInfoBLL();
        Infomation infoModel = new Infomation();
        for (int i = 0; i < infoListModel.size(); i++) {
            infoModel = infoListModel.get(i);
            model.addRow(new Object[0]);
            model.setValueAt(infoModel.getMaNV(), i, 0);
            model.setValueAt(infoModel.getHovaten(), i, 1);
            model.setValueAt(infoModel.getNgaysinh(), i, 2);
            model.setValueAt(infoModel.getNoisinh(), i, 3);
            System.out.println("ID GUI" + infoModel);
        }
        infoListModel.clear();
    }//GEN-LAST:event_formWindowOpened

    private void btDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        bll.deleteBLL(maNV);
        model.removeRow(row);
    }//GEN-LAST:event_btDelActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        maNV = jTable1.getModel().getValueAt(row, 0).toString();
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDel;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btNew;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    public javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}
