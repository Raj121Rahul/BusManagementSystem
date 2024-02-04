package busreservationsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ViewStations extends javax.swing.JPanel{
    
    String[] station = new String[13];
    int i=0;
    
    ViewStations(){
    
        con();
        
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTextField1.setText("jTextField1");

        this.setBackground(new java.awt.Color(255, 204, 204));
        this.setAutoscrolls(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                " Stations "
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
        this.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180 , javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(365, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );          
        
        for(i=0;i<13;i++){  
            
               javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
               model.addRow(new Object[] {station[i]});
               System.out.println(station[i]);
                
        }
        
    }
    
    void con(){
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
    private void showMessage(String msg) {
            JOptionPane.showMessageDialog(null, msg);
        }
    
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
}
