/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * login.java
 *
 * Created on 18/04/2015, 15:34:04
 */
package ProjetoSalao;

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
        BTCadastrar = new javax.swing.JButton();
        BTAgendamento = new javax.swing.JButton();
        btRelatorio = new javax.swing.JButton();
        btCaixa = new javax.swing.JButton();
        btConfig = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sis Salão");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(-1,true));

        JPPrincipal.setBackground(new java.awt.Color(-32640,true));

        BTCadastrar.setBackground(new java.awt.Color(-32640,true));
        BTCadastrar.setForeground(new java.awt.Color(-1,true));
        BTCadastrar.setText("Cadastrar");
        BTCadastrar.setBorderPainted(false);
        BTCadastrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BTCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTCadastrarMouseClicked(evt);
            }
        });
        BTCadastrar.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                BTCadastrarComponentHidden(evt);
            }
        });
        BTCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCadastrarActionPerformed(evt);
            }
        });

        BTAgendamento.setBackground(new java.awt.Color(-32640,true));
        BTAgendamento.setForeground(new java.awt.Color(-1,true));
        BTAgendamento.setText("Agendamento");
        BTAgendamento.setBorderPainted(false);
        BTAgendamento.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BTAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAgendamentoActionPerformed(evt);
            }
        });

        btRelatorio.setBackground(new java.awt.Color(-32640,true));
        btRelatorio.setForeground(new java.awt.Color(-1,true));
        btRelatorio.setText("Relatorios");
        btRelatorio.setBorderPainted(false);
        btRelatorio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioActionPerformed(evt);
            }
        });

        btCaixa.setBackground(new java.awt.Color(-32640,true));
        btCaixa.setForeground(new java.awt.Color(-1,true));
        btCaixa.setText("Caixa");
        btCaixa.setAlignmentY(0.0F);
        btCaixa.setBorderPainted(false);
        btCaixa.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btConfig.setBackground(new java.awt.Color(-32640,true));
        btConfig.setForeground(new java.awt.Color(-1,true));
        btConfig.setText("Configurações");
        btConfig.setAlignmentY(0.0F);
        btConfig.setBorderPainted(false);
        btConfig.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setForeground(new java.awt.Color(-1,true));
        jLabel4.setText("Usuario Ativo:");

        jLabel5.setForeground(new java.awt.Color(-1,true));
        jLabel5.setText("Admin");

        javax.swing.GroupLayout JPPrincipalLayout = new javax.swing.GroupLayout(JPPrincipal);
        JPPrincipal.setLayout(JPPrincipalLayout);
        JPPrincipalLayout.setHorizontalGroup(
            JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JPPrincipalLayout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(0, 419, Short.MAX_VALUE))
        );
        JPPrincipalLayout.setVerticalGroup(
            JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPPrincipalLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(BTCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTAgendamentoActionPerformed
        Mae.agendamento.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTAgendamentoActionPerformed

    private void BTCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCadastrarActionPerformed

        Mae.cadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTCadastrarActionPerformed

    private void BTCadastrarComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BTCadastrarComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_BTCadastrarComponentHidden

    private void BTCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTCadastrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BTCadastrarMouseClicked

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
    Mae.relatorio.setVisible(true);        
    this.dispose();
    }//GEN-LAST:event_btRelatorioActionPerformed

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
                //new Cadastro().setVisible(false);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTAgendamento;
    private javax.swing.JButton BTCadastrar;
    private javax.swing.JPanel JPPrincipal;
    private javax.swing.JButton btCaixa;
    private javax.swing.JButton btConfig;
    private javax.swing.JButton btRelatorio;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
