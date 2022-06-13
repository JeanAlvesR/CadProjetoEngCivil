package Principal;

import Controler.Controlador;
import Entidades.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaClientes extends javax.swing.JFrame {

    private static ListaClientes listaClientes = null;

    private ListaClientes() {
        initComponents();
    }

    public static ListaClientes getListaClientes() {
        if (listaClientes == null) {
            listaClientes = new ListaClientes();
        }
        return listaClientes;
    }

    public void listaTabela() {
        //Deixar a tabela flexível/expansível com base nos dados que entram.
        DefaultTableModel modelo = (DefaultTableModel) tbClientes.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        //for alternativo
        for (Cliente cliente : Controlador.getControlador().getServico().clienteList()) {
            modelo.insertRow(posLin, new Object[]{cliente.getNome(), cliente.getCpf()});
            posLin++;

        }
    }
       
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        btSairListaClientes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btSairListaClientes.setText("Sair");
        btSairListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairListaClientesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 213, 12, 5);
        jPanel2.add(btSairListaClientes, gridBagConstraints);

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "CPF"
            }
        ));
        tbClientes.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(tbClientes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 263;
        gridBagConstraints.ipady = 283;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 5);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairListaClientesActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de saída", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            sair();
        }
    }//GEN-LAST:event_btSairListaClientesActionPerformed

    public void sair(){
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
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSairListaClientes;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbClientes;
    // End of variables declaration//GEN-END:variables
}