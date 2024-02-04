package busreservationsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

public class AddAdmin extends javax.swing.JPanel{
   
    String FirstName,LastName,PhNo,Email,Passward,fullDate="";
   
    AddAdmin() {

        jLabel5 = new javax.swing.JLabel();
        fName = new javax.swing.JLabel();
        fNameT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lNameT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phNoT = new javax.swing.JTextField();
        DOB = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        emailT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passwardT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        addAdmin = new javax.swing.JButton();

        this.setBackground(new java.awt.Color(255, 204, 204));

        fName.setText("First Name :");
        fName.setMaximumSize(new java.awt.Dimension(60, 25));
        fName.setMinimumSize(new java.awt.Dimension(60, 25));
        fName.setPreferredSize(new java.awt.Dimension(60, 25));

        jLabel2.setText("Last Name :");
        jLabel2.setMaximumSize(new java.awt.Dimension(60, 25));
        jLabel2.setMinimumSize(new java.awt.Dimension(60, 25));
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 25));

        jLabel3.setText("Date Of Birth :");
        jLabel3.setMaximumSize(new java.awt.Dimension(60, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(60, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(60, 25));

        jLabel4.setText(" Phone No. :");
        jLabel4.setMaximumSize(new java.awt.Dimension(60, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(60, 25));
        jLabel4.setPreferredSize(new java.awt.Dimension(60, 25));

        jLabel6.setText("Email :");
        jLabel6.setMaximumSize(new java.awt.Dimension(60, 25));
        jLabel6.setMinimumSize(new java.awt.Dimension(60, 25));
        jLabel6.setPreferredSize(new java.awt.Dimension(60, 25));

        jLabel7.setText("Passward :");
        jLabel7.setMaximumSize(new java.awt.Dimension(60, 25));
        jLabel7.setMinimumSize(new java.awt.Dimension(60, 25));
        jLabel7.setPreferredSize(new java.awt.Dimension(60, 25));
        
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel8.setText("ADD ADMIN");
        jLabel8.setMaximumSize(new java.awt.Dimension(150, 50));
        jLabel8.setMinimumSize(new java.awt.Dimension(100, 50));
        jLabel8.setPreferredSize(new java.awt.Dimension(150, 50));
       
        addAdmin.setText("Add Admin");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this);
        this.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNameT)
                            .addComponent(lNameT)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phNoT)
                            .addComponent(DOB, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailT)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwardT)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(addAdmin)))
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
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lNameT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phNoT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwardT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
       
        addAdmin.addActionListener(e->{
            FirstName=fNameT.getText();
            LastName=lNameT.getText();
            PhNo=phNoT.getText();
            Email=emailT.getText();
            Passward=passwardT.getText();
            System.out.println(FirstName);
            System.out.println(LastName);
            System.out.println(PhNo);
            System.out.println(DOB.getDate());
            System.out.println(Email);
            System.out.println(Passward);
            
           calDate();
           con();
           showMessage("Admin Added Successfully");
           fNameT.setText(""); 
           lNameT.setText("");
           phNoT.setText("");
           emailT.setText("");
           passwardT.setText("");
           
        });
    }
    
    private void showMessage(String msg) {
            JOptionPane.showMessageDialog(null, msg);
        }
    
    void calDate(){
       
        int i,k=0,j,temp1=0,temp2;
        String day="",monS="",mon="",year="";
        String months[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        Date date=DOB.getDate();
        String dateS=date.toString();
        System.out.println(dateS);
        for(i=0;i<dateS.length();i++){
            if(dateS.charAt(i)==' '){
                k++;
                if(k==1){
                    monS=dateS.substring(i+1,i+4);
                    System.out.println(dateS.substring(i+1,i+4));
                }
                if(k==2){
                    System.out.println(dateS.substring(i+1,i+3));
                    day=dateS.substring(i+1,i+3);
                }
                if(k==5){
                    year=dateS.substring(i+1,i+5);
                    System.out.println(dateS.substring(i+1,i+5));
                }
            }
        }
        for(i=0;i<12;i++){
            System.out.println(months[i]);
            if(monS.compareTo(months[i])==0){
                System.out.println(i);
                mon = Integer.toString((i+1));
                break;
            }
        }
        System.out.println(day+"-"+monS+"-"+year);
        year=year.concat("-");
        fullDate=year.concat(mon);
        fullDate=fullDate.concat("-");
        fullDate=fullDate.concat(day);
        System.out.println(fullDate);
    }

    
    void con(){
        
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/busmanagementsystem", "root", "Prakhar@123");
         Statement stmt = conn.createStatement();
      ) {		      
         System.out.println("Inserting records into the table...");          
         String sql = "INSERT INTO admins VALUES ('"+fNameT.getText()+"', '"+lNameT.getText()+"','"+fullDate+"','"+phNoT.getText()+"', '"+emailT.getText()+"','"+passwardT.getText()+"')";
         stmt.executeUpdate(sql);
        }catch (SQLException e) {
         e.printStackTrace();
      } 
    
    }
    
    private com.toedter.calendar.JDateChooser DOB;
    private javax.swing.JButton addAdmin;
    private javax.swing.JTextField emailT;
    private javax.swing.JLabel fName;
    private javax.swing.JTextField fNameT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lNameT;
    private javax.swing.JTextField passwardT;
    private javax.swing.JTextField phNoT;
}


    
    
