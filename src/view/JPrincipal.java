/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**Cria a classe principal 
 *
 * @author claudiocp
 */
public class JPrincipal extends javax.swing.JFrame {

    /** Cria o formulário da janela principal
     * 
     */
    public JPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadClie = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItemConsClie = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuVerifVenci = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(35, 71, 107));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONTROLE TROCA REFIL");

        jMenuCadastros.setText("Cadastros");

        jMenuItemCadClie.setText("Clientes");
        jMenuItemCadClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadClieActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadClie);

        jMenuBar1.add(jMenuCadastros);

        jMenuConsultas.setText("Consultas");

        jMenuItemConsClie.setText("Consulta Clientes");
        jMenuItemConsClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsClieActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemConsClie);

        jMenuBar1.add(jMenuConsultas);

        jMenu1.setText("Verificar ");

        jMenuVerifVenci.setText("Vencimentos");
        jMenuVerifVenci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVerifVenciActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuVerifVenci);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadClieActionPerformed
        JCadClienteView jc = new JCadClienteView(null, true);
        jc.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadClieActionPerformed

    private void jMenuItemConsClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsClieActionPerformed
        JFrmConCliente jc = new JFrmConCliente(null, true);
        jc.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsClieActionPerformed

    private void jMenuVerifVenciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVerifVenciActionPerformed
        JVerificaVenc vv = new JVerificaVenc();
        vv.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_jMenuVerifVenciActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemCadClie;
    private javax.swing.JMenuItem jMenuItemConsClie;
    private javax.swing.JMenuItem jMenuVerifVenci;
    // End of variables declaration//GEN-END:variables
}
