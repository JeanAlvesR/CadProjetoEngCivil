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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btSairCadClientes.setText("Sair");
        btSairCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairCadClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btSairCadClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        lbCadastroCliente.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        lbCadastroCliente.setText("Cadastro Cliente");
        getContentPane().add(lbCadastroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 25, -1, -1));

        lbNomeCli.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbNomeCli.setText("Nome: ");
        getContentPane().add(lbNomeCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, -1));

        lbCpfCli.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbCpfCli.setText("CPF: ");
        getContentPane().add(lbCpfCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 40, -1));

        btCadastrarCliente.setText("Cadastrar");
        btCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        cxNomeCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeCliActionPerformed(evt);
            }
        });
        getContentPane().add(cxNomeCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 160, -1));

        cxCpfCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCpfCliActionPerformed(evt);
            }
        });
        getContentPane().add(cxCpfCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 147, 160, -1));

        lbEmailCli.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbEmailCli.setText("Email: ");
        getContentPane().add(lbEmailCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        cxEmailCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEmailCliActionPerformed(evt);
            }
        });
        getContentPane().add(cxEmailCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 160, -1));

        lbTelefoneCli.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbTelefoneCli.setText("Telefone: ");
        getContentPane().add(lbTelefoneCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        cxTelefoneCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTelefoneCliActionPerformed(evt);
            }
        });
        getContentPane().add(cxTelefoneCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairCadClientesActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmacao de saida", JOptionPane.YES_NO_OPTION);
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
     limpar();
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
    cxEmailCli.setText("");
    cxNomeCli.requestFocus();

    }
    
    public void cadastrar(){
        Cliente cliente = new Cliente();
        
        cliente.setNome(cxNomeCli.getText());
        cliente.setCpf(cxEmailCli.getText());
        cliente.setEmail(cxEmailCli.getText());
        cliente.setTelefone(cxTelefoneCli.getText());
  
        try{
        Controlador.getControlador().getServico().addCliente(cliente);
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! ", "Cadastrado", 1);
        }
        catch(CadException ce){
             JOptionPane.showMessageDialog(null, "O Cadastro nao deu certo", "ERROR", 0);
        }
        
    
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
    private javax.swing.JLabel lbCadastroCliente;
    private javax.swing.JLabel lbCpfCli;
    private javax.swing.JLabel lbEmailCli;
    private javax.swing.JLabel lbNomeCli;
    private javax.swing.JLabel lbTelefoneCli;
    // End of variables declaration//GEN-END:variables
}
