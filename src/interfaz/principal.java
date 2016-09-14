/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.DenominadorCeroException;
import clases.Mixto;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        cmdCalcular.setEnabled(true);
        cmdFraccionario.setEnabled(false);
        cmdLimpiar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEntero1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtNumerador1 = new javax.swing.JTextField();
        txtDenominador1 = new javax.swing.JTextField();
        txtEntero2 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtNumerador2 = new javax.swing.JTextField();
        txtDenominador2 = new javax.swing.JTextField();
        cmbOperacion = new javax.swing.JComboBox();
        cmdCalcular = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdFraccionario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtNumerador3 = new javax.swing.JTextField();
        txtDenominador3 = new javax.swing.JTextField();
        txtEntero3 = new javax.swing.JTextField();
        txtNumerador4 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtDenominador4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        jLabel1.setText("Ejercicio 2");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        txtEntero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntero1ActionPerformed(evt);
            }
        });
        txtEntero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntero1KeyTyped(evt);
            }
        });
        jPanel1.add(txtEntero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 30, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 60, 20));

        txtNumerador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumerador1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 60, 30));

        txtDenominador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 60, 30));

        txtEntero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntero2ActionPerformed(evt);
            }
        });
        txtEntero2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntero2KeyTyped(evt);
            }
        });
        jPanel1.add(txtEntero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 30, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 60, 20));

        txtNumerador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador2KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 60, 30));

        txtDenominador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador2KeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 60, 30));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Suma", "Resta", "Multiplicación", "División" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 100, 30));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 90, 40));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 90, 40));

        cmdFraccionario.setText("Fraccionario");
        cmdFraccionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdFraccionarioActionPerformed(evt);
            }
        });
        jPanel1.add(cmdFraccionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 100, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 60, 20));

        txtNumerador3.setEditable(false);
        jPanel1.add(txtNumerador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 60, 30));

        txtDenominador3.setEditable(false);
        jPanel1.add(txtDenominador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 60, 30));

        txtEntero3.setEditable(false);
        txtEntero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntero3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtEntero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 30, 30));

        txtNumerador4.setEditable(false);
        jPanel1.add(txtNumerador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 60, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 60, 20));

        txtDenominador4.setEditable(false);
        jPanel1.add(txtDenominador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 60, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEntero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntero1ActionPerformed

    private void txtEntero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntero2ActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        if (txtNumerador1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite El numerador 1", "error", JOptionPane.ERROR_MESSAGE);
            txtNumerador1.requestFocusInWindow();
            txtNumerador1.selectAll();
        } else if (txtNumerador2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite El numerador 2", "error", JOptionPane.ERROR_MESSAGE);
            txtNumerador2.requestFocusInWindow();
            txtNumerador2.selectAll();
        } else if (txtDenominador1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite El denominador 1", "error", JOptionPane.ERROR_MESSAGE);
            txtDenominador1.requestFocusInWindow();
            txtDenominador1.selectAll();
        } else if (txtDenominador2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite El denominador 2", "error", JOptionPane.ERROR_MESSAGE);
            txtDenominador2.requestFocusInWindow();
            txtDenominador2.selectAll();
        } else if (txtEntero1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite la parte entera en la fracción 1", "error", JOptionPane.ERROR_MESSAGE);
            txtEntero1.requestFocusInWindow();
            txtEntero1.selectAll();
        } else if (txtEntero2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite la parte entera en la fracción 2", "error", JOptionPane.ERROR_MESSAGE);
            txtEntero2.requestFocusInWindow();
            txtEntero2.selectAll();
        } else {

            int op, n1, n2, e1, d1, d2, e2;
            Mixto f1, f2, f3 = null;
            op = cmbOperacion.getSelectedIndex();
            n1 = Integer.parseInt(txtNumerador1.getText());
            n2 = Integer.parseInt(txtNumerador2.getText());
            d1 = Integer.parseInt(txtDenominador1.getText());
            d2 = Integer.parseInt(txtDenominador2.getText());
            e1 = Integer.parseInt(txtEntero1.getText());
            e2 = Integer.parseInt(txtEntero2.getText());
            try {
                f1 = new Mixto(n1, d1, e1);
                f2 = new Mixto(n2, d2, e2);
                switch (op) {
                    case 0:
                        f3 = f1.sumar(f2);

                        break;
                    case 1:
                        f3 = f1.restar(f2);

                        break;
                    case 2:
                        f3 = f1.multiplicar(f2);

                        break;
                    case 3:
                        f3 = f1.dividir(f2);
                        break;

                }
                txtNumerador3.setText("" + f3.getNumerador());
                txtDenominador3.setText("" + f3.getDenominador());
                txtEntero3.setText("" + f3.getEntero());
            } catch (DenominadorCeroException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null,"El resultado es igual a 0",  "Error", JOptionPane.ERROR_MESSAGE);
            }
            cmdCalcular.setEnabled(false);
            cmdFraccionario.setEnabled(true);
            cmdLimpiar.setEnabled(true);
        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtNumerador1.setText("");
        txtNumerador2.setText("");
        txtNumerador3.setText("");
        txtNumerador4.setText("");
        txtEntero1.setText("");
        txtEntero2.setText("");
        txtEntero3.setText("");
        txtDenominador1.setText("");
        txtDenominador2.setText("");
        txtDenominador3.setText("");
        txtDenominador4.setText("");
        txtEntero1.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);

        cmdCalcular.setEnabled(true);
        cmdFraccionario.setEnabled(false);
        cmdLimpiar.setEnabled(true);

    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void txtEntero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntero3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntero3ActionPerformed

    private void txtEntero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntero1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntero1KeyTyped

    private void txtNumerador1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumerador1KeyReleased

    private void txtNumerador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumerador1KeyTyped

    private void txtEntero2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntero2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntero2KeyTyped

    private void txtNumerador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumerador2KeyTyped

    private void txtDenominador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDenominador2KeyTyped

    private void cmdFraccionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdFraccionarioActionPerformed
