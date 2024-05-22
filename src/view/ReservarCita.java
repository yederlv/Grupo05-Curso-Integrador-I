package view;

import model.Cliente;
import dao.ClienteDAO;
import java.util.List;

/**
 *
 * @author Alfredo
 */
public class ReservarCita extends javax.swing.JFrame {

    /**
     * Creates new form ReservarCita
     */
    public ReservarCita() {
        initComponents();
        this.setTitle("VETERINARIA PATITAS Y COLITAS");
        this.setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        IngresarDato = new javax.swing.JTextField();
        BuscarCliente = new javax.swing.JButton();
        CrearNuevoCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListarCliente = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Ingresar datos del Dueño:");

        BuscarCliente.setBackground(new java.awt.Color(0, 102, 255));
        BuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BuscarCliente.setText("BUSCAR");
        BuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarClienteActionPerformed(evt);
            }
        });

        CrearNuevoCliente.setBackground(new java.awt.Color(102, 255, 204));
        CrearNuevoCliente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        CrearNuevoCliente.setText("NUEVO CLIENTE");
        CrearNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearNuevoClienteActionPerformed(evt);
            }
        });

        ListarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRE", "APELLIDO", "TELÉFONO", "DIRECCIÓN", "EMAIL", "OPCIÓN"
            }
        ));
        jScrollPane1.setViewportView(ListarCliente);

        jMenu2.setText("Reservar Citas");
        jMenuBar1.add(jMenu2);

        jMenu1.setText("Consultar Citas");
        jMenuBar1.add(jMenu1);

        jMenu3.setText("Registrar Cliente");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Historial Médico");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IngresarDato, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(BuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(CrearNuevoCliente)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IngresarDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarCliente)
                    .addComponent(CrearNuevoCliente))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearNuevoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrearNuevoClienteActionPerformed

    private void BuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarClienteActionPerformed
   
        String valor = IngresarDato.getText();
        
        ClienteDAO clienteDAO = new ClienteDAO();
        
        if(!valor.isEmpty()){
            List<Cliente> clientes = clienteDAO.buscarClientes("dni", valor);
            
            if(clientes.isEmpty()){
                clientes = clienteDAO.buscarClientes("apellido", valor);
            }
            if(clientes.isEmpty()){
                clientes = clienteDAO.buscarClientes("telefono", valor);
            }
        
        }
        
    }//GEN-LAST:event_BuscarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(ReservarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarCliente;
    private javax.swing.JButton CrearNuevoCliente;
    private javax.swing.JTextField IngresarDato;
    private javax.swing.JTable ListarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
