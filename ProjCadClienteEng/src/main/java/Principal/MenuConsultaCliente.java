package Principal;

import Controler.Controlador;
import Entidades.Cliente;
import javax.swing.JOptionPane;


public class MenuConsultaCliente extends javax.swing.JFrame {

    private static MenuConsultaCliente menuConsultaCliente = null;
    
    private MenuConsultaCliente() {
        initComponents();
    }
    
    public static MenuConsultaCliente getMenuConsultaCliente(){
        if(menuConsultaCliente == null){
            menuConsultaCliente = new MenuConsultaCliente();
        }
        return menuConsultaCliente;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbConsultaCliente = new javax.swing.JLabel();
        lbNomeCli = new javax.swing.JLabel();
        lbCpfCli = new javax.swing.JLabel();
        lbEmailCli = new javax.swing.JLabel();
        lbTelefoneCli = new javax.swing.JLabel();
        cxNomeCli = new javax.swing.JLabel();
        cxCpfBusca = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        cxCpfCli = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbConsultaCliente.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        lbConsultaCliente.setText("Consulta Cliente");
        getContentPane().add(lbConsultaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        lbNomeCli.setText("Nome:");
        getContentPane().add(lbNomeCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        lbCpfCli.setText("CPF:");
        getContentPane().add(lbCpfCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        lbEmailCli.setText("Email:");
        getContentPane().add(lbEmailCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        lbTelefoneCli.setText("Telefone:");
        getContentPane().add(lbTelefoneCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        cxNomeCli.setText("...");
        getContentPane().add(cxNomeCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 150, -1));

        cxCpfBusca.setForeground(new java.awt.Color(153, 153, 153));
        cxCpfBusca.setText("Digite o CPF");
        cxCpfBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCpfBuscaActionPerformed(evt);
            }
        });
        getContentPane().add(cxCpfBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        cxCpfCli.setText("...");
        getContentPane().add(cxCpfCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxCpfBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCpfBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCpfBuscaActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
       consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    public void consultar(){
        Cliente cliente = new Cliente();
        
        cliente.setCpf(cxCpfBusca.getText());
        
        cliente = Controlador.getControlador().getServico().consultaCliente(cliente);
        
        if(cliente != null){
            cxNomeCli.setText(cliente.getNome());
            cxCpfCli.setText(cliente.getCpf());
        }
        else{
            JOptionPane.showMessageDialog(null, "Cliente nao encontrado!", "ERROR", 0);
        }
        
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
    private javax.swing.JTextField cxCpfBusca;
    private javax.swing.JLabel cxCpfCli;
    private javax.swing.JLabel cxNomeCli;
    private javax.swing.JLabel lbConsultaCliente;
    private javax.swing.JLabel lbCpfCli;
    private javax.swing.JLabel lbEmailCli;
    private javax.swing.JLabel lbNomeCli;
    private javax.swing.JLabel lbTelefoneCli;
    // End of variables declaration//GEN-END:variables
}
