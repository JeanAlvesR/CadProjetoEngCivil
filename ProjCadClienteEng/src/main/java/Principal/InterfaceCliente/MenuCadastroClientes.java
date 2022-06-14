package Principal.InterfaceCliente;

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
        java.awt.GridBagConstraints gridBagConstraints;

        Painel1 = new javax.swing.JPanel();
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
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        Painel1.setBackground(new java.awt.Color(255, 255, 255));
        Painel1.setLayout(new java.awt.GridBagLayout());

        btSairCadClientes.setText("Sair");
        btSairCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairCadClientesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 10, 0, 0);
        Painel1.add(btSairCadClientes, gridBagConstraints);

        lbCadastroCliente.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        lbCadastroCliente.setText("Cadastro Cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
        Painel1.add(lbCadastroCliente, gridBagConstraints);

        lbNomeCli.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbNomeCli.setText("Nome: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 20, 0, 0);
        Painel1.add(lbNomeCli, gridBagConstraints);

        lbCpfCli.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbCpfCli.setText("CPF: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 20, 0, 0);
        Painel1.add(lbCpfCli, gridBagConstraints);

        btCadastrarCliente.setText("Cadastrar");
        btCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 20, 0, 0);
        Painel1.add(btCadastrarCliente, gridBagConstraints);

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 12, 0, 0);
        Painel1.add(btLimpar, gridBagConstraints);

        cxNomeCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeCliActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 96;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 30, 0, 0);
        Painel1.add(cxNomeCli, gridBagConstraints);

        cxCpfCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCpfCliActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 96;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 30, 0, 0);
        Painel1.add(cxCpfCli, gridBagConstraints);

        lbEmailCli.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbEmailCli.setText("Email: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 20, 0, 0);
        Painel1.add(lbEmailCli, gridBagConstraints);

        cxEmailCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEmailCliActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 96;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 30, 0, 0);
        Painel1.add(cxEmailCli, gridBagConstraints);

        lbTelefoneCli.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbTelefoneCli.setText("Telefone: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 20, 0, 0);
        Painel1.add(lbTelefoneCli, gridBagConstraints);

        cxTelefoneCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTelefoneCliActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 96;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 30, 0, 0);
        Painel1.add(cxTelefoneCli, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(Painel1, gridBagConstraints);

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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        MenuClientes.getMenuClientes().setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        MenuClientes.getMenuClientes().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
    private javax.swing.JPanel Painel1;
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
