/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package userInterfaceLayer;

import businessLogicLayer.BLClients;
import businessLogicLayer.BLEmployees;
import businessLogicLayer.BLProducts;
import businessLogicLayer.Validations;
import entityLayer.Client;
import entityLayer.Product;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 * @author Kevin Bolaños V.
 */
public class frmSales extends javax.swing.JInternalFrame {
    DefaultTableModel model;
    Validations validate = new Validations();
    List<Product> productList = new ArrayList<>();
    int SuppId;
    /**
     * Creates new form frmSales
     */
    public frmSales() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        txtTotalAmount = new javax.swing.JTextField();
        txtClientPhone = new javax.swing.JTextField();
        txtTaxes = new javax.swing.JTextField();
        txtClientEmail = new javax.swing.JTextField();
        btnGenerateInvoice = new javax.swing.JButton();
        txtClientAddress = new javax.swing.JTextField();
        btnRemoveFromLlist = new javax.swing.JButton();
        btnLoadClient = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        btnLoadProduct = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmployeeId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtClientId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cboDiscount = new javax.swing.JComboBox<>();

        jLabel1.setText("Información del Cliente: ");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Número: ");

        jLabel4.setText("Correo: ");

        jLabel5.setText("Dirección: ");

        txtClientName.setEditable(false);

        txtTotalAmount.setEditable(false);

        txtClientPhone.setEditable(false);

        txtTaxes.setEditable(false);

        txtClientEmail.setEditable(false);

        btnGenerateInvoice.setText("Realizar Factura");
        btnGenerateInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateInvoiceActionPerformed(evt);
            }
        });

        txtClientAddress.setEditable(false);

        btnRemoveFromLlist.setText("Borrar de la lista");
        btnRemoveFromLlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFromLlistActionPerformed(evt);
            }
        });

        btnLoadClient.setText("Cargar Cliente");
        btnLoadClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadClientActionPerformed(evt);
            }
        });

        btnExit.setText("Cancelar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProducts);

        btnLoadProduct.setText("Cargar Productos");
        btnLoadProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadProductActionPerformed(evt);
            }
        });

        jLabel6.setText("Impuestos");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel7.setText("Ventas");

        jLabel8.setText("Monto Final: ");

        jLabel9.setText("Cédula del vendedor:");

        jLabel10.setText("Cédula: ");

        txtClientId.setEditable(false);

        jLabel11.setText("Descuento: ");

        cboDiscount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "1%", "2%", "3% (Pago en efectivo)", "4%", "5%" }));
        cboDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDiscountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmployeeId))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnLoadProduct)
                                .addGap(18, 18, 18)
                                .addComponent(btnGenerateInvoice)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRemoveFromLlist)
                                .addGap(18, 18, 18)
                                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtTaxes, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtClientName))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtClientAddress)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtClientPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel10))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtClientId)
                                            .addComponent(txtClientEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLoadClient)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtClientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtClientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtClientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtClientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoadClient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cboDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtTaxes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLoadProduct)
                        .addComponent(jLabel8)
                        .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGenerateInvoice)
                        .addComponent(btnRemoveFromLlist)
                        .addComponent(btnExit)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Es el método para abir el otro formulario que inserta la factura, por lo que tiene varias validaciónes y emvía los datos de este formulario al otro
    private void btnGenerateInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateInvoiceActionPerformed
        BLEmployees blEmployees = new BLEmployees();
        if (productList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe cargar productos antes de generar una factura.");
            return;
        }
        if(txtEmployeeId.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe digitar el ID del empleado.");
            return;
        }
        try {
            if(!blEmployees.verifyEmployeeIdExists(txtEmployeeId.getText())){
                 JOptionPane.showMessageDialog(this, "El empleado no existe");
                return;
            }
        } catch (Exception ex) {
            Logger.getLogger(frmSales.class.getName()).log(Level.SEVERE, null, ex);
        }
        frmSaleReceipt Receipt = new frmSaleReceipt(null, true); // Null que no tiene contenedor y true que es un modal
        Receipt.setLocationRelativeTo(null);
        final frmSales this_ = this;
        Receipt.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    // Pasar la lista productList al formulario frmSaleReceipt
                    this_.dispose();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                }
            }
        });
        Receipt.loadSalesData(productList, txtClientId.getText(), txtEmployeeId.getText(), cboDiscount.getSelectedItem().toString(), txtClientPhone.getText(), txtTotalAmount.getText(), txtTaxes.getText());
        Receipt.setVisible(true);
    }//GEN-LAST:event_btnGenerateInvoiceActionPerformed

    

private void updateTotalAmount(double discountRate) { // Actualiza el precio en base al descuento que recibe como parametro
    double totalAmount = 0.0;
    double totalTaxes = 0.0;

    for (Product product : productList) {
        double productPrice = (product.getPrice() * product.getReorderQuantity()) * 1.25;
        double productTaxes = productPrice * 0.13;
        
        if (discountRate > 0) {
            double discount = productPrice * discountRate;
            productPrice -= discount;
        }
        
        totalAmount += productPrice;
        totalTaxes += productTaxes;
    }

    txtTotalAmount.setText(Double.toString(totalAmount + totalTaxes));
    txtTaxes.setText(Double.toString(totalTaxes));
}
    
    private void btnRemoveFromLlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFromLlistActionPerformed
        // TODO add your handling code here:
        btnRemoveFromLlist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeSelectedProduct();
                updateTotalAmount(0);
            }
        });
    }//GEN-LAST:event_btnRemoveFromLlistActionPerformed

    private void removeSelectedProduct() {
    int selectedRow = tblProducts.getSelectedRow();
    
    if (selectedRow != -1) {
        productList.remove(selectedRow);
        updateTable();
    } 
}
    //Suma los datos de una columna
  public double calculateTotalAmount(int columnToSum) {
    double totalAmount = 0.0;

    for (int row = 0; row < model.getRowCount(); row++) {
        Object value = model.getValueAt(row, columnToSum);
        if (value instanceof Double) {
            totalAmount += (double) value;
        } else if (value instanceof String) {
            try {
                totalAmount += Double.parseDouble((String) value);
            } catch (NumberFormatException e) {
                throw e;
            }
        }
  }

    return totalAmount;
}
 //Actualiza la tabla y los text field del monto total 
