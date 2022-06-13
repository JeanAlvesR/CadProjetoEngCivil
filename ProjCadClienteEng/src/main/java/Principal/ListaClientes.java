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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        btSairListaClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(tbClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 400, 260));

        btSairListaClientes.setText("Sair");
        btSairListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairListaClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btSairListaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairListaClientesActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmacao de saida", JOptionPane.YES_NO_OPTION);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbClientes;
    // End of variables declaration//GEN-END:variables
}
