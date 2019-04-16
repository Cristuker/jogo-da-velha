package jogodavelha2.pkg0;

import javax.swing.JOptionPane;

public class JogoTela extends javax.swing.JFrame {

    int cont = 1;
    String user = "";
    String user2 = "";
    int cont2 = 1;
    String[] btn = new String[10];

    public JogoTela() {
        initComponents();
        setLocationRelativeTo(null);
        //Entrada do símbolo de cada player.

        user = JOptionPane.showInputDialog(null, "Jogador 1 digite o seu símbolo: ");
        user2 = JOptionPane.showInputDialog(null, "Jogador 2 digite o seu sìmbolo: ");

        btn[0] = "";
        btn[1] = "";
        btn[2] = "";
        btn[3] = "";
        btn[4] = "";
        btn[5] = "";
        btn[6] = "";
        btn[7] = "";
        btn[8] = "";
        btn[9] = "";

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tgbtn1 = new javax.swing.JToggleButton();
        tgbtn2 = new javax.swing.JToggleButton();
        tgbtn3 = new javax.swing.JToggleButton();
        tgbtn4 = new javax.swing.JToggleButton();
        tgbtn5 = new javax.swing.JToggleButton();
        tgbtn6 = new javax.swing.JToggleButton();
        tgbtn7 = new javax.swing.JToggleButton();
        tgbtn8 = new javax.swing.JToggleButton();
        tgbtn9 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnOldMatch = new javax.swing.JMenuItem();
        btnReset = new javax.swing.JMenuItem();
        btnExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Jogo da Velha");

        tgbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtn1ActionPerformed(evt);
            }
        });

        tgbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtn2ActionPerformed(evt);
            }
        });

        tgbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtn3ActionPerformed(evt);
            }
        });

        tgbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtn4ActionPerformed(evt);
            }
        });

        tgbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtn5ActionPerformed(evt);
            }
        });

        tgbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtn6ActionPerformed(evt);
            }
        });

        tgbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtn7ActionPerformed(evt);
            }
        });

        tgbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtn8ActionPerformed(evt);
            }
        });

        tgbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtn9ActionPerformed(evt);
            }
        });

        jMenu1.setText("Jogo");

        btnOldMatch.setText("Partidas passadas");
        btnOldMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOldMatchActionPerformed(evt);
            }
        });
        jMenu1.add(btnOldMatch);

        btnReset.setText("Reiniciar");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jMenu1.add(btnReset);

        btnExit.setText("Sair");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jMenu1.add(btnExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tgbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tgbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tgbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tgbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tgbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tgbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tgbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tgbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tgbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tgbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tgbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tgbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tgbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtn1ActionPerformed
        //O tgbtn vai colocar o símbolo do Player que está na vez de jogar trago pelo metódo PlayerM, a varíavel array vai receber o simbolo do respectivo player para testar e em seguida já é feito o teste de resultado.
        //Explicação válida para todos os botões.
        tgbtn1.setText(PlayerM());
        btn[1] = tgbtn1.getText();
        result();
    }//GEN-LAST:event_tgbtn1ActionPerformed

    private void tgbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtn2ActionPerformed
        tgbtn2.setText(PlayerM());
        btn[2] = tgbtn2.getText();
        result();
    }//GEN-LAST:event_tgbtn2ActionPerformed

    private void tgbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtn3ActionPerformed
        tgbtn3.setText(PlayerM());
        btn[3] = tgbtn3.getText();
        result();
    }//GEN-LAST:event_tgbtn3ActionPerformed

    private void tgbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtn4ActionPerformed
        tgbtn4.setText(PlayerM());
        btn[4] = tgbtn4.getText();
        result();
    }//GEN-LAST:event_tgbtn4ActionPerformed

    private void tgbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtn5ActionPerformed
        tgbtn5.setText(PlayerM());
        btn[5] = tgbtn5.getText();
        result();
    }//GEN-LAST:event_tgbtn5ActionPerformed

    private void tgbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtn6ActionPerformed
        tgbtn6.setText(PlayerM());
        btn[6] = tgbtn6.getText();
        result();
    }//GEN-LAST:event_tgbtn6ActionPerformed

    private void tgbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtn7ActionPerformed
        tgbtn7.setText(PlayerM());
        btn[7] = tgbtn7.getText();
        result();
    }//GEN-LAST:event_tgbtn7ActionPerformed

    private void tgbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtn8ActionPerformed
        tgbtn8.setText(PlayerM());
        btn[8] = tgbtn8.getText();
        result();
    }//GEN-LAST:event_tgbtn8ActionPerformed

    private void tgbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtn9ActionPerformed
        tgbtn9.setText(PlayerM());
        btn[9] = tgbtn9.getText();
        result();
    }//GEN-LAST:event_tgbtn9ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnOldMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOldMatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOldMatchActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoTela().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnExit;
    private javax.swing.JMenuItem btnOldMatch;
    private javax.swing.JMenuItem btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToggleButton tgbtn1;
    private javax.swing.JToggleButton tgbtn2;
    private javax.swing.JToggleButton tgbtn3;
    private javax.swing.JToggleButton tgbtn4;
    private javax.swing.JToggleButton tgbtn5;
    private javax.swing.JToggleButton tgbtn6;
    private javax.swing.JToggleButton tgbtn7;
    private javax.swing.JToggleButton tgbtn8;
    private javax.swing.JToggleButton tgbtn9;
    // End of variables declaration//GEN-END:variables
public String PlayerM() {
// Esse metódo faz a alternância entre o jogar 1 e 2.        
        String vez = "";
        if (cont == 1) {
            vez = user;

            cont--;

        } else {
            vez = user2;
            cont++;
        }
        return vez;
    }
