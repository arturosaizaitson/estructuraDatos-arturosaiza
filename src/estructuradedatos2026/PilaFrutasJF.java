 
package estructuradedatos2026;

import java.util.ArrayDeque;
 
import java.util.Deque;
import javax.swing.JOptionPane;

 

 

  
public class PilaFrutasJF extends javax.swing.JFrame {

    Deque<String> pilaFrutas; 
     
     
    public PilaFrutasJF() {
        initComponents();
        
        pilaFrutas = new ArrayDeque<>();
        
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNuevaFruta = new javax.swing.JTextField();
        btnVerCima = new javax.swing.JButton();
        btnDesapilar = new javax.swing.JButton();
        btnApliar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblCantidadFrutas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PILA DE FRUTAS");

        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Apilar Fruta:");

        txtNuevaFruta.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtNuevaFruta.setForeground(new java.awt.Color(51, 51, 51));
        txtNuevaFruta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNuevaFruta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNuevaFrutaKeyReleased(evt);
            }
        });

        btnVerCima.setBackground(new java.awt.Color(0, 153, 153));
        btnVerCima.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVerCima.setForeground(new java.awt.Color(204, 255, 204));
        btnVerCima.setText("VER CIMA");
        btnVerCima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCimaActionPerformed(evt);
            }
        });

        btnDesapilar.setBackground(new java.awt.Color(0, 153, 153));
        btnDesapilar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDesapilar.setForeground(new java.awt.Color(204, 255, 204));
        btnDesapilar.setText("DESAPLIAR");
        btnDesapilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesapilarActionPerformed(evt);
            }
        });

        btnApliar.setBackground(new java.awt.Color(0, 153, 153));
        btnApliar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnApliar.setForeground(new java.awt.Color(204, 255, 204));
        btnApliar.setText("APILAR");
        btnApliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApliarActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FRUTAS");

        lblCantidadFrutas.setBackground(new java.awt.Color(255, 255, 255));
        lblCantidadFrutas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCantidadFrutas.setForeground(new java.awt.Color(0, 51, 102));
        lblCantidadFrutas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadFrutas.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerCima, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(txtNuevaFruta)
                    .addComponent(btnDesapilar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnApliar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCantidadFrutas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(lblCantidadFrutas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNuevaFruta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnApliar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btnVerCima, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDesapilar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApliarActionPerformed
     String nuevaFruta = txtNuevaFruta.getText(); 
     pilaFrutas.push(nuevaFruta);
     lblCantidadFrutas.setText( pilaFrutas.size()+"" );  
    
     txtNuevaFruta.setText("");
     txtNuevaFruta.requestFocusInWindow();
    }//GEN-LAST:event_btnApliarActionPerformed

    private void btnVerCimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCimaActionPerformed
    JOptionPane.showMessageDialog(this, pilaFrutas.peek() ,"CIMA DE LA PILA:",1); 
    }//GEN-LAST:event_btnVerCimaActionPerformed

    private void btnDesapilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesapilarActionPerformed
    String frutaDesapilada = pilaFrutas.pop();
    JOptionPane.showMessageDialog(this, frutaDesapilada ,"FRUTA DESAPILADA:",1);
    lblCantidadFrutas.setText(pilaFrutas.size()+"");
    }//GEN-LAST:event_btnDesapilarActionPerformed

    private void txtNuevaFrutaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevaFrutaKeyReleased
  int teclaCode = evt.getKeyCode();
  
  if(teclaCode==10){
        btnApliar.doClick();
  }
        
        
    }//GEN-LAST:event_txtNuevaFrutaKeyReleased

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilaFrutasJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApliar;
    private javax.swing.JButton btnDesapilar;
    private javax.swing.JButton btnVerCima;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCantidadFrutas;
    private javax.swing.JTextField txtNuevaFruta;
    // End of variables declaration//GEN-END:variables
}
