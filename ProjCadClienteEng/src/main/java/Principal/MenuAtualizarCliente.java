package Principal;

import Controler.Controlador;
import Entidades.Cliente;
import Servico.Exceptions.AtualizaException;
import javax.swing.JOptionPane;


public class MenuAtualizarCliente extends javax.swing.JFrame {
    
    private static MenuAtualizarCliente menuAtualizarCliente = null;

    private MenuAtualizarCliente() {
        initComponents();
        
    }
    public void impDados(Cliente cliente){
        cxNomeCli.setText(cliente.getNome());
        cxCpfCli.setText(cliente.getCpf());
        cxEmailCli.setText(cliente.getEmail());
        cxTelefoneCli.setText(cliente.getTelefone());
    }
    
    public static MenuAtualizarCliente getMenuAtualizarCliente(){
    
        if(menuAtualizarCliente == null){
            menuAtualizarCliente = new MenuAtualizarCliente();
        }
        
        //Metodo que imprime na tela os dados...
        
        return menuAtualizarCliente;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbNomeCli = new javax.swing.JLabel();
        lbCpfCli = new javax.swing.JLabel();
        lbEmailCli = new javax.swing.JLabel();
        lbTelefoneCli = new javax.swing.JLabel();
        cxNomeCli = new javax.swing.JTextField();
        cxEmailCli = new javax.swing.JTextField();
        cxTelefoneCli = new javax.swing.JTextField();
        cxCpfCli = new javax.swing.JLabel();
        btAtualizarCli = new javax.swing.JButton();
        brSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel1.setText("Atualiza Cliente");

        lbNomeCli.setText("Nome: ");

        lbCpfCli.setText("CPF: ");

        lbEmailCli.setText("Email:");

        lbTelefoneCli.setText("Telefone:");

        cxCpfCli.setText("...");

        btAtualizarCli.setText("Atualizar");
        btAtualizarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarCliActionPerformed(evt);
            }
        });

        brSair.setText("Sair");
        brSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNomeCli)
                    .addComponent(lbCpfCli)
                    .addComponent(lbEmailCli)
                    .addComponent(lbTelefoneCli))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxNomeCli)
                                    .addComponent(cxEmailCli)
                                    .addComponent(cxCpfCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cxTelefoneCli)))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAtualizarCli)
                .addGap(18, 18, 18)
                .addComponent(brSair)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeCli)
                    .addComponent(cxNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCpfCli)
                    .addComponent(cxCpfCli))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmailCli)
                    .addComponent(cxEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefoneCli)
                    .addComponent(cxTelefoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizarCli)
                    .addComponent(brSair))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAtualizarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarCliActionPerformed
        atualizar();
        Cliente cliente = capturaDados();
        MenuConsultaCliente.getMenuConsultaCliente().consultaAtualizada(cliente);
        sair();
    }//GEN-LAST:event_btAtualizarCliActionPerformed

    private void brSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brSairActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmacao de saida", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            sair();
        }
    }//GEN-LAST:event_brSairActionPerformed

    public Cliente capturaDados(){
        Cliente cliente = new Cliente();
        
        cliente.setNome(cxNomeCli.getText());
        cliente.setCpf(cxEmailCli.getText());
        cliente.setEmail(cxEmailCli.getText());
        cliente.setTelefone(cxTelefoneCli.getText());
        return cliente;
    }
    
    public void sair() {
        this.dispose();
    }
    public void atualizar(){
    
    int resp = JOptionPane.showConfirmDialog(null, "Todos os campos serao atualizados. Deseja realmente Atualizar? ", "Confirmacao de Atualizacao", JOptionPane.YES_NO_CANCEL_OPTION);

    if(resp==0){
        Cliente cliente = new Cliente();
        cliente.setNome(cxNomeCli.getText());
        cliente.setCpf(cxCpfCli.getText());
        cliente.setEmail(cxEmailCli.getText());
        cliente.setTelefone(cxTelefoneCli.getText());
        
        try{
            Controlador.getControlador().getServico().atualizaCliente(cliente);
        }catch(AtualizaException ae){
            JOptionPane.showMessageDialog(null, "Erro Encontrado!", "ERROR", 0);
        }
    }
    
    }
    
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
            java.util.logging.Logger.getLogger(MenuAtualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAtualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAtualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAtualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAtualizarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brSair;
    private javax.swing.JButton btAtualizarCli;
    private javax.swing.JLabel cxCpfCli;
    private javax.swing.JTextField cxEmailCli;
    private javax.swing.JTextField cxNomeCli;
    private javax.swing.JTextField cxTelefoneCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbCpfCli;
    private javax.swing.JLabel lbEmailCli;
    private javax.swing.JLabel lbNomeCli;
    private javax.swing.JLabel lbTelefoneCli;
    // End of variables declaration//GEN-END:variables
}
