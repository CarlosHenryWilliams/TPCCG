package com.mycompany.tpccg;

import com.mycompany.tpccg.controllers.*;
import com.mycompany.tpccg.igu.Principal;
import com.mycompany.tpccg.model.*;
import java.util.Date;

public class TPCCG {
  public static void main(String[] args) {
    Principal princi = new Principal();
    princi.setVisible(true);
    princi.setLocationRelativeTo(null); // centra al medio la interfaz
  }
}