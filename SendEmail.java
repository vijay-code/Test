import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
  
public class SendEmail  
{  
 public static void main(String [] args){  
	 
	 Scanner sc=new Scanner(System.in);
	 final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
	  // Get a Properties object
	     Properties props = System.getProperties();
	     props.setProperty("mail.smtp.host", "infrasofttech-com-smtp.mail.na.collabserv.com");
	     props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
	     props.setProperty("mail.smtp.socketFactory.fallback", "false");
	     props.setProperty("mail.smtp.port", "465");
	     props.setProperty("mail.smtp.socketFactory.port", "465");
	     props.put("mail.smtp.auth", "true");
	     props.put("mail.debug", "true");
	     props.put("mail.store.protocol", "pop3");
	     props.put("mail.transport.protocol", "smtp");
	     System.out.println("Please enter the From Email Id ");
	     final String username = "vijay.yadav@infrasofttech.com";
	     final String password = "keepheart@1994";
	     
	     try{
	     Session session = Session.getDefaultInstance(props, 
	                          new Authenticator(){
	                             protected PasswordAuthentication getPasswordAuthentication() {
	                                return new PasswordAuthentication(username, password);
	                             }});

	   // -- Create a new message --
	     Message msg = new MimeMessage(session);

	  // -- Set the FROM and TO fields --
	     msg.setFrom(new InternetAddress("vijay.yadav@infrasofttech.com"));
	     System.out.println("Please enter your mail Id ");
	     String mailTo=sc.nextLine();
	     msg.setRecipients(Message.RecipientType.TO, 
	                      InternetAddress.parse(mailTo,false));
	     msg.setSubject("  Mail Demo From Java Program ");
	    // msg.setContent("Hi", "text/plain");
	   //  msg.setHeader("MyHeader", "MyHeader1");
	 
	    // msg.setText("How are you");
	     String message = "<i>Greetings From Java Mail !</i><br>";
	     message += "<b>Wish you a nice day!</b><br><br><br>";
	        message += "<font color=red>Thanks and Regards ,<br>"
	        		+ "Vijay Yadav</font>";
	     
	     msg.setContent(message, "text/html");
	     
	     
	     msg.setSentDate(new Date());
	     Transport.send(msg);
	     System.out.println("Message sent.");
	  }
	     
	     
	     catch (MessagingException e){
	    	 
	    	 System.out.println("Error" + e);
	     }
	  }
 
}