//*******************************************************************************************************************************************************************

    public void result() {
//Esse metódo testa a condição de vitória.     
//-----------------Teste de vitória do User---------------------------------------------------------------------------------------------------------------
        if (btn[1].equalsIgnoreCase(user) && btn[2].equalsIgnoreCase(user) && btn[3].equalsIgnoreCase(user)) {
            JOptionPane.showMessageDialog(null, "Parabéns jogador: " + user + " você venceu!");
            reset();
        }

        if (btn[4].equalsIgnoreCase(user) && btn[5].equalsIgnoreCase(user) && btn[6].equalsIgnoreCase(user)) {
            JOptionPane.showMessageDialog(null, "Parabéns jogador: " + user + " você venceu!");
            reset();
        }
        if (btn[7].equalsIgnoreCase(user) && btn[8].equalsIgnoreCase(user) && btn[9].equalsIgnoreCase(user)) {
            JOptionPane.showMessageDialog(null, "Parabéns jogador: " + user + " você venceu!");
            reset();
        }
        if (btn[1].equalsIgnoreCase(user) && btn[4].equalsIgnoreCase(user) && btn[7].equalsIgnoreCase(user)) {
            JOptionPane.showMessageDialog(null, "Parabéns jogador: " + user + " você venceu!");
            reset();
        }
        if (btn[2].equalsIgnoreCase(user) && btn[5].equalsIgnoreCase(user) && btn[8].equalsIgnoreCase(user)) {
            JOptionPane.showMessageDialog(null, "Parabéns jogador: " + user + " você venceu!");
            reset();
        }
        if (btn[3].equalsIgnoreCase(user) && btn[6].equalsIgnoreCase(user) && btn[9].equalsIgnoreCase(user)) {
            JOptionPane.showMessageDialog(null, "Parabéns jogador: " + user + " você venceu!");
            reset();
        }
        if (btn[1].equalsIgnoreCase(user) && btn[5].equalsIgnoreCase(user) && btn[9].equalsIgnoreCase(user)) {
            JOptionPane.showMessageDialog(null, "Parabéns jogador: " + user + " você venceu!");
            reset();
        } else if (btn[3].equalsIgnoreCase(user) && btn[5].equalsIgnoreCase(user) && btn[7].equalsIgnoreCase(user)) {
            JOptionPane.showMessageDialog(null, "Parabéns jogador: " + user + " você venceu!");
            reset();
        }
        //-----------Teste de vitória do User2---------------------------------------------------------------------------------------------------------------
        if (btn[1].equalsIgnoreCase(user2) && btn[2].equalsIgnoreCase(user2) && btn[3].equalsIgnoreCase(user2)) {
            JOptionPane.showMessageDialog(null, "Parabéns jogador: " + user2 + " você venceu!");
            reset();
        }
        if (btn[4].equalsIgnoreCase(user2) && btn[5].equalsIgnoreCase(user2) && btn[6].equalsIgnoreCase(user2)) {
            JOptionPane.showMessageDialog(null, "Parabéns jogador: " + user2 + " você venceu!");
            reset();
        }
        if (btn[7].equalsIgnoreCase(user2) && btn[8].equalsIgnoreCase(user2) && btn[9].equalsIgnoreCase(user2)) {
            JOptionPane.showMessageDialog(null, "Parabéns jogador: " + user2 + " você venceu!");
            reset();
        }
        if (btn[1].equalsIgnoreCase(user2) && btn[4].equalsIgnoreCase(user2) && btn[7].equalsIgnoreCase(user2)) {
            JOptionPane.showMessageDialog(null, "Parabéns jogador: " + user2 + " você venceu!");
            reset();
        }
        if (btn[2].equalsIgnoreCase(user2) && btn[5].equalsIgnoreCase(user2) && btn[8].equalsIgnoreCase(user2)) {
            JOptionPane.showMessageDialog(null, "Parabéns jogador: " + user2 + " você venceu!");
            reset();
        }
        if (btn[3].equalsIgnoreCase(user2) && btn[6].equalsIgnoreCase(user2) && btn[9].equalsIgnoreCase(user2)) {
            JOptionPane.showMessageDialog(null, "Parabéns jogador: " + user2 + " você venceu!");
            reset();
        }
        if (btn[1].equalsIgnoreCase(user2) && btn[5].equalsIgnoreCase(user2) && btn[9].equalsIgnoreCase(user2)) {
            JOptionPane.showMessageDialog(null, "Parabéns jogador: " + user2 + " você venceu!");
            reset();
        }
        if (btn[3].equalsIgnoreCase(user2) && btn[5].equalsIgnoreCase(user2) && btn[7].equalsIgnoreCase(user2)) {
            JOptionPane.showMessageDialog(null, "Parabéns jogador: " + user2 + " você venceu!");
            reset();
        } else {
//Condicional para quando der velha.
            if (!btn[1].equals("")&&!btn[2].equals("")&&!btn[3].equals("")&&!btn[4].equals("")&&!btn[5].equals("")&&!btn[6].equals("")&&!btn[7].equals("")&&!btn[8].equals("")&&!btn[9].equals("")) {
                JOptionPane.showMessageDialog(null, "Deu velha");
                reset();
            }

        }
    }

    public void reset() {
        int r = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?");
        if (r == JOptionPane.YES_OPTION) {
            for (int i = 0; i < 10;) {
                btn[i] = "";
                i++;
            }
            this.dispose();
            new JogoTela().setVisible(true);
        } else {
            System.exit(0);
        }

    }

}
