package jogodavelha;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class GUI extends javax.swing.JFrame {
    static jogoDaVelha jogo;
    public GUI(jogoDaVelha jogo) {
        initComponents();
        GUI.jogo = jogo;
    }
    
    public void setarLados(String lado){
        if(lado.equals("X")){
            jogo.jog = "X";
            jogo.com = "O";
        }else{
            jogo.jog = "O";
            jogo.com = "X";
        }
    }
    
    @SuppressWarnings("unchecked")
    
    public ArrayList seq(){
        ArrayList seq = new ArrayList();
        
        seq.add(casa1.getText());seq.add(casa2.getText());seq.add(casa3.getText());
        seq.add(casa4.getText());seq.add(casa5.getText());seq.add(casa6.getText());
        seq.add(casa7.getText());seq.add(casa8.getText());seq.add(casa9.getText());
        
        return seq;
    }
    
    public void regJogada(JButton casa){
        caixaDeEscolha.setVisible(false);
        
        Boolean b = false;
        b = jogo.regJogada(casa);
        if(b == true){
            jogo.jogar(seq(), this);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caixaDialogo = new javax.swing.JDialog();
        botaoFim = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        caixaDeEscolha = new javax.swing.JDialog();
        X = new javax.swing.JButton();
        textoCaixaEscolha = new javax.swing.JLabel();
        O = new javax.swing.JButton();
        casa1 = new javax.swing.JButton();
        casa2 = new javax.swing.JButton();
        casa3 = new javax.swing.JButton();
        casa4 = new javax.swing.JButton();
        casa5 = new javax.swing.JButton();
        casa6 = new javax.swing.JButton();
        casa7 = new javax.swing.JButton();
        casa8 = new javax.swing.JButton();
        casa9 = new javax.swing.JButton();

        botaoFim.setBackground(new java.awt.Color(255, 255, 255));
        botaoFim.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botaoFim.setText("Ok !");
        botaoFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFimActionPerformed(evt);
            }
        });

        label.setBackground(new java.awt.Color(255, 255, 255));
        label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("TEXTO");

        javax.swing.GroupLayout caixaDialogoLayout = new javax.swing.GroupLayout(caixaDialogo.getContentPane());
        caixaDialogo.getContentPane().setLayout(caixaDialogoLayout);
        caixaDialogoLayout.setHorizontalGroup(
            caixaDialogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caixaDialogoLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(botaoFim, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, caixaDialogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        caixaDialogoLayout.setVerticalGroup(
            caixaDialogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, caixaDialogoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(botaoFim)
                .addContainerGap())
        );

        X.setBackground(new java.awt.Color(255, 255, 255));
        X.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        X.setText("Ok !");
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        textoCaixaEscolha.setBackground(new java.awt.Color(255, 255, 255));
        textoCaixaEscolha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoCaixaEscolha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCaixaEscolha.setText("TEXTO");

        O.setBackground(new java.awt.Color(255, 255, 255));
        O.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        O.setText("Ok !");
        O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout caixaDeEscolhaLayout = new javax.swing.GroupLayout(caixaDeEscolha.getContentPane());
        caixaDeEscolha.getContentPane().setLayout(caixaDeEscolhaLayout);
        caixaDeEscolhaLayout.setHorizontalGroup(
            caixaDeEscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caixaDeEscolhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(caixaDeEscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(caixaDeEscolhaLayout.createSequentialGroup()
                        .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(textoCaixaEscolha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        caixaDeEscolhaLayout.setVerticalGroup(
            caixaDeEscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, caixaDeEscolhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoCaixaEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(caixaDeEscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        casa1.setBackground(new java.awt.Color(255, 255, 255));
        casa1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        casa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casa1ActionPerformed(evt);
            }
        });

        casa2.setBackground(new java.awt.Color(255, 255, 255));
        casa2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        casa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casa2ActionPerformed(evt);
            }
        });

        casa3.setBackground(new java.awt.Color(255, 255, 255));
        casa3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        casa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casa3ActionPerformed(evt);
            }
        });

        casa4.setBackground(new java.awt.Color(255, 255, 255));
        casa4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        casa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casa4ActionPerformed(evt);
            }
        });

        casa5.setBackground(new java.awt.Color(255, 255, 255));
        casa5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        casa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casa5ActionPerformed(evt);
            }
        });

        casa6.setBackground(new java.awt.Color(255, 255, 255));
        casa6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        casa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casa6ActionPerformed(evt);
            }
        });

        casa7.setBackground(new java.awt.Color(255, 255, 255));
        casa7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        casa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casa7ActionPerformed(evt);
            }
        });

        casa8.setBackground(new java.awt.Color(255, 255, 255));
        casa8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        casa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casa8ActionPerformed(evt);
            }
        });

        casa9.setBackground(new java.awt.Color(255, 255, 255));
        casa9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        casa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casa9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casa1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casa2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casa3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casa4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casa5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casa6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casa7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casa8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casa9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casa1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casa2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casa3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(casa6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casa5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casa4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casa7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casa8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casa9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa1ActionPerformed
        regJogada(casa1);
    }//GEN-LAST:event_casa1ActionPerformed

    private void casa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa2ActionPerformed
        regJogada(casa2);
    }//GEN-LAST:event_casa2ActionPerformed

    private void casa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa3ActionPerformed
        regJogada(casa3);
    }//GEN-LAST:event_casa3ActionPerformed

    private void casa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa4ActionPerformed
        regJogada(casa4);
    }//GEN-LAST:event_casa4ActionPerformed

    private void casa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa5ActionPerformed
        regJogada(casa5);
    }//GEN-LAST:event_casa5ActionPerformed

    private void casa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa6ActionPerformed
        regJogada(casa6);
    }//GEN-LAST:event_casa6ActionPerformed

    private void casa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa7ActionPerformed
        regJogada(casa7);
    }//GEN-LAST:event_casa7ActionPerformed

    private void casa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa8ActionPerformed
        regJogada(casa8);
    }//GEN-LAST:event_casa8ActionPerformed

    private void casa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa9ActionPerformed
        regJogada(casa9);
    }//GEN-LAST:event_casa9ActionPerformed

    private void botaoFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFimActionPerformed
        System.out.println("Zerando os campos do jogo...");
        
        casa1.setText("");casa2.setText("");casa3.setText("");
        casa4.setText("");casa5.setText("");casa6.setText("");
        casa7.setText("");casa8.setText("");casa9.setText("");
        
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        caixaDialogo.setVisible(false);
        
        caixaDeEscolha.setVisible(true);
    }//GEN-LAST:event_botaoFimActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        caixaDeEscolha.setVisible(false);
        setarLados("X");
    }//GEN-LAST:event_XActionPerformed

    private void OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OActionPerformed
        caixaDeEscolha.setVisible(false);
        setarLados("O");
    }//GEN-LAST:event_OActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton O;
    public javax.swing.JButton X;
    public javax.swing.JButton botaoFim;
    public javax.swing.JDialog caixaDeEscolha;
    public javax.swing.JDialog caixaDialogo;
    public javax.swing.JButton casa1;
    public javax.swing.JButton casa2;
    public javax.swing.JButton casa3;
    public javax.swing.JButton casa4;
    public javax.swing.JButton casa5;
    public javax.swing.JButton casa6;
    public javax.swing.JButton casa7;
    public javax.swing.JButton casa8;
    public javax.swing.JButton casa9;
    public javax.swing.JLabel label;
    public javax.swing.JLabel textoCaixaEscolha;
    // End of variables declaration//GEN-END:variables
}
