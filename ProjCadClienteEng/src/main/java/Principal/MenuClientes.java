package Principal;


public class MenuClientes extends javax.swing.JFrame {

    private static MenuClientes menuClientes = null;
   
    private MenuClientes() {
        initComponents();
    }

    public static MenuClientes getMenuClientes(){
        if(menuClientes == null){
            menuClientes = new MenuClientes();
        }
        return menuClientes;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbClientes = new javax.swing.JLabel();
        btListaClientes = new javax.swing.JButton();
        btCadCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu  Clientes");

        lbClientes.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        lbClientes.setText("Clientes");

        btListaClientes.setText("Lista de Clientes");
        btListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListaClientesActionPerformed(evt);
            }
        });

        btCadCliente.setText("Cadastro");
        btCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btListaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbClientes)
                    .addComponent(btCadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbClientes)
                .addGap(34, 34, 34)
                .addComponent(btListaClientes)
                .addGap(18, 18, 18)
                .addComponent(btCadCliente)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListaClientesActionPerformed
        
        ListaClientes.getListaClientes().setVisible(true);
        ListaClientes.getListaClientes().listaTabela();
        
    }//GEN-LAST:event_btListaClientesActionPerformed

    private void btCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadClienteActionPerformed
        MenuCadastroClientes.getMenuCadastroClientes().setVisible(true);
    }//GEN-LAST:event_btCadClienteActionPerformed

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
            java.util.logging.Logger.getLogger(MenuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadCliente;
    private javax.swing.JButton btListaClientes;
    private javax.swing.JLabel lbClientes;
    // End of variables declaration//GEN-END:variables
}
