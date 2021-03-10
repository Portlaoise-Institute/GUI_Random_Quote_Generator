
package com.mycompany.guirandomquoteoftheday;

import java.util.ArrayList;

public class Main extends javax.swing.JFrame {
    
      // Declare and initialise new String Array List 
        ArrayList<String> quotes = new ArrayList<String>();
        
        public void addQuotes()
        {

        //Add quotes to the string arraylist 
        //We could also connect to a database and pull quotes from a larger
        //Source
        quotes.add("All of the women on The Apprentice flirted with me "
                + "- consciously or unconsciously. That's to be expected."
                + "   D. Trump\n");
        quotes.add("I'm not going to have some reporters pawing through our "
                + "papers. "
                + "We are the president.    H. Clinton\n");
        quotes.add("Only silence communicates the truth as it is.   Osho\n");
        quotes.add("Let yourself be silently drawn by the stronger pull of what "
                    + "you really love.   Rumi\n");
        quotes.add("Faith is taking the first step even when you don't"
                + " see the whole staircase.   Martin Luther King\n");
        quotes.add("Forgive your enemies, but never forget their names.   JFK\n");
        quotes.add("The greatest education in the world is watching"
                + " the masters at work.    Michael Jackson\n");
        quotes.add("I can resist everything except temptation.    Oscar Wilde\n");
        quotes.add("A man of genius makes no mistakes. His errors are "
                + "volitional and are the portals of discovery.   James Joyce\n");
        quotes.add("There are two tragedies in life. One is not to get your"
                + " heart's desire. The other is to get it.   G. B. Shaw\n");
        }
    
    
    
    
    

    /** Creates new form Main */
    public Main() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        quoteLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daily Quote App");

        jButton1.setText("Get a Quote");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Random Quote of The Day:");

        quoteLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quoteLbl.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quoteLbl)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(574, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(quoteLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Add quotes to the string arraylist 
        addQuotes();
        
        //Generate a random number
        int r = (int) Math.floor(Math.random()*10);

        //Display random quote on the form
        quoteLbl.setText(quotes.get(r));
        
        
        
        
        
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      //  java.awt.EventQueue.invokeLater(new Runnable() {
     //       public void run() {
                new Main().setVisible(true);
     //       }
      //  });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel quoteLbl;
    // End of variables declaration//GEN-END:variables

}
