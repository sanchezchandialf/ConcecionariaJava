/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

/**
 *
 * @author lauta
 */
public class Catalogo extends javax.swing.JFrame {

    /**
     * Creates new form Catalogo
     */
    public Catalogo() {
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

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        MarcaChevrole = new javax.swing.JLabel();
        MarcaPeugeot = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        VotonVolver = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        Titulo.setText("MARCAS");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 210, -1));

        MarcaChevrole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-Chevrolet-marca-autos.jpg"))); // NOI18N
        MarcaChevrole.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MarcaChevrole.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MarcaChevroleMouseClicked(evt);
            }
        });
        jPanel1.add(MarcaChevrole, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 150, 90));

        MarcaPeugeot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-Peugeot-marca-autos.jpg"))); // NOI18N
        MarcaPeugeot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MarcaPeugeot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MarcaPeugeotMouseClicked(evt);
            }
        });
        jPanel1.add(MarcaPeugeot, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-Citroën-marca-autos.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, 130));

        VotonVolver.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        VotonVolver.setForeground(new java.awt.Color(102, 102, 102));
        VotonVolver.setText("VOLVER");
        VotonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VotonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VotonVolverMouseClicked(evt);
            }
        });
        jPanel1.add(VotonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, -1));

        Background.setAutoscrolls(true);
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 613, 625));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MarcaChevroleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MarcaChevroleMouseClicked
        Chevrolet chevrolet=new Chevrolet();
        chevrolet.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MarcaChevroleMouseClicked

    private void MarcaPeugeotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MarcaPeugeotMouseClicked
        // TODO add your handling code here:  
        Peugeot peugeot=new Peugeot();
        peugeot.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MarcaPeugeotMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    CITROEN citroen=new CITROEN();
    citroen.setVisible(true);
    this.dispose();
    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void VotonVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VotonVolverMouseClicked
       Inicio inicio=new Inicio();
       inicio.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_VotonVolverMouseClicked

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
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel MarcaChevrole;
    private javax.swing.JLabel MarcaPeugeot;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel VotonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
