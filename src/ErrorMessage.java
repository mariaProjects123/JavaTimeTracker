import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Error Message if wrong info is put in or account is not created yet
	
	public class ErrorMessage {  
	    private static JDialog d;  
	    ErrorMessage() {  
	        JFrame f= new JFrame();  
	        d = new JDialog(f , "Error", true);  
	        d.setLayout( new FlowLayout() );  
	        JButton okButton = new JButton ("OK");  
	        okButton.addActionListener ( new ActionListener()  
	        {  
	            public void actionPerformed( ActionEvent e )  
	            {  
	                ErrorMessage.d.setVisible(false);  
	            }  
	        });  
	        d.add( new JLabel ("Incorrect Email or Password, please try again"));  
	        d.add(okButton);   
	        d.setSize(500,500);    
	        d.setVisible(true);  
	    }  
	    public static void main(String args[])  
	    {  
	        new ErrorMessage();  
	    }  
	}