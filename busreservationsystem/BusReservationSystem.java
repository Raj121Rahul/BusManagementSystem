/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservationsystem;
import java.awt.Dimension;
import javax.swing.*;
/**
 *
 * @author Prakhar Mishra
 */
public class BusReservationSystem{

    public static void main(String[] args) throws Exception {
        
        A o=new A();
        //mailTo ab=new mailTo();
        //ab.sendMail("Prakharmishra135@gmail.com");
                       
        
    }
    
}
class A{

    A(){
        
        //Mainframe_Admin ob=new Mainframe_Admin();
        LogIn ob=new LogIn();
        //UserView ob=new UserView("Prakhar","Mishra","6393012237","Prakhar@gmai.com");
        //Admin ob=new Admin();
        //user ob=new user("Prakhar","Mishra","6393012237","Prakhar@gmai.com");
        //CancelTickets ob=new CancelTickets("6393012237","Prakhar@gmai.com");
        //ForgotPass ob = new ForgotPass();
        //EditDetails ob = new EditDetails("6393012237"); 
        ob.setSize(500,500);
        ob.setBounds(0,0,500,500);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setLocation(0, 0);
        ob.setVisible(true);
        ob.pack();
                       
    }
}