
package view;

import dao.ClienteDAO;
import dao.MascotaDAO;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Cliente;
import model.Especie;
import model.Mascota;
import model.Raza;


public class RegistrarCliente extends javax.swing.JFrame {
    private Object ComboBoxFiller;
   
    public RegistrarCliente() {
        
        initComponents();
        this.setTitle("VETERINARIA PATITAS Y COLITAS");
        this.setLocationRelativeTo(null);
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nombres = new javax.swing.JTextField();
        Apellidos = new javax.swing.JTextField();
        DocuementoIdentidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Direccion = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Sexo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        AgregarMascota = new javax.swing.JButton();
        PanelMascotas = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        NombreMasc = new javax.swing.JTextField();
        JComboBoxTR = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        JComboBoxTE = new javax.swing.JComboBox();
        Edad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Peso = new javax.swing.JTextField();
        SexoMascota = new javax.swing.JComboBox();
        Guardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Datos del Dueño");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nombres:");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("Documento Identidad:");

        jLabel4.setText("Dirección:");

        jLabel6.setText("Teléfono:");

        jLabel7.setText("Email:");

        jLabel8.setText("Sexo:");

        Sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        Sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(Sexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombres))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Apellidos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DocuementoIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(78, 78, 78)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(DocuementoIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Datos del Paciente");

        AgregarMascota.setText("Agregar otra mascota");
        AgregarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarMascotaActionPerformed(evt);
            }
        });

        PanelMascotas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelMascotas.setEnabled(false);
        PanelMascotas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                PanelMascotasAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel10.setText("Nombre:");

        jLabel11.setText("Raza:");

        jLabel12.setText("Sexo:");

        JComboBoxTR.setEditable(true);
        JComboBoxTR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona Tipo raza" }));
        JComboBoxTR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxTRActionPerformed(evt);
            }
        });

        jLabel13.setText("Especie:");

        jLabel14.setText("Edad:");

        JComboBoxTE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona tipo" }));
        JComboBoxTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxTEActionPerformed(evt);
            }
        });

        jLabel15.setText("Peso:");

        SexoMascota.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Macho", "Hembra" }));

        javax.swing.GroupLayout PanelMascotasLayout = new javax.swing.GroupLayout(PanelMascotas);
        PanelMascotas.setLayout(PanelMascotasLayout);
        PanelMascotasLayout.setHorizontalGroup(
            PanelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMascotasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMascotasLayout.createSequentialGroup()
                        .addGroup(PanelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelMascotasLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NombreMasc))
                            .addGroup(PanelMascotasLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(22, 22, 22)
                                .addGroup(PanelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SexoMascota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JComboBoxTR, 0, 221, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addGroup(PanelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(PanelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelMascotasLayout.createSequentialGroup()
                                .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JComboBoxTE, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelMascotasLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );
        PanelMascotasLayout.setVerticalGroup(
            PanelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMascotasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMascotasLayout.createSequentialGroup()
                        .addGroup(PanelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(NombreMasc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(PanelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(JComboBoxTR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelMascotasLayout.createSequentialGroup()
                        .addGroup(PanelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(JComboBoxTE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(PanelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(SexoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

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
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(Guardar)
                        .addGap(39, 39, 39)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(PanelMascotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(AgregarMascota))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(AgregarMascota))
                .addGap(26, 26, 26)
                .addComponent(PanelMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(jButton2))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarMascotaActionPerformed
        
        AgregarMascota newframe = new AgregarMascota();
        newframe.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_AgregarMascotaActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
     
        try {
            
            Cliente cliente = new Cliente();
            cliente.setNombre(Nombres.getText());
            cliente.setApellido(Apellidos.getText());
            cliente.setCodDocumento(Integer.parseInt(DocuementoIdentidad.getText()));
            cliente.setDireccion(Direccion.getText());
            cliente.setEmail(Email.getText());
            cliente.setTelefono(Integer.parseInt(Telefono.getText()));
            cliente.setSexo(Sexo.getSelectedItem().toString());
            
            ClienteDAO clienteDAO = new ClienteDAO(); // Instancia de ClienteDAO
            clienteDAO.addCliente(cliente);

            Mascota mascota = new Mascota();
            mascota.setNombreMascota(NombreMasc.getText());
            mascota.setEdadMascota(Integer.parseInt(Edad.getText()));
            mascota.setPesoMascota(Integer.parseInt(Peso.getText()));
            mascota.setSexoMascota(SexoMascota.getSelectedItem().toString());
           
            Especie especie = new Especie();
            especie.setTipoEspecie(JComboBoxTE.getSelectedItem().toString());
            
            Raza raza = new Raza();
            raza.setTipoRaza(JComboBoxTR.getSelectedItem().toString());
            
            MascotaDAO mascotaDAO = new MascotaDAO(); // Instancia de MascotaDAO
            mascotaDAO.addMascota(mascota);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"ERROR EN AGREGAR AL NUEVO CLIENTE!!!");
        }
  
    }//GEN-LAST:event_GuardarActionPerformed

    MascotaDAO re = new MascotaDAO();
    private void JComboBoxTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxTEActionPerformed

        re.RellenarComboBox("especie", "TipoEspecie", JComboBoxTE);
        
    }//GEN-LAST:event_JComboBoxTEActionPerformed

    private void JComboBoxTRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxTRActionPerformed
        
        re.RellenarComboBox("raza", "TipoRaza", JComboBoxTR);
        
    }//GEN-LAST:event_JComboBoxTRActionPerformed

    private void PanelMascotasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_PanelMascotasAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelMascotasAncestorAdded

    private void SexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexoActionPerformed

    public void addMascota(Mascota mascota) {
    JPanel PanelMascotas = new JPanel();
    PanelMascotas.setLayout(new BorderLayout());

    JLabel lblNombre = new JLabel("Nombre: " + mascota.getNombreMascota());
    JLabel lblEdad = new JLabel("Edad: " + mascota.getEdadMascota());
    JLabel lblPeso = new JLabel("Peso: " + mascota.getPesoMascota());
    JLabel lblSexo = new JLabel("Sexo: " + mascota.getSexoMascota());
    JLabel lblEspecie = new JLabel("Especie: " + mascota.getIdEspecieFK());
    JLabel lblRaza = new JLabel("Raza: " + mascota.getIdRazaFK());

    JButton btnExpand = new JButton("+");
    btnExpand.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            boolean isExpanded = lblEdad.isVisible();
            lblEdad.setVisible(!isExpanded);
            lblPeso.setVisible(!isExpanded);
            lblSexo.setVisible(!isExpanded);
            lblEspecie.setVisible(!isExpanded);
            lblRaza.setVisible(!isExpanded);
            btnExpand.setText(isExpanded ? "+" : "-");
        }
        
    });

    PanelMascotas.add(lblNombre, BorderLayout.NORTH);
    PanelMascotas.add(btnExpand, BorderLayout.EAST);

    JPanel panelDetalles = new JPanel();
    panelDetalles.setLayout(new BoxLayout(panelDetalles, BoxLayout.Y_AXIS));
    panelDetalles.add(lblEdad);
    panelDetalles.add(lblPeso);
    panelDetalles.add(lblSexo);
    panelDetalles.add(lblEspecie);
    panelDetalles.add(lblRaza);

    lblEdad.setVisible(false);
    lblPeso.setVisible(false);
    lblSexo.setVisible(false);
    lblEspecie.setVisible(false);
    lblRaza.setVisible(false);

    PanelMascotas.add(panelDetalles, BorderLayout.CENTER);

    PanelMascotas.add(PanelMascotas);
    PanelMascotas.revalidate();
    PanelMascotas.repaint();
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
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarMascota;
    public javax.swing.JTextField Apellidos;
    public javax.swing.JTextField Direccion;
    public javax.swing.JTextField DocuementoIdentidad;
    public javax.swing.JTextField Edad;
    public javax.swing.JTextField Email;
    private javax.swing.JButton Guardar;
    public javax.swing.JComboBox JComboBoxTE;
    public javax.swing.JComboBox JComboBoxTR;
    public javax.swing.JTextField NombreMasc;
    public javax.swing.JTextField Nombres;
    private javax.swing.JPanel PanelMascotas;
    public javax.swing.JTextField Peso;
    private javax.swing.JComboBox Sexo;
    private javax.swing.JComboBox SexoMascota;
    public javax.swing.JTextField Telefono;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
