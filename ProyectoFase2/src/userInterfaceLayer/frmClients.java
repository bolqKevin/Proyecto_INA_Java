/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package userInterfaceLayer;

import businessLogicLayer.BLClients;
import businessLogicLayer.Validations;
import entityLayer.Client;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin Bolaños V.
 */
public class frmClients extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmClients
     */
    DefaultTableModel model;
    Validations validate = new Validations();
    
    public frmClients() {
        initComponents();
        try {
            loadClients("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Error: " + ex);
        }
    }
    
    public void ClearTable(){
        model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int colum){
                return false;
            }
        };
        tblClients.setModel(model);
        model.addColumn("Cédula");
        model.addColumn("Nombre");
        model.addColumn("Apellidos");
        model.addColumn("Dirección");
        model.addColumn("Telefono");
        model.addColumn("Correo");
        model.addColumn("Notas");
    }
            
    public void cleanFields(){
        txtClientId.setText("");
        txtAddress.setText("");
        txtEmail.setText("");
        txtLastName.setText("");
        txtName.setText("");
        txtNotes.setText("");
        txtPhone.setText("");
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtClientId = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        Labe12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lable234 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lable56 = new javax.swing.JLabel();
        lable55 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblClients = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        txtNotes.setColumns(20);
        txtNotes.setRows(5);
        jScrollPane2.setViewportView(txtNotes);

        jLabel1.setText("Correo Electronico");

        Labe12.setText("Cédula");

        jLabel3.setText("Apellidos");

        lable234.setText("Nombre");

        jLabel5.setText("Número");

        lable56.setText("Dirección");

        lable55.setText("Notas");

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel2.setText("Mantenimiento de Clientes");

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tblClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "Title 6", "null"
            }
        ));
        tblClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblClients);

        btnClear.setText("Limpiar");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lable56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lable55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lable234)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtLastName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Labe12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEmail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(txtClientId)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(btnSave)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnClear)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lable234)
                    .addComponent(jLabel3)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe12)
                    .addComponent(txtClientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lable56))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lable55)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnSearch)
                    .addComponent(btnDelete)
                    .addComponent(btnExit)
                    .addComponent(btnClear))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private Client clientEntity(Client client){
        client.setId_client(txtClientId.getText());
        client.setAddress(txtAddress.getText());
        client.setEmail(txtEmail.getText());
        client.setFirstName(txtName.getText());
        client.setLastName(txtLastName.getText());
        client.setPhone(txtPhone.getText());
        client.setNotes(txtNotes.getText());
    return client;
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
          if(txtName.getText().equals("") || txtPhone.getText().equals("") || txtClientId.getText().equals("") || txtLastName.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe agregar todos los datos"); //Que los datos estén completos
                return;
            }
          
          if(validate.validateId(txtClientId.getText()) == false){
                JOptionPane.showMessageDialog(this, "Debe agregar una cédula valida"); //Que cliente ID sea una cédula valida
                return;
            }
          if(!validate.validateEmail(txtEmail.getText())){
                 JOptionPane.showMessageDialog(this, "Debe agregar un correo valido"); //Que haya un correo valido
                return;
            }
          if(!validate.validatePhoneNumber(txtPhone.getText())){
            JOptionPane.showMessageDialog(this, "Debe agregar un Número telefonico valido"); //Que haya un número valido
                return;
            }
                try {
                BLClients logic = new BLClients(); 
                Client client = new Client();
                client = clientEntity(client);
                if(!logic.verifyClientPhone(client.getPhone()) == false){
                JOptionPane.showMessageDialog(this, "El número ya está registrado"); //Que el número no esté registrado en la base de datos
                return;
               }
               if(!logic.verifyClientEmail(client.getEmail()) == false){
                JOptionPane.showMessageDialog(this, "El Correo ya está registrado"); //Que el Correo no esté registrado en la base de datos
                return;
               }
               if(logic.verifyClientIdExists(client) == false){
                   logic.insertClient(client);
               }else{
                   logic.UpdateClient(client);
               }
               
               JOptionPane.showMessageDialog(this, logic.getMessage());
               cleanFields();
               loadClients("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed
        
    public void loadClients(String condicion) throws Exception{
        try {
            BLClients logic = new BLClients();
            List<Client> list;
            ClearTable();
            Object[] fila = new Object[7];
            list = logic.listClients(condicion, "");
            for(Client cli : list){
            fila[0] = cli.getId_client();
            fila[1] = cli.getFirstName();
            fila[2] = cli.getLastName();
            fila[3] = cli.getAddress();
            fila[4] = cli.getPhone();
            fila[5] = cli.getEmail();
            fila[6] = cli.getNotes();
            model.addRow(fila);
            }
        } catch (Exception e) {
        }//Cargar cliente list
    }
        
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        BLClients logic = new BLClients();
        Client client = new Client();
        String condition;
        try {
            client = clientEntity(client);
            if(logic.verifyClientIdExists(client)){
                if(logic.DeleteClient(client)>0){
                    JOptionPane.showMessageDialog(this, logic.getMessage());
                    cleanFields();
                    loadClients("");
                }else{
                    JOptionPane.showMessageDialog(this, "NO ELIMINADO ");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente ");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "El cliente tiene citas o Facturas en la base de datos y no se puede eliminar ");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientsMouseClicked
        // TODO add your handling code here:
          try {
            BLClients logic = new BLClients();
            Client client;
            String condition;
            if(evt.getClickCount() == 2){
                int fila = tblClients.rowAtPoint(evt.getPoint());
                txtClientId.setText(tblClients.getValueAt(fila, 0).toString());
                condition = String.format("CLIENTID= '%s ", txtClientId.getText() + "'");
                client=logic.GetClient(condition);
                
                txtClientId.setText(client.getId_client());
                txtName.setText(client.getFirstName());
                txtLastName.setText(client.getLastName());
                txtAddress.setText(client.getAddress());
                txtPhone.setText(client.getPhone());
                txtEmail.setText(client.getEmail());
                txtNotes.setText(client.getNotes());
            }
        } catch (Exception e) 
        {
        }
    }//GEN-LAST:event_tblClientsMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        cleanFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        frmSearchClients searchClient = new frmSearchClients(null, true); // Null que no tiene contenerdor y true que es un modal
        searchClient.addWindowListener(new WindowAdapter(){
        @Override
        public void windowClosed(WindowEvent e){
        try {
            String id = searchClient.GetId();
            String condition;
            BLClients logic = new BLClients();
            Client client;
            if(id != ""){
                condition = "CLIENTID= '"+ id + "'";
                client = logic.GetClient(condition);
                txtClientId.setText(String.valueOf(client.getId_client()));
                txtName.setText(String.valueOf(client.getFirstName()));
                txtPhone.setText(String.valueOf(client.getPhone()));
                txtAddress.setText(String.valueOf(client.getAddress()));
                txtLastName.setText(String.valueOf(client.getLastName()));
                txtNotes.setText(String.valueOf(client.getNotes()));
                txtEmail.setText(String.valueOf(client.getEmail()));
            }else{
                cleanFields();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
        }
        });
        searchClient.setVisible(true);
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Labe12;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lable234;
    private javax.swing.JLabel lable55;
    private javax.swing.JLabel lable56;
    private javax.swing.JTable tblClients;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtClientId;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtNotes;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
