package roupashoward;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Interfaceroupas extends javax.swing.JFrame {

    List<Roupa> lista;
    Integer posicao, ultimo;

    public Interfaceroupas() {
        initComponents();
        lista = new ArrayList<Roupa>();
        posicao = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botaoprimeiro = new javax.swing.JButton();
        botaoultimo = new javax.swing.JButton();
        botaoanterior = new javax.swing.JButton();
        botaoproximo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botaoexcluir = new javax.swing.JButton();
        botaolimpar = new javax.swing.JButton();
        botaocadastrar = new javax.swing.JButton();
        botaoconsultar = new javax.swing.JButton();
        caixadescricao = new javax.swing.JTextField();
        caixatipo = new javax.swing.JTextField();
        caixacor = new javax.swing.JTextField();
        caixapreferida = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Roupas");

        botaoprimeiro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoprimeiro.setText("Primeiro");
        botaoprimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoprimeiroActionPerformed(evt);
            }
        });

        botaoultimo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoultimo.setText("Último");
        botaoultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoultimoActionPerformed(evt);
            }
        });

        botaoanterior.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoanterior.setText("Anterior");
        botaoanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoanteriorActionPerformed(evt);
            }
        });

        botaoproximo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoproximo.setText("Próximo");
        botaoproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoproximoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Descrição:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tipo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Cor:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("É minha roupa preferida:");

        botaoexcluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoexcluir.setText("Excluir");
        botaoexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoexcluirActionPerformed(evt);
            }
        });

        botaolimpar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaolimpar.setText("Limpar");
        botaolimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaolimparActionPerformed(evt);
            }
        });

        botaocadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaocadastrar.setText("Cadastrar");
        botaocadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocadastrarActionPerformed(evt);
            }
        });

        botaoconsultar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoconsultar.setText("Consultar");
        botaoconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoconsultarActionPerformed(evt);
            }
        });

        caixacor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixacorActionPerformed(evt);
            }
        });

        caixapreferida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Sim", "Não" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel5))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(caixapreferida, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caixadescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(caixatipo)
                                    .addComponent(caixacor)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botaoexcluir)
                                    .addGap(18, 18, 18)
                                    .addComponent(botaolimpar)
                                    .addGap(18, 18, 18)
                                    .addComponent(botaocadastrar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoconsultar))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botaoprimeiro)
                                    .addGap(18, 18, 18)
                                    .addComponent(botaoultimo)
                                    .addGap(18, 18, 18)
                                    .addComponent(botaoanterior)
                                    .addGap(18, 18, 18)
                                    .addComponent(botaoproximo))))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixadescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixatipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixacor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(caixapreferida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoanterior)
                    .addComponent(botaoproximo)
                    .addComponent(botaoprimeiro)
                    .addComponent(botaoultimo))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoexcluir)
                    .addComponent(botaolimpar)
                    .addComponent(botaocadastrar)
                    .addComponent(botaoconsultar))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoprimeiroActionPerformed
        posicao = 0;
        Roupa r = lista.get(posicao);
        caixadescricao.setText(r.getDescricao());
        caixatipo.setText(r.getTipo());
        caixacor.setText(r.getCor());
        if (r.getPreferida() == true) {
            caixapreferida.setSelectedIndex(1);
        } else if (r.getPreferida() == false) {
            caixapreferida.setSelectedIndex(2);
        }
    }//GEN-LAST:event_botaoprimeiroActionPerformed

    private void botaolimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaolimparActionPerformed
        Limpar();
    }//GEN-LAST:event_botaolimparActionPerformed

    private void botaoexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoexcluirActionPerformed
        if (lista.size() >= 0) {
            lista.remove(lista.get(posicao));
            Limpar();
        }
    }//GEN-LAST:event_botaoexcluirActionPerformed

    private void botaoultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoultimoActionPerformed
        posicao = lista.size() - 1;
        Roupa r = lista.get(posicao);
        caixadescricao.setText(r.getDescricao());
        caixatipo.setText(r.getTipo());
        caixacor.setText(r.getCor());
        if (r.getPreferida() == true) {
            caixapreferida.setSelectedIndex(1);
        } else if (r.getPreferida() == false) {
            caixapreferida.setSelectedIndex(2);
        }
    }//GEN-LAST:event_botaoultimoActionPerformed

    private void botaoproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoproximoActionPerformed
        posicao = posicao + 1;
        Roupa r = lista.get(posicao);
        caixadescricao.setText(r.getDescricao());
        caixatipo.setText(r.getTipo());
        caixacor.setText(r.getCor());
        if (r.getPreferida() == true) {
            caixapreferida.setSelectedIndex(1);
        } else if (r.getPreferida() == false) {
            caixapreferida.setSelectedIndex(2);
        }
    }//GEN-LAST:event_botaoproximoActionPerformed

    private void botaoanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoanteriorActionPerformed
        posicao = posicao - 1;
        Roupa r = lista.get(posicao);
        caixadescricao.setText(r.getDescricao());
        caixatipo.setText(r.getTipo());
        caixacor.setText(r.getCor());
        if (r.getPreferida() == true) {
            caixapreferida.setSelectedIndex(1);
        } else if (r.getPreferida() == false) {
            caixapreferida.setSelectedIndex(2);
        }
    }//GEN-LAST:event_botaoanteriorActionPerformed

    private void botaocadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocadastrarActionPerformed
        Roupa r = new Roupa();
        r.setDescricao(caixadescricao.getText());
        r.setTipo(caixatipo.getText());
        r.setCor(caixacor.getText());
        if (caixapreferida.getSelectedItem().toString().equals("Sim") == true) {
            r.setPreferida(true);
        } else {
            r.setPreferida(false);
        }
        lista.add(r);
        Limpar();
    }//GEN-LAST:event_botaocadastrarActionPerformed

    private void botaoconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoconsultarActionPerformed
        String nome = JOptionPane.showInputDialog("Digite o modelo a ser pesquisado: ");
        boolean encontrou = false;
        Integer posicaoachou = 0;
        for (Roupa roupa : lista) {
            if (nome.equals(roupa.getDescricao())) {
                encontrou = true;
                posicao = posicaoachou;
                caixadescricao.setText(roupa.getDescricao());
                caixatipo.setText(roupa.getTipo());
                caixacor.setText(roupa.getCor());
                if (roupa.getPreferida() == true) {
                    caixapreferida.setSelectedIndex(1);
                } else if (roupa.getPreferida() == false) {
                    caixapreferida.setSelectedIndex(2);
                }
                break;
            }
            posicaoachou++;
        }
        if (encontrou == true) {
            JOptionPane.showMessageDialog(null, "Encontrei!");
        } else {
            JOptionPane.showMessageDialog(null, "Não encontrei!");
            Limpar();
        }
    }//GEN-LAST:event_botaoconsultarActionPerformed

    private void caixacorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixacorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixacorActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Interfaceroupas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaceroupas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaceroupas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaceroupas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaceroupas().setVisible(true);
            }
        });
    }
    
    public void Limpar() {
        caixadescricao.setText(null);
        caixatipo.setText(null);
        caixacor.setText(null);
        caixapreferida.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoanterior;
    private javax.swing.JButton botaocadastrar;
    private javax.swing.JButton botaoconsultar;
    private javax.swing.JButton botaoexcluir;
    private javax.swing.JButton botaolimpar;
    private javax.swing.JButton botaoprimeiro;
    private javax.swing.JButton botaoproximo;
    private javax.swing.JButton botaoultimo;
    private javax.swing.JTextField caixacor;
    private javax.swing.JTextField caixadescricao;
    private javax.swing.JComboBox caixapreferida;
    private javax.swing.JTextField caixatipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
