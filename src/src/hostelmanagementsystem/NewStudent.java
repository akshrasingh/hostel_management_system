package hostelmanagementsystem;

import java.sql.*;
import Project.ConnectionProvider;
import java.awt.Color;
import javax.swing.JOptionPane;
        
public class NewStudent extends javax.swing.JFrame 
{
    public void clear()//method
    {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jComboBox1.removeAllItems();
        roomNumber();
    }
    public void roomNumber()
    {
        int i = 0;
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from room where activate='Yes' and roomStatus='Not Booked'");
            while(rs.next())
            {
                i=1;
                jComboBox1.addItem(rs.getString(1));
            }
            if(i==0)
            {
                jButton1.setVisible(false);
                JOptionPane.showMessageDialog(null, "All Rooms are already Booked");
                setVisible(false);
                
            }
        }
        catch(Exception e)
        {
            
        }
    }

    public NewStudent()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeall = new javax.swing.JButton();
        mobilenumber = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        fathername = new javax.swing.JLabel();
        mothername = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        permanentaddress = new javax.swing.JLabel();
        collegename = new javax.swing.JLabel();
        aadhar = new javax.swing.JLabel();
        roomnumber = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(480, 150));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hostel images & icon/Close all jframe.png"))); // NOI18N
        closeall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeallActionPerformed(evt);
            }
        });
        getContentPane().add(closeall, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 6, -1, -1));

        mobilenumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mobilenumber.setText("Mobile Number");
        getContentPane().add(mobilenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 64, -1, -1));

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name.setText("Name");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 105, -1, -1));

        fathername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fathername.setText("Father Name");
        getContentPane().add(fathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 146, -1, -1));

        mothername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mothername.setText("Mother Name");
        getContentPane().add(mothername, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 187, -1, -1));

        email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        email.setText("Email");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 225, -1, -1));

        permanentaddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        permanentaddress.setText("Permanent Address");
        getContentPane().add(permanentaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 266, -1, -1));

        collegename.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        collegename.setText("College Name");
        getContentPane().add(collegename, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 307, -1, -1));

        aadhar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        aadhar.setText("Aadhar Number(UNIQUE ID)");
        getContentPane().add(aadhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 345, -1, -1));

        roomnumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roomnumber.setText("Room Number");
        getContentPane().add(roomnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 386, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 61, 325, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 102, 325, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 143, 325, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 184, 325, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 219, 325, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 260, 325, -1));

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 301, 325, -1));

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 342, 325, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 383, 325, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hostel images & icon/save.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 424, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hostel images & icon/clear.png"))); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 424, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hostel images & icon/pages background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 670, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        roomNumber();
        
    }//GEN-LAST:event_formComponentShown

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
       
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void closeallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeallActionPerformed
        
        setVisible(false);
    }//GEN-LAST:event_closeallActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String mobilenumber=jTextField1.getText();
        if(mobilenumber.matches("^[0-9]*$")&& mobilenumber.length()==10)
        {
            jTextField1.setBackground(Color.green);
            JOptionPane.showMessageDialog(null, "Successfully Updated");
        }
        else
        {
            jTextField1.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Please enter 10-digit number");
        }
        String name=jTextField2.getText();
        String fathername=jTextField3.getText();
        String mothername=jTextField4.getText();
        String email=jTextField5.getText();
        String address=jTextField6.getText();
        String college=jTextField7.getText();
        String aadhar=jTextField8.getText();
        String roomnumber=(String)jComboBox1.getSelectedItem();
        String status="Living";
        try
        {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, mobilenumber);
            ps.setString(2, name);
            ps.setString(3, fathername);
            ps.setString(4, mothername);
            ps.setString(5, email);
            ps.setString(6, address);
            ps.setString(7, college);
            ps.setString(8, aadhar);
            ps.setString(9, roomnumber);
            ps.setString(10, status);
            ps.executeUpdate();
            
            PreparedStatement ps1 = con.prepareStatement("update room set roomStatus='Booked' where number=?");
            ps1.setString(1, roomnumber);
            ps1.executeUpdate();
            
            clear();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        clear();
                
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[])
    {
 
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run()
            {
                new NewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aadhar;
    private javax.swing.JButton closeall;
    private javax.swing.JLabel collegename;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fathername;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel mobilenumber;
    private javax.swing.JLabel mothername;
    private javax.swing.JLabel name;
    private javax.swing.JLabel permanentaddress;
    private javax.swing.JLabel roomnumber;
    // End of variables declaration//GEN-END:variables
}
