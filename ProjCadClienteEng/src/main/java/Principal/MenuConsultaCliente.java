package Principal;

import Controler.Controlador;
import Entidades.Cliente;
import Servico.Exceptions.RemoveException;
import javax.swing.JOptionPane;

public class MenuConsultaCliente extends javax.swing.JFrame {

    private static MenuConsultaCliente menuConsultaCliente = null;

    private MenuConsultaCliente() {
        initComponents();
    }

    public static MenuConsultaCliente getMenuConsultaCliente() {
        if (menuConsultaCliente == null) {
            menuConsultaCliente = new MenuConsultaCliente();
        }
        return menuConsultaCliente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lbConsultaCliente = new javax.swing.JLabel();
        lbTelefoneCli = new javax.swing.JLabel();
        lbEmailCli = new javax.swing.JLabel();
        lbCpfCli = new javax.swing.JLabel();
        lbNomeCli = new javax.swing.JLabel();
        cxTelefoneCli = new javax.swing.JLabel();
        cxEmailCli = new javax.swing.JLabel();
        cxCpfCli = new javax.swing.JLabel();
        cxNomeCli = new javax.swing.JLabel();
        cxCpfBusca = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        btRemoverCli = new javax.swing.JButton();
        btEditarCli = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSairMenuConsultaCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Consulta Cliente");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lbConsultaCliente.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        lbConsultaCliente.setText("Consulta Cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 76, 0, 0);
        jPanel1.add(lbConsultaCliente, gridBagConstraints);

        lbTelefoneCli.setText("Telefone:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 62, 0, 0);
        jPanel1.add(lbTelefoneCli, gridBagConstraints);

        lbEmailCli.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 60, 0, 0);
        jPanel1.add(lbEmailCli, gridBagConstraints);

        lbCpfCli.setText("CPF:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 60, 0, 0);
        jPanel1.add(lbCpfCli, gridBagConstraints);

        lbNomeCli.setText("Nome:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 60, 0, 0);
        jPanel1.add(lbNomeCli, gridBagConstraints);

        cxTelefoneCli.setText("...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 141;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 18, 0, 0);
        jPanel1.add(cxTelefoneCli, gridBagConstraints);

        cxEmailCli.setText("...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 131;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 18, 0, 0);
        jPanel1.add(cxEmailCli, gridBagConstraints);

        cxCpfCli.setText("...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 131;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 18, 0, 0);
        jPanel1.add(cxCpfCli, gridBagConstraints);

        cxNomeCli.setText("...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 141;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        jPanel1.add(cxNomeCli, gridBagConstraints);

        cxCpfBusca.setForeground(new java.awt.Color(153, 153, 153));
        cxCpfBusca.setText("Digite o CPF");
        cxCpfBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCpfBuscaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(82, 40, 20, 0);
        jPanel1.add(cxCpfBusca, gridBagConstraints);

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(85, 18, 0, 0);
        jPanel1.add(btConsultar, gridBagConstraints);

        btRemoverCli.setText("Remover");
        btRemoverCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverCliActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(85, 18, 0, 0);
        jPanel1.add(btRemoverCli, gridBagConstraints);

        btEditarCli.setText("Editar");
        btEditarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarCliActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(85, 18, 0, 0);
        jPanel1.add(btEditarCli, gridBagConstraints);

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 36;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(85, 18, 0, 0);
        jPanel1.add(btLimpar, gridBagConstraints);

        btSairMenuConsultaCliente.setText("Sair");
        btSairMenuConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairMenuConsultaClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 37;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(85, 18, 0, 13);
        jPanel1.add(btSairMenuConsultaCliente, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxCpfBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCpfBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCpfBuscaActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btRemoverCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverCliActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente remover?", "Confirmação de remoção", JOptionPane.YES_NO_OPTION);

        if (resp == 0) {
            remover();
            limpar();
        }

        
    }//GEN-LAST:event_btRemoverCliActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btEditarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarCliActionPerformed
        Cliente cliente = verificaCliente();
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "O cliente não existe!", "ERROR", 0);

        } else {
            MenuAtualizarCliente.getMenuAtualizarCliente().setVisible(true);
            MenuAtualizarCliente.getMenuAtualizarCliente().impDados(cliente);
        }
    }//GEN-LAST:event_btEditarCliActionPerformed

    private void btSairMenuConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairMenuConsultaClienteActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de saída", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            sair();
        }
    }//GEN-LAST:event_btSairMenuConsultaClienteActionPerformed

    public void sair(){
        this.dispose();
    }
    
    public Cliente verificaCliente() {
        if (cxCpfBusca.getText().isEmpty()) {
            return null;
        }
        Cliente cliente = new Cliente();
        cliente.setCpf(cxCpfBusca.getText());
        cliente = Controlador.getControlador().getServico().consultaCliente(cliente);
        return cliente;
    }

    public void limpar() {

        cxCpfBusca.setText("Digite o CPF");
        cxNomeCli.setText("...");
        cxCpfCli.setText("...");
        cxEmailCli.setText("...");
        cxTelefoneCli.setText("...");

    }

    public boolean remover() {

        Cliente cliente = new Cliente();
        cliente.setCpf(cxCpfBusca.getText());

        if (cxCpfBusca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O código precisa existir!", "ERROR", 0);
            return false;
        }

        try {
            Controlador.getControlador().getServico().removeCliente(cliente);
            JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!", "Removido", 1);
        } catch (RemoveException re) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!", "ERROR", 0);
            return false;
        }

        return true;
    }

    public void consultar() {
        Cliente cliente = new Cliente();

        cliente.setCpf(cxCpfBusca.getText());

        cliente = Controlador.getControlador().getServico().consultaCliente(cliente);

        if (cliente != null) {
            cxNomeCli.setText(cliente.getNome());
            cxCpfCli.setText(cliente.getCpf());
            cxEmailCli.setText(cliente.getEmail());
            cxTelefoneCli.setText(cliente.getTelefone());
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!", "ERROR", 0);
        }

    }

    public void consultaAtualizada(Cliente cliente) {
        cxNomeCli.setText(cliente.getNome());
        cxCpfCli.setText(cliente.getCpf());
        cxEmailCli.setText(cliente.getEmail());
        cxTelefoneCli.setText(cliente.getTelefone());
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
            java.util.logging.Logger.getLogger(MenuConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConsultaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEditarCli;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRemoverCli;
    private javax.swing.JButton btSairMenuConsultaCliente;
    private javax.swing.JTextField cxCpfBusca;
    private javax.swing.JLabel cxCpfCli;
    private javax.swing.JLabel cxEmailCli;
    private javax.swing.JLabel cxNomeCli;
    private javax.swing.JLabel cxTelefoneCli;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbConsultaCliente;
    private javax.swing.JLabel lbCpfCli;
    private javax.swing.JLabel lbEmailCli;
    private javax.swing.JLabel lbNomeCli;
    private javax.swing.JLabel lbTelefoneCli;
    // End of variables declaration//GEN-END:variables
}
