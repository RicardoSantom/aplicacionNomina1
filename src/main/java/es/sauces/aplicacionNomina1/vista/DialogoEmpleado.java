/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.sauces.aplicacionNomina1.vista;

/**
 *
 * @author Usuario
 */
public class DialogoEmpleado extends javax.swing.JDialog {

    /**
     * Creates new form DialogoEmpleado
     */
    public DialogoEmpleado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatos = new javax.swing.JPanel();
        etiquetaDni = new javax.swing.JLabel();
        textFieldDni = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        etiquetaTipo = new javax.swing.JLabel();
        comboBoxTipo = new javax.swing.JComboBox<>();
        etiquetaSalario = new javax.swing.JLabel();
        jFormattedTextFieldSalario = new javax.swing.JFormattedTextField();
        etiquetaHoras = new javax.swing.JLabel();
        spinnerHoras = new javax.swing.JSpinner();
        botonAceptar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear empleado");

        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del empleado"));

        etiquetaDni.setText("DNI");

        etiquetaNombre.setText("NOMBRE");

        etiquetaTipo.setText("TIPO");

        comboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FIJO", "EVENTUAL" }));
        comboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTipoActionPerformed(evt);
            }
        });

        etiquetaSalario.setText("SALARIO");

        etiquetaHoras.setText("HORAS");

        botonAceptar.setBackground(new java.awt.Color(51, 153, 255));
        botonAceptar.setText("ACEPTAR");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        botonCancelar.setBackground(new java.awt.Color(51, 153, 255));
        botonCancelar.setText("CANCELAR");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaNombre)
                            .addComponent(etiquetaTipo)
                            .addComponent(etiquetaSalario)
                            .addComponent(etiquetaDni, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaHoras))
                        .addGap(53, 53, 53)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comboBoxTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 126, Short.MAX_VALUE)
                            .addComponent(textFieldNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldDni, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldSalario)
                            .addComponent(spinnerHoras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaDni))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaTipo))
                .addGap(25, 25, 25)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaSalario)
                    .addComponent(jFormattedTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaHoras)
                    .addComponent(spinnerHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar)
                    .addComponent(botonCancelar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTipoActionPerformed
        if(comboBoxTipo.getSelectedItem().equals("FIJO")){
            this.etiquetaHoras.setVisible(false);
            this.spinnerHoras.setVisible(false);
        }else{
            this.etiquetaHoras.setVisible(true);
            this.spinnerHoras.setVisible(true);
        }
    }//GEN-LAST:event_comboBoxTipoActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        if(!getDni().isBlank()&&!getNombre().isBlank()&&getSalario()>0&&!getTipo().isBlank()){
            opcion=ACEPTAR;
            setVisible(false);
        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        opcion=CANCELAR;
        setVisible(false);
    }//GEN-LAST:event_botonCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogoEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogoEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogoEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogoEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogoEmpleado dialog = new DialogoEmpleado(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
     public static final int ACEPTAR =1;
    public static final int CANCELAR=0;
    private int opcion;
    
    public String getDni(){
        return this.textFieldDni.getText();
    }
    
    public String getNombre(){
        return this.textFieldNombre.getText();
    }
    
    public String getTipo(){
        return (String) this.comboBoxTipo.getSelectedItem();
    }
    
    public float getSalario(){
        return Float.parseFloat(this.jFormattedTextFieldSalario.getText().replace(',','.'));
    }
    
    public int getHoras(){
        return (int)spinnerHoras.getValue();
    }
    
    public int mostrar(){
        opcion=CANCELAR;
        setVisible(true);
        return opcion;
    }
        public void limpiarCampos(){
        textFieldDni.setText("");
        textFieldNombre.setText("");
        jFormattedTextFieldSalario.setValue(0);
        spinnerHoras.setValue(0);
        comboBoxTipo.setSelectedItem("FIJO");
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JComboBox<String> comboBoxTipo;
    private javax.swing.JLabel etiquetaDni;
    private javax.swing.JLabel etiquetaHoras;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaSalario;
    private javax.swing.JLabel etiquetaTipo;
    private javax.swing.JFormattedTextField jFormattedTextFieldSalario;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JSpinner spinnerHoras;
    private javax.swing.JTextField textFieldDni;
    private javax.swing.JTextField textFieldNombre;
    // End of variables declaration//GEN-END:variables
}
