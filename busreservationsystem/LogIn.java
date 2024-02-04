/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservationsystem;
import java.awt.Checkbox;
import java.sql.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
/**
 *
 * @author Prakhar
 */
public class LogIn extends JFrame{
    
    private JTextField tf[] = new JTextField[2];
    private JLabel lbl[] = new JLabel[2];
    private String lblText[] = {"ID", "Passward"};
    private int x = 300;
    private int y = 60;
    int width = 150;
    int height = 30;
    
    LogIn(){
        
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMinimumSize(new java.awt.Dimension(500, 550));
    setLocation(200, 100);
    JLabel heading = new JLabel();
    heading.setBounds(200, 10, 400, 30);
    heading.setText("<html><h1 style='color:blue'>Welcome</h1></html>");
    add(heading);
    for (int i = 0; i < tf.length; i++) {
    tf[i] = new JTextField();
    tf[i].setBounds(x, y, width, height);

    lbl[i] = new JLabel();
    lbl[i].setBounds(x - 250, y, width, height);
    lbl[i].setText(lblText[i]);

    y += 40;
    add(lbl[i]);
    add(tf[i]);
    
    }
    JButton login = new JButton("LOG IN");
    login.setBounds(120, 240, 80, height);
    add(login);
    JButton create = new JButton("Create Account");
    create.setBounds(220, 240, 130, height);
    add(create);
    JButton edit = new JButton("Forgot Passward");
    edit.setBounds(160, 280, 130, height);
    add(edit);
    JRadioButton c1= new JRadioButton();  
    JRadioButton c2= new JRadioButton();
    ButtonGroup buttons = new ButtonGroup();
    JLabel admin = new JLabel();
    admin.setBounds(150, y+40, width, height);
    admin.setText("Admin");
    add(admin);
    add(c1);
    c1.setBounds(200,y+40,20,20);
    JLabel users = new JLabel();
    users.setBounds(250, y+40, width, height);
    users.setText("user");
    add(users);
    add(c2);
    c2.setBounds(300,y+40,20,20);
    buttons.add(c1);
    buttons.add(c2);
    JPanel j=new JPanel();
    add(j);
    try{
    login.addActionListener(e -> {
    if (isFieldEmpty()) {
        showMessage("Plese fill all the fields");
    } else {
        if(c1.isSelected()==true){
            try{
            String url = "jdbc:mysql://localhost:3306/busmanagementsystem";
			String user = "root";
			String password = "malarahul";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "select phno from admins where phno='" + tf[0].getText() + "' and passward='" + tf[1].getText() + "';";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if(rs.next() == false){
                showMessage("Something went wrong");
                System.out.print("No records found in table");
            }
            else{ 
                Admin ob=new Admin();
                ob.setSize(700,550);
                ob.setBounds(0,0,700,550);
                ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ob.setLocation(0, 0);
                ob.setVisible(true);
                ob.pack();
                showMessage("Admin Log-in successfully");
            }
            }
            catch(Exception g){
                g.getStackTrace();
                System.out.print(g);
            }

            
        }
        if(c2.isSelected()==true){
            try{
            String url = "jdbc:mysql://localhost:3306/busmanagementsystem";
			String user = "root";
			String password = "Prakhar@123";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "select fname,lname,phno,email from users where phno='" + tf[0].getText() + "' and passward='" + tf[1].getText() + "';";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if(rs.next() == false){
                showMessage("Something went wrong");
                System.out.print("No records found in table");
            }
            else{
                UserView ob=new UserView(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
                ob.setSize(700,550);
                ob.setBounds(0,0,700,550);
                ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ob.setLocation(0, 0);
                ob.setVisible(true);
                ob.pack();
                showMessage("User Log-in successfully");
            }
            }
            catch(Exception g){
                g.getStackTrace();
                System.out.print(g);
            }
        }
        
        }
        });

        } 
        catch (Exception ex) {
        showMessage(ex.getMessage());
        }
        create.addActionListener(e -> {
            
            CreateAcc ob=new CreateAcc();
            ob.setSize(500,500);
            ob.setBounds(0,0,500,500);
            //ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ob.setLocation(0, 0);
            ob.setVisible(true);
            ob.pack();
            
        });
        edit.addActionListener(e -> {
            
            ForgotPass ob=new ForgotPass();
            ob.setSize(500,500);
            ob.setBounds(0,0,500,500);
            //ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ob.setLocation(0, 0);
            ob.setVisible(true);
            ob.pack();
            
        });
        }

        private boolean isFieldEmpty() {
            boolean b = true;
            for (int i = 0; i < tf.length; i++) {
                if (tf[i].getText().isEmpty()) {
                b = true;
                }
                else {
                b = false;
                }
            }
            return b;
        }
        private void showMessage(String msg) {
            JOptionPane.showMessageDialog(null, msg);
        }

    }
