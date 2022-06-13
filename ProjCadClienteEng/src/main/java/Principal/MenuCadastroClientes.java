package Principal;

import Controler.Controlador;
import Entidades.Cliente;
import Servico.Exceptions.CadException;
import javax.swing.JOptionPane;

public class MenuCadastroClientes extends javax.swing.JFrame {
    
    public static MenuCadastroClientes menuCadastroClientes = null;

    private MenuCadastroClientes() {
        initComponents();
    }
    
    public static MenuCadastroClientes getMenuCadastroClientes(){
        if(menuCadastroClientes == null){
            menuCadastroClientes = new MenuCadastroClientes();
        }
        return menuCadastroClientes;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btSairCadClientes = new javax.swing.JButton();
        lbCadastroCliente = new javax.swing.JLabel();
        lbNomeCli = new javax.swing.JLabel();
        lbCpfCli = new javax.swing.JLabel();
        btCadastrarCliente = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        cxNomeCli = new javax.swing.JTextField();
        cxCpfCli = new javax.swing.JTextField();
        lbEmailCli = new javax.swing.JLabel();
        cxEmailCli = new javax.swing.JTextField();
        lbTelefoneCli = new javax.swing.JLabel();
        cxTelefoneCli = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Clientes");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btSairCadClientes.setText("Sair");
        btSairCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairCadClientesActionPerformed(evt);
            }
        });

        lbCadastroCliente.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        lbCadastroCliente.setText("Cadastro Cliente");

        lbNomeCli.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbNomeCli.setText("Nome: ");

        lbCpfCli.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbCpfCli.setText("CPF: ");

        btCadastrarCliente.setText("Cadastrar");
        btCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarClienteActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        cxNomeCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeCliActionPerformed(evt);
            }
        });

        cxCpfCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCpfCliActionPerformed(evt);
            }
        });

        lbEmailCli.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbEmailCli.setText("Email: ");

        cxEmailCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEmailCliActionPerformed(evt);
            }
        });

        lbTelefoneCli.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbTelefoneCli.setText("Telefone: ");

        cxTelefoneCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTelefoneCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lbCadastroCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cxNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(cxCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbEmailCli)
                        .addGap(45, 45, 45)
                        .addComponent(cxEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTelefoneCli)
                        .addGap(24, 24, 24)
                        .addComponent(cxTelefoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btCadastrarCliente)
                        .addGap(12, 12, 12)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btSairCadClientes)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbCadastroCliente)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNomeCli)
                    .addComponent(cxNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbCpfCli))
                    .addComponent(cxCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmailCli)
                    .addComponent(cxEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTelefoneCli)
                    .addComponent(cxTelefoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadastrarCliente)
                    .addComponent(btLimpar)
                    .addComponent(btSairCadClientes))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairCadClientesActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de saída", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            sair();
        }
    }//GEN-LAST:event_btSairCadClientesActionPerformed

    private void cxEmailCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEmailCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxEmailCliActionPerformed

    private void cxNomeCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeCliActionPerformed

    private void btCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarClienteActionPerformed
     cadastrar();
     
    }//GEN-LAST:event_btCadastrarClienteActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void cxCpfCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCpfCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCpfCliActionPerformed

    private void cxTelefoneCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTelefoneCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTelefoneCliActionPerformed

    public void limpar(){
    cxNomeCli.setText("");
    cxCpfCli.setText("");
    cxEmailCli.setText("");
    cxTelefoneCli.setText("");
    cxNomeCli.requestFocus();

    }
    
    public boolean cadastrar(){
        Cliente cliente = new Cliente();
        
        cliente.setNome(cxNomeCli.getText());
        cliente.setCpf(cxCpfCli.getText());
        cliente.setEmail(cxEmailCli.getText());
        cliente.setTelefone(cxTelefoneCli.getText());
        
        if(cxCpfCli.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O código precisa existir!", "ERROR", 0);
            cxCpfCli.requestFocus();
            return false;
        }
  
        try{
        Controlador.getControlador().getServico().addCliente(cliente);
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! ", "Cadastrado", 1);
        limpar();
        }
        catch(CadException ce){
             JOptionPane.showMessageDialog(null, "O Cadastro não deu certo! Verifique o código.", "ERROR", 0);
             cxCpfCli.requestFocus();
        }
        
        
        return true;
    
    }
    
    public void sair() {
        this.dispose();
    }

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
            java.util.logging.Logger.getLogger(MenuCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarCliente;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSairCadClientes;
    private javax.swing.JTextField cxCpfCli;
    private javax.swing.JTextField cxEmailCli;
    private javax.swing.JTextField cxNomeCli;
    private javax.swing.JTextField cxTelefoneCli;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCadastroCliente;
    private javax.swing.JLabel lbCpfCli;
    private javax.swing.JLabel lbEmailCli;
    private javax.swing.JLabel lbNomeCli;
    private javax.swing.JLabel lbTelefoneCli;
    // End of variables declaration//GEN-END:variables
}
