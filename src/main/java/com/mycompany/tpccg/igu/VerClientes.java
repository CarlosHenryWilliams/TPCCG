package com.mycompany.tpccg.igu;

import com.microsoft.sqlserver.jdbc.StringUtils;
import com.mycompany.tpccg.controllers.ClienteJpaController;
import java.util.List;
import com.mycompany.tpccg.model.*;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class VerClientes extends javax.swing.JFrame {
  static ClienteJpaController clientController = new ClienteJpaController();

  private int IDCliente;

  private void refreshTableClients() {
    new Thread(() -> { loadClientTable(clientController.findClienteEntities()); }).start();
  }
  
  private void setResultLabelStyle(boolean visible, String text, Color color) {
    LabelResultData.setVisible(visible);
    LabelResultData.setText(text);
    LabelResultData.setForeground(color);
  }
  
  private boolean validateDataInputs(String firstname, String lastname, String dni) {
    if (StringUtils.isEmpty(firstname) ||  StringUtils.isEmpty(lastname) || StringUtils.isEmpty(dni)) {
      setResultLabelStyle(true, "Error en los datos del cliente", Color.red);
      return false;
    }
    return true;
  }

  private void loadClientTable(List<Cliente> clientList) {
    DefaultTableModel model = (DefaultTableModel) clientTable.getModel();
    model.setRowCount(0);
    for (Cliente obj : clientList) {
      String[] partes = obj.getNombreCompleto().split(";");
      String firstname = partes.length > 0 ? partes[0] : "";
      String lastname = partes.length > 1 ? partes[1] : "";
      model.addRow(new Object[] {
        obj.getIdCliente(),
        firstname,
        lastname,
        obj.getDNI()
      });
    }
  }

  private void completeInputsOnSelectRow() {
    clientTable.getSelectionModel().addListSelectionListener(row -> {
      if (!row.getValueIsAdjusting()) {
        int fila = clientTable.getSelectedRow();
        if (fila != -1) {
          refreshInputs.setEnabled(true); // SELECCIONO UN CLIENTE EXISTENTE
          editBtn.setEnabled(true); 
          deleteBtn.setEnabled(true);
          createBtn.setEnabled(false); 
          this.IDCliente = Integer.parseInt(clientTable.getValueAt(fila, 0).toString());
          FirstNameInput.setText(clientTable.getValueAt(fila, 1).toString()); // Nombre
          LastNameInput.setText(clientTable.getValueAt(fila, 2).toString()); // Apellido
          dniInput.setText(clientTable.getValueAt(fila, 3).toString()); // DNI
        } 
      }
    });
  }
  
  private void refreshInputsAndButtons() {
    this.IDCliente = -1;
    createBtn.setEnabled(true);
    refreshInputs.setEnabled(false);
    deleteBtn.setEnabled(false);
    editBtn.setEnabled(false);
    FirstNameInput.setText("");
    LastNameInput.setText("");
    dniInput.setText("");
  }
  
  public VerClientes() {
    initComponents();
    refreshTableClients();
    completeInputsOnSelectRow();
    refreshInputsAndButtons();
    setResultLabelStyle(false, null, null);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPContenedorGeneral = new javax.swing.JPanel();
    jPHeader = new javax.swing.JPanel();
    jLTitulo = new javax.swing.JLabel();
    closeBtn = new javax.swing.JButton();
    jPContenedorTabla = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    clientTable = new javax.swing.JTable();
    jPContenedorBotones = new javax.swing.JPanel();
    FirstNameLabel = new javax.swing.JLabel();
    FirstNameInput = new javax.swing.JTextField();
    FirstNameLabel1 = new javax.swing.JLabel();
    LastNameInput = new javax.swing.JTextField();
    FirstNameLabel2 = new javax.swing.JLabel();
    dniInput = new javax.swing.JTextField();
    editBtn = new javax.swing.JButton();
    deleteBtn = new javax.swing.JButton();
    createBtn = new javax.swing.JButton();
    refreshInputs = new javax.swing.JButton();
    LabelResultData = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPContenedorGeneral.setBackground(new java.awt.Color(204, 204, 204));

    jPHeader.setBackground(new java.awt.Color(0, 153, 153));
    jPHeader.setPreferredSize(new java.awt.Dimension(428, 110));

    jLTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
    jLTitulo.setForeground(new java.awt.Color(255, 255, 255));
    jLTitulo.setText("CLIENTES");

    closeBtn.setBackground(new java.awt.Color(102, 102, 102));
    closeBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    closeBtn.setText("Cerrar");
    closeBtn.setBorderPainted(false);
    closeBtn.setFocusPainted(false);
    closeBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        closeBtnActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPHeaderLayout = new javax.swing.GroupLayout(jPHeader);
    jPHeader.setLayout(jPHeaderLayout);
    jPHeaderLayout.setHorizontalGroup(
      jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPHeaderLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLTitulo)
        .addGap(347, 347, 347))
    );
    jPHeaderLayout.setVerticalGroup(
      jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPHeaderLayout.createSequentialGroup()
        .addGroup(jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPHeaderLayout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(jLTitulo))
          .addGroup(jPHeaderLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(closeBtn)))
        .addContainerGap(28, Short.MAX_VALUE))
    );

    jPContenedorTabla.setBackground(new java.awt.Color(204, 204, 204));
    jPContenedorTabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

    clientTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "IDCliente", "Nombre", "Apellido", "DNI"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    clientTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
    jScrollPane1.setViewportView(clientTable);
    if (clientTable.getColumnModel().getColumnCount() > 0) {
      clientTable.getColumnModel().getColumn(0).setMinWidth(0);
      clientTable.getColumnModel().getColumn(0).setMaxWidth(0);
    }

    javax.swing.GroupLayout jPContenedorTablaLayout = new javax.swing.GroupLayout(jPContenedorTabla);
    jPContenedorTabla.setLayout(jPContenedorTablaLayout);
    jPContenedorTablaLayout.setHorizontalGroup(
      jPContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    jPContenedorTablaLayout.setVerticalGroup(
      jPContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    jPContenedorBotones.setBackground(new java.awt.Color(204, 204, 204));

    javax.swing.GroupLayout jPContenedorBotonesLayout = new javax.swing.GroupLayout(jPContenedorBotones);
    jPContenedorBotones.setLayout(jPContenedorBotonesLayout);
    jPContenedorBotonesLayout.setHorizontalGroup(
      jPContenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );
    jPContenedorBotonesLayout.setVerticalGroup(
      jPContenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 130, Short.MAX_VALUE)
    );

    FirstNameLabel.setBackground(new java.awt.Color(0, 0, 0));
    FirstNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    FirstNameLabel.setForeground(new java.awt.Color(0, 0, 0));
    FirstNameLabel.setText("Nombre");

    FirstNameInput.setBackground(new java.awt.Color(255, 255, 255));
    FirstNameInput.setForeground(new java.awt.Color(0, 0, 0));
    FirstNameInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    FirstNameLabel1.setBackground(new java.awt.Color(0, 0, 0));
    FirstNameLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    FirstNameLabel1.setForeground(new java.awt.Color(0, 0, 0));
    FirstNameLabel1.setText("Apellido");

    LastNameInput.setBackground(new java.awt.Color(255, 255, 255));
    LastNameInput.setForeground(new java.awt.Color(0, 0, 0));
    LastNameInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    FirstNameLabel2.setBackground(new java.awt.Color(0, 0, 0));
    FirstNameLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    FirstNameLabel2.setForeground(new java.awt.Color(0, 0, 0));
    FirstNameLabel2.setText("DNI");

    dniInput.setBackground(new java.awt.Color(255, 255, 255));
    dniInput.setForeground(new java.awt.Color(0, 0, 0));
    dniInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    editBtn.setBackground(new java.awt.Color(0, 153, 153));
    editBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    editBtn.setText("Editar");
    editBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        editBtnActionPerformed(evt);
      }
    });

    deleteBtn.setBackground(new java.awt.Color(0, 153, 153));
    deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    deleteBtn.setText("Eliminar");
    deleteBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        deleteBtnActionPerformed(evt);
      }
    });

    createBtn.setBackground(new java.awt.Color(0, 153, 153));
    createBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    createBtn.setText("Crear");
    createBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        createBtnActionPerformed(evt);
      }
    });

    refreshInputs.setBackground(new java.awt.Color(0, 153, 153));
    refreshInputs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    refreshInputs.setText("Limpiar");
    refreshInputs.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        refreshInputsActionPerformed(evt);
      }
    });

    LabelResultData.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    LabelResultData.setForeground(new java.awt.Color(0, 0, 0));
    LabelResultData.setText("jLabel1");

    javax.swing.GroupLayout jPContenedorGeneralLayout = new javax.swing.GroupLayout(jPContenedorGeneral);
    jPContenedorGeneral.setLayout(jPContenedorGeneralLayout);
    jPContenedorGeneralLayout.setHorizontalGroup(
      jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPContenedorGeneralLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPContenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPContenedorGeneralLayout.createSequentialGroup()
            .addGroup(jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(FirstNameLabel)
              .addComponent(FirstNameLabel1)
              .addComponent(FirstNameLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPContenedorGeneralLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(dniInput, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(FirstNameInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(LastNameInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPContenedorBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPContenedorGeneralLayout.createSequentialGroup()
            .addGroup(jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(LabelResultData)
              .addGroup(jPContenedorGeneralLayout.createSequentialGroup()
                .addComponent(refreshInputs, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 12, Short.MAX_VALUE)))
        .addContainerGap())
      .addComponent(jPHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
    );
    jPContenedorGeneralLayout.setVerticalGroup(
      jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPContenedorGeneralLayout.createSequentialGroup()
        .addComponent(jPHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPContenedorGeneralLayout.createSequentialGroup()
            .addGap(59, 59, 59)
            .addGroup(jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPContenedorGeneralLayout.createSequentialGroup()
                .addComponent(jPContenedorBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
              .addGroup(jPContenedorGeneralLayout.createSequentialGroup()
                .addGroup(jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(FirstNameLabel)
                  .addComponent(FirstNameInput))
                .addGap(27, 27, 27)
                .addGroup(jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(FirstNameLabel1)
                  .addComponent(LastNameInput))
                .addGap(27, 27, 27)
                .addGroup(jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(FirstNameLabel2)
                  .addComponent(dniInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(refreshInputs)
                  .addComponent(deleteBtn)
                  .addComponent(editBtn)
                  .addComponent(createBtn))
                .addGap(18, 18, 18)
                .addComponent(LabelResultData)
                .addGap(57, 57, 57))))
          .addGroup(jPContenedorGeneralLayout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPContenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPContenedorGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPContenedorGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
    if(!validateDataInputs(FirstNameInput.getText(), LastNameInput.getText(), dniInput.getText())) {
      return;
    }
    Cliente client = new Cliente();
    client.setNombreCompleto(FirstNameInput.getText() + ";" + LastNameInput.getText());
    client.setIdCliente(IDCliente);
    client.setDNI(dniInput.getText());
    try {
      clientController.edit(client);
      setResultLabelStyle(true, "Cliente guardado correctamente", Color.GREEN);
      refreshTableClients();
      refreshInputsAndButtons();
    } catch (Exception e) {
      setResultLabelStyle(true, "Error al guardar el cliente", Color.red);
    } 
  }//GEN-LAST:event_editBtnActionPerformed

  private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
    try {
      clientController.destroy(IDCliente);
      setResultLabelStyle(true, "Cliente eliminado correctamente", Color.GREEN);
      refreshTableClients();
      refreshInputsAndButtons();
    } catch (Exception e) {
      setResultLabelStyle(true, "Error al eliminar el cliente", Color.red);
    }
  }//GEN-LAST:event_deleteBtnActionPerformed

  private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
    if(!validateDataInputs(FirstNameInput.getText(), LastNameInput.getText(), dniInput.getText())) {
      return;
    }
    Cliente client = new Cliente();
    client.setNombreCompleto(FirstNameInput.getText() + ";" + LastNameInput.getText());
    client.setDNI(dniInput.getText());
    try {
      clientController.create(client);
      setResultLabelStyle(true, "Cliente guardado correctamente", Color.GREEN);
      refreshTableClients();
      refreshInputsAndButtons();
    } catch (Exception e) {
      setResultLabelStyle(true, "Error al guardar el cliente", Color.red);
    }
  }//GEN-LAST:event_createBtnActionPerformed

  private void refreshInputsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshInputsActionPerformed
    refreshInputsAndButtons();
  }//GEN-LAST:event_refreshInputsActionPerformed

  private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
    this.dispose();
  }//GEN-LAST:event_closeBtnActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField FirstNameInput;
  private javax.swing.JLabel FirstNameLabel;
  private javax.swing.JLabel FirstNameLabel1;
  private javax.swing.JLabel FirstNameLabel2;
  private javax.swing.JLabel LabelResultData;
  private javax.swing.JTextField LastNameInput;
  private javax.swing.JTable clientTable;
  private javax.swing.JButton closeBtn;
  private javax.swing.JButton createBtn;
  private javax.swing.JButton deleteBtn;
  private javax.swing.JTextField dniInput;
  private javax.swing.JButton editBtn;
  private javax.swing.JLabel jLTitulo;
  private javax.swing.JPanel jPContenedorBotones;
  private javax.swing.JPanel jPContenedorGeneral;
  private javax.swing.JPanel jPContenedorTabla;
  private javax.swing.JPanel jPHeader;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JButton refreshInputs;
  // End of variables declaration//GEN-END:variables
}
