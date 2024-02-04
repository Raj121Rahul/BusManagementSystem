package busreservationsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

public class ForgotPass_P extends javax.swing.JPanel{
   
    String FirstName,LastName,PhNo,cpass,Passward,fullDate="";
   
    ForgotPass_P() {

        fName = new javax.swing.JLabel();
        fNameT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phNoT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cPassT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passwardT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        changePass = new javax.swing.JButton();

        this.setBackground(new java.awt.Color(255, 204, 204));

        fName.setText("First Name :");
        fName.setMaximumSize(new java.awt.Dimension(60, 25));
        fName.setMinimumSize(new java.awt.Dimension(60, 25));
        fName.setPreferredSize(new java.awt.Dimension(60, 25));

        jLabel4.setText(" Phone No. :");
        jLabel4.setMaximumSize(new java.awt.Dimension(60, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(60, 25));
        jLabel4.setPreferredSize(new java.awt.Dimension(60, 25));

        jLabel7.setText("Confirm Passward :");
        jLabel7.setMaximumSize(new java.awt.Dimension(60, 25));
        jLabel7.setMinimumSize(new java.awt.Dimension(60, 25));
        jLabel7.setPreferredSize(new java.awt.Dimension(60, 25));
        
        jLabel6.setText("Passward :");
        jLabel6.setMaximumSize(new java.awt.Dimension(120, 25));
        jLabel6.setMinimumSize(new java.awt.Dimension(60, 25));
        jLabel6.setPreferredSize(new java.awt.Dimension(120, 25));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel8.setText("FORGOT PASSWARD");
        jLabel8.setMaximumSize(new java.awt.Dimension(250, 50));
        jLabel8.setMinimumSize(new java.awt.Dimension(150, 50));
        jLabel8.setPreferredSize(new java.awt.Dimension(250, 50));
       
        changePass.setText("Change");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this);
        this.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNameT)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phNoT)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwardT)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cPassT)))
                        
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(changePass)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fNameT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phNoT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cPassT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwardT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(changePass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
       
        changePass.addActionListener(e->{
            FirstName=fNameT.getText();
            PhNo=phNoT.getText();
            Passward=passwardT.getText();
            cpass=cPassT.getText();
            
            //System.out.println(con());
           if(cpass.equals(Passward)){
           int x=con();
           if(x==1){
              showMessage("Passward Change Successfully");
           }
           else{
               showMessage("Something went wrong.");
           }
           fNameT.setText(""); 
           phNoT.setText("");
           cPassT.setText("");
           passwardT.setText("");
           
           }
           else{
               showMessage("Passward dosen't match.");
           }
           
        });
    }
    
    private void showMessage(String msg) {
            JOptionPane.showMessageDialog(null, msg);
        }
    
    
    int con(){
        
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/busmanagementsystem", "root", "Prakhar@123");
         Statement stmt = conn.createStatement();
      ) {		      
         System.out.println("Inserting records into the table...");          
         String sql = "UPDATE users set passward = '"+passwardT.getText()+"' where phno='"+phNoT.getText()+"'";
         stmt.executeUpdate(sql);
        }catch (SQLException e) {
         e.printStackTrace();
         return 0;
      } 
    return 1;
    }
    
    
    private javax.swing.JButton changePass;
    private javax.swing.JTextField cPassT;
    private javax.swing.JLabel fName;
    private javax.swing.JTextField fNameT;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField passwardT;
    private javax.swing.JTextField phNoT;
}

