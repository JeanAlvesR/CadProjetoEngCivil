package Principal.IntefaceFuncionario;

import javax.swing.JOptionPane;

public class MenuCadastroFuncionarios extends javax.swing.JFrame {


    private static MenuCadastroFuncionarios menuCadastroFuncionarios = null;
    
    private MenuCadastroFuncionarios() {
        initComponents();
    }

    public static MenuCadastroFuncionarios getMenuCadastroFuncionarios(){
        
        if(menuCadastroFuncionarios == null){
            menuCadastroFuncionarios = new MenuCadastroFuncionarios();
        }
        
        return menuCadastroFuncionarios;
    }
            
            
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btCadArq = new javax.swing.JButton();
        btCadEng = new javax.swing.JButton();
        btSairMenuFunc = new javax.swing.JButton();
        btCadFuncGeral = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbFunc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Cadastro de Funcionários");
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

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btCadArq.setBackground(new java.awt.Color(102, 102, 102));
        btCadArq.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btCadArq.setForeground(new java.awt.Color(255, 255, 255));
        btCadArq.setText("Arquiteto");
        btCadArq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadArqActionPerformed(evt);
            }
        });

        btCadEng.setBackground(new java.awt.Color(102, 102, 102));
        btCadEng.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btCadEng.setForeground(new java.awt.Color(255, 255, 255));
        btCadEng.setText("Engenheiro");
        btCadEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadEngActionPerformed(evt);
            }
        });

        btSairMenuFunc.setBackground(new java.awt.Color(102, 102, 102));
        btSairMenuFunc.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btSairMenuFunc.setForeground(new java.awt.Color(255, 255, 255));
        btSairMenuFunc.setText("Sair");
        btSairMenuFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairMenuFuncActionPerformed(evt);
            }
        });

        btCadFuncGeral.setBackground(new java.awt.Color(102, 102, 102));
        btCadFuncGeral.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btCadFuncGeral.setForeground(new java.awt.Color(255, 255, 255));
        btCadFuncGeral.setText("Funcionario Geral");
        btCadFuncGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadFuncGeralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadEng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadArq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadFuncGeral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addComponent(btSairMenuFunc)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btCadEng)
                .addGap(18, 18, 18)
                .addComponent(btCadArq)
                .addGap(18, 18, 18)
                .addComponent(btCadFuncGeral)
                .addGap(0, 76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSairMenuFunc)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        lbFunc.setFont(new java.awt.Font("Nimbus Mono PS", 1, 24)); // NOI18N
        lbFunc.setForeground(new java.awt.Color(255, 255, 255));
        lbFunc.setText("Cadastro de Funcionários");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lbFunc)
                .addGap(15, 15, 15))
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
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadArqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadArqActionPerformed
        
    }//GEN-LAST:event_btCadArqActionPerformed

    private void btCadEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadEngActionPerformed
        
    }//GEN-LAST:event_btCadEngActionPerformed

    private void btSairMenuFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairMenuFuncActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de saída", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            sair();
        }
    }//GEN-LAST:event_btSairMenuFuncActionPerformed

    public void sair(){
        this.dispose();
    }
    
    private void btCadFuncGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadFuncGeralActionPerformed

        //ListaClientes.getListaClientes().setVisible(true);
        //ListaClientes.getListaClientes().listaTabela();
    }//GEN-LAST:event_btCadFuncGeralActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        MenuFuncionario.getMenuFuncionario().setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        MenuFuncionario.getMenuFuncionario().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(MenuCadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCadastroFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadArq;
    private javax.swing.JButton btCadEng;
    private javax.swing.JButton btCadFuncGeral;
    private javax.swing.JButton btSairMenuFunc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbFunc;
    // End of variables declaration//GEN-END:variables
}
