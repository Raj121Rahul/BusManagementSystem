package busreservationsystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class user extends javax.swing.JFrame {
    
    String id,fname,lname,fullDate="",name,vartype,txtclas;
    
    private javax.swing.JButton submit;
    private javax.swing.JComboBox<String> jComboBoxDestination;
    private javax.swing.JComboBox<String> jComboBoxFrom;
    private javax.swing.JComboBox<String> jComboBoxTime;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonEconomy1;
    private javax.swing.JRadioButton jRadioButtonFirstClass1;
    private javax.swing.JRadioButton jRadioButtonReturn1;
    private javax.swing.JRadioButton jRadioButtonSingle1;
    private javax.swing.JTextField jTextFieldPassenger1;
    
    String station[]=new String[14];
    int i;
    String gender,email,ss;

    public user(String fn,String ln, String no, String mail) {
        
        fname=fn;
        fname.concat(" ");
        name = fname.concat(ln);
        lname = ln;
        id=no;
        System.out.println(name+" -> "+id);
        email=mail;
        initComponents();
    }
    
    public void con(){
    
        try{
        submit.addActionListener(e -> {
        if (isFieldEmpty()) {
            showMessage("Plese fill all the fields");
        } else {
            System.out.println(jComboBoxDestination.getSelectedItem());
            System.out.println(jDateChooser.getDate());
            System.out.println(jComboBoxTime.getSelectedItem());
            if(jRadioButtonSingle1.isSelected()==true){
                System.out.println("Single");
                vartype = "single";
            }
            else if(jRadioButtonReturn1.isSelected()==true){
                System.out.println("Return");
                vartype = "return";
            }
            if(jRadioButtonFirstClass1.isSelected()==true){
                System.out.println("Firist class");
                txtclas = "First";
            }
            else if(jRadioButtonEconomy1.isSelected()==true){
                System.out.println("Economy class");
                txtclas = "Economy";
            }
            ss=jTextFieldPassenger1.getText();
            System.out.println(ss);
            calDate();
            System.out.println(fullDate);
            try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/busmanagementsystem", "root", "Prakhar@123");
            Statement stmt = conn.createStatement();
            ) {		      
               System.out.println("Inserting records into the table...");          
               String sql = "INSERT INTO tickets VALUES ('"+name+"', '"+id+"','"+jComboBoxFrom.getSelectedItem()+"','"+jComboBoxDestination.getSelectedItem()+"', '"+fullDate+"','"+jComboBoxTime.getSelectedItem()+"','"+vartype+"','"+txtclas+"','"+jTextFieldPassenger1.getText()+"')";
               stmt.executeUpdate(sql);
               System.out.println("Inserted records into the table...");  
               txtfile(name);
               //showMessage("Ticket booked successfully...! Check Your Di1recto1ry For Recipt.");
               jTextFieldPassenger1.setText("");
              }catch (SQLException ex) {
               ex.printStackTrace();
            } 
            }
  
               payment_set_ser ob = new payment_set_ser(name, txtclas, "male", id,email,jComboBoxTime.getSelectedItem().toString(),fullDate,ss,dis(jComboBoxFrom.getSelectedItem().toString()),dis(jComboBoxDestination.getSelectedItem().toString()));
               ob.setSize(500,500);
                ob.setBounds(0,0,500,500);
                //ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ob.setLocation(0, 0);
                ob.setVisible(true);
                ob.pack();
                //this.dispose();
            });

        }
        catch (Exception ex) {
            showMessage(ex.getMessage());
        }
        
    }
    public int dis(String st){
        int d=0,i;
        for(i=0;i<14;i++){
            if(station[i]==st)
                return i+1;
        }
    return d;
    }
    private boolean isFieldEmpty() {
            boolean b = true;
                if (jTextFieldPassenger1.getText().isEmpty()) {
                b = true;
                }
                else {
                b = false;
                }
            return b;
        }
        private void showMessage(String msg) {
            JOptionPane.showMessageDialog(null, msg);
        }
        
        void conStations(){
        try{
            String url = "jdbc:mysql://localhost:3306/busmanagementsystem";
			String user = "root";
			String password = "Prakhar@123";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "select station from stations;";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if(rs.next() == false){
                showMessage("Something went wrong");
                System.out.print("No records found in table");
            }
            else{ 
                do{
                    station[i]=rs.getString(1);
                    i++;
		}while(rs.next()); 
            }
        }
        catch(Exception g){
            g.getStackTrace();
            System.out.print(g);
        }
    }

    void calDate(){
       
        int i,k=0,j,temp1=0,temp2;
        String day="",monS="",mon="",year="";
        String months[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        Date date=jDateChooser.getDate();
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
    
    private void txtfile(String name){
     try{
        String date1 = fullDate;
        String flname = name.concat(date1);
        String fullflname = flname.concat(".txt");
        File file1 = new File(fullflname);
        FileWriter fw=new FileWriter(file1);
        PrintWriter pw=new PrintWriter(fw);
        
        pw.println("Name : "+fname+" "+lname+"\n");
        pw.println("ID : "+id+"\n");
        pw.println("From : "+jComboBoxFrom.getSelectedItem()+"\n");
        pw.println("To : "+jComboBoxDestination.getSelectedItem()+"\n");
        pw.println("Date : "+fullDate+"\n");
        pw.println("Time : "+jComboBoxTime.getSelectedItem()+"\n");
        pw.println("Type : "+vartype+"\n");
        pw.println("Class : "+txtclas+"\n");
        pw.println("No of Passengers : "+jTextFieldPassenger1.getText()+"\n");
        
        pw.close();
     }catch(Exception etc){
         System.out.println(etc);
     }
    
    }

    private void initComponents() {
        
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxDestination = new javax.swing.JComboBox<>();
        jComboBoxFrom = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButtonSingle1 = new javax.swing.JRadioButton();
        jRadioButtonEconomy1 = new javax.swing.JRadioButton();
        jRadioButtonReturn1 = new javax.swing.JRadioButton();
        jRadioButtonFirstClass1 = new javax.swing.JRadioButton();
        jTextFieldPassenger1 = new javax.swing.JTextField();
        jComboBoxTime = new javax.swing.JComboBox<>();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        submit = new javax.swing.JButton();
        ButtonGroup type = new ButtonGroup();
        ButtonGroup clas = new ButtonGroup();
        
        con();
        conStations();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 550));

        jPanel1.setBackground(new java.awt.Color(175, 220, 236));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setForeground(new java.awt.Color(175, 220, 236));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 80)); 
        jLabel1.setForeground(new java.awt.Color(255, 0, 204));
        jLabel1.setText("  Bus Reservation System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); 
        jLabel8.setText("From ");
        
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); 
        jLabel2.setText("Destinantion ");

        jComboBoxFrom.setModel(new javax.swing.DefaultComboBoxModel<>(station));
        jComboBoxDestination.setModel(new javax.swing.DefaultComboBoxModel<>(station));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); 
        jLabel3.setText("Date of Journey");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); 
        jLabel4.setText("Ticket Type ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); 
        jLabel5.setText("Departure");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); 
        jLabel6.setText("No. of Passengers ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); 
        jLabel7.setText("Class");
        
        jRadioButtonSingle1.setFont(new java.awt.Font("Times New Roman", 1, 15)); 
        jRadioButtonSingle1.setText("Single");

        jRadioButtonEconomy1.setFont(new java.awt.Font("Times New Roman", 1, 15)); 
        jRadioButtonEconomy1.setText("Economy");

        jRadioButtonReturn1.setFont(new java.awt.Font("Times New Roman", 1, 15)); 
        jRadioButtonReturn1.setText("Return");

        jRadioButtonFirstClass1.setFont(new java.awt.Font("Times New Roman", 1, 15)); 
        jRadioButtonFirstClass1.setText("First Class");
        
        
        type.add(jRadioButtonSingle1);
        type.add(jRadioButtonReturn1);
        
        clas.add(jRadioButtonFirstClass1);
        clas.add(jRadioButtonEconomy1);
        
        jComboBoxTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Time", "11:30", "12:30", "1:30", "2:30" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPassenger1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxFrom, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxDestination, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jRadioButtonFirstClass1)
                                                .addGap(18, 18, 18))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jRadioButtonSingle1)
                                                .addGap(50, 50, 50)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButtonReturn1)
                                            .addComponent(jRadioButtonEconomy1)))
                                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonReturn1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButtonSingle1)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonFirstClass1)
                        .addComponent(jRadioButtonEconomy1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPassenger1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        submit.setBackground(new java.awt.Color(0, 204, 51));
        submit.setFont(new java.awt.Font("Times New Roman", 1, 22));
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(submit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(submit)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        /*submit.addActionListener(e -> {
        
        });*/
    }                       
    
}
