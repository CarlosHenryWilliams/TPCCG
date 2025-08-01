package com.mycompany.tpccg.igu;

import com.mycompany.tpccg.model.ControladoraLogica;
import com.mycompany.tpccg.model.TipoPropiedad;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerTipoPropiedades extends javax.swing.JFrame {

    /**
     * Creates new form VerTipoPropiedades
     */
    ControladoraLogica controlLogica;

    private void refreshTableTipoPropiedades() {
        new Thread(() -> {
            CargarTablaTipoPropiedades();
        }).start();
    }

    public VerTipoPropiedades() {
        initComponents();
        controlLogica = new ControladoraLogica();
        btnEditar.setEnabled(false);
        completeInputsOnSelectRow();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPContenedorGeneral = new javax.swing.JPanel();
        jPContenedorTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTipoPropiedades = new javax.swing.JTable();
        jPHeader = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jPContenedorFormulario = new javax.swing.JPanel();
        jLFormDesc = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPContenedorGeneral.setBackground(new java.awt.Color(255, 255, 255));

        jPContenedorTabla.setBackground(new java.awt.Color(255, 255, 255));
        jPContenedorTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        tablaTipoPropiedades.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaTipoPropiedades);

        javax.swing.GroupLayout jPContenedorTablaLayout = new javax.swing.GroupLayout(jPContenedorTabla);
        jPContenedorTabla.setLayout(jPContenedorTablaLayout);
        jPContenedorTablaLayout.setHorizontalGroup(
            jPContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContenedorTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPContenedorTablaLayout.setVerticalGroup(
            jPContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContenedorTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPHeader.setBackground(new java.awt.Color(0, 153, 153));

        jLTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo.setText("TIPO DE PROPIEDADES");

        javax.swing.GroupLayout jPHeaderLayout = new javax.swing.GroupLayout(jPHeader);
        jPHeader.setLayout(jPHeaderLayout);
        jPHeaderLayout.setHorizontalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addComponent(jLTitulo)
                .addGap(176, 176, 176))
        );
        jPHeaderLayout.setVerticalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLTitulo)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPContenedorFormulario.setBackground(new java.awt.Color(255, 255, 255));
        jPContenedorFormulario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPContenedorFormulario.setForeground(new java.awt.Color(0, 0, 0));

        jLFormDesc.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLFormDesc.setForeground(new java.awt.Color(0, 0, 0));
        jLFormDesc.setText("Descripción");

        txtDesc.setBackground(new java.awt.Color(255, 255, 255));

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/edit.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/clean.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/delete.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPContenedorFormularioLayout = new javax.swing.GroupLayout(jPContenedorFormulario);
        jPContenedorFormulario.setLayout(jPContenedorFormularioLayout);
        jPContenedorFormularioLayout.setHorizontalGroup(
            jPContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContenedorFormularioLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPContenedorFormularioLayout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPContenedorFormularioLayout.createSequentialGroup()
                        .addComponent(jLFormDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPContenedorFormularioLayout.setVerticalGroup(
            jPContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPContenedorFormularioLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFormDesc)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPContenedorFormularioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPContenedorFormularioLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jPContenedorGeneralLayout = new javax.swing.GroupLayout(jPContenedorGeneral);
        jPContenedorGeneral.setLayout(jPContenedorGeneralLayout);
        jPContenedorGeneralLayout.setHorizontalGroup(
            jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContenedorGeneralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPContenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPContenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(jPHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPContenedorGeneralLayout.setVerticalGroup(
            jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContenedorGeneralLayout.createSequentialGroup()
                .addComponent(jPHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPContenedorFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPContenedorTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPContenedorGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPContenedorGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        refreshTableTipoPropiedades();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //  Controlar que la tabla no este vacia
        if (tablaTipoPropiedades.getRowCount() > 0) {  // controlamos que la tabla no este vacia o sea que haya mas de un registro
            // Controlar que la columna este seleccionada
            if (tablaTipoPropiedades.getSelectedRow() != -1) { // -1 significa que no hay ninguna seleccionada
                
                try {
                    int idTipoPropiedadSeleccionado = Integer.parseInt(String.valueOf(tablaTipoPropiedades.getValueAt(tablaTipoPropiedades.getSelectedRow(), 0)));
                    controlLogica.borrarTipoPropiedad(idTipoPropiedadSeleccionado);
                    mostrarMensaje("Tipo de Propiedad Eliminado Correctamente", "Info", "Eliminacion Exitosa"); // Llama al metodo Mostrar Mensaje
                    refreshTableTipoPropiedades();

                } catch (Exception e) {
                    mostrarMensaje("No puede eliminar el tipo de propiedad porque esta en uso", "Error", "Error tipo propiedad en uso");
                }
            } else {
                mostrarMensaje("No se ha seleccionado ninguna fila", "Error", "Error al no seleccionar");
            }
        } else {
            mostrarMensaje("La tabla se encuentra vacia", "Error", "Tabla Vacia");
        }
        // TODO add your handling code here:


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        try {
            int idTipoPropiedadSeleccionado = 0;
            if (tablaTipoPropiedades.getSelectedRow() != -1) { // -1 significa que no hay ninguna seleccionada
                idTipoPropiedadSeleccionado = Integer.parseInt(String.valueOf(tablaTipoPropiedades.getValueAt(tablaTipoPropiedades.getSelectedRow(), 0)));
            }
            String descripcionTipo = txtDesc.getText();
            if (descripcionTipo.isBlank()) {
                mostrarMensaje("Por favor complete el campo de descripcion", "Error", "Error completar campo descripcion");
            } else {
                controlLogica.modificarTipoPropiedad(idTipoPropiedadSeleccionado, descripcionTipo);
                mostrarMensaje("TipoPropiedad Modificada Correctamente", "Info", "Se ha modificado la propiedad con exito");
                refreshTableTipoPropiedades();
                txtDesc.setText("");
                btnAgregar.setEnabled(true);
                btnEditar.setEnabled(false);
            }
        } catch (Exception e) {
            mostrarMensaje("Error al editar", "Error", "Error al editar");

        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        try {
            String descripcionTipo = txtDesc.getText();
            if (descripcionTipo.isBlank()) {
                mostrarMensaje("Por favor complete el campo de descripcion", "Error", "Error completar campo descripcion");
            } else {
                controlLogica.agregarTipoPropiedad(descripcionTipo);
                mostrarMensaje("Tipo Propiedad Agregado Correctamente", "Info", "Se ha agregado con exito");
                refreshTableTipoPropiedades();
                txtDesc.setText("");
                btnAgregar.setEnabled(true);
                btnEditar.setEnabled(false);
            }

        } catch (Exception e) {
            mostrarMensaje("Error al agregar", "Error", "Error al agregar");

        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void completeInputsOnSelectRow() {
        tablaTipoPropiedades.getSelectionModel().addListSelectionListener(row -> {
            if (!row.getValueIsAdjusting()) { // lo selecciona solo cuando suelta el click
                if (tablaTipoPropiedades.getSelectedRow() != -1) {

                    // DESHABILITO EL BOTON AGREGAR SI SELECCIONO UINO
                    btnAgregar.setEnabled(false);
                    btnEditar.setEnabled(true);

                    String descripcionSelecionada = String.valueOf(tablaTipoPropiedades.getValueAt(tablaTipoPropiedades.getSelectedRow(), 1));
                    txtDesc.setText(descripcionSelecionada);

                } else {
                    // Si no hay ninguna fila seleccionada 
                    btnAgregar.setEnabled(true);
                    btnEditar.setEnabled(false);
                    txtDesc.setText("");

                }
            }
        });
    }


    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtDesc.setText("");
        btnAgregar.setEnabled(true);
        btnEditar.setEnabled(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLFormDesc;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPContenedorFormulario;
    private javax.swing.JPanel jPContenedorGeneral;
    private javax.swing.JPanel jPContenedorTabla;
    private javax.swing.JPanel jPHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTipoPropiedades;
    private javax.swing.JTextField txtDesc;
    // End of variables declaration//GEN-END:variables

    private void CargarTablaTipoPropiedades() {
        // SETEAR MODELO TABLA
        DefaultTableModel modeloTablaTipoPropiedades = new DefaultTableModel() {
            // que fila y columnas no sea editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        // setear nombre de las columnas
        String nombreColumnas[] = {"idTipoPropiedad", "Descripcion"};
        modeloTablaTipoPropiedades.setColumnIdentifiers(nombreColumnas);

        // traer propiedades
        List<TipoPropiedad> listaTipoPropiedades = controlLogica.traerTipoPropiedades();
        if (listaTipoPropiedades != null) {
            for (TipoPropiedad tipoPropiedad : listaTipoPropiedades) {
                Object[] objeto = {tipoPropiedad.getIdTipoPropiedad(), tipoPropiedad.getDescripcion()};
                modeloTablaTipoPropiedades.addRow(objeto);
            }
        }
        tablaTipoPropiedades.setModel(modeloTablaTipoPropiedades);
    }

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {

        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }
}
