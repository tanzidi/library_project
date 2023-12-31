/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import static forms.Search.scaleImage;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class IdCard extends javax.swing.JFrame {
    Connection conn = null;
    int ok = 0;
    /**
     * Creates new form NewJFrame
     * @throws java.lang.ClassNotFoundException
     */
    public IdCard() throws ClassNotFoundException {
        initComponents();
       conn = sql_connect.connect();
    }
    public static BufferedImage scaleImage(int w, int h, BufferedImage img) throws Exception {
    BufferedImage bi;
    bi = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);
    Graphics2D g2d = (Graphics2D) bi.createGraphics();
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
    g2d.drawImage(img, 0, 0, w, h, null);
    g2d.dispose();
    return bi;
    }
    private void save_image(){
        BufferedImage imagebuf=null;
        try {
            imagebuf = new Robot().createScreenCapture(jPanel3.bounds()); // which panel you want to save
        } catch (AWTException e1) {
            e1.printStackTrace();
        }  
         Graphics2D graphics2D = imagebuf.createGraphics();
         jPanel3.paint(graphics2D);
         try {
            ImageIO.write(imagebuf,"jpg", new File(jTextField1.getText()+".jpg"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error");
        }
        JFrame f=new JFrame();  
        JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        idnotset = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(1092, 452));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setMaximumSize(new java.awt.Dimension(123, 123));
        jLabel9.setMinimumSize(new java.awt.Dimension(123, 123));
        jLabel9.setPreferredSize(new java.awt.Dimension(122, 122));
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 122, 122));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("XXXXXX");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 120, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("XXXXXX");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 230, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("XXXXXXXX");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 230, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("XXXXXXXX");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 230, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("XXXXXXXXXXXXX");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 230, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("XXXXX");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 230, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icard.jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 630, 450));

        jPanel1.setBackground(new java.awt.Color(140, 43, 60));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField1InputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 160, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Id to get Library card");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(140, 43, 60));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Get Data");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setFocusable(false);
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 160, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(140, 43, 60));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Save It");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.setFocusable(false);
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 160, 40));

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setText("<< HOME");
        home.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.setFocusable(false);
        home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 70, 20));

        idnotset.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(idnotset, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 680));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 630, 680));

        setSize(new java.awt.Dimension(1107, 725));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField1InputMethodTextChanged

    }//GEN-LAST:event_jTextField1InputMethodTextChanged

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel10.setForeground(Color.white);
        jLabel10.setOpaque(false);
        Border border = BorderFactory.createLineBorder(Color.white, 1);
        jLabel10.setBorder(border);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setOpaque(true);
        jLabel10.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        jLabel10.setBackground(Color.white);
        jLabel10.setForeground(new Color(140,43,60));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        if("".equals(jTextField1.getText()))idnotset.setText("* Id not set"); 
        else {
            idnotset.setText("");
            ok = 1;
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM customer WHERE id = '"+jTextField1.getText()+"' LIMIT 1");
                while(rs.next()){
                    jLabel3.setText(rs.getString(1));
                    jLabel4.setText(rs.getString(2)+" "+rs.getString(3));
                    jLabel5.setText(rs.getString(5));
                    jLabel6.setText(rs.getString(4));
                    jLabel7.setText(rs.getString(6));
                    jLabel8.setText(rs.getString(2));
                   // System.out.println(rs.getString(1));
                }
                jLabel12.setEnabled(true);
                ImageIcon ii=new ImageIcon(scaleImage(123, 123, ImageIO.read(new File("upload\\"+jTextField1.getText()+".jpg"))));//get the image from file chooser and scale it to match JLabel size
                jLabel9.setIcon(ii);
                jLabel9.setBackground(Color.white);
                jLabel11.setText("");
            }
            catch(SQLException e){
                //System.out.println(e);
                jLabel11.setText("Sorry no data found !");
                jLabel3.setText("XXXXX");
                jLabel4.setText("XXXXXXXXXXXXX");
                jLabel5.setText("XXXXXXXX");
                jLabel6.setText("XXXXXXXX");
                jLabel7.setText("XXXXXX");
                jLabel8.setText("XXXXXX");
                ok = 0;
                ImageIcon ii;
                try {
                    ii = new ImageIcon(scaleImage(123, 123, ImageIO.read(new File("src\\icons\\364-user.png")))); //get the image from file chooser and scale it to match JLabel size
                    jLabel9.setIcon(ii);
                } catch (IOException ex) {
                    Logger.getLogger(IdCard.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(IdCard.class.getName()).log(Level.SEVERE, null, ex);
                }
                jLabel12.setEnabled(false);
            } catch (IOException ex) {
                //Logger.getLogger(IdCard.class.getName()).log(Level.SEVERE, null, ex);
                jLabel11.setText("Sorry no Image found !");
                jLabel3.setText("XXXXX");
                jLabel4.setText("XXXXXXXXXXXXX");
                jLabel5.setText("XXXXXXXX");
                jLabel6.setText("XXXXXXXX");
                jLabel7.setText("XXXXXX");
                jLabel8.setText("XXXXXX");
                ok = 0;
                ImageIcon ii;
                try {
                    ii = new ImageIcon(scaleImage(123, 123, ImageIO.read(new File("src\\icons\\364-user.png")))); //get the image from file chooser and scale it to match JLabel size
                    jLabel9.setIcon(ii);
                } catch (IOException ex1) {
                    Logger.getLogger(IdCard.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex1) {
                    Logger.getLogger(IdCard.class.getName()).log(Level.SEVERE, null, ex);
                }
                jLabel12.setEnabled(false);
            } catch (Exception ex) {
                //Logger.getLogger(IdCard.class.getName()).log(Level.SEVERE, null, ex);
                jLabel11.setText("Sorry no data found !");
                jLabel3.setText("XXXXX");
                jLabel4.setText("XXXXXXXXXXXXX");
                jLabel5.setText("XXXXXXXX");
                jLabel6.setText("XXXXXXXX");
                jLabel7.setText("XXXXXX");
                jLabel8.setText("XXXXXX");
                ok = 0;
                ImageIcon ii;
                try {
                    ii = new ImageIcon(scaleImage(123, 123, ImageIO.read(new File("src\\icons\\364-user.png")))); //get the image from file chooser and scale it to match JLabel size
                    jLabel9.setIcon(ii);
                } catch (IOException ex2) {
                    Logger.getLogger(IdCard.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex2) {
                    Logger.getLogger(IdCard.class.getName()).log(Level.SEVERE, null, ex);
                }
                jLabel12.setEnabled(false);
            }       
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        if(ok==1){
            save_image(); 
        }
        else{
            JFrame f=new JFrame();  
            JOptionPane.showMessageDialog(f,"Image not Set.","Alert",JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jLabel12.setForeground(Color.white);
        jLabel12.setOpaque(false);
        Border border = BorderFactory.createLineBorder(Color.white, 1);
        jLabel12.setBorder(border);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        jLabel12.setOpaque(true);
        jLabel12.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        jLabel12.setBackground(Color.white);
        jLabel12.setForeground(new Color(140,43,60));
    }//GEN-LAST:event_jLabel12MouseExited

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        new main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IdCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IdCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IdCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IdCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new IdCard().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(IdCard.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel home;
    private javax.swing.JLabel idnotset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
