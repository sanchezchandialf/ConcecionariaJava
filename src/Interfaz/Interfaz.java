/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
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

        Background = new javax.swing.JPanel();
        FondoAzul = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        TextApellido = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        TextEmail = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        TextTelefono = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        TextMensaje = new javax.swing.JTextField();
        Enviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo-azul1.png"))); // NOI18N
        FondoAzul.setText("jLabel1");
        FondoAzul.setMaximumSize(new java.awt.Dimension(300, 600));
        FondoAzul.setPreferredSize(new java.awt.Dimension(2431, 1649));
        Background.add(FondoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 0, 430, -1));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("BIENVENIDOS");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        textNombre.setText("Ingrese nombre");
        textNombre.setBorder(null);
        textNombre.setOpaque(true);
        Background.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, -1));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 180, 10));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel3.setText("Apellido");
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        TextApellido.setText("Ingrese nombre");
        TextApellido.setBorder(null);
        TextApellido.setOpaque(true);
        Background.add(TextApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 120, -1));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 180, 10));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel4.setText("Email");
        Background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        TextEmail.setText("Ingrese Email");
        TextEmail.setBorder(null);
        TextEmail.setOpaque(true);
        Background.add(TextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, -1));
        Background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 180, 10));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel5.setText("Telefono");
        Background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        TextTelefono.setText("Ingrese Telefono");
        TextTelefono.setBorder(null);
        TextTelefono.setOpaque(true);
        Background.add(TextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 120, -1));
        Background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 180, 10));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel6.setText("Mensaje");
        Background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        TextMensaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TextMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextMensajeActionPerformed(evt);
            }
        });
        Background.add(TextMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 490, 170));

        Enviar.setBackground(new java.awt.Color(204, 204, 204));
        Enviar.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Enviar.setText("Enviar");
        Enviar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnviarMouseClicked(evt);
            }
        });
        Background.add(Enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 130, 40));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextMensajeActionPerformed

    private void EnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarMouseClicked
           try {
        // Mostrar un cuadro de diálogo con el mensaje "Mensaje recibido"
        javax.swing.JOptionPane.showMessageDialog(null, "Mensaje Recibido");

        // Crear un archivo .dat
        java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter("datosUsuario.dat"));

        // Escribir los datos en el archivo
        writer.write("Apellido: " + TextApellido.getText() + "\n");
        writer.write("Telefono: " + TextTelefono.getText() + "\n");
        writer.write("Email: " + TextEmail.getText() + "\n");
        writer.write("Nombre: " + textNombre.getText() + "\n");
        writer.write("Mensaje: " + TextMensaje.getText() + "\n");

        // Cerrar el archivo
        writer.close();
    } catch (java.io.IOException e) {
        // Mostrar un cuadro de diálogo con el mensaje de error
        javax.swing.JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        e.printStackTrace();
    }
    }//GEN-LAST:event_EnviarMouseClicked

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton Enviar;
    private javax.swing.JLabel FondoAzul;
    private javax.swing.JTextField TextApellido;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextMensaje;
    private javax.swing.JTextField TextTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
