package Principal.InterfaceCliente;

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbConsultaCliente.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        lbConsultaCliente.setText("Consulta Cliente");

        lbTelefoneCli.setText("Telefone:");

        lbEmailCli.setText("Email:");

        lbCpfCli.setText("CPF:");

        lbNomeCli.setText("Nome:");

        cxTelefoneCli.setText("...");

        cxEmailCli.setText("...");

        cxCpfCli.setText("...");

        cxNomeCli.setText("...");

        cxCpfBusca.setForeground(new java.awt.Color(153, 153, 153));
        cxCpfBusca.setText("Digite o CPF");
        cxCpfBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCpfBuscaActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btRemoverCli.setText("Remover");
        btRemoverCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverCliActionPerformed(evt);
            }
        });

        btEditarCli.setText("Editar");
        btEditarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarCliActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSairMenuConsultaCliente.setText("Sair");
        btSairMenuConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairMenuConsultaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(lbConsultaCliente))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lbNomeCli)
                .addGap(35, 35, 35)
                .addComponent(cxNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lbCpfCli)
                .addGap(48, 48, 48)
                .addComponent(cxCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lbEmailCli)
                .addGap(38, 38, 38)
                .addComponent(cxEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lbTelefoneCli)
                .addGap(18, 18, 18)
                .addComponent(cxTelefoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(cxCpfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btConsultar)
                .addGap(18, 18, 18)
                .addComponent(btRemoverCli)
                .addGap(18, 18, 18)
                .addComponent(btEditarCli)
                .addGap(18, 18, 18)
                .addComponent(btLimpar)
                .addGap(18, 18, 18)
                .addComponent(btSairMenuConsultaCliente))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbConsultaCliente)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNomeCli)
                    .addComponent(cxNomeCli))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCpfCli)
                    .addComponent(cxCpfCli))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmailCli)
                    .addComponent(cxEmailCli))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTelefoneCli)
                    .addComponent(cxTelefoneCli))
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cxCpfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btConsultar)
                            .addComponent(btRemoverCli)
                            .addComponent(btEditarCli)
                            .addComponent(btLimpar)
                            .addComponent(btSairMenuConsultaCliente)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        MenuClientes.getMenuClientes().setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        MenuClientes.getMenuClientes().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
