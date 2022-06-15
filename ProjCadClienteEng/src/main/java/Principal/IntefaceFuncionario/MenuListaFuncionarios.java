package Principal.IntefaceFuncionario;

import Controler.Controlador;
import Entidades.Cliente;
import Entidades.Engenheiro;
import Entidades.Funcionario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuListaFuncionarios extends javax.swing.JFrame {

    private static MenuListaFuncionarios menuListaFuncionarios = null;
    
    private MenuListaFuncionarios() {
        initComponents();
    }
    
    public static MenuListaFuncionarios getMenuListaFuncionarios(){
        if(menuListaFuncionarios == null){
            menuListaFuncionarios = new MenuListaFuncionarios();
        }
        return menuListaFuncionarios;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbFunc = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btSairMenuFunc = new javax.swing.JButton();
        lbEng = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEng = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Lista de Funcionários");
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

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        lbFunc.setFont(new java.awt.Font("Nimbus Mono PS", 1, 24)); // NOI18N
        lbFunc.setForeground(new java.awt.Color(255, 255, 255));
        lbFunc.setText("Lista de Funcionários");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lbFunc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbFunc)
                .addGap(20, 20, 20))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btSairMenuFunc.setBackground(new java.awt.Color(102, 102, 102));
        btSairMenuFunc.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btSairMenuFunc.setForeground(new java.awt.Color(255, 255, 255));
        btSairMenuFunc.setText("Sair");
        btSairMenuFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairMenuFuncActionPerformed(evt);
            }
        });

        lbEng.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lbEng.setForeground(new java.awt.Color(255, 255, 255));
        lbEng.setText("ENGENHEIROS");

        tbEng.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CREA"
            }
        ));
        jScrollPane1.setViewportView(tbEng);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btSairMenuFunc)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbEng)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbEng)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSairMenuFunc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairMenuFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairMenuFuncActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de saída", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            sair();
        }
    }//GEN-LAST:event_btSairMenuFuncActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        MenuFuncionario.getMenuFuncionario().setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        MenuFuncionario.getMenuFuncionario().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    public void sair(){
        this.dispose();
    }
    
    public void listaTabelas(){
    DefaultTableModel modelo = (DefaultTableModel) tbEng.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        //for alternativo  
        for (Funcionario eng : Controlador.getControlador().getServico().funcionarioList()) {
            modelo.insertRow(posLin, new Object[]{((Engenheiro)eng).getNome(), ((Engenheiro)eng).getCrea()});
            posLin++;

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
            java.util.logging.Logger.getLogger(MenuListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuListaFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSairMenuFunc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEng;
    private javax.swing.JLabel lbFunc;
    private javax.swing.JTable tbEng;
    // End of variables declaration//GEN-END:variables
}
