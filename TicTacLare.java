
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;


public class TicTacLare extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TicTacLare.class.getName());
    int turn=2;
    int buttonused[]={0,0,0,0,0,0,0,0,0};
    int pXwon[]={0,0,0,0,0,0,0,0,0};
    int pOwon[]={0,0,0,0,0,0,0,0,0};
    
    int pXwon()
    {
        if(pXwon[0]==1 && pXwon[1]==1 && pXwon[2]==1)
        {
            return 1;
        }
        if(pXwon[3]==1 && pXwon[4]==1 && pXwon[5]==1)
        {
            return 1;
        }
        if(pXwon[6]==1 && pXwon[7]==1 && pXwon[8]==1)
        {
            return 1;
        }
        if(pXwon[0]==1 && pXwon[3]==1 && pXwon[6]==1)
        {
            return 1;
        }
        if(pXwon[1]==1 && pXwon[4]==1 && pXwon[7]==1)
        {
            return 1;
        }
        if(pXwon[2]==1 && pXwon[5]==1 && pXwon[8]==1)
        {
            return 1;
        }
        if(pXwon[2]==1 && pXwon[4]==1 && pXwon[6]==1)
        {
            return 1;
        }
        if(pXwon[0]==1 && pXwon[4]==1 && pXwon[8]==1)
        {
            return 1;
        }
        return 0;
    }
    
    int pOwon()
    {
        if(pOwon[0]==1 && pOwon[1]==1 && pOwon[2]==1)
        {
            return 1;
        }
        if(pOwon[3]==1 && pOwon[4]==1 && pOwon[5]==1)
        {
            return 1;
        }
        if(pOwon[6]==1 && pOwon[7]==1 && pOwon[8]==1)
        {
            return 1;
        }
        if(pOwon[0]==1 && pOwon[3]==1 && pOwon[6]==1)
        {
            return 1;
        }
        if(pOwon[1]==1 && pOwon[4]==1 && pOwon[7]==1)
        {
            return 1;
        }
        if(pOwon[2]==1 && pOwon[5]==1 && pOwon[8]==1)
        {
            return 1;
        }
        if(pOwon[2]==1 && pOwon[4]==1 && pOwon[6]==1)
        {
            return 1;
        }
        if(pOwon[0]==1 && pOwon[4]==1 && pOwon[8]==1)
        {
            return 1;
        }
        return 0;
    }
    
    /**
     * Creates new form TicTacLare
     */
    public TicTacLare() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        b0 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        b0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b0.addActionListener(this::b0ActionPerformed);

        b1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b1.addActionListener(this::b1ActionPerformed);

        b2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b2.addActionListener(this::b2ActionPerformed);

        b3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b3.addActionListener(this::b3ActionPerformed);

        b4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b4.addActionListener(this::b4ActionPerformed);

        b5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b5.addActionListener(this::b5ActionPerformed);

        b6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b6.addActionListener(this::b6ActionPerformed);

        b7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b7.addActionListener(this::b7ActionPerformed);

        b8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b8.addActionListener(this::b8ActionPerformed);

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("Play Again!!!");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        // TODO add your handling code here:
        if(buttonused[0]==0)
        {
     
            if(turn%2==0)
            {
                turn++;
                b0.setText("X");
                buttonused[0]=1;
                pXwon[0]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player X won!!!");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player O won!!!");
                }
            }
            else
            {
                turn++;
                b0.setText("0");
                buttonused[0]=1;
                pOwon[0]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player X won!!!");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player O won!!!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON IS ALREADY USED!!!");
        }
    }//GEN-LAST:event_b0ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        if(buttonused[2]==0)
        {
     
            if(turn%2==0)
            {
                turn++;
                b2.setText("X");
                buttonused[2]=1;
                pXwon[2]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
               if(result1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player X won!!!");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player O won!!!");
                }
            }
            else
            {
                turn++;
                b2.setText("0");
                buttonused[2]=1;
                pOwon[2]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player X won!!!");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player O won!!!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON IS ALREADY USED!!!");
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        if(buttonused[1]==0)
        {
     
            if(turn%2==0)
            {
                turn++;
                b1.setText("X");
                buttonused[1]=1;
                pXwon[1]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player X won!!!");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player O won!!!");
                }
            }
            else
            {
                turn++;
                b1.setText("0");
                buttonused[1]=1;
                pOwon[1]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player X won!!!");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player O won!!!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON IS ALREADY USED!!!");
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        if(buttonused[3]==0)
        {
     
            if(turn%2==0)
            {
                turn++;
                b3.setText("X");
                buttonused[3]=1;
                pXwon[3]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player X won!!!");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player O won!!!");
                }
            }
            else
            {
                turn++;
                b3.setText("0");
                buttonused[3]=1;
                pOwon[3]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player X won!!!");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player O won!!!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON IS ALREADY USED!!!");
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        if(buttonused[4]==0)
        {
     
            if(turn%2==0)
            {
                turn++;
                b4.setText("X");
                buttonused[4]=1;
                pXwon[4]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
               if(result1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player X won!!!");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player O won!!!");
                }
            }
            else
            {
                turn++;
                b4.setText("0");
                buttonused[4]=1;
                pOwon[4]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player X won!!!");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player O won!!!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON IS ALREADY USED!!!");
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        if(buttonused[5]==0)
        {
     
            if(turn%2==0)
            {
                turn++;
                b5.setText("X");
                buttonused[5]=1;
                pXwon[5]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
               if(result1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player X won!!!");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player O won!!!");
                }
            }
            else
            {
                turn++;
                b5.setText("0");
                buttonused[5]=1;
                pOwon[5]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
               if(result1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player X won!!!");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player O won!!!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON IS ALREADY USED!!!");
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        if(buttonused[6]==0)
        {
     
            if(turn%2==0)
            {
                turn++;
                b6.setText("X");
                buttonused[6]=1;
                pXwon[6]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player X won!!!");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player O won!!!");
                }
            }
            else
            {
                turn++;
                b6.setText("0");
                buttonused[6]=1;
                pOwon[6]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player X won!!!");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player O won!!!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON IS ALREADY USED!!!");
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        if(buttonused[7]==0)
        {
     
            if(turn%2==0)
            {
                turn++;
                b7.setText("X");
                buttonused[7]=1;
                pXwon[7]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player X won!!!");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player O won!!!");
                }
            }
            else
            {
                turn++;
                b7.setText("0");
                buttonused[7]=1;
                pOwon[7]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
               if(result1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player X won!!!");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player O won!!!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON IS ALREADY USED!!!");
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        if(buttonused[8]==0)
        {
     
            if(turn%2==0)
            {
                turn++;
                b8.setText("X");
                buttonused[8]=1;
                pXwon[8]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player X won!!!");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player O won!!!");
                }
            }
            else
            {
                turn++;
                b8.setText("0");
                buttonused[8]=1;
                pOwon[8]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player X won!!!");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Player O won!!!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON IS ALREADY USED!!!");
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        b0.setText("");
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        
        turn=2;
        for(int i=0;i<9;i++)
        {
            buttonused[i]=0;
        }
        for(int i=0;i<9;i++)
        {
            pXwon[i]=0;
        }
        for(int i=0;i<9;i++)
        {
            pOwon[i]=0;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new TicTacLare().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
