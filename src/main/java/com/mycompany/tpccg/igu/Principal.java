package com.mycompany.tpccg.igu;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPContenedorGeneral = new javax.swing.JPanel();
        jPHeader = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jPContenedorBotones = new javax.swing.JPanel();
        jBVerFacturas = new javax.swing.JButton();
        jBVerPropiedades = new javax.swing.JButton();
        jBClientes = new javax.swing.JButton();
        jBAdministrarTipoPropiedades = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPContenedorGeneral.setBackground(new java.awt.Color(255, 255, 255));

        jPHeader.setBackground(new java.awt.Color(0, 153, 153));

        jLTitulo.setBackground(new java.awt.Color(0, 0, 0));
        jLTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo.setText("CCG REAL ESTATE");

        javax.swing.GroupLayout jPHeaderLayout = new javax.swing.GroupLayout(jPHeader);
        jPHeader.setLayout(jPHeaderLayout);
        jPHeaderLayout.setHorizontalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addContainerGap(335, Short.MAX_VALUE)
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
        );
        jPHeaderLayout.setVerticalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLTitulo)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPContenedorBotones.setBackground(new java.awt.Color(255, 255, 255));

        jBVerFacturas.setBackground(new java.awt.Color(255, 255, 255));
        jBVerFacturas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBVerFacturas.setForeground(new java.awt.Color(0, 0, 0));
        jBVerFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/factura.png"))); // NOI18N
        jBVerFacturas.setText("  FACTURAS");
        jBVerFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerFacturasActionPerformed(evt);
            }
        });

        jBVerPropiedades.setBackground(new java.awt.Color(255, 255, 255));
        jBVerPropiedades.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBVerPropiedades.setForeground(new java.awt.Color(0, 0, 0));
        jBVerPropiedades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/home.png"))); // NOI18N
        jBVerPropiedades.setText("  PROPIEDADES");
        jBVerPropiedades.setMaximumSize(new java.awt.Dimension(103, 23));
        jBVerPropiedades.setMinimumSize(new java.awt.Dimension(103, 23));
        jBVerPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerPropiedadesActionPerformed(evt);
            }
        });

        jBClientes.setBackground(new java.awt.Color(255, 255, 255));
        jBClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBClientes.setForeground(new java.awt.Color(0, 0, 0));
        jBClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario.png"))); // NOI18N
        jBClientes.setText("  CLIENTES");
        jBClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClientesActionPerformed(evt);
            }
        });

        jBAdministrarTipoPropiedades.setBackground(new java.awt.Color(255, 255, 255));
        jBAdministrarTipoPropiedades.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBAdministrarTipoPropiedades.setForeground(new java.awt.Color(0, 0, 0));
        jBAdministrarTipoPropiedades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/departamento.png"))); // NOI18N
        jBAdministrarTipoPropiedades.setText("  T. PROPIEDADES");
        jBAdministrarTipoPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdministrarTipoPropiedadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPContenedorBotonesLayout = new javax.swing.GroupLayout(jPContenedorBotones);
        jPContenedorBotones.setLayout(jPContenedorBotonesLayout);
        jPContenedorBotonesLayout.setHorizontalGroup(
            jPContenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContenedorBotonesLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jBVerPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBAdministrarTipoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBVerFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPContenedorBotonesLayout.setVerticalGroup(
            jPContenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContenedorBotonesLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPContenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPContenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBVerPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBAdministrarTipoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBVerFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout jPContenedorGeneralLayout = new javax.swing.GroupLayout(jPContenedorGeneral);
        jPContenedorGeneral.setLayout(jPContenedorGeneralLayout);
        jPContenedorGeneralLayout.setHorizontalGroup(
            jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPContenedorBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPContenedorGeneralLayout.setVerticalGroup(
            jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContenedorGeneralLayout.createSequentialGroup()
                .addComponent(jPHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPContenedorBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jBVerPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerPropiedadesActionPerformed
        VerPropiedades verPropiedades = new VerPropiedades();
        verPropiedades.setVisible(true);
        verPropiedades.setLocationRelativeTo(null); // centra al medio la interfaz
    }//GEN-LAST:event_jBVerPropiedadesActionPerformed

    private void jBVerFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerFacturasActionPerformed
        VerFacturas verFacturas = new VerFacturas();
        verFacturas.setVisible(true);
        verFacturas.setLocationRelativeTo(null); // centra al medio la interfaz
    }//GEN-LAST:event_jBVerFacturasActionPerformed

    private void jBClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClientesActionPerformed
        VerClientes verClientes = new VerClientes();
        verClientes.setVisible(true);
        verClientes.setLocationRelativeTo(null); // centra al medio la interfaz
    }//GEN-LAST:event_jBClientesActionPerformed

    private void jBAdministrarTipoPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdministrarTipoPropiedadesActionPerformed
        VerTipoPropiedades verTipoPropiedades = new VerTipoPropiedades();
        verTipoPropiedades.setVisible(true);
        verTipoPropiedades.setLocationRelativeTo(null); // centra al medio la interfaz
    }//GEN-LAST:event_jBAdministrarTipoPropiedadesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdministrarTipoPropiedades;
    private javax.swing.JButton jBClientes;
    private javax.swing.JButton jBVerFacturas;
    private javax.swing.JButton jBVerPropiedades;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPContenedorBotones;
    private javax.swing.JPanel jPContenedorGeneral;
    private javax.swing.JPanel jPHeader;
    // End of variables declaration//GEN-END:variables
}
