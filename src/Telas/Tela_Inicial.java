
package Telas;

import OutrasClasses.Usuario;

/**
 *
 * @author Dyonathan
 */
public class Tela_Inicial extends javax.swing.JFrame {
public Usuario usuario;
    public Tela_Inicial(Usuario user){
        initComponents();
        Permissoes(user);
        usuario = user;
        
    }
    public Tela_Inicial() {
        initComponents();
        
        btn_dados.setEnabled(true);
        btn_estoque.setEnabled(true);
        btn_contas.setEnabled(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_dados = new javax.swing.JButton();
        btn_estoque = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        btn_contas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_dados.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_dados.setText("Seus Dados");
        btn_dados.setEnabled(false);
        btn_dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dadosActionPerformed(evt);
            }
        });
        jPanel2.add(btn_dados, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 101, -1, -1));

        btn_estoque.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_estoque.setText("Estoque");
        btn_estoque.setEnabled(false);
        btn_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estoqueActionPerformed(evt);
            }
        });
        jPanel2.add(btn_estoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 179, -1, -1));

        btn_sair.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        btn_contas.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_contas.setText("Contas");
        btn_contas.setEnabled(false);
        btn_contas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contasActionPerformed(evt);
            }
        });
        jPanel2.add(btn_contas, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 257, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 430));

        setSize(new java.awt.Dimension(616, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dadosActionPerformed
        Tela_Dados T_D = new Tela_Dados(usuario);
        T_D.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btn_dadosActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        Tela_de_Login T_C = new Tela_de_Login();
        T_C.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_contasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contasActionPerformed
        Tela_das_Contas T_C = new Tela_das_Contas(usuario);
        T_C.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btn_contasActionPerformed

    private void btn_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estoqueActionPerformed
        Tela_Estoque T_E = new Tela_Estoque(usuario);
        T_E.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btn_estoqueActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_contas;
    private javax.swing.JButton btn_dados;
    private javax.swing.JButton btn_estoque;
    private javax.swing.JButton btn_sair;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
public void Permissoes(Usuario user){
    if (user.getFuncao().equalsIgnoreCase("Gerente")){
        btn_dados.setEnabled(true);
        btn_estoque.setEnabled(true);
        btn_contas.setEnabled(true);
    }else if (user.getFuncao().equalsIgnoreCase("Repositor")){
        btn_dados.setEnabled(true);
        btn_estoque.setEnabled(true);
    }else if (user.getFuncao().equalsIgnoreCase("Açougueiro")){
        btn_dados.setEnabled(true);
        btn_estoque.setEnabled(true);
    }else if (user.getFuncao().equalsIgnoreCase("Caixa")){
        btn_dados.setEnabled(true);
        btn_estoque.setEnabled(true);
    }else if (user.getFuncao().equalsIgnoreCase("Faxineiro")){
        btn_dados.setEnabled(true);
    }
}

}
