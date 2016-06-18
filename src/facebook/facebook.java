package facebook;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Post;
import facebook4j.PostUpdate;
import facebook4j.ResponseList;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Javii
 */
public class facebook extends javax.swing.JFrame {

  public facebook() {
        initComponents();
    }
  
    Facebook fb = new FacebookFactory().getInstance();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CPublicacion = new javax.swing.JTextField();
        BSubir = new javax.swing.JButton();
        BEnviar = new javax.swing.JButton();
        BGusta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CComentar = new javax.swing.JTextField();
        BComentar = new javax.swing.JButton();
        CBuscar = new javax.swing.JTextField();
        BBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabuscar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Publicacion:");

        BSubir.setText("Subir");
        BSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSubirActionPerformed(evt);
            }
        });

        BEnviar.setText("Enviar");
        BEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEnviarActionPerformed(evt);
            }
        });

        BGusta.setText("Me Gusta");
        BGusta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGustaActionPerformed(evt);
            }
        });

        jLabel2.setText("Comenta:");

        BComentar.setText("Comentar");
        BComentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BComentarActionPerformed(evt);
            }
        });

        BBuscar.setText("Buscar");
        BBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarActionPerformed(evt);
            }
        });

        Tabuscar.setColumns(20);
        Tabuscar.setRows(5);
        jScrollPane1.setViewportView(Tabuscar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CPublicacion)
                            .addComponent(CComentar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(BSubir)
                                        .addGap(18, 18, 18)
                                        .addComponent(BEnviar)
                                        .addGap(18, 18, 18)
                                        .addComponent(BGusta))
                                    .addComponent(BComentar, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BBuscar)
                                .addGap(0, 446, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BSubir)
                    .addComponent(BGusta)
                    .addComponent(BEnviar))
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CComentar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BComentar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Este metodo sube una foto a partir de la URL que se situa en el campo de texto correspondiente.
     */
    private void BSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSubirActionPerformed
        PostUpdate post = null;
        try {
            post = new PostUpdate(new URL("http://facebook4j.org"))
                    .picture(new URL(CPublicacion.getText()))
                    .name("foto")
                    .caption("facebook4j.org")
                    .description("foto subida desde netbeans");
        } catch (MalformedURLException ex) {
            Logger.getLogger(facebook.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fb.postFeed(post);
        } catch (FacebookException ex) {
            Logger.getLogger(facebook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BSubirActionPerformed

    /**
     * Actualiza el estado del usuario enviando lo introducido en el campo correspondiente.
     * @param CPublicacion campo de texto donde se introducen los datos 
     */
    private void BEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEnviarActionPerformed
        try {
            //faltan permisos de visibilidad
            fb.postStatusMessage(CPublicacion.getText());
        } catch (FacebookException ex) {
            Logger.getLogger(facebook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BEnviarActionPerformed

    /**
     * Envia un me gusta a la imagen introducida en el campo
     * @param CPublicacion campo de texto donde se introducen los datos  
     */
    private void BGustaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGustaActionPerformed
         try {
            fb.likePost(CPublicacion.getText());
        } catch (FacebookException ex) {
            Logger.getLogger(facebook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BGustaActionPerformed

    /**
     * Comenta en la foto con el id introducido en el campo de la publicacion
     * y recoge lo que encuentra en el de Comentar como comentario.
     * @param CPublicacion campo de texto donde se introducen los datos  
     * @param CComentar campo de texto donde se introducen los datos  
     */
    private void BComentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BComentarActionPerformed
        try {
            fb.commentPhoto(CPublicacion.getText(),CComentar.getText());
        } catch (FacebookException ex) {
            Logger.getLogger(facebook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BComentarActionPerformed

    /**
     * Busca lo introducido en el campo de buscar
     * y muestra en el otro el resultado
     * @param CBuscar campo de texto donde se introducen los datos
     * @param Tabuscar Area de texto donde se muestra el resultado
     */
    private void BBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarActionPerformed
        ResponseList<Post> results = null;
        try {
            results = fb.searchPosts(CBuscar.getText());
        } catch (FacebookException ex) {
            Logger.getLogger(facebook.class.getName()).log(Level.SEVERE, null, ex);
        }
       for(int i=0;i<results.size();i++){
           Tabuscar.setText(results.get(i).toString());
        }
                                       
    }//GEN-LAST:event_BBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(facebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new facebook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscar;
    private javax.swing.JButton BComentar;
    private javax.swing.JButton BEnviar;
    private javax.swing.JButton BGusta;
    private javax.swing.JButton BSubir;
    private javax.swing.JTextField CBuscar;
    private javax.swing.JTextField CComentar;
    private javax.swing.JTextField CPublicacion;
    private javax.swing.JTextArea Tabuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
