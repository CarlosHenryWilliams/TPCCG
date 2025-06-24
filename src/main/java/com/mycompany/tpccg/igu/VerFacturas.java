package com.mycompany.tpccg.igu;

import com.mycompany.tpccg.model.ControladoraLogica;
import com.mycompany.tpccg.model.Factura;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VerFacturas extends javax.swing.JFrame {
  ControladoraLogica controlLogica;

  public VerFacturas() {
    initComponents();
    controlLogica = new ControladoraLogica();
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
  }
  
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPContenedorGeneral = new javax.swing.JPanel();
        jPHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPContenedorTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFacturas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPContenedorGeneral.setBackground(new java.awt.Color(204, 204, 204));

        jPHeader.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FACTURAS");

        javax.swing.GroupLayout jPHeaderLayout = new javax.swing.GroupLayout(jPHeader);
        jPHeader.setLayout(jPHeaderLayout);
        jPHeaderLayout.setHorizontalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPHeaderLayout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(231, 231, 231))
        );
        jPHeaderLayout.setVerticalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPContenedorTabla.setBackground(new java.awt.Color(204, 204, 204));

        tablaFacturas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaFacturas);

        javax.swing.GroupLayout jPContenedorTablaLayout = new javax.swing.GroupLayout(jPContenedorTabla);
        jPContenedorTabla.setLayout(jPContenedorTablaLayout);
        jPContenedorTablaLayout.setHorizontalGroup(
            jPContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContenedorTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPContenedorTablaLayout.setVerticalGroup(
            jPContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPContenedorTablaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPContenedorGeneralLayout = new javax.swing.GroupLayout(jPContenedorGeneral);
        jPContenedorGeneral.setLayout(jPContenedorGeneralLayout);
        jPContenedorGeneralLayout.setHorizontalGroup(
            jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPContenedorGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPContenedorTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPContenedorGeneralLayout.setVerticalGroup(
            jPContenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContenedorGeneralLayout.createSequentialGroup()
                .addComponent(jPHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPContenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      CargarTablaFacturas();
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPContenedorGeneral;
    private javax.swing.JPanel jPContenedorTabla;
    private javax.swing.JPanel jPHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaFacturas;
    // End of variables declaration//GEN-END:variables

  private void CargarTablaFacturas() {
    DefaultTableModel modeloTablaFacturas =   new DefaultTableModel() {
      @Override
      public boolean isCellEditable(int row, int column) {
        return false;
      }
    };
    
    // setear nombre de las columnas
    String nombreColumnas[] = {"IdFactura", "NombreComprador", "DNI", "IdPropiedad", "Direccion", "TipoPropiedad", "Ambientes", "Precio", "Fecha"};
    modeloTablaFacturas.setColumnIdentifiers(nombreColumnas);

    // traer propiedades
    List<Factura> listaFacturas = controlLogica.traerFacturas(); 

    if (listaFacturas != null) {
      for (Factura factura : listaFacturas) {
        String[] partes = factura.getCompradorAsig().getNombreCompleto().split(";");
        String firstname = partes.length > 0 ? partes[0] : "";
        String lastname = partes.length > 1 ? partes[1] : "";

        Object[] objeto = { 
          factura.getIdFactura(), 
          firstname + " " + lastname, 
          factura.getCompradorAsig().getDNI(), 
          factura.getPropiedadAsig().getIdPropiedad(), 
          factura.getPropiedadAsig().getDireccion(),
          factura.getPropiedadAsig().getTipoPropiedad().getDescripcion(), 
          factura.getPropiedadAsig().getAmbientes(), 
          factura.getPropiedadAsig().getPrecio(), 
          factura.getFechaEmision()
        };
        
        modeloTablaFacturas.addRow(objeto); // agrega
      }
    }
    tablaFacturas.setModel(modeloTablaFacturas);
  }
}
