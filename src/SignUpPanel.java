import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTabbedPane;

public class SignUpPanel extends javax.swing.JPanel {
	
	JTabbedPane parentTabs = new JTabbedPane();

    public SignUpPanel(JTabbedPane tabs) {
        initComponents(tabs);
    }
                        
    private void initComponents(JTabbedPane tabs) {
    	
    	parentTabs = tabs;

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        
        jLabel6 = new javax.swing.JLabel();  // error label
        
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); 
        jLabel3.setText("Time Tracker Registration");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Registration - Create an account");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 22));
        jLabel2.setText("Enter Name:");
        
        
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); 
        jLabel6.setBackground(Color.red); 
        jLabel6.setForeground(Color.red); 
        jLabel6.setText("");

        jTextField1.setText("");

        jTextField2.setText("");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 22));
        jLabel4.setText("Enter Password:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 22));
        jLabel5.setText("Enter Email:");

        jTextField3.setText("");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jButton1.setText("Sign up");
        
        
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    		.addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)))
                        .addGap(155, 155, 155)))
                .addContainerGap(339, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                

                
                
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6))
                
                
                
                .addGap(60, 60, 60)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
                


            
                
        );
    }// </editor-fold>                        

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }  
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    	String emailAddress = jTextField2.getText();
    	String password = jTextField1.getText();
    	String userName = jTextField3.getText();
    	
    	System.out.println("You entered email address " + emailAddress);
    	System.out.println("You entered password " + password);
    	System.out.println("You entered username " + userName);
    	
    	DatabaseUtilities du = new DatabaseUtilities();
    	Connection connection = null;
    	
    	ResultSet rs = null;
    	
    	boolean emailExists = false;
    	
    	
    	int userId = 0;
    	    	 	
    	try
	    {
        	connection = du.getDBConnection();
        	
        	String userInsertQuery = "INSERT INTO `timetracker`.`user` (`FirstName`, `UserName`, `CreatedDate`, `UpdatedDate`,`UserEmail` ) VALUES ('"+userName+"','"+userName+"',SYSDATE(),SYSDATE(),'" + emailAddress +"' )" ;


        	
        	
        	boolean isUserInsertWorked = false;
        	
        	
        	// check if email exists         	////////  Start
        	
        	String checkEmailQuery = "SELECT ID FROM timetracker.user where UserEmail = '" + emailAddress + "'";
        	rs = du.getData(checkEmailQuery, connection);
        	
        	while( rs.next() )
    	    {
        		userId = rs.getInt("ID");
        		
        		System.out.println("Email found, failed. @ id " + userId);
        		
        		emailExists = true;
        		
    	    }
    	    // Close the result set, statement and the connection
    	    
        	rs.close() ;
        	
        	// check if email exists         	////////  Start 
        	
        	
        	
        	if(!emailExists) {
        		
        		isUserInsertWorked = du.insertData(userInsertQuery, connection);
            	
            	if(isUserInsertWorked == true ) {
            		
            		System.out.println("Data inserted in user table");
            		
            		
        			
        			// get the inserted id
        			
                	String userQuery = "SELECT ID FROM timetracker.user where FirstName = '" + userName + "' and UserName = '" + userName + "'";
                	rs = du.getData(userQuery, connection);
                	
                	
        			
                	while( rs.next() )
            	    {
                		userId = rs.getInt("ID");
                		
                		System.out.println("Data inserted in user table with id " + userId);
                		
            	    }
            	    // Close the result set, statement and the connection
            	    
                	rs.close() ;
            	    

                	String loginInsertQuery = "INSERT INTO `timetracker`.`login`(`UserEmail`,`Password`,`LastLoginDate`, `user_ID`) VALUES ('"+emailAddress+"','"+password+"',SYSDATE()," + userId + ")";
            		
                	System.out.println("Data inserted in login table");
                	
            		boolean isloginInsertWorked = false;
                	
            		isloginInsertWorked = du.insertData(loginInsertQuery, connection);
            		
            		if(isloginInsertWorked == true) {
            			
            			
            			// Close  the connection
                	    connection.close();
            			
            		}else{
            			System.out.println("Insert failed in login table");
            			// Close  the connection
                	    connection.close();
            		}
            		
            		
            	}else{
        			System.out.println("Insert failed in user table");
        			// Close  the connection
            	    connection.close();
        		}
        		
        		
        	}else {
        		
        		System.out.println("Registration failed");
        		
        	    jTextField1.setText("");
        	    jTextField2.setText("");
        	    jTextField3.setText("");
        	    
        	    if( emailExists = true ) {
        	      jLabel6.setText("Registration failed, email address already exists");
        	    }else {
        	    	jLabel6.setText("Registration failed, please try again");
        	    }
        	    
        	    
        	}
        	
        	
        	
        	   
	    } catch( Exception e ) 	{
		   System.out.println( e ) ;
		}
    }  


    // Variables declaration                      
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    
    private javax.swing.JLabel jLabel6;
    // End of variables declaration                   
}
