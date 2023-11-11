/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cifradortexto;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexa
 */
public class cifradorVisual extends javax.swing.JFrame {

    String resetRoute="C:/Users/Alexa/Documents/NetBeansProjects/CifradorTexto/src/cifradortexto/";

    /**
     * Creates new form cifradorVisual
     */
    public cifradorVisual() {
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

        jLabel1 = new javax.swing.JLabel();
        cmbCodigos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        chkConcurrente = new javax.swing.JCheckBox();
        btnIniciar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbEscogerTexto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLogs = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Cifrador de Texto");

        cmbCodigos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hill", "lion", "test", "dfhc", "lkop" }));

        jLabel2.setText("Escoge tu clave de cifrado:");

        chkConcurrente.setText("Concurrente");
        chkConcurrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkConcurrenteActionPerformed(evt);
            }
        });

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "6", "8" }));
        jComboBox1.setEnabled(false);

        jLabel3.setText("Cantidad de hilos (Concurrente)");

        cmbEscogerTexto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lorem", "Shrek" }));

        jLabel4.setText("Escoge el texto a cifrar");

        txtCantidad.setText("10000");

        jLabel5.setText("Cantidad de veces a cifrar:");

        txtLogs.setColumns(20);
        txtLogs.setRows(5);
        txtLogs.setText("Logs:");
        jScrollPane1.setViewportView(txtLogs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbCodigos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkConcurrente, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbEscogerTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIniciar)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCodigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(chkConcurrente)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEscogerTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnIniciar)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        cifradoHill cifradoHill=new cifradoHill();
        if(esNumeroEntero(txtCantidad.getText().toString())){
            borrarCrearResultado();
            
            
        String codigos=cmbCodigos.getSelectedItem().toString();
        int cantidadHilos=Integer.parseInt(jComboBox1.getSelectedItem().toString());
        String textoCifrar=cmbEscogerTexto.getSelectedItem().toString();
        
        int cantidadCifrar=Integer.parseInt(txtCantidad.getText().toString());
        
        cifradoHill.key=codigos;
        cifradoHill.numHilos=cantidadHilos;
        cifradoHill.nombreArchivo=cifradoHill.nombreArchivo+textoCifrar+".txt";
        cifradoHill.numCifrado=cantidadCifrar;
        
        if(!chkConcurrente.isSelected()){
            try {
                long tiempoInicioSecuencial = System.currentTimeMillis();
                cifradoHill.cifrarSecuencial();
                long tiempoFinSecuencial = System.currentTimeMillis();
                long tiempoTotalSecuencial = tiempoFinSecuencial - tiempoInicioSecuencial;
               
                JOptionPane.showMessageDialog(this, "Tiempo de ejecución (secuencial): " + tiempoTotalSecuencial + " ms");
                
                txtLogs.append("\nTiempo de ejecución (secuencial): " + tiempoTotalSecuencial + " ms\n");
            } catch (IOException ex) {
                Logger.getLogger(cifradorVisual.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            try {
                long tiempoInicioConHilos = System.currentTimeMillis();

                cifradoHill.cifrarConHilos();
                long tiempoFinConHilos = System.currentTimeMillis();
                long tiempoTotalConHilos = tiempoFinConHilos - tiempoInicioConHilos;
                JOptionPane.showMessageDialog(this, "Tiempo de ejecución (concurrente): " + tiempoTotalConHilos + " ms");

                txtLogs.append("\nTiempo de ejecución (concurrente): " + tiempoTotalConHilos + " ms\n");
                
                
            } catch (IOException ex) {
                Logger.getLogger(cifradorVisual.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        cifradoHill.nombreArchivo=resetRoute;
        
        }else{
        JOptionPane.showMessageDialog(this, "Error: Ingrese un número entero válido.");

        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    
    private void chkConcurrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkConcurrenteActionPerformed
        if(chkConcurrente.isSelected()){
            jComboBox1.setEnabled(true);
        }
        else{
            jComboBox1.setEnabled(false);

        }

    }//GEN-LAST:event_chkConcurrenteActionPerformed

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
            java.util.logging.Logger.getLogger(cifradorVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cifradorVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cifradorVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cifradorVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cifradorVisual().setVisible(true);
            }
        });
    }
    
    private boolean esNumeroEntero(String input) {
    try {
        Integer.parseInt(input);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
    
    private void borrarCrearResultado() {
        
        String nombreArchivo = "C:/Users/Alexa/Documents/NetBeansProjects/CifradorTexto/src/cifradortexto/test.txt";

        // Crear un objeto File con el nombre del archivo
        File archivo = new File(nombreArchivo);

        // Verificar si el archivo existe y borrarlo si es necesario
        if (archivo.exists()) {
            if (archivo.delete()) {
                System.out.println("El archivo existente ha sido eliminado.");
            } else {
                System.out.println("No se pudo eliminar el archivo existente.");
            }
        }

        try {
            // Crear un nuevo archivo con el mismo nombre
            if (archivo.createNewFile()) {
                System.out.println("Se ha creado un nuevo archivo: " + nombreArchivo);
            } else {
                System.out.println("No se pudo crear el nuevo archivo.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
        
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JCheckBox chkConcurrente;
    private javax.swing.JComboBox<String> cmbCodigos;
    private javax.swing.JComboBox<String> cmbEscogerTexto;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtLogs;
    // End of variables declaration//GEN-END:variables
}
