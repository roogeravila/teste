/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * login.java
 *
 * Created on 18/04/2015, 15:34:04
 */
package testegit;

/**
 *
 * @author Dev
 */
public class principal extends javax.swing.JFrame {

    /** Creates new form login */
    public principal() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPPrincipal = new javax.swing.JPanel();
        JPSecundario = new javax.swing.JPanel();
        JPCadastroUsuario = new javax.swing.JPanel();
        BTCadastrar = new javax.swing.JButton();
        BTAgendamento = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sis Salão");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(-1,true));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPPrincipal.setBackground(new java.awt.Color(-8388353,true));

        JPSecundario.setBackground(new java.awt.Color(-1,true));

        JPCadastroUsuario.setBackground(new java.awt.Color(-1,true));

        javax.swing.GroupLayout JPCadastroUsuarioLayout = new javax.swing.GroupLayout(JPCadastroUsuario);
        JPCadastroUsuario.setLayout(JPCadastroUsuarioLayout);
        JPCadastroUsuarioLayout.setHorizontalGroup(
            JPCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 835, Short.MAX_VALUE)
        );
        JPCadastroUsuarioLayout.setVerticalGroup(
            JPCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JPSecundarioLayout = new javax.swing.GroupLayout(JPSecundario);
        JPSecundario.setLayout(JPSecundarioLayout);
        JPSecundarioLayout.setHorizontalGroup(
            JPSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPCadastroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JPSecundarioLayout.setVerticalGroup(
            JPSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPCadastroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BTCadastrar.setBackground(new java.awt.Color(-8388353,true));
        BTCadastrar.setForeground(new java.awt.Color(-1,true));
        BTCadastrar.setText("Cadastrar");
        BTCadastrar.setBorderPainted(false);
        BTCadastrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BTCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCadastrarActionPerformed(evt);
            }
        });

        BTAgendamento.setBackground(new java.awt.Color(-8388353,true));
        BTAgendamento.setForeground(new java.awt.Color(-1,true));
        BTAgendamento.setText("Agendamento");
        BTAgendamento.setBorderPainted(false);
        BTAgendamento.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BTAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAgendamentoActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(-8388353,true));
        jButton3.setForeground(new java.awt.Color(-1,true));
        jButton3.setText("Relatorios");
        jButton3.setBorderPainted(false);
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jButton4.setBackground(new java.awt.Color(-8388353,true));
        jButton4.setForeground(new java.awt.Color(-1,true));
        jButton4.setText("Caixa");
        jButton4.setAlignmentY(0.0F);
        jButton4.setBorderPainted(false);
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jButton5.setBackground(new java.awt.Color(-8388353,true));
        jButton5.setForeground(new java.awt.Color(-1,true));
        jButton5.setText("Configurações");
        jButton5.setAlignmentY(0.0F);
        jButton5.setBorderPainted(false);
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setForeground(new java.awt.Color(-1,true));
        jLabel4.setText("Usuario Ativo:");

        jLabel5.setForeground(new java.awt.Color(-1,true));
        jLabel5.setText("Admin");

        javax.swing.GroupLayout JPPrincipalLayout = new javax.swing.GroupLayout(JPPrincipal);
        JPPrincipal.setLayout(JPPrincipalLayout);
        JPPrincipalLayout.setHorizontalGroup(
            JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPPrincipalLayout.createSequentialGroup()
                .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BTCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPSecundario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JPPrincipalLayout.createSequentialGroup()
                                .addComponent(BTAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPPrincipalLayout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        JPPrincipalLayout.setVerticalGroup(
            JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPPrincipalLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        getContentPane().add(JPPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void BTCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCadastrarActionPerformed
JPCadastroUsuario.setVisible(true);// TODO add your handling code here:
}//GEN-LAST:event_BTCadastrarActionPerformed

private void BTAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTAgendamentoActionPerformed
JPSecundario.setVisible(true);// TODO add your handling code here:
}//GEN-LAST:event_BTAgendamentoActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTAgendamento;
    private javax.swing.JButton BTCadastrar;
    private javax.swing.JPanel JPCadastroUsuario;
    private javax.swing.JPanel JPPrincipal;
    private javax.swing.JPanel JPSecundario;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
