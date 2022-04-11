/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.alejandro.library_system;

import Beans.Escritores;
import Entidades.subGeneroLiterario;
import javax.swing.JOptionPane;
import Beans.Subgenero_beans;
import Entidades.Escritor;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin
 */
public class FrmSubGeneroLiterario extends javax.swing.JFrame {

    /**
     * Creates new form FrmSubGeneroLiterario
     */
    public FrmSubGeneroLiterario() {
        initComponents();
        this.setLocationRelativeTo(null);
        carga();
        txtSubGeneroLiterario.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSubGeneroLiterario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblSubGenero = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtIdSubGenero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregar.setBackground(java.awt.Color.blue);
        btnAgregar.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(254, 254, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(java.awt.Color.blue);
        btnCancelar.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(254, 254, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        jLabel1.setText("S. G. Literario");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Insertar nuevo sub genero literario ");

        txtSubGeneroLiterario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        TblSubGenero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TblSubGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblSubGeneroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblSubGenero);

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Id");

        txtIdSubGenero.setEditable(false);
        txtIdSubGenero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnCancelar)
                        .addGap(51, 51, 51)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSubGeneroLiterario)
                                    .addComponent(txtIdSubGenero))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdSubGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubGeneroLiterario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void carga() {
        Limpiar();
        String titulos[] = {"Id", "Sub Genero Literario"};
        //Ejemplosdearreglos
        Double numero[] = new Double[3];
        DefaultTableModel df = new DefaultTableModel(null, titulos);

        Subgenero_beans es = new Subgenero_beans();
        ArrayList<subGeneroLiterario> listar = es.MostrarSubGeneroLiterario();

        Iterator iterador = listar.iterator();
        Object fila[] = new Object[5];

        while (iterador.hasNext()) {
            //CASTEAR
            subGeneroLiterario estBucle = (subGeneroLiterario) iterador.next();
            fila[0] = estBucle.getIdSugeneroLiterario();
            fila[1] = estBucle.getSubgenero_Literario();
            df.addRow(fila);
        }
        TblSubGenero.setModel(df);
    }
    
    
    
      public void Limpiar() {
        txtSubGeneroLiterario.setText("");
    }
    
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
      
        if (txtSubGeneroLiterario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo vacio");
        } else {
            subGeneroLiterario sub = new subGeneroLiterario();
            Subgenero_beans subDAO = new Subgenero_beans();
            sub.setSubgenero_Literario(txtSubGeneroLiterario.getText());
            subDAO.AgregarSubGeneroLiterario(sub);
            Limpiar();
            carga();
            txtSubGeneroLiterario.requestFocus();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
      FrmMenu regresar = new FrmMenu();
        regresar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void TblSubGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblSubGeneroMouseClicked
        isSelect = true;
        try {
            txtIdSubGenero.setText(TblSubGenero.getValueAt(TblSubGenero.getSelectedRow(), 0).toString());
            txtSubGeneroLiterario.setText(TblSubGenero.getValueAt(TblSubGenero.getSelectedRow(), 1).toString());

        } catch (Exception ex) {
        }
    }//GEN-LAST:event_TblSubGeneroMouseClicked

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
            java.util.logging.Logger.getLogger(FrmSubGeneroLiterario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSubGeneroLiterario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSubGeneroLiterario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSubGeneroLiterario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSubGeneroLiterario().setVisible(true);
            }
        });
    }

       public boolean isSelect = false;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblSubGenero;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtIdSubGenero;
    private javax.swing.JTextField txtSubGeneroLiterario;
    // End of variables declaration//GEN-END:variables
}
