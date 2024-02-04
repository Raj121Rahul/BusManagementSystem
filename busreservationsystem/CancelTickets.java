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

public class CancelTickets extends javax.swing.JFrame {
    
    String id,fname,lname,fullDate="",fm,td,name,vartype,txtclas;
    
    private javax.swing.JButton submit;
    private javax.swing.JComboBox<String> jComboBoxDestination;
    private javax.swing.JComboBox<String> jComboBoxFrom;
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
    
    String station[]=new String[14];
    int i;
    String gender,email,ss;

    public CancelTickets(String no, String mail) {
        
        id=no;
        System.out.println(name+" -> "+id);
        email=mail;
        initComponents();
    }
    
    public void con(){
    
        
        
    }
    public int dis(String st){
        int d=0,i;
        for(i=0;i<14;i++){
            if(station[i]==st)
                return i+1;
        }
    return d;
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
        jDateChooser = new com.toedter.calendar.JDateChooser();
        submit = new javax.swing.JButton();
        ButtonGroup type = new ButtonGroup();
        ButtonGroup clas = new ButtonGroup();
        
        con();
        conStations();

       // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
                            .addComponent(jComboBoxFrom, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxDestination, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGap(18, 18, 18))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(50, 50, 50)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)))
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
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            )
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    )
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        submit.setBackground(new java.awt.Color(0, 204, 51));
        submit.setFont(new java.awt.Font("Times New Roman", 1, 22));
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Cancel");

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
        
        submit.addActionListener(e -> {
        if (false) {
        } else {
            System.out.println(jComboBoxDestination.getSelectedItem());
            System.out.println(jDateChooser.getDate());
            calDate();
            System.out.println(fullDate);
            try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/busmanagementsystem", "root", "Prakhar@123");
            Statement stmt = conn.createStatement();
            ) {		      
               fm =jComboBoxFrom.getSelectedItem().toString();
               td = jComboBoxDestination.getSelectedItem().toString();
               System.out.println("deleting records from table...");          
               String sql = "delete from tickets where phno='"+id+"' and ondate = '"+fullDate+"' and froms = '"+fm+"' and destination = '"+td+"';"; //and froms = '"+jComboBoxFrom.getSelectedItem()+"' and destination = '"+jComboBoxDestination.getSelectedItem()+"' and ondate = '"+fullDate+"';";
               stmt.executeUpdate(sql);
               showMessage("Ticket cancelled successfully...!");
              }catch (SQLException ex) {
               ex.printStackTrace();
            } 
            /*try{
            String url = "jdbc:mysql://localhost:3306/busmanagementsystem";
			String user = "root";
			String password = "Prakhar@123";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection(url, user, password);
               String sql = "delete from tickets where phno='"+id+"' and froms = '"+jComboBoxFrom.getSelectedItem()+"' and destination = '"+jComboBoxDestination.getSelectedItem()+"' and ondate = '"+fullDate+"';";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            }catch (Exception ex) {
            showMessage(ex.getMessage());
            }*/
        }
            
        });
        /*submit.addActionListener(e -> {
        
        });*/
    }                       
    
}
