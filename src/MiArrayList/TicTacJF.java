 
package MiArrayList;

import java.util.ArrayList;
import javax.swing.JButton;

 
public class TicTacJF extends javax.swing.JFrame {

    ArrayList<String> ValoresTicTac;
    String turno;
    String ganador;
    
    public TicTacJF() {
        initComponents();
        reiniciar();
    }

    public void turno(JButton boton, int pos){
        ValoresTicTac.set(pos, turno); 
        boton.setText(turno);   
        validarGanador();
        turno = turno.equals("X")? "Y" : "X"; 
     }
    
    public void validarGanador(){
    
        if(       ValoresTicTac.get(1).equals(turno) && ValoresTicTac.get(2).equals(turno) && ValoresTicTac.get(3).equals(turno)  ){
            ganador=turno;
        }else  if(ValoresTicTac.get(4).equals(turno) && ValoresTicTac.get(5).equals(turno) && ValoresTicTac.get(6).equals(turno)  ){
            ganador=turno;
        }else  if(ValoresTicTac.get(7).equals(turno) && ValoresTicTac.get(8).equals(turno) && ValoresTicTac.get(9).equals(turno)  ){
            ganador=turno;
        }else  if(ValoresTicTac.get(1).equals(turno) && ValoresTicTac.get(4).equals(turno) && ValoresTicTac.get(7).equals(turno)  ){
            ganador=turno;
        }else  if(ValoresTicTac.get(2).equals(turno) && ValoresTicTac.get(5).equals(turno) && ValoresTicTac.get(8).equals(turno)  ){
            ganador=turno;
        }else  if(ValoresTicTac.get(3).equals(turno) && ValoresTicTac.get(6).equals(turno) && ValoresTicTac.get(9).equals(turno)  ){
            ganador=turno;
        }else  if(ValoresTicTac.get(1).equals(turno) && ValoresTicTac.get(5).equals(turno) && ValoresTicTac.get(9).equals(turno)  ){
            ganador=turno;
        }else  if(ValoresTicTac.get(3).equals(turno) && ValoresTicTac.get(5).equals(turno) && ValoresTicTac.get(9).equals(turno)  ){
            ganador=turno;
        }else{
            
            ValoresTicTac.forEach((valor) -> {
                System.out.println(valor);
            });
            
        } 
    
    }
    
    public void reiniciar(){
        ValoresTicTac = new ArrayList<>();  
        ValoresTicTac.add("");        
        ValoresTicTac.add("");     
        ValoresTicTac.add("");     
        ValoresTicTac.add("");     
        ValoresTicTac.add("");     
        ValoresTicTac.add("");     
        ValoresTicTac.add("");     
        ValoresTicTac.add("");     
        ValoresTicTac.add("");     
        ValoresTicTac.add("");
        turno = "X";
        ganador ="";
    }
    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn9 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Wicked Mouse", 0, 29)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPATE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 230, 50));

        btn9.setFont(new java.awt.Font("Wicked Mouse", 1, 36)); // NOI18N
        btn9.setForeground(new java.awt.Color(0, 102, 204));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 70, 70));

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setFont(new java.awt.Font("Wicked Mouse", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 255, 255));
        jButton2.setText("R E I N I C i A R");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 230, 40));

        btn2.setFont(new java.awt.Font("Wicked Mouse", 1, 36)); // NOI18N
        btn2.setForeground(new java.awt.Color(0, 102, 204));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 70, 70));

        btn3.setFont(new java.awt.Font("Wicked Mouse", 1, 36)); // NOI18N
        btn3.setForeground(new java.awt.Color(0, 102, 204));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 70, 70));

        btn4.setFont(new java.awt.Font("Wicked Mouse", 1, 36)); // NOI18N
        btn4.setForeground(new java.awt.Color(0, 102, 204));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, 70));

        btn5.setFont(new java.awt.Font("Wicked Mouse", 1, 36)); // NOI18N
        btn5.setForeground(new java.awt.Color(0, 102, 204));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 70, 70));

        btn6.setFont(new java.awt.Font("Wicked Mouse", 1, 36)); // NOI18N
        btn6.setForeground(new java.awt.Color(0, 102, 204));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 70, 70));

        btn7.setFont(new java.awt.Font("Wicked Mouse", 1, 36)); // NOI18N
        btn7.setForeground(new java.awt.Color(0, 102, 204));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 70, 70));

        btn8.setFont(new java.awt.Font("Wicked Mouse", 1, 36)); // NOI18N
        btn8.setForeground(new java.awt.Color(0, 102, 204));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 70, 70));

        jLabel2.setFont(new java.awt.Font("Wicked Mouse", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("TIC TAC");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 60));

        btn1.setFont(new java.awt.Font("Wicked Mouse", 1, 36)); // NOI18N
        btn1.setForeground(new java.awt.Color(0, 102, 204));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        turno((JButton) evt.getSource(),1); 
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        turno((JButton) evt.getSource(),2);      
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       turno((JButton) evt.getSource(),3);  
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       turno((JButton) evt.getSource(),4);  
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        turno((JButton) evt.getSource(),5);  
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        turno((JButton) evt.getSource(),6);  
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        turno((JButton) evt.getSource(),7);  
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        turno((JButton) evt.getSource(),8);  
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        turno((JButton) evt.getSource(),9);  
    }//GEN-LAST:event_btn9ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
