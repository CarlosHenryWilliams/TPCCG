package com.mycompany.tpccg.igu;

import com.mycompany.tpccg.model.ControladoraLogica;
import com.mycompany.tpccg.model.Propiedad;
import com.mycompany.tpccg.model.TipoPropiedad;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerPropiedades extends javax.swing.JFrame {

    ControladoraLogica controlLogica;

    private void refreshTablePropiedades() {
        new Thread(() -> {
            CargarTablaPropiedades();
        }).start();
    }

    public VerPropiedades() {
        initComponents();
        controlLogica = new ControladoraLogica();
        CargarTipoPropiedades();
        completeInputsOnSelectRow();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPContenedorGeneral = new javax.swing.JPanel();
        jPHeader = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jPContenedorTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPropiedades = new javax.swing.JTable();
        jPContenedorFormulario = new javax.swing.JPanel();
        jLFormDireccion = new javax.swing.JLabel();
        jLFormPrecio = new javax.swing.JLabel();
        jLFormCantAmb = new javax.swing.JLabel();
        jLFormTipoProp = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        cmbCantAmbientes = new javax.swing.JComboBox<>();
        cmbTipoPropiedad = new javax.swing.JComboBox();
        btnLimpiar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPContenedorGeneral.setBackground(new java.awt.Color(255, 255, 255));

        jPHeader.setBackground(new java.awt.Color(0, 153, 153));
        jPHeader.setPreferredSize(new java.awt.Dimension(428, 110));

        jLTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo.setText("PROPIEDADES");

        javax.swing.GroupLayout jPHeaderLayout = new javax.swing.GroupLayout(jPHeader);
        jPHeader.setLayout(jPHeaderLayout);
        jPHeaderLayout.setHorizontalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jLTitulo)
                .addContainerGap(381, Short.MAX_VALUE))
        );
        jPHeaderLayout.setVerticalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLTitulo)
                .addGap(25, 25, 25))
        );

        jPContenedorTabla.setBackground(new java.awt.Color(255, 255, 255));
        jPContenedorTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        tablaPropiedades.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaPropiedades.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tablaPropiedades);

        javax.swing.GroupLayout jPContenedorTablaLayout = new javax.swing.GroupLayout(jPContenedorTabla);
        jPContenedorTabla.setLayout(jPContenedorTablaLayout);
        jPContenedorTablaLayout.setHorizontalGroup(
            jPContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContenedorTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPContenedorTablaLayout.setVerticalGroup(
            jPContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContenedorTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPContenedorFormulario.setBackground(new java.awt.Color(255, 255, 255));
        jPContenedorFormulario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLFormDireccion.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLFormDireccion.setForeground(new java.awt.Color(0, 0, 0));
        jLFormDireccion.setText("Direccion");

        jLFormPrecio.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLFormPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jLFormPrecio.setText("Precio");

        jLFormCantAmb.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLFormCantAmb.setForeground(new java.awt.Color(0, 0, 0));
        jLFormCantAmb.setText("Cant. Ambientes");

        jLFormTipoProp.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLFormTipoProp.setForeground(new java.awt.Color(0, 0, 0));
        jLFormTipoProp.setText("Tipo Propiedad");

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));

        cmbCantAmbientes.setBackground(new java.awt.Color(255, 255, 255));
        cmbCantAmbientes.setForeground(new java.awt.Color(0, 0, 0));
        cmbCantAmbientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cmbCantAmbientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCantAmbientesActionPerformed(evt);
            }
        });

        cmbTipoPropiedad.setBackground(new java.awt.Color(255, 255, 255));
        cmbTipoPropiedad.setForeground(new java.awt.Color(0, 0, 0));
        cmbTipoPropiedad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/clean.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/edit.png"))); // NOI18N
        btnEditar.setEnabled(false);
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

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/delete.png"))); // NOI18N
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnVender.setBackground(new java.awt.Color(255, 255, 255));
        btnVender.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnVender.setForeground(new java.awt.Color(0, 0, 0));
        btnVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buy.png"))); // NOI18N
        btnVender.setText("     VENTA");
        btnVender.setEnabled(false);
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
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
                        .addGroup(jPContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLFormDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFormCantAmb, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFormTipoProp, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFormPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCantAmbientes, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipoPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPContenedorFormularioLayout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPContenedorFormularioLayout.setVerticalGroup(
            jPContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContenedorFormularioLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFormCantAmb)
                    .addComponent(cmbCantAmbientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFormDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFormTipoProp)
                    .addComponent(cmbTipoPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFormPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPContenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jPContenedorGeneralLayout = new javax.swing.GroupLayout(jPContenedorGeneral);
        jPContenedorGeneral.setLayout(jPContenedorGeneralLayout);
        jPContenedorGeneralLayout.setHorizontalGroup(
            jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1084, Short.MAX_VALUE)
            .addGroup(jPContenedorGeneralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPContenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPContenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPContenedorGeneralLayout.setVerticalGroup(
            jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPContenedorGeneralLayout.createSequentialGroup()
                .addComponent(jPHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPContenedorFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPContenedorTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPContenedorGeneral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPContenedorGeneral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        refreshTablePropiedades();
        btnEditar.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        try {
            String direccionCasa = txtDireccion.getText();
            String tipoPropiedadCasaDescripcion = (String) cmbTipoPropiedad.getSelectedItem(); // rural
            int cantAmbientesCasa = Integer.parseInt((String) cmbCantAmbientes.getSelectedItem());
            Double precioCasa = Double.valueOf(txtPrecio.getText());

            TipoPropiedad tipoPropiedadCasa = new TipoPropiedad();
            // Recorro  para igualar un tipoPropiedad con la descripcion y cargarlo a tipoPropiedadCasa
            List<TipoPropiedad> listaTipoPropiedades = controlLogica.traerTipoPropiedades();
            for (TipoPropiedad tipoPropi : listaTipoPropiedades) {
                if (tipoPropiedadCasaDescripcion.equals(tipoPropi.getDescripcion())) { // me fijo que el tipo propiedad coincida
                    tipoPropiedadCasa = tipoPropi; // seteo el tipo de propeidad
                }
            }

            controlLogica.agregarPropiedad(direccionCasa, tipoPropiedadCasa, cantAmbientesCasa, precioCasa);
            mostrarMensaje("Propiedad Agregada Correctamente", "Info", "Se ha agregado con exito"); // Llama al metodo Mostrar Mensaje

            refreshTablePropiedades();

        } catch (Exception e) { // validaciones generales
            mostrarMensaje("Ha ocurrido un error, complete correctamente el formulario", "Error", "Error al agregar");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
        if (tablaPropiedades.getSelectedRow() != -1) { // -1 significa que no hay ninguna seleccionada

            int idPropiedadSeleccionado = Integer.parseInt(String.valueOf(tablaPropiedades.getValueAt(tablaPropiedades.getSelectedRow(), 0)));
            this.dispose();
            RealizarVentas realizarVentas = new RealizarVentas(idPropiedadSeleccionado);
            realizarVentas.setVisible(true);
            realizarVentas.setLocationRelativeTo(null); // centra al medio la interfaz
        }

    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (tablaPropiedades.getRowCount() > 0) {  // controlamos que la tabla no este vacia o sea que haya mas de un registro
            if (tablaPropiedades.getSelectedRow() != -1) { // -1 significa que no hay ninguna seleccionada

                try {
                    int idPropiedadSeleccionado = Integer.parseInt(String.valueOf(tablaPropiedades.getValueAt(tablaPropiedades.getSelectedRow(), 0)));
                    controlLogica.borrarPropiedad(idPropiedadSeleccionado);
                    mostrarMensaje("Propiedad Eliminada Correctamente", "Info", "Eliminacion Exitosa"); // Llama al metodo Mostrar Mensaje
                    refreshTablePropiedades();
                } catch (Exception e) {
                    mostrarMensaje("No puede eliminar la propiedad", "Error", "Error propiedad");
                }

            } else {
                mostrarMensaje("No se ha seleccionado ninguna fila", "Error", "Error al no seleccionar");
            }
        } else {
            mostrarMensaje("La tabla se encuentra vacia", "Error", "Tabla Vacia");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtDireccion.setText("");
        txtPrecio.setText("");
        cmbCantAmbientes.setSelectedIndex(0);
        cmbTipoPropiedad.setSelectedIndex(0);

        // Habilito EL BOTON AGREGAR SI SELECCIONO UINO
        btnAgregar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        try {

            String direccionCasa = txtDireccion.getText();
            String tipoPropiedadCasaDescripcion = (String) cmbTipoPropiedad.getSelectedItem();
            TipoPropiedad tipoPropiedadCasa = new TipoPropiedad();
            // Recorro  para igualar un tipoPropiedad con la descripcion y cargarlo a tipoPropiedadCasa
            List<TipoPropiedad> listaTipoPropiedades = controlLogica.traerTipoPropiedades();
            for (TipoPropiedad tipoPropi : listaTipoPropiedades) {
                if (tipoPropiedadCasaDescripcion.equals(tipoPropi.getDescripcion())) {
                    tipoPropiedadCasa = tipoPropi; // seteo el tipo de propeidad
                }
            }

            int cantAmbientesCasa = Integer.parseInt((String) cmbCantAmbientes.getSelectedItem());
            Double precioCasa = Double.valueOf(txtPrecio.getText());
            int idPropiedadSeleccionado = 0;
            if (tablaPropiedades.getSelectedRow() != -1) { // -1 significa que no hay ninguna seleccionada
                idPropiedadSeleccionado = Integer.parseInt(String.valueOf(tablaPropiedades.getValueAt(tablaPropiedades.getSelectedRow(), 0)));
            }

            controlLogica.modificarPropiedad(idPropiedadSeleccionado, direccionCasa, tipoPropiedadCasa, cantAmbientesCasa, precioCasa);
            mostrarMensaje("Propiedad Modfiicada Correctamente", "Info", "Se ha modificado la propiedad con exito");
            refreshTablePropiedades();

            // Limpieza campos
            txtDireccion.setText("");
            txtPrecio.setText("");
            cmbCantAmbientes.setSelectedIndex(0);
            cmbTipoPropiedad.setSelectedIndex(0);

            // Habilito EL BOTON AGREGAR SI SELECCIONO UINO
            btnAgregar.setEnabled(true);
            btnEditar.setEnabled(false);
        } catch (Exception e) {
            mostrarMensaje("Ha ocurrido un error, complete correctamente el formulario", "Error", "Error al editar");
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void cmbCantAmbientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCantAmbientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCantAmbientesActionPerformed

    private void completeInputsOnSelectRow() {
        tablaPropiedades.getSelectionModel().addListSelectionListener(row -> {
            if (!row.getValueIsAdjusting()) { // lo selecciona solo cuando suelta el click
                if (tablaPropiedades.getSelectedRow() != -1) {

                    // ACTIVAR BOTON VENTA
                    String esVendida = String.valueOf(tablaPropiedades.getValueAt(tablaPropiedades.getSelectedRow(), 5));
                    if (esVendida.equals("Si")) {
                        btnVender.setEnabled(false);
                        btnEliminar.setEnabled(false);
                    } else {
                        btnEliminar.setEnabled(true);
                        btnVender.setEnabled(true);
                    }

                    btnAgregar.setEnabled(false);
                    btnEditar.setEnabled(true);
                

                    // explicacion ----- getValueAt (traeme el valor de ) la fila seleccionada y la columna 0; pasamos a String porque lo trae en forma de objeto y a ese string lo pasamos a int
                    String tipoPropiedadSeleccionado = String.valueOf(tablaPropiedades.getValueAt(tablaPropiedades.getSelectedRow(), 1));
                    String direccionSeleccionada = String.valueOf(tablaPropiedades.getValueAt(tablaPropiedades.getSelectedRow(), 2));
                    int ambientesSeleccionado = Integer.parseInt(String.valueOf(tablaPropiedades.getValueAt(tablaPropiedades.getSelectedRow(), 3)));
                    String precioSeleccionado = String.valueOf(tablaPropiedades.getValueAt(tablaPropiedades.getSelectedRow(), 4));

                    // Recorrer combob box para buscar el valor igual al que llego y setearlo en ese indice CMB AMBIENTES
                    for (int i = 0; i < cmbCantAmbientes.getItemCount(); i++) {
                        if (cmbCantAmbientes.getItemAt(i).equals(String.valueOf(ambientesSeleccionado))) { // si es igual lo setea
                            cmbCantAmbientes.setSelectedIndex(i);
                        }
                    }

                    // Recorrer combob box para buscar el valor igual al que llego y setearlo en ese indice CMB TIPO PROPIEDAD
                    for (int i = 0; i < cmbTipoPropiedad.getItemCount(); i++) {

                        if (cmbTipoPropiedad.getItemAt(i).equals(tipoPropiedadSeleccionado)) { // si es igual lo setea
                            cmbTipoPropiedad.setSelectedIndex(i);
                        }
                    }

                    txtPrecio.setText(precioSeleccionado);
                    txtDireccion.setText(direccionSeleccionada);
                } else {
                    // Si no hay ninguna fila seleccionada 
                    btnAgregar.setEnabled(true); // Habilita agregar de nuevo
                    btnEditar.setEnabled(false); // Deshabilita editar

                    // Limpia los campos de texto
                    txtPrecio.setText("");
                    txtDireccion.setText("");
                    cmbCantAmbientes.setSelectedIndex(0);
                    cmbTipoPropiedad.setSelectedIndex(0);
                }
            }
        });
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVender;
    private javax.swing.JComboBox<String> cmbCantAmbientes;
    private javax.swing.JComboBox cmbTipoPropiedad;
    private javax.swing.JLabel jLFormCantAmb;
    private javax.swing.JLabel jLFormDireccion;
    private javax.swing.JLabel jLFormPrecio;
    private javax.swing.JLabel jLFormTipoProp;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPContenedorFormulario;
    private javax.swing.JPanel jPContenedorGeneral;
    private javax.swing.JPanel jPContenedorTabla;
    private javax.swing.JPanel jPHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPropiedades;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    private void CargarTablaPropiedades() {
        // SETEAR MODELO TABLA
        DefaultTableModel modeloTablaPropiedades = new DefaultTableModel() {
            // que fila y columnas no sea editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        // setear nombre de las columnas
        String nombreColumnas[] = {"idPropiedad", "TipoPropiedad", "Direccion", "Ambientes", "Precio", "Vendida"};
        modeloTablaPropiedades.setColumnIdentifiers(nombreColumnas);
        // traer propiedades
        List<Propiedad> listaPropiedades = controlLogica.traerPropiedades();

        String variableVendida = "";
        if (listaPropiedades != null) {
            for (Propiedad propiedad : listaPropiedades) {

                if (propiedad.getVendida() == true) {
                    variableVendida = "Si";
                } else {
                    variableVendida = "No";
                }
                Object[] objeto = {propiedad.getIdPropiedad(), propiedad.getTipoPropiedad().getDescripcion(), propiedad.getDireccion(),
                    propiedad.getAmbientes(), propiedad.getPrecio(), variableVendida};

                modeloTablaPropiedades.addRow(objeto);
            }
        }
        tablaPropiedades.setModel(modeloTablaPropiedades);
    }

    private void CargarTipoPropiedades() {
        List<TipoPropiedad> listaTipoPropiedades = controlLogica.traerTipoPropiedades();
        for (TipoPropiedad tipoPropi : listaTipoPropiedades) {
            cmbTipoPropiedad.addItem(tipoPropi.getDescripcion());
        }
    }
}
