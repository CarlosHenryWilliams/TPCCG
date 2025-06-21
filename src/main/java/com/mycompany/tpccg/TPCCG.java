package com.mycompany.tpccg;

import com.mycompany.tpccg.controllers.ClienteJpaController;
import com.mycompany.tpccg.controllers.FacturaJpaController;
import com.mycompany.tpccg.controllers.PropiedadJpaController;
import com.mycompany.tpccg.controllers.TipoPropiedadJpaController;
import com.mycompany.tpccg.igu.Principal;
import com.mycompany.tpccg.model.Cliente;
import com.mycompany.tpccg.model.Factura;
import com.mycompany.tpccg.model.Propiedad;
import com.mycompany.tpccg.model.TipoPropiedad;
import java.util.Date;



public class TPCCG {

    public static void main(String[] args) {
        
        Principal princi = new Principal();
        princi.setVisible(true);
        princi.setLocationRelativeTo(null); // centra al medio la interfaz
   /*     
      PropiedadJpaController propiedadJpa = new PropiedadJpaController();
        TipoPropiedadJpaController tipoPropiedadJpa = new TipoPropiedadJpaController();
        ClienteJpaController clienteJpa = new ClienteJpaController();
        FacturaJpaController facturaJpa = new FacturaJpaController();
        
        TipoPropiedad tp1 = new TipoPropiedad("Rural");
        TipoPropiedad tp2 = new TipoPropiedad("Urbana");
        TipoPropiedad tp3 = new TipoPropiedad("Departamento");
        
        tipoPropiedadJpa.create(tp1);
        tipoPropiedadJpa.create(tp2);
        tipoPropiedadJpa.create(tp3);
        
        Propiedad p1 = new Propiedad(6, "Campo 1651", 75000d, true, tp1);
        Propiedad p2 = new Propiedad(5, "Santa Teresita 1651", 44000d, false, tp2);
        Propiedad p3 = new Propiedad(2, "MDQ 1651", 15000d, true, tp3);
        
        propiedadJpa.create(p1);
        propiedadJpa.create(p2);
        propiedadJpa.create(p3);
        
        Cliente c1 = new Cliente("Franco Martinez Fosco", "45176881");
        Cliente c2 = new Cliente("Pepe Argento", "11222333");
        Cliente c3 = new Cliente("Adolfo H", "33222111");
        
        clienteJpa.create(c1);
        clienteJpa.create(c2);
        clienteJpa.create(c3);
        
        Factura f1 = new Factura(p1, c1, new Date());
        Factura f2 = new Factura(p2, c2, new Date());
        Factura f3 = new Factura(p3, c3, new Date());
        
        facturaJpa.create(f1);
        facturaJpa.create(f2);
        facturaJpa.create(f3);*/
       
    }
    
}
