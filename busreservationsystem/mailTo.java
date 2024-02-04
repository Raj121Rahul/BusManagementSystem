/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busreservationsystem;

import java.lang.System.Logger;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import java.util.*;
import java.util.logging.Level;

public class mailTo {

	public static void sendMail(String recepient) throws Exception {
            
                System.out.println("Preparing to send mail'");
		//String username = "singhhritik092000@gmail.com";
                String username = "sparksfoundationdonation@gmail.com";
		String password = "Prakhar@135";
                
                final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
 // Get a Properties object
                Properties props = System.getProperties();
                props.setProperty("mail.smtp.host", "smtp.live.com");
                props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
                props.setProperty("mail.smtp.socketFactory.fallback", "false");
                props.setProperty("mail.smtp.port", "587");
                props.setProperty("mail.smtp.starttls.enable","true");
                props.setProperty("mail.smtp.socketFactory.port", "587");
                props.put("mail.smtp.auth", "true");
                props.put("mail.debug", "true");
                props.put("mail.smtp.ssl.protocols", "TLSv1.2");
                props.put("mail.store.protocol", "pop3");
                System.setProperty("mail.pop3s.ssl.protocols", "TLSv1.2");
                props.put("mail.transport.protocol", "smtp");
                
                try{
                  Session session = Session.getDefaultInstance(props, 
                                      new Authenticator(){
                                         protected PasswordAuthentication getPasswordAuthentication() {
                                            return new PasswordAuthentication(username, password);
                                         }});

               // -- Create a new message --
                  Message msg = new MimeMessage(session);

               // -- Set the FROM and TO fields --
                  msg.setFrom(new InternetAddress(username));
                  msg.setRecipients(Message.RecipientType.TO, 
                                    InternetAddress.parse(recepient,false));
                  msg.setSubject("Hello");
                  msg.setText("How are you");
                  msg.setSentDate(new Date());
                  Transport transport = session.getTransport("smtps");
                  transport.connect ("smtp.live.com", 587,username,password);
                  transport.sendMessage(msg,msg.getAllRecipients());
                  transport.close();
                  System.out.println("Message sent.");
                }catch (MessagingException e){ 
                  System.out.println("Error, cz: " + e);
                }
             

                /*
		Properties props = new Properties();			
		props.put("mail.smtp.auth", "true");			
		props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.debug", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		props.put("mail.smtp.port", "25");			
                
                System.out.println("Creating Session");
		Session session = Session.getInstance(props,
		new javax.mail.Authenticator() {
			@Override
			//override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {			
				return new PasswordAuthentication(username,password);
			}
		});
                
                Message message = prepareMessage(session, username,recepient);
                Transport.send(message);
                System.out.println("Message sent successfully");
                
        }
		private static Message prepareMessage(Session session, String username, String recepient) {
		    try{
                        
                        System.out.println("In Prapare Message");
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(recepient));
			message.setSubject("hello");
			message.setText("Yo it has been sent");

			return message;
                        
		} catch (Exception e) {
                    System.out.println("fail");
                    throw new RuntimeException(e);
                    //Logger.grtLogger(mailTo.class.getName().log(Level.SEVERE,null,e));
		}*/

	}
}
