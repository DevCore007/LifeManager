/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CF;

import CF.TelaLogin;


/**
 *
 * @author José Satiro
 */
public class telaEscolhaProjeto extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(telaEscolhaProjeto.class.getName());

    /**
     * Creates new form telaEscolhaProjeto
     */
    
    boolean temaEscuro = true;
    
    public telaEscolhaProjeto() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        aplicarTema();
    }
    
    private void aplicarTema() {
        if (temaEscuro) {
            jPanel1.setBackground(new java.awt.Color(32, 14, 56));
            
            tituloPagina.setForeground(new java.awt.Color(255, 255, 255));
            
            cardAgenda.setBackground(new java.awt.Color(106, 14, 71));
            cardAgenda.setForeground(new java.awt.Color(204, 204, 0));
            cardAgenda.setPreferredSize(new java.awt.Dimension(310, 235));
            cardIconAgenda.setBackground(new java.awt.Color(106, 14, 71));
            
            imgAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agenda (5) (1).png"))); // NOI18N
            
            
            agendaTelefonicaNome.setForeground(new java.awt.Color(255, 255, 255));
            
            agendaTelefonicaDesc.setForeground(new java.awt.Color(209, 209, 209));
            
            botaoSelecionarAgenda.setBackground(new java.awt.Color(181, 13, 87));
            botaoSelecionarAgenda.setForeground(new java.awt.Color(255, 255, 255));
            
            cardCalculadora.setBackground(new java.awt.Color(106, 14, 71));
            cardCalculadora.setForeground(new java.awt.Color(204, 204, 0));cardCalculadora.setBackground(new java.awt.Color(106, 14, 71));
            cardCalculadora.setForeground(new java.awt.Color(204, 204, 0));
            
            cardIconCalculadora.setBackground(new java.awt.Color(106, 14, 71));
            
            imgCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calculadora (1) (1).png"))); // NOI18N
            
            calculadoraNome.setForeground(new java.awt.Color(255, 255, 255));
            
            calculadoraDesc.setForeground(new java.awt.Color(209, 209, 209));
            
            botaoSelecionarCalculadora.setBackground(new java.awt.Color(181, 13, 87));
            botaoSelecionarCalculadora.setForeground(new java.awt.Color(255, 255, 255));
            
            descTela.setForeground(new java.awt.Color(255, 255, 255));
            
            returnBotao.setBackground(new java.awt.Color(32, 14, 56));
            returnBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/return (1).png"))); // NOI18N
            
            temaBotao.setBackground(new java.awt.Color(32, 14, 56));
            temaBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sun (3).png"))); // NOI18N
        }
        else {
            jPanel1.setBackground(new java.awt.Color(242, 238, 249));
            
            tituloPagina.setForeground(new java.awt.Color(45, 14, 57));
            
            cardAgenda.setBackground(new java.awt.Color(169, 136, 255));
            cardAgenda.setForeground(new java.awt.Color(204, 204, 0));
            cardAgenda.setPreferredSize(new java.awt.Dimension(310, 235));
            
            cardIconAgenda.setBackground(new java.awt.Color(169, 136, 255));
            
            imgAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agenda (7) (2).png"))); // NOI18N
            
            
            agendaTelefonicaNome.setForeground(new java.awt.Color(255, 255, 255));
            
            agendaTelefonicaDesc.setForeground(new java.awt.Color(255, 255, 255));
            
            botaoSelecionarAgenda.setBackground(new java.awt.Color(124, 77, 255));
            botaoSelecionarAgenda.setForeground(new java.awt.Color(255, 255, 255));
            
            cardCalculadora.setBackground(new java.awt.Color(169, 136, 255));
            cardCalculadora.setForeground(new java.awt.Color(204, 204, 0));
            
            cardIconCalculadora.setBackground(new java.awt.Color(169, 136, 255));
            
            imgCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calculadora (2) (1).png"))); // NOI18N
            
            calculadoraNome.setForeground(new java.awt.Color(255, 255, 255));
            
            calculadoraDesc.setForeground(new java.awt.Color(255, 255, 255));
            
            botaoSelecionarCalculadora.setBackground(new java.awt.Color(124, 77, 255));
            botaoSelecionarCalculadora.setForeground(new java.awt.Color(255, 255, 255));
            
            descTela.setForeground(new java.awt.Color(45, 14, 57));
            
            returnBotao.setBackground(new java.awt.Color(242, 238, 249));
            returnBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/return (2).png"))); // NOI18N
            
            temaBotao.setBackground(new java.awt.Color(242, 238, 249));
            temaBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/moon (1).png"))); // NOI18N     
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloPagina = new javax.swing.JLabel();
        cardAgenda = new javax.swing.JPanel();
        cardIconAgenda = new javax.swing.JPanel();
        imgAgenda = new javax.swing.JLabel();
        agendaTelefonicaNome = new javax.swing.JLabel();
        agendaTelefonicaDesc = new javax.swing.JLabel();
        botaoSelecionarAgenda = new javax.swing.JButton();
        cardCalculadora = new javax.swing.JPanel();
        cardIconCalculadora = new javax.swing.JPanel();
        imgCalculadora = new javax.swing.JLabel();
        calculadoraNome = new javax.swing.JLabel();
        calculadoraDesc = new javax.swing.JLabel();
        botaoSelecionarCalculadora = new javax.swing.JButton();
        descTela = new javax.swing.JLabel();
        returnBotao = new javax.swing.JButton();
        temaBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(725, 340));

        tituloPagina.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tituloPagina.setForeground(new java.awt.Color(255, 255, 255));
        tituloPagina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPagina.setText("Selecione um Projeto");

        cardAgenda.setForeground(new java.awt.Color(204, 204, 0));
        cardAgenda.setPreferredSize(new java.awt.Dimension(310, 235));

        imgAgenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agenda (5) (1).png"))); // NOI18N

        javax.swing.GroupLayout cardIconAgendaLayout = new javax.swing.GroupLayout(cardIconAgenda);
        cardIconAgenda.setLayout(cardIconAgendaLayout);
        cardIconAgendaLayout.setHorizontalGroup(
            cardIconAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgAgenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cardIconAgendaLayout.setVerticalGroup(
            cardIconAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        agendaTelefonicaNome.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        agendaTelefonicaNome.setForeground(new java.awt.Color(255, 255, 255));
        agendaTelefonicaNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agendaTelefonicaNome.setText("Agenda Telefônica");

        agendaTelefonicaDesc.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        agendaTelefonicaDesc.setForeground(new java.awt.Color(209, 209, 209));
        agendaTelefonicaDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agendaTelefonicaDesc.setText("Gerencie seus contatos de forma organizada");

        botaoSelecionarAgenda.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        botaoSelecionarAgenda.setForeground(new java.awt.Color(255, 255, 255));
        botaoSelecionarAgenda.setText("Selecionar");
        botaoSelecionarAgenda.setBorder(null);
        botaoSelecionarAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSelecionarAgenda.setFocusPainted(false);
        botaoSelecionarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSelecionarAgendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardAgendaLayout = new javax.swing.GroupLayout(cardAgenda);
        cardAgenda.setLayout(cardAgendaLayout);
        cardAgendaLayout.setHorizontalGroup(
            cardAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAgendaLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(cardIconAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(agendaTelefonicaNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardAgendaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSelecionarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addComponent(agendaTelefonicaDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        cardAgendaLayout.setVerticalGroup(
            cardAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAgendaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(cardIconAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agendaTelefonicaNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agendaTelefonicaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoSelecionarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        cardCalculadora.setForeground(new java.awt.Color(204, 204, 0));
        cardCalculadora.setPreferredSize(new java.awt.Dimension(310, 235));

        imgCalculadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calculadora (1) (1).png"))); // NOI18N

        javax.swing.GroupLayout cardIconCalculadoraLayout = new javax.swing.GroupLayout(cardIconCalculadora);
        cardIconCalculadora.setLayout(cardIconCalculadoraLayout);
        cardIconCalculadoraLayout.setHorizontalGroup(
            cardIconCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgCalculadora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cardIconCalculadoraLayout.setVerticalGroup(
            cardIconCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        calculadoraNome.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        calculadoraNome.setForeground(new java.awt.Color(255, 255, 255));
        calculadoraNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calculadoraNome.setText("Calculadora");

        calculadoraDesc.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        calculadoraDesc.setForeground(new java.awt.Color(209, 209, 209));
        calculadoraDesc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        calculadoraDesc.setText("Realize cálculos de forma rápida e precisa ");

        botaoSelecionarCalculadora.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        botaoSelecionarCalculadora.setForeground(new java.awt.Color(255, 255, 255));
        botaoSelecionarCalculadora.setText("Selecionar");
        botaoSelecionarCalculadora.setBorder(null);
        botaoSelecionarCalculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSelecionarCalculadora.setFocusPainted(false);
        botaoSelecionarCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSelecionarCalculadoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardCalculadoraLayout = new javax.swing.GroupLayout(cardCalculadora);
        cardCalculadora.setLayout(cardCalculadoraLayout);
        cardCalculadoraLayout.setHorizontalGroup(
            cardCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCalculadoraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSelecionarCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(cardCalculadoraLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(cardCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cardIconCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calculadoraNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(calculadoraDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        cardCalculadoraLayout.setVerticalGroup(
            cardCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCalculadoraLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(cardIconCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculadoraNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculadoraDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoSelecionarCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        descTela.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        descTela.setForeground(new java.awt.Color(255, 255, 255));
        descTela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descTela.setText("Escolha um projeto para começar");

        returnBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/return (1).png"))); // NOI18N
        returnBotao.setBorder(null);
        returnBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBotaoActionPerformed(evt);
            }
        });

        temaBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sun (3).png"))); // NOI18N
        temaBotao.setBorder(null);
        temaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temaBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloPagina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(descTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cardAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(cardCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(returnBotao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(temaBotao)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnBotao)
                    .addComponent(temaBotao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloPagina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cardAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(cardCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(descTela)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void temaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temaBotaoActionPerformed
        // TODO add your handling code here:
        temaEscuro = !temaEscuro;
        aplicarTema();
    }//GEN-LAST:event_temaBotaoActionPerformed

    private void returnBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBotaoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaLogin().setVisible(true);
    }//GEN-LAST:event_returnBotaoActionPerformed

    private void botaoSelecionarCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSelecionarCalculadoraActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_botaoSelecionarCalculadoraActionPerformed

    private void botaoSelecionarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSelecionarAgendaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_botaoSelecionarAgendaActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new telaEscolhaProjeto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agendaTelefonicaDesc;
    private javax.swing.JLabel agendaTelefonicaNome;
    private javax.swing.JButton botaoSelecionarAgenda;
    private javax.swing.JButton botaoSelecionarCalculadora;
    private javax.swing.JLabel calculadoraDesc;
    private javax.swing.JLabel calculadoraNome;
    private javax.swing.JPanel cardAgenda;
    private javax.swing.JPanel cardCalculadora;
    private javax.swing.JPanel cardIconAgenda;
    private javax.swing.JPanel cardIconCalculadora;
    private javax.swing.JLabel descTela;
    private javax.swing.JLabel imgAgenda;
    private javax.swing.JLabel imgCalculadora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton returnBotao;
    private javax.swing.JButton temaBotao;
    private javax.swing.JLabel tituloPagina;
    // End of variables declaration//GEN-END:variables
}
