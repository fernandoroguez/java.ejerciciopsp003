/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ferna
 */
public class appl extends javax.swing.JFrame {

    /**
     * Creates new form appl
     */
    MyList<Empleado> l;
    MyList<Empleado> original;

    public appl() {
        super("Menu");
        original = new MyList();
        l = new MyList();
        Empleado aux = new Empleado("Fer", 100, 300);
        l.add(aux);
        Empleado aux2 = new Empleado("Paco", 100, 300);
        l.add(aux2);
        Empleado aux3 = new Empleado("Paco", 100, 300);
        l.add(aux3);
        cont = 3;
        initComponents();

        mostrar(l);
        setfiltro(l);
    }

    private void avanzar(MyList<Empleado> l) {
        if (l.esultimo()) {
            btnsiguiente.setEnabled(false);
            btnanterior.setEnabled(true);
        } else {
            l.adelante();
            mostrar(l);
            btnanterior.setEnabled(true);
            if (l.esultimo()) {
                btnsiguiente.setEnabled(false);
            }
        }
    }

    private void retroceder(MyList<Empleado> l) {
        if (l.esprimero()) {
            btnsiguiente.setEnabled(true);
            btnanterior.setEnabled(false);
        } else {
            l.atras();
            mostrar(l);
            btnsiguiente.setEnabled(true);
            if (l.esprimero()) {
                btnanterior.setEnabled(false);
            }
        }
    }

    private void setfiltro(MyList<Empleado> l) {

        int numm = cont;

        String[] fechas = new String[numm + 1];
        l.inicio();

        for (int i = 0; i < cont; i++) {
            mostrar(l);
            fechas[i] = txtfecha.getText();
            l.adelante();
        }
        l.inicio();
        fechas[cont] = "borrar filtro";
        filtro.setModel(new javax.swing.DefaultComboBoxModel<>(fechas));
        //cont=l.getnum();
    }

    private void mostrar(MyList<Empleado> l) {
        String[] parts = l.actual().split(",");
        String part1 = parts[0]; // 123
        String part2 = parts[1]; // 654321
        String part3 = parts[2];
        String part4 = parts[3];
        String part5 = parts[4];
        txtnumero.setText(parts[1]);
        txtnombre.setText(parts[0]);
        txtsueldo.setText(parts[2]);
        txtsueldomax.setText(parts[3]);
        txtfecha.setText(parts[4]);
    }

