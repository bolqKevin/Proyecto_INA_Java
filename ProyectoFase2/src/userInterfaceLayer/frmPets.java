package userInterfaceLayer;

import businessLogicLayer.BLClients;
import businessLogicLayer.BLPets;
import businessLogicLayer.Validations;
import entityLayer.Pet;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Kevin Bolaños V.
 */
public class frmPets extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmPets
     */
    DefaultTableModel model;
    Validations validations = new Validations();
    public frmPets() {
        initComponents();
        try {
            loadPets("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Error: " + ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboSpecies = new javax.swing.JComboBox<>();
        lable1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBreed = new javax.swing.JTextField();
        txtBirthDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboGender = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtClientId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPets = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel2.setText("Mantenimiento de Mascotas");

        jLabel1.setText("ID");

        txtId.setEditable(false);

        jLabel3.setText("Nombre");

        jLabel4.setText("Especie");

        cboSpecies.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perro", "Gato", "Roedor", "Ave" }));

        lable1.setText("Raza");

        jLabel6.setText("Fecha de nacimiento");

        jLabel7.setText("Género");

        cboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "Hembra", " " }));

        jLabel8.setText("Cédula del dueño");

        tblPets.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPetsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPets);

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Limpiar");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(lable1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtBreed, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6))
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboSpecies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtClientId, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel2)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(18, 18, 18)
                .addComponent(btnClear)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit)
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtClientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lable1)
                    .addComponent(txtBreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cboSpecies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnClear)
                    .addComponent(btnExit)
                    .addComponent(btnDelete)
                    .addComponent(btnSearch))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    public void CleanTable(){ //Le da formato a la tabla
        model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int colum){
                return false;
            }
        };
        tblPets.setModel(model);
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Especie");
        model.addColumn("Raza");
        model.addColumn("Fecha de nacimiento");
        model.addColumn("Género");
        model.addColumn("Cédula del dueño");
    }
    
    public void cleanFields(){ //Limpiar campos
    txtBirthDate.setText("");
    txtBreed.setText("");
    txtClientId.setText("");
    txtName.setText("");
    txtId.setText("");
    cboGender.setSelectedItem("Perro");
    cboSpecies.setSelectedItem("Macho");
    }
        
    private Pet petEntity(Pet pet){ //Genera entidad pet
        if(!txtId.getText().equals("")){
        pet.setPetId(Integer.parseInt(txtId.getText()));
        }
        pet.setPetName(txtName.getText());
        pet.setSpecies(cboSpecies.getSelectedItem().toString());
        if(!txtBreed.getText().equals("")){
            pet.setBreed(txtBreed.getText());
        }
        if(!txtBirthDate.getText().equals("")){
            pet.setBirthDate(txtBirthDate.getText());
        }
        pet.setGender(cboGender.getSelectedItem().toString());
        pet.setClientId(txtClientId.getText());
    return pet;
    }
    //Guarda/modifica segun el caso
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
            //Validar cosas antes de proceder con guardar/modificar
            
            if(validations.validateId(txtClientId.getText()) == false){
                JOptionPane.showMessageDialog(this, "Debe agregar una cédula valida"); //Que cliente ID sea una cédula valida
                return;
            }
            if(validations.validateBirthDate(txtBirthDate.getText()) == false){
               JOptionPane.showMessageDialog(this, "Debe agregar una fecha valida con formato aaaa-mm-dd"); //Que la fecha sea valida
               return;
            }
            BLClients blClient = new BLClients();
            try {
              if (!blClient.verifyClientIdExists(txtClientId.getText())) {
                  JOptionPane.showMessageDialog(this, "Cédula no registrada"); //Que la cédula esté registrada
                  return;
              }
            } catch (Exception e) {}
                try {
            BLPets logic = new BLPets();
            
            if(!txtName.getText().equals("") && !txtName.getText().equals("") && !txtClientId.getText().equals("")){
                Pet pet = new Pet();
                pet = petEntity(pet);
               if(logic.verifyPetIdExists(pet) == false){
                   logic.insertPet(pet);
               }else{
                   logic.updatePet(pet);
               }
               
               JOptionPane.showMessageDialog(this, logic.getMensaje());
               cleanFields();
               loadPets("");
            }else{
                JOptionPane.showMessageDialog(this, "Agregar todos los datos");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed
    
    //Carga mascota con doble click en la tabla
    private void tblPetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPetsMouseClicked
        // TODO add your handling code here:
            try {
            BLPets logic = new BLPets();
            Pet pet;
            String condition;
            if(evt.getClickCount() == 2){
                int fila = tblPets.rowAtPoint(evt.getPoint());
                txtClientId.setText(tblPets.getValueAt(fila, 0).toString());
                condition = String.format("PETID=%s ", txtClientId.getText());
                pet=logic.getPet(condition);
                
                txtClientId.setText(pet.getClientId());
                txtName.setText(pet.getPetName());
                txtBreed.setText(pet.getBreed());
                txtBirthDate.setText(pet.getBirthDate());
                txtId.setText(String.valueOf(pet.getPetId()));
                cboGender.setSelectedItem(pet.getGender());
                cboSpecies.setSelectedItem(pet.getSpecies());
            }
        } catch (Exception e) 
        {
        }
    }//GEN-LAST:event_tblPetsMouseClicked

    //Elimina mascota
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        BLPets logic = new BLPets();
        Pet pet = new Pet();
        String condition;
        try {
            pet = petEntity(pet);
            if(logic.verifyPetIdExists(pet)){
                if(logic.deletePet(pet)>0){
                    JOptionPane.showMessageDialog(this, logic.getMensaje());
                    cleanFields();
                    loadPets("");
                }else{
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar la mascota ");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Debe seleccionar una mascota con doble click ");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "La mascota tiene registros medicos y no se puede eliminar ");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        cleanFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed
       
    //activa una ventana de búsqueda de mascotas para seleccionar una mascota y cargarla
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    frmSearchPets searchPet = new frmSearchPets(null, true); // Null que no tiene contenedor y true que es un modal
    searchPet.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosed(WindowEvent e) {
            try {
                int petId = searchPet.GetId();
                String condition;
                BLPets logic = new BLPets();
                Pet pet;
                
                if (petId != -1) {
                    condition = "PETID = " + petId;
                    pet = logic.getPet(condition);
                    
                    txtId.setText(String.valueOf(pet.getPetId()));
                    txtName.setText(pet.getPetName());
                    cboSpecies.setSelectedItem(pet.getSpecies());
                    txtBreed.setText(pet.getBreed());
                    txtBirthDate.setText(pet.getBirthDate());
                    cboGender.setSelectedItem(pet.getGender());
                    txtClientId.setText(pet.getClientId());
                } else {
                    cleanFields();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }
    });
    searchPet.setVisible(true);
    }//GEN-LAST:event_btnSearchActionPerformed

    //Carga en la tabla
    public void loadPets(String condition) throws Exception{
        try {
            BLPets logic = new BLPets();
            List<Pet> list;
            CleanTable();
            Object[] fila = new Object[7];
            list = logic.listPets(condition, "");
            for(Pet cli : list){
            fila[0] = cli.getPetId();
            fila[1] = cli.getPetName();
            fila[2] = cli.getSpecies();
            fila[3] = cli.getBreed();
            fila[4] = cli.getBirthDate();
            fila[5] = cli.getGender();
            fila[6] = cli.getClientId();
            model.addRow(fila);
            }
        } catch (Exception e) {
        }//Cargar cliente list
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cboGender;
    private javax.swing.JComboBox<String> cboSpecies;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lable1;
    private javax.swing.JTable tblPets;
    private javax.swing.JTextField txtBirthDate;
    private javax.swing.JTextField txtBreed;
    private javax.swing.JTextField txtClientId;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}

