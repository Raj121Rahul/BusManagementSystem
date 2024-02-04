package busreservationsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AddStations extends javax.swing.JPanel{
    
    String station;
    
    public AddStations() {
        
        jLabel1 = new javax.swing.JLabel();
        stationTF = new javax.swing.JTextField();
        kmTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel("Enter Km From 1st Stop");
        add = new javax.swing.JButton();


        this.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel1.setText("Add Stations");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 60));


        jLabel2.setText("Enter Station");

        add.setText("Add");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stationTF, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kmTF, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(add))
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stationTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kmTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        setLayout(jPanel1Layout);
        
        add.addActionListener(e -> {
            System.out.println("clicked add....!!");
            station=stationTF.getText();
            System.out.println(stationTF.getText());
            try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/busmanagementsystem", "root", "Prakhar@123");
             Statement stmt = conn.createStatement();
          ) {		      
             System.out.println("Inserting records into the table...");          
             String sql = "INSERT INTO stations VALUES ('"+stationTF.getText()+"',"+Integer.parseInt(kmTF.getText())+");";
             stmt.executeUpdate(sql);
             showMessage("Station Added Successfully.");
             stationTF.setText("");
             kmTF.setText("");
            }catch (SQLException ec) {
             ec.printStackTrace();
          } 
        });
      
    }                  
    
    private void showMessage(String msg) {
            JOptionPane.showMessageDialog(null, msg);
        }
                
    public javax.swing.JButton add;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel temp;
    public javax.swing.JTextField stationTF;
    public javax.swing.JTextField kmTF;
                  
    
}