    private void cancelar() {
        btnanterior.setText("Empleado anterior");
        btnsiguiente.setText("Empleado siguiente");
        modificar = false;
        crear = false;
        txtsueldo.setEditable(false);
        txtsueldomax.setEditable(false);
        txtfecha.setEditable(false);
        txtnombre.setEditable(false);
        txtnumero.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtsueldo = new javax.swing.JTextField();
        txtsueldomax = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btncrear = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btnanterior = new javax.swing.JButton();
        btnsiguiente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        filtro = new javax.swing.JComboBox<>();
        btnfiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Numero de Empleado");

        jLabel2.setText("Nombre del Empleado");

        jLabel3.setText("Sueldo del Empleado");

        jLabel4.setText("Sueldo Maximo del Empleado");

        jLabel5.setText("Fecha de Alta del Empleado");

        txtsueldo.setText("");
        txtsueldo.setEditable(false);
        txtsueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsueldoActionPerformed(evt);
            }
        });

        txtsueldomax.setText("");
        txtsueldomax.setEditable(false);

        txtfecha.setText("");
        txtfecha.setEditable(false);
        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });

        txtnombre.setText("");
        txtnombre.setEditable(false);

        txtnumero.setText("");
        txtnumero.setEditable(false);
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtsueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addComponent(txtsueldomax)
                    .addComponent(txtfecha)
                    .addComponent(txtnombre)
                    .addComponent(txtnumero))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnumero, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtsueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtsueldomax, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btncrear.setText("Crear Empleado");
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar Empleado");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnborrar.setText("Borrar Empleado");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btnanterior.setText("Empleado Anterior");
        btnanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanteriorActionPerformed(evt);
            }
        });

        btnsiguiente.setText("Empleado Siguiente");
        btnsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguienteActionPerformed(evt);
            }
        });

        jLabel6.setText("Filtrar por fecha");

        filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroActionPerformed(evt);
            }
        });

        btnfiltrar.setText("Filtrar");
        btnfiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btncrear, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnanterior, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnfiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137)
                                .addComponent(btnsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncrear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnanterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed
        //crear empleado
        crear = true;
        txtsueldo.setEditable(true);
        txtsueldomax.setEditable(true);
        txtfecha.setEditable(true);
        txtnombre.setEditable(true);
        txtnumero.setEditable(true);
        btnanterior.setText("Cancelar");
        btnsiguiente.setText("Confirmar");
        btnsiguiente.setEnabled(true);
        btnanterior.setEnabled(true);

    }//GEN-LAST:event_btncrearActionPerformed

    private void btnsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguienteActionPerformed
        //siguiente
        if (modificar == true) {
            System.out.println("modificar");

            salario = Integer.parseInt(txtsueldomax.getText());
            System.out.println("salario");
            salario_max = Integer.parseInt(txtsueldomax.getText());
            System.out.println("salario_max");
            nombre = txtnombre.getText();
            System.out.println("nombre");
            num = Integer.parseInt(txtnumero.getText());
            Empleado aux = new Empleado(nombre, salario, salario_max, num);
            l.modificar(aux);
            cancelar();
            setfiltro(l);
        } else if (crear == true) {

            salario = Integer.parseInt(txtsueldo.getText());
            salario_max = Integer.parseInt(txtsueldomax.getText());
            nombre = txtnombre.getText();

            Empleado aux = new Empleado(nombre, salario, salario_max);
            l.add(aux);
            cancelar();
            cont++;
            setfiltro(l);
        } else {
            avanzar(l);
        }
    }//GEN-LAST:event_btnsiguienteActionPerformed

    private void txtsueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsueldoActionPerformed

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        // TODO add your handling code here:
        l.eliminar();
        l.inicio();
        mostrar(l);
        cont--;
        setfiltro(l);

    }//GEN-LAST:event_btnborrarActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        modificar = true;
        txtsueldo.setEditable(true);
        txtsueldomax.setEditable(true);
        txtfecha.setEditable(true);
        txtnombre.setEditable(true);
        txtnumero.setEditable(true);
        btnanterior.setText("Cancelar");
        btnsiguiente.setText("Confirmar");
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanteriorActionPerformed
        // TODO add your handling code here:
        if (modificar == true) {
            cancelar();
        } else if (crear == true) {
            cancelar();
        } else {
            retroceder(l);
        }
    }//GEN-LAST:event_btnanteriorActionPerformed

    private void filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroActionPerformed
        // TODO add your handling code here:

        fechaaux = (String) filtro.getSelectedItem();

    }//GEN-LAST:event_filtroActionPerformed

    private void btnfiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfiltrarActionPerformed
        // TODO add your handling code here:
        if (fechaaux.equals("borrar filtro")) {
            btncrear.setEnabled(true);
            btnborrar.setEnabled(true);
            btnmodificar.setEnabled(true);
            System.out.println("borrar filtro");
            l.destruir();
            original.inicio();
            for (int i = 0; i < cont; i++) {

                l.add(original.getmain());

                original.adelante();

            }

            l.showMyList();
            original.showMyList();

        } else {
            btncrear.setEnabled(false);
            btnborrar.setEnabled(false);
            btnmodificar.setEnabled(false);

            l.inicio();

            for (int i = 0; i < cont; i++) {

                original.add(l.getmain());

                l.adelante();

            }

            l.destruir();

            original.inicio();
            for (int i = 0; i < cont; i++) {
                Empleado aux = original.getmain();
                String[] parts = aux.toString().split(",");
                String part1 = parts[0]; // 123
                String part2 = parts[1]; // 654321
                String part3 = parts[2];
                String part4 = parts[3];
                String part5 = parts[4];
                System.out.println(fechaaux);
                if (fechaaux.equals(part5)) {
                    l.add(original.getmain());
                }
                original.adelante();
            }
            mostrar(l);
            l.showMyList();
        }
    }//GEN-LAST:event_btnfiltrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnanterior;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btncrear;
    private javax.swing.JButton btnfiltrar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnsiguiente;
    private javax.swing.JComboBox<String> filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtsueldo;
    private javax.swing.JTextField txtsueldomax;
    // End of variables declaration//GEN-END:variables
    boolean modificar = false;
    boolean crear = false;
    int salario, salario_max, num;
    String nombre;
    int cont = 0;
    String fechaaux;
}