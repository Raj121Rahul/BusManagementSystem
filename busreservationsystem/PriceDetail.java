package busreservationsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class PriceDetail extends javax.swing.JPanel{
    
    String[] station = new String[14];
    int initS[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0},finalS[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int i=0,j=0,total;
    
    PriceDetail(){
    
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
                " From ", " To ", "Money in Rs"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
        this.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );          
        
        for(i=0;i<station.length;i++){  
            for(j=0;j<station.length;j++){
                
               if(i==j){
                   continue;
               }
               
               total=initS[i]-finalS[j];
               if(total<0){
                   total=total*(-1);
               }
               javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
               model.addRow(new Object[] {station[i],station[j],Integer.toString(total*3)});
               //System.out.println(station[i]+" -> "+station[j]+" = "+(total*3)+" Rs");
                
            }
        }
    }
    
    void con(){
        try{
            String url = "jdbc:mysql://localhost:3306/busmanagementsystem";
			String user = "root";
			String password = "Prakhar@123";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "select * from stations;";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if(rs.next() == false){
                showMessage("Something went wrong");
                System.out.print("No records found in table");
            }
            else{ 
                do{  
                    //System.out.println(rs.getString(1));
                    station[i]=rs.getString(1);
                    //System.out.println(rs.getString(2));
                    finalS[i]=Integer.valueOf(rs.getString(2));
                    initS[i]=finalS[i];
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
