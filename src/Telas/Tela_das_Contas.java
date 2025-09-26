package Telas;

import OutrasClasses.Usuario;
import OutrasClasses.UsuarioDao;
import OutrasClasses.UsuarioServicos;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tela_das_Contas extends javax.swing.JFrame {

    UsuarioServicos serviceUser = new UsuarioServicos(new UsuarioDao());
    public Usuario usuario;

    public Tela_das_Contas(Usuario user) {
        initComponents();
        usuario = user;
        Preencher();

    }

    public Tela_das_Contas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_contas = new javax.swing.JTable();
        btn_adicionar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl_adicionarhoras = new javax.swing.JLabel();
        txt_addhoras = new javax.swing.JTextField();
        btn_adicionar_H = new javax.swing.JButton();
        lbl_horastrabalhadas = new javax.swing.JLabel();
        lbl_horas = new javax.swing.JLabel();
        lbl_Salario = new javax.swing.JLabel();
        btn_zerar = new javax.swing.JButton();
        lbl_salario = new javax.swing.JLabel();
        lbl_erro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText("Contas");

        tbl_contas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tbl_contas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_contasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_contas);

        btn_adicionar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_adicionar.setText("Adicionar Novo");
        btn_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarActionPerformed(evt);
            }
        });

        btn_editar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_excluir.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_voltar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_adicionarhoras.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_adicionarhoras.setText("Adicionar Horas Trabalhadas: ");

        txt_addhoras.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_addhoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addhorasActionPerformed(evt);
            }
        });

        btn_adicionar_H.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_adicionar_H.setText("Adicionar");
        btn_adicionar_H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionar_HActionPerformed(evt);
            }
        });

        lbl_horastrabalhadas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_horastrabalhadas.setText("Horas Totais Trabalhadas: ");

        lbl_horas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_horas.setText("0");

        lbl_Salario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_Salario.setText("Salario Final: ");

        btn_zerar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_zerar.setText("Zerar Horas");
        btn_zerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_zerarActionPerformed(evt);
            }
        });

        lbl_salario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_salario.setText("R$: 00,00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_horastrabalhadas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_horas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_adicionarhoras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_addhoras, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_adicionar_H)
                            .addComponent(lbl_Salario))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_salario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_zerar)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_horastrabalhadas)
                    .addComponent(lbl_horas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_adicionarhoras)
                    .addComponent(txt_addhoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_adicionar_H, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_zerar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Salario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txt_addhoras.getAccessibleContext().setAccessibleParent(lbl_adicionarhoras);

        lbl_erro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_erro.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jLabel1)
                .addGap(0, 332, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_excluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_voltar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_editar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_adicionar))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_erro, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_adicionar)
                            .addComponent(btn_editar))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_voltar)
                            .addComponent(btn_excluir))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_erro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(15, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 580));

        setSize(new java.awt.Dimension(816, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        Excluir();

    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed
        Tela_Criar_Conta T_C_C = new Tela_Criar_Conta(usuario);
        T_C_C.setVisible(true);

        dispose();
    }//GEN-LAST:event_btn_adicionarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        TEditar();

    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        Tela_Inicial T_I = new Tela_Inicial(usuario);
        T_I.setVisible(true);

        dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void txt_addhorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addhorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addhorasActionPerformed

    private void btn_adicionar_HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionar_HActionPerformed
        Adicionarhoras();
        PreencherH();
    }//GEN-LAST:event_btn_adicionar_HActionPerformed

    private void btn_zerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_zerarActionPerformed
        Zerar();
        PreencherH();
    }//GEN-LAST:event_btn_zerarActionPerformed

    private void tbl_contasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_contasMouseClicked
        PreencherH();
    }//GEN-LAST:event_tbl_contasMouseClicked

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
            java.util.logging.Logger.getLogger(Tela_das_Contas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_das_Contas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_das_Contas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_das_Contas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_das_Contas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_adicionar_H;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JButton btn_zerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Salario;
    private javax.swing.JLabel lbl_adicionarhoras;
    private javax.swing.JLabel lbl_erro;
    private javax.swing.JLabel lbl_horas;
    private javax.swing.JLabel lbl_horastrabalhadas;
    private javax.swing.JLabel lbl_salario;
    private javax.swing.JTable tbl_contas;
    private javax.swing.JTextField txt_addhoras;
    // End of variables declaration//GEN-END:variables
    public void Adicionarhoras() {
        if (tbl_contas.getSelectedRow() != -1) {
            Usuario user = serviceUser.getUsuarioId
        (Integer.parseInt(tbl_contas.getValueAt(tbl_contas.getSelectedRow(), 0).toString()));
            
            if (user.getNome() != null) {
                lbl_erro.setText("");

                user.setH_trabalhadas(user.getH_trabalhadas() + Integer.parseInt(txt_addhoras.getText()));

                serviceUser.atualizarUsuario(user);

            } else {
                lbl_erro.setText("Selecione um Usuário");
            }
        }
    }

    public void Preencher() {
        List<Usuario> listaU = serviceUser.getListUsuario();

        String[] config = {"Id", "Nome", "CPF", "Nascimento", "E_mail", "Funcao", "Salário", "Senha"};
        DefaultTableModel Modelo = new DefaultTableModel(config, 0);

        for (int i = 0; listaU.size() > i; i++) {
            Usuario user = listaU.get(i);

            String[] Linha = {
                Integer.toString(user.getId()),
                user.getNome(),
                user.getCPF(),
                user.getNascimento(),
                user.getE_mail(),
                user.getFuncao(),
                Double.toString(user.getSalario()),
                user.getSenha()
            };
            Modelo.addRow(Linha);
        }
        tbl_contas.setModel(Modelo);
    }

    public void PreencherH() {
        if (tbl_contas.getSelectedRow() != -1) {
            Usuario user = serviceUser.getUsuarioId
        (Integer.parseInt(tbl_contas.getValueAt(tbl_contas.getSelectedRow(), 0).toString()));
            
            if (user.getNome() != null) {
                lbl_erro.setText("");
                lbl_horas.setText(Integer.toString(user.getH_trabalhadas()));

                double salario = UsuarioServicos.salarioCalculado(user);

                lbl_salario.setText("R$: " + salario);

            } else {
                lbl_erro.setText("Usuário não encontrado");
            }
        }
    }

    public void Zerar() {
        if (tbl_contas.getSelectedRow() != -1) {
            Usuario user = serviceUser.getUsuarioId
        (Integer.parseInt(tbl_contas.getValueAt(tbl_contas.getSelectedRow(), 0).toString()));
            
            if (user.getNome() != null) {
                lbl_erro.setText("");

                user.setH_trabalhadas(0);

                serviceUser.atualizarUsuario(user);

            } else {
                lbl_erro.setText("Selecione um Usuário");
            }
        }
    }

    public void TEditar() {
        if (tbl_contas.getSelectedRow() != -1) {
            Usuario user = serviceUser.getUsuarioId
        (Integer.parseInt(tbl_contas.getValueAt(tbl_contas.getSelectedRow(), 0).toString()));
            
            if (user.getNome() != null) {
                Tela_Editar_Conta E_C = new Tela_Editar_Conta(usuario, user.getId());
                E_C.setVisible(true);
                dispose();
            }
        } else {
            lbl_erro.setText("Selecione um Usuário");
        }

    }

    public void Excluir() {
        if (tbl_contas.getSelectedRow() != -1) {
            lbl_erro.setText("");

            String Senhainf = JOptionPane.showInputDialog("Indique SUA senha para excluir a conta!");
            if (UsuarioServicos.validarPermissao(usuario, Senhainf)) {

                int id = Integer.parseInt(tbl_contas.getValueAt(tbl_contas.getSelectedRow(), 0).toString());
                if (serviceUser.deletarUsuario(id)) {
                    Preencher();
                    JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
                } else {
                    Preencher();
                    JOptionPane.showMessageDialog(null, "Erro ao Excluir o Usuário!");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta ou Você não tem permissão necessaria!");
            }
        } else {
            lbl_erro.setText("Selecione um Usuario");
        }
    }
}
