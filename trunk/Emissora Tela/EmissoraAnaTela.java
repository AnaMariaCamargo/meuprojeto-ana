package janelas;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EmissoraAnaTela extends javax.swing.JFrame {

    List<Emissora> lista;
    Integer posicao, ultimo;

    public EmissoraAnaTela() {
        initComponents();
        lista = new ArrayList<Emissora>();
        posicao = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JLabel();
        btlimpar = new javax.swing.JButton();
        caixanome = new javax.swing.JTextField();
        exibicao = new javax.swing.JLabel();
        endereco = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        caixaendereco = new javax.swing.JTextField();
        caixaexibicao = new javax.swing.JComboBox();
        btcadastrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btanterior = new javax.swing.JButton();
        btprimeiro = new javax.swing.JButton();
        btproximo = new javax.swing.JButton();
        btultimo = new javax.swing.JButton();
        btexcluir = new javax.swing.JButton();
        btconsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nome.setText("Nome:");

        btlimpar.setBackground(new java.awt.Color(255, 255, 255));
        btlimpar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btlimpar.setText("Limpar");
        btlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimparActionPerformed(evt);
            }
        });

        exibicao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        exibicao.setText("Exibição:");

        endereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        endereco.setText("Endereço: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Emissora");

        caixaexibicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Aberta", "Fechada" }));
        caixaexibicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaexibicaoActionPerformed(evt);
            }
        });

        btcadastrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btcadastrar.setText("Cadastrar");
        btcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcadastrarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navegação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        btanterior.setText("Anterior");
        btanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanteriorActionPerformed(evt);
            }
        });

        btprimeiro.setText("Primeiro");
        btprimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btprimeiroActionPerformed(evt);
            }
        });

        btproximo.setText("Próximo");
        btproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btproximoActionPerformed(evt);
            }
        });

        btultimo.setText("Último");
        btultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btultimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btprimeiro)
                .addGap(18, 18, 18)
                .addComponent(btproximo)
                .addGap(18, 18, 18)
                .addComponent(btanterior)
                .addGap(18, 18, 18)
                .addComponent(btultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btprimeiro)
                    .addComponent(btproximo)
                    .addComponent(btanterior)
                    .addComponent(btultimo))
                .addGap(41, 41, 41))
        );

        btexcluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btexcluir.setText("Excluir");
        btexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluirActionPerformed(evt);
            }
        });

        btconsultar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btconsultar.setText("Consultar");
        btconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exibicao)
                                .addGap(28, 28, 28)
                                .addComponent(caixaexibicao, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btcadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(btconsultar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(caixanome, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(endereco)
                                    .addGap(18, 18, 18)
                                    .addComponent(caixaendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btexcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btlimpar)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(caixanome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endereco)
                    .addComponent(caixaendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exibicao)
                    .addComponent(caixaexibicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btlimpar)
                    .addComponent(btexcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btcadastrar)
                    .addComponent(btconsultar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        caixanome.setText(null);
        caixaendereco.setText(null);
        caixaexibicao.setSelectedIndex(0);
    }//GEN-LAST:event_btlimparActionPerformed

    private void caixaexibicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaexibicaoActionPerformed

    }//GEN-LAST:event_caixaexibicaoActionPerformed

    private void btcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcadastrarActionPerformed
        Emissora obj = new Emissora();
        obj.setNomeemissora(caixanome.getText());
        obj.setEndereco(caixaendereco.getText());
        if (caixaexibicao.getSelectedItem().toString().equals("Aberta") == true) {
            obj.setTvabertaoufechada(true);
        } else {
            obj.setTvabertaoufechada(false);
        }
        lista.add(obj);
        Limpar();
        JOptionPane.showMessageDialog(null, "Foi cadastrado");
    }//GEN-LAST:event_btcadastrarActionPerformed

    private void btprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btprimeiroActionPerformed
        if (lista.size() > 0) {
            posicao = 0;
            Emissora elemento = lista.get(0);
            caixanome.setText(elemento.getNomeemissora());
            caixaendereco.setText(elemento.getEndereco());
            if (elemento.getTvabertaoufechada() == true) {
                caixaexibicao.setSelectedIndex(1);
            } else if (elemento.getTvabertaoufechada() == false) {
                caixaexibicao.setSelectedIndex(2);
            }
        }
    }//GEN-LAST:event_btprimeiroActionPerformed

    private void btproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btproximoActionPerformed
        if (lista.size() >= 0) {
            if (posicao != (lista.size() - 1)) {
                posicao = posicao + 1;
                Emissora elemento = lista.get(posicao);
                caixanome.setText(elemento.getNomeemissora());
                caixaendereco.setText(elemento.getEndereco());
                if (elemento.getTvabertaoufechada() == true) {
                    caixaexibicao.setSelectedIndex(1);
                } else if (elemento.getTvabertaoufechada() == false) {
                    caixaexibicao.setSelectedIndex(2);
                }
            }
        }
    }//GEN-LAST:event_btproximoActionPerformed

    private void btanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btanteriorActionPerformed
        if (posicao > 0) {
            posicao = posicao - 1;
            if (lista.size() > 0) {
                Emissora elemento = lista.get(posicao);
                caixanome.setText(elemento.getNomeemissora());
                caixaendereco.setText(elemento.getEndereco());
                if (elemento.getTvabertaoufechada() == true) {
                    caixaexibicao.setSelectedIndex(1);
                } else if (elemento.getTvabertaoufechada() == false) {
                    caixaexibicao.setSelectedIndex(2);
                }
            }
        }
    }//GEN-LAST:event_btanteriorActionPerformed

    private void btultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btultimoActionPerformed
        if (lista.size() > 0) {
            posicao = lista.size() - 1;
            Emissora elemento = lista.get(posicao);
            caixanome.setText(elemento.getNomeemissora());
            caixaendereco.setText(elemento.getEndereco());
            if (elemento.getTvabertaoufechada() == true) {
                caixaexibicao.setSelectedIndex(1);
            } else if (elemento.getTvabertaoufechada() == false) {
                caixaexibicao.setSelectedIndex(2);
            }
        }
    }//GEN-LAST:event_btultimoActionPerformed

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        if (lista.size() >= 0) {
            lista.remove(lista.get(posicao));
            Limpar();
        }
    }//GEN-LAST:event_btexcluirActionPerformed

    private void btconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconsultarActionPerformed
        String nome = JOptionPane.showInputDialog("Digite o nome para pesquisar ");
        boolean encontrou = false;
        for (Emissora emissora : lista) {
            if (nome.equals(emissora.getNomeemissora())) {
                encontrou = true;
                break;
            }
        }
        if (encontrou == true) {
            JOptionPane.showMessageDialog(null, "Encontrou");
        } else {
            JOptionPane.showMessageDialog(null, "Não encontrou");
        }
    }//GEN-LAST:event_btconsultarActionPerformed

    public void Limpar() {
        caixanome.setText(null);
        caixaendereco.setText(null);
        caixaexibicao.setSelectedIndex(0);
    }

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
            java.util.logging.Logger.getLogger(EmissoraTela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmissoraTela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmissoraTela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmissoraTela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmissoraTela().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btanterior;
    private javax.swing.JButton btcadastrar;
    private javax.swing.JButton btconsultar;
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton btprimeiro;
    private javax.swing.JButton btproximo;
    private javax.swing.JButton btultimo;
    private javax.swing.JTextField caixaendereco;
    private javax.swing.JComboBox caixaexibicao;
    private javax.swing.JTextField caixanome;
    private javax.swing.JLabel endereco;
    private javax.swing.JLabel exibicao;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nome;
    // End of variables declaration//GEN-END:variables
}