private void updateTable() {
    clearTable();

    for (Product product : productList) {
        Object[] fila = new Object[8];
        fila[0] = product.getProductId();
        fila[1] = product.getProducName();
        fila[2] = product.getDescription();
        fila[3] = product.getCurrentStock();
        fila[4] = product.getReorderQuantity(); //Reciclando esto para la cantidad que va a comprar el usuario
        fila[5] = String.format("%.2f", (product.getPrice() * product.getReorderQuantity()) * 1.25);
        double taxes = (product.getPrice() * 1.25) * product.getReorderQuantity() * 0.13;
        fila[6] = taxes;
        model.addRow(fila);
    }

    double totalAmount = calculateTotalAmount(5);
    double totalTaxes = calculateTotalAmount(6);
    txtTotalAmount.setText(Double.toString(totalAmount + totalTaxes));
    txtTaxes.setText(Double.toString(totalTaxes));
    updateTotalAmount(0);
}

//Le da formato a la tabla
public void clearTable() {
    model = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    tblProducts.setModel(model);
    model.addColumn("Producto ID");
    model.addColumn("Nombre");
    model.addColumn("Descripción");
    model.addColumn("Existencias");
    model.addColumn("Cantidad");
    model.addColumn("Precio");
    model.addColumn("Impuestos");
}
    
    // Redirige a otro form que cuanto se cierra carga datos en este
    private void btnLoadClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadClientActionPerformed
    frmSearchClients searchClient = new frmSearchClients(null, true); 
        searchClient.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                String id = searchClient.GetId();
                String condition;
                BLClients logic = new BLClients();
                Client client;
            if(id != ""){
                productList.clear();
                cboDiscount.setSelectedItem("Seleccionar (0%)");
                updateTable();
                condition = "CLIENTID= '"+ id + "'";
                client = logic.GetClient(condition);
                txtClientId.setText(String.valueOf(client.getId_client()));
                txtClientName.setText(String.valueOf(client.getFirstName() + " " +client.getLastName()));
                txtClientPhone.setText(String.valueOf(client.getPhone()));
                txtClientAddress.setText(String.valueOf(client.getAddress()));
                txtClientEmail.setText(String.valueOf(client.getEmail()));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
            }
        });
        searchClient.setVisible(true);
    }//GEN-LAST:event_btnLoadClientActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

// Redirige a otro form que cuanto se cierra carga datos en este
    private void btnLoadProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadProductActionPerformed
       // TODO add your handling code here:
       if(txtClientName.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Debe cargar un Cliente");
           return;
       }
    frmLoadProduct loadProductForm = new frmLoadProduct(null, true, true); 
    loadProductForm.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosed(WindowEvent e) {
            try {
                int quantity = loadProductForm.GetQuantity();
                int productId = loadProductForm.GetId();
                String condition;
                BLProducts logic = new BLProducts();
                Product product;
                if (productId != -1) {
                condition = "PRODUCTID = " + productId;
                product = logic.getProduct(condition);
                loadProducts(product, quantity);

                } else {
                    
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }
    });
    loadProductForm.setVisible(true);
    }//GEN-LAST:event_btnLoadProductActionPerformed
    // Actualiza los precios en base a la elección del usuario en el cbo
    private void cboDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDiscountActionPerformed
        // TODO add your handling code here:
    String selectedDiscount = (String) cboDiscount.getSelectedItem();
    
    if (selectedDiscount.equals("0%")) {
        updateTotalAmount(0);
    } else if (selectedDiscount.equals("1%")) {
        updateTotalAmount(0.01);
    } else if (selectedDiscount.equals("2%")) {
        updateTotalAmount(0.02);
    } else if (selectedDiscount.equals("3% (Pago en efectivo)")) {
        updateTotalAmount(0.03);
    } else if (selectedDiscount.equals("4%")) {
        updateTotalAmount(0.04);
    } else if (selectedDiscount.equals("5%")) {
        updateTotalAmount(0.05);
    }
    }//GEN-LAST:event_cboDiscountActionPerformed
    
    //Actualiza la tabla
    public void loadProducts(Product product_, int quantity) throws Exception {
    try {
        product_.setReorderQuantity(quantity);
        productList.add(product_);
        updateTable(); // Actualizar la tabla y los totales
    } catch (Exception e) {
        //JOptionPane.showMessageDialog(this, e);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGenerateInvoice;
    private javax.swing.JButton btnLoadClient;
    private javax.swing.JButton btnLoadProduct;
    private javax.swing.JButton btnRemoveFromLlist;
    private javax.swing.JComboBox<String> cboDiscount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtClientAddress;
    private javax.swing.JTextField txtClientEmail;
    private javax.swing.JTextField txtClientId;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtClientPhone;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtTaxes;
    private javax.swing.JTextField txtTotalAmount;
    // End of variables declaration//GEN-END:variables
}