if (txtEntero3.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe obtenerse un resultado de operación", "error", JOptionPane.ERROR_MESSAGE);
            txtEntero1.requestFocusInWindow();
            txtEntero1.selectAll();
        }
else if (txtNumerador3.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe tenerse un resultado de operación", "error", JOptionPane.ERROR_MESSAGE);
            txtEntero1.requestFocusInWindow();
            txtEntero1.selectAll();
        }
else if (txtDenominador3.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe tenerse un resultado de operación", "error", JOptionPane.ERROR_MESSAGE);
            txtEntero3.requestFocusInWindow();
            txtEntero3.selectAll();
        }
else {
    
int num3, den3,ent3, n,nn, d, dd;
String  num, den, sig="-";

        num3 = Integer.parseInt(txtNumerador3.getText());
        den3 = Integer.parseInt(txtDenominador3.getText());
        ent3 = Integer.parseInt(txtEntero3.getText());
        n=(den3*ent3)+num3;
        d= den3;
        if(n<0&&d<0){
            nn=n*(-1);
            dd=d*(-1);
            jLabel3.setText(sig);
        num = String.valueOf(nn);
        txtNumerador4.setText(num);
        den = String.valueOf(dd);
        txtDenominador4.setText(den);  
        }
        else{
        num = String.valueOf(n);
        txtNumerador4.setText(num);
        den = String.valueOf(d);
        txtDenominador4.setText(den);
        }
}
    }//GEN-LAST:event_cmdFraccionarioActionPerformed

    private void txtDenominador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador1KeyTyped
char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDenominador1KeyTyped

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperacion;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdFraccionario;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField txtDenominador1;
    private javax.swing.JTextField txtDenominador2;
    private javax.swing.JTextField txtDenominador3;
    private javax.swing.JTextField txtDenominador4;
    private javax.swing.JTextField txtEntero1;
    private javax.swing.JTextField txtEntero2;
    private javax.swing.JTextField txtEntero3;
    private javax.swing.JTextField txtNumerador1;
    private javax.swing.JTextField txtNumerador2;
    private javax.swing.JTextField txtNumerador3;
    private javax.swing.JTextField txtNumerador4;
    // End of variables declaration//GEN-END:variables
}
