package Telas;

import OutrasClasses.Usuario;
import OutrasClasses.UsuarioDao;
import OutrasClasses.UsuarioServicos;
import javax.swing.JOptionPane;

public class Tela_Criar_Conta extends javax.swing.JFrame {

    UsuarioServicos serviceUser = new UsuarioServicos(new UsuarioDao());
    public Usuario usuario;

    public Tela_Criar_Conta(Usuario user) {
        initComponents();
        usuario = user;
    }

    public Tela_Criar_Conta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_email = new javax.swing.JLabel();
        lbl_salario = new javax.swing.JLabel();
        lbl_funcao = new javax.swing.JLabel();
        lbl_senha = new javax.swing.JLabel();
        lbl_nascimento = new javax.swing.JLabel();
        lbl_cpf = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        txt_nascimento = new javax.swing.JTextField();
        txt_nome = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_cpf = new javax.swing.JTextField();
        txt_salario = new javax.swing.JTextField();
        txt_senha = new javax.swing.JTextField();
        btn_voltar = new javax.swing.JButton();
        btn_criar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbb_funcao = new javax.swing.JComboBox<>();
        lbl_erro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_email.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_email.setText("E_mail: ");

        lbl_salario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_salario.setText("Salário: ");

        lbl_funcao.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_funcao.setText("Função: ");

        lbl_senha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_senha.setText("Senha: ");

        lbl_nascimento.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_nascimento.setText("Nascimento: ");

        lbl_cpf.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_cpf.setText("CPF: ");

        lbl_nome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_nome.setText("Nome:");

        txt_nascimento.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_nascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nascimentoActionPerformed(evt);
            }
        });

        txt_nome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });

        txt_email.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        txt_cpf.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cpfActionPerformed(evt);
            }
        });

        txt_salario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salarioActionPerformed(evt);
            }
        });

        txt_senha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_senhaActionPerformed(evt);
            }
        });

        btn_voltar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        btn_criar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_criar.setText("Criar");
        btn_criar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_criarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel8.setText("Criar Conta");

        cbb_funcao.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cbb_funcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Repositor", "Caixa", "Faxineiro", "Açougueiro", "Gerente" }));

        lbl_erro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_erro.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_funcao)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nome)
                            .addComponent(lbl_salario)
                            .addComponent(lbl_senha)
                            .addComponent(lbl_nascimento)
                            .addComponent(lbl_email)
                            .addComponent(lbl_cpf)
                            .addComponent(btn_voltar))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                                    .addComponent(txt_email)
                                    .addComponent(txt_cpf)
                                    .addComponent(txt_nascimento)
                                    .addComponent(txt_nome)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_salario)
                                        .addComponent(btn_criar, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cbb_funcao, 0, 335, Short.MAX_VALUE))
                                    .addComponent(lbl_erro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(297, 297, 297))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel8)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nascimento)
                    .addComponent(txt_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cpf)
                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_email)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_senha)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_salario)
                    .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_funcao)
                    .addComponent(cbb_funcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_voltar)
                    .addComponent(btn_criar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_erro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        txt_nascimento.getAccessibleContext().setAccessibleParent(lbl_nascimento);
        txt_nome.getAccessibleContext().setAccessibleParent(lbl_nome);
        txt_email.getAccessibleContext().setAccessibleParent(lbl_email);
        txt_cpf.getAccessibleContext().setAccessibleParent(lbl_cpf);
        txt_salario.getAccessibleContext().setAccessibleParent(lbl_salario);
        txt_senha.getAccessibleContext().setAccessibleParent(lbl_senha);
        cbb_funcao.getAccessibleContext().setAccessibleParent(lbl_funcao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(816, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_criarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_criarActionPerformed
        Salvar();
    }//GEN-LAST:event_btn_criarActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        Tela_das_Contas T_C = new Tela_das_Contas(usuario);
        T_C.setVisible(true);

        dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void txt_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_senhaActionPerformed

    private void txt_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salarioActionPerformed

    private void txt_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cpfActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void txt_nascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nascimentoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Criar_Conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Criar_Conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Criar_Conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Criar_Conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Criar_Conta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_criar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JComboBox<String> cbb_funcao;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_cpf;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_erro;
    private javax.swing.JLabel lbl_funcao;
    private javax.swing.JLabel lbl_nascimento;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_salario;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JTextField txt_cpf;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nascimento;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_salario;
    private javax.swing.JTextField txt_senha;
    // End of variables declaration//GEN-END:variables
public void Salvar() {

        if (!txt_nome.getText().isEmpty() || !txt_nascimento.getText().isEmpty()
        || !txt_cpf.getText().isEmpty() || !txt_email.getText().isEmpty()
        || !txt_senha.getText().isEmpty() || !txt_salario.getText().isEmpty()) {
            
            lbl_erro.setText("");
            Usuario user = new Usuario();

            user.setNome(txt_nome.getText());
            user.setE_mail(txt_email.getText());
            user.setSenha(txt_senha.getText());
            user.setFuncao(cbb_funcao.getSelectedItem().toString());
            user.setH_trabalhadas(0);
            user.setNascimento(txt_nascimento.getText());
            user.setCPF(txt_cpf.getText());
            
            try{
                user.setSalario(Double.parseDouble(txt_salario.getText().toString()));
            }catch(Exception ex){
                lbl_erro.setText("Salario inválido");
                user.setSalario(-1.00);
            }

            if (UsuarioServicos.validarUsuario(user) == null) {
                String Senhainf = JOptionPane.showInputDialog("Indique SUA senha para criar a conta!");
                
                if (UsuarioServicos.validarPermissao(this.usuario, Senhainf)) {
                    if(serviceUser.adicionarUsuario(user)){
                    Tela_das_Contas T_C = new Tela_das_Contas(this.usuario);
                    T_C.setVisible(true);

                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");

                    dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro ao cadastrar Usuario");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Senha incorreta ou Você não tem permissão necessaria!");
                }
            } else {
                lbl_erro.setText(UsuarioServicos.validarUsuario(user));
            }

        }else{
            lbl_erro.setText("Preencha Todos os valores");
        }
    }
}
