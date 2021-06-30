/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VentanaInicial extends javax.swing.JFrame {
 IngresoJugadores jug;
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaInicial() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escaleras y Serpientes");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(51, 139, 168));
        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(35, 35, 16));
        jLabel2.setText("Serpientes y Escaleras");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 10, 390, 40);

        jLabel4.setBackground(new java.awt.Color(8, 17, 19));
        jLabel4.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 17, 4));
        jLabel4.setText("Elija los jugadores");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 250, 210, 30);

        jLabel6.setBackground(new java.awt.Color(232, 244, 52));
        jLabel6.setFont(new java.awt.Font("Waree", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(14, 14, 5));
        jLabel6.setText("Elija el Tablero");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(300, 240, 220, 40);

        jButton1.setBackground(new java.awt.Color(53, 84, 176));
        jButton1.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(103, 207, 97));
        jButton1.setText("Jugadores");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 180, 140, 50);

        jButton2.setBackground(new java.awt.Color(53, 94, 198));
        jButton2.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(62, 194, 66));
        jButton2.setText("Buscar Archivo");
        jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jButton2);
        jButton2.setBounds(310, 180, 200, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Escaleras.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 570, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jug= new IngresoJugadores(new javax.swing.JDialog(), true);
        jug.setVisible(true);
        jug.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
