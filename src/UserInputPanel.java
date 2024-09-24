import java.sql.Connection;
import java.sql.ResultSet;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.swing.JTabbedPane;

public class UserInputPanel extends javax.swing.JPanel {
	
	JTabbedPane parentTabs = new JTabbedPane();
	public int loggedInUserLocal = 0;

    public int getLoggedInUserLocal() {
		return loggedInUserLocal;
	}



	public void setLoggedInUserLocal(int loggedInUserLocal) {
		this.loggedInUserLocal = loggedInUserLocal;
	}



	/**
     * Creates new form UserInputPanel
     */
    public UserInputPanel(JTabbedPane tabs , int loggedInUser) {
        initComponents(tabs);
        loggedInUserLocal = loggedInUser;
    }

                

   private void initComponents(JTabbedPane tabs) {
	   
	   parentTabs = tabs;

       jLabel1 = new javax.swing.JLabel();
       jLabel2 = new javax.swing.JLabel();
       jLabelExercise = new javax.swing.JLabel();
       jComboBoxSchoolMins = new javax.swing.JComboBox<>();
       jComboBoxSchoolHrs = new javax.swing.JComboBox<>();
       jLabel4 = new javax.swing.JLabel();
       jLabel5 = new javax.swing.JLabel();
       jLabel6 = new javax.swing.JLabel();
       jComboBoxEatingHrs = new javax.swing.JComboBox<>();
       jLabel7 = new javax.swing.JLabel();
       jComboBoxSleepMins = new javax.swing.JComboBox<>();
       jComboBoxWorkHrs = new javax.swing.JComboBox<>();
       jLabel9 = new javax.swing.JLabel();
       jComboBoxWorkMins = new javax.swing.JComboBox<>();
       jLabelSleep = new javax.swing.JLabel();
       jComboBoxSleepHrs = new javax.swing.JComboBox<>();
       jComboBoxEatingMins = new javax.swing.JComboBox<>();
       jLabel11 = new javax.swing.JLabel();
       jLabelEating = new javax.swing.JLabel();
       jComboBoxExerciseHrs = new javax.swing.JComboBox<>();
       jLabel13 = new javax.swing.JLabel();
       jComboBoxExerciseMins = new javax.swing.JComboBox<>();
       jLabelOther = new javax.swing.JLabel();
       jComboBoxOtherHrs = new javax.swing.JComboBox<>();
       jLabel15 = new javax.swing.JLabel();
       jComboBoxOtherMins = new javax.swing.JComboBox<>();
       jButtonSave = new javax.swing.JButton();
       jButtonCalcTimeLeft = new javax.swing.JButton();
       jLabelWork = new javax.swing.JLabel();
       jLabelSchool = new javax.swing.JLabel();
       jLabel16 = new javax.swing.JLabel();
       jLabel17 = new javax.swing.JLabel();
       jLabel18 = new javax.swing.JLabel();
       jLabel19 = new javax.swing.JLabel();

       jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); 
       jLabel1.setText("Time");

       jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48));
       jLabel2.setText("Activities");

       jLabelExercise.setFont(new java.awt.Font("Tahoma", 0, 36)); 
       jLabelExercise.setText("Exercise:");

       jLabel4.setText("Pick Hrs");

       jLabel5.setText("Pick Mins");

       jLabel6.setText("Pick Hrs");

       jLabel7.setText("Pick Mins");

       jLabel9.setText("Pick Mins");

       jLabelSleep.setFont(new java.awt.Font("Tahoma", 0, 36)); 
       jLabelSleep.setText("Sleep:");

       jLabel11.setText("Pick Mins");

       jLabelEating.setFont(new java.awt.Font("Tahoma", 0, 36)); 
       jLabelEating.setText("Eating:");

       jLabel13.setText("Pick Mins");

       jLabelOther.setFont(new java.awt.Font("Tahoma", 0, 36));
       jLabelOther.setText("Other:");

       jLabel15.setText("Pick Mins");

       jButtonSave.setFont(new java.awt.Font("Tahoma", 0, 22)); 
       jButtonSave.setText("Save");

       jButtonCalcTimeLeft.setFont(new java.awt.Font("Tahoma", 0, 22)); 
       jButtonCalcTimeLeft.setText("Calculate Time Left");

       jLabelWork.setFont(new java.awt.Font("Tahoma", 0, 36)); 
       jLabelWork.setText("Work:");

       jLabelSchool.setFont(new java.awt.Font("Tahoma", 0, 36)); 
       jLabelSchool.setText("School:");

       jLabel16.setText("Pick Hrs");

       jLabel17.setText("Pick Hrs");

       jLabel18.setText("Pick Hrs");

       jLabel19.setText("Pick Hrs");
       
       // add items to jComboBoxSchoolHrs
       
       int hrs = 0;
       int mins = 0;
       
       for (int i=0; i<=24; i++) {
       	hrs = hrs + i;
       	//System.out.println(hrs);
       	//System.out.println(i);
       	jComboBoxSchoolHrs.addItem(String.valueOf(hrs));
       	hrs = 0;
       }
       
       for (int i=0; i<=59; i++) {
       	mins = mins + i;
       	//System.out.println(mins);
       	//System.out.println(i);
       	jComboBoxSchoolMins.addItem(String.valueOf(mins));
       	mins = 0;
       }
       
       for (int i=0; i<=24; i++) {
         hrs = hrs + i;
         //System.out.println(hrs);
         //System.out.println(i);
         jComboBoxWorkHrs.addItem(String.valueOf(hrs));
         hrs = 0;
       }
          
       for (int i=0; i<=59; i++) {
         mins = mins + i;
         //System.out.println(mins);
         //System.out.println(i);
         jComboBoxWorkMins.addItem(String.valueOf(mins));
         mins = 0;
       }
        
        for (int i=0; i<=24; i++) {
         hrs = hrs + i;
         //System.out.println(hrs);
         //System.out.println(i);
         jComboBoxSleepHrs.addItem(String.valueOf(hrs));
         hrs = 0;
        }
           
        for (int i=0; i<=59; i++) {
         mins = mins + i;
         //System.out.println(mins);
        // System.out.println(i);
         jComboBoxSleepMins.addItem(String.valueOf(mins));
         mins = 0;
        }
        for (int i=0; i<=24; i++) {
         hrs = hrs + i;
         //System.out.println(hrs);
         ///System.out.println(i);
         jComboBoxExerciseHrs.addItem(String.valueOf(hrs));
         hrs = 0;
        }
            
        for (int i=0; i<=59; i++) {
         mins = mins + i;
         //System.out.println(mins);
         //System.out.println(i);
         jComboBoxExerciseMins.addItem(String.valueOf(mins));
         mins = 0;
        }
         
        for (int i=0; i<=24; i++) {
         hrs = hrs + i;
         //System.out.println(hrs);
         //System.out.println(i);
         jComboBoxEatingHrs.addItem(String.valueOf(hrs));
         hrs = 0;
         }
             
         for (int i=0; i<=59; i++) {
          mins = mins + i;
          //System.out.println(mins);
          //System.out.println(i);
          jComboBoxEatingMins.addItem(String.valueOf(mins));
          mins = 0;
         }
         for (int i=0; i<=24; i++) {
          hrs = hrs + i;
          //System.out.println(hrs);
          //System.out.println(i);
          jComboBoxOtherHrs.addItem(String.valueOf(hrs));
          hrs = 0;
          }
              
          for (int i=0; i<=59; i++) {
           mins = mins + i;
           //System.out.println(mins);
           //System.out.println(i);
           jComboBoxOtherMins.addItem(String.valueOf(mins));
           mins = 0;
          }   
         

          
          jButtonSave.addActionListener(new java.awt.event.ActionListener() {
              public void actionPerformed(java.awt.event.ActionEvent evt) {
            	  jButtonSaveActionPerformed(evt);
              }
          });
          

          jButtonCalcTimeLeft.addActionListener(new java.awt.event.ActionListener() {
              public void actionPerformed(java.awt.event.ActionEvent evt) {
            	  jButtonCalcTimeActionPerformed(evt);
              }
          });
          
       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
       this.setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addContainerGap(428, Short.MAX_VALUE)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(layout.createSequentialGroup()
                       .addComponent(jLabel2)
                       .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                   .addGroup(layout.createSequentialGroup()
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(jButtonCalcTimeLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGroup(layout.createSequentialGroup()
                               .addGap(12, 12, 12)
                               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                   .addComponent(jLabelExercise)
                                   .addComponent(jLabelSleep)
                                   .addComponent(jLabelEating)
                                   .addComponent(jLabelOther)
                                   .addComponent(jLabelWork)
                                   .addComponent(jLabelSchool))
                               .addGap(40, 40, Short.MAX_VALUE)
                               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                       .addComponent(jLabel19)
                                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                       .addComponent(jComboBoxOtherHrs, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                       .addComponent(jLabel18)
                                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                       .addComponent(jComboBoxEatingHrs, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                       .addComponent(jLabel17)
                                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                       .addComponent(jComboBoxExerciseHrs, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                       .addComponent(jLabel16)
                                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                       .addComponent(jComboBoxSleepHrs, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                       .addComponent(jLabel6)
                                       .addGap(28, 28, 28)
                                       .addComponent(jComboBoxWorkHrs, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                       .addComponent(jLabel4)
                                       .addGap(28, 28, 28)
                                       .addComponent(jComboBoxSchoolHrs, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                       .addGap(1, 1, 1)
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                               .addGroup(layout.createSequentialGroup()
                                   .addComponent(jLabel5)
                                   .addGap(18, 18, 18)
                                   .addComponent(jComboBoxSchoolMins, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                               .addGroup(layout.createSequentialGroup()
                                   .addComponent(jLabel7)
                                   .addGap(18, 18, 18)
                                   .addComponent(jComboBoxWorkMins, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                               .addGroup(layout.createSequentialGroup()
                                   .addGap(4, 4, 4)
                                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                       .addComponent(jLabel9)
                                       .addComponent(jLabel11)
                                       .addComponent(jLabel13)
                                       .addComponent(jLabel15))
                                   .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                       .addComponent(jComboBoxEatingMins, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                       .addComponent(jComboBoxSleepMins, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                       .addComponent(jComboBoxExerciseMins, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                       .addComponent(jComboBoxOtherMins, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                               .addComponent(jLabel1)
                               .addGap(144, 144, 144))
                           .addComponent(jButtonSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                       .addGap(296, 296, 296))))
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addGap(128, 128, 128)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel1)
                   .addComponent(jLabel2))
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(layout.createSequentialGroup()
                       .addGap(35, 35, 35)
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                           .addComponent(jComboBoxSchoolHrs, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jComboBoxSchoolMins, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabel4)
                           .addComponent(jLabel5))
                       .addGap(17, 17, 17))
                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(jLabelSchool)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                   .addGroup(layout.createSequentialGroup()
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                           .addComponent(jComboBoxWorkHrs, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jComboBoxWorkMins, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabel6)
                           .addComponent(jLabel7))
                       .addGap(27, 27, 27)
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                           .addComponent(jLabel9)
                           .addComponent(jComboBoxSleepMins, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                       .addGap(18, 18, 18))
                   .addGroup(layout.createSequentialGroup()
                       .addComponent(jLabelWork)
                       .addGap(23, 23, 23)
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                           .addComponent(jComboBoxSleepHrs, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabelSleep)
                           .addComponent(jLabel16))
                       .addGap(10, 10, 10)))
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabelExercise)
                   .addComponent(jLabel11)
                   .addComponent(jComboBoxExerciseHrs, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jComboBoxExerciseMins, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jLabel17))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jComboBoxEatingHrs, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jLabel13)
                   .addComponent(jComboBoxEatingMins, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jLabelEating)
                   .addComponent(jLabel18))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabelOther)
                   .addComponent(jComboBoxOtherHrs, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jLabel15)
                   .addComponent(jComboBoxOtherMins, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jLabel19))
               .addGap(62, 62, 62)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jButtonCalcTimeLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addContainerGap(145, Short.MAX_VALUE))
       );
   }                        

   private void jButtonCalcTimeActionPerformed(java.awt.event.ActionEvent evt) {                                       
       // TODO add your handling code here:
	   System.out.println("Calc clicked");
	   
	   
	   int totalRemainingHrs = TimeTracker.getTotalMinutesRemaining()/60;
	   int totalRemainingMinutes = TimeTracker.getTotalMinutesRemaining()%60;
	   
	   System.out.println("The total remaining hours are: " +totalRemainingHrs);
	   System.out.println("The total remaining minutes are: " +totalRemainingMinutes);
	   
	   
	   System.out.println("Total Minutes Used : " +  TimeTracker.getTotalMinutesUsed());
	   System.out.println("Total Minutes Remaining : " +  TimeTracker.getTotalMinutesRemaining() );
	   
	   
	   
	   TimeTracker.setTotalCalcRemainingHrs(totalRemainingHrs);
	   TimeTracker.setTotalCalcRemainingMins(totalRemainingMinutes);
	   
	   parentTabs.setSelectedIndex(4);
	   
	   
   }
   
   private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {                                       
       // TODO add your handling code here:
	   System.out.println("Saved clicked");
	   
	   int schoolhrs = Integer.parseInt(jComboBoxSchoolHrs.getSelectedItem().toString());
	   int schoolmins = Integer.parseInt(jComboBoxSchoolMins.getSelectedItem().toString());
	   
	   int workhrs = Integer.parseInt(jComboBoxWorkHrs.getSelectedItem().toString());
	   int workmins = Integer.parseInt(jComboBoxWorkMins.getSelectedItem().toString());
	   
	   int sleephrs = Integer.parseInt(jComboBoxSleepHrs.getSelectedItem().toString());
	   int sleepmins = Integer.parseInt(jComboBoxSleepMins.getSelectedItem().toString());
	   
	   int exercisehrs = Integer.parseInt(jComboBoxExerciseHrs.getSelectedItem().toString());
	   int exercisemins = Integer.parseInt(jComboBoxExerciseMins.getSelectedItem().toString());
	   
	   int eatinghrs = Integer.parseInt(jComboBoxEatingHrs.getSelectedItem().toString());
	   int eatingmins = Integer.parseInt(jComboBoxEatingMins.getSelectedItem().toString());
	   
	   int otherhrs = Integer.parseInt(jComboBoxOtherHrs.getSelectedItem().toString());
	   int othermins = Integer.parseInt(jComboBoxOtherMins.getSelectedItem().toString());
	   
	   
	   DatabaseUtilities du = new DatabaseUtilities();
   	   Connection connection = null;
   	
   	   ResultSet rs = null;
   	   
   	   boolean isUserActivityInsertWorked = false;
	
	
   	
     	try
	    {
       	    connection = du.getDBConnection();
       	    
       	 
       	   loggedInUserLocal = TimeTracker.loggedInUserId;
       	   
       	   
       	   System.out.println("You entered schoolhrs " + schoolhrs);
    	   System.out.println("You entered schoolmins " + schoolmins);
    	   
    	   System.out.println("You entered workhrs " + workhrs);
    	   System.out.println("You entered workmins " + workmins);
    	   
    	   System.out.println("You entered sleephrs " + sleephrs);
    	   System.out.println("You entered sleepmins " + sleepmins);
    	   
    	   System.out.println("You entered exercisehrs " + exercisehrs);
    	   System.out.println("You entered exercisemins " + exercisemins);
    	   
    	   System.out.println("You entered eatinghrs " + eatinghrs);
    	   System.out.println("You entered eatingmins " + eatingmins);
    	   
    	   System.out.println("You entered otherhrs " + otherhrs);
    	   System.out.println("You entered othermins " + othermins);
    	   
    	   System.out.println("You entered loggedInUserLocal " + loggedInUserLocal);
    	   
    	   int totalMinutes = schoolhrs * 60 + schoolmins + workhrs * 60 + workmins + sleephrs * 60 + sleepmins 
    			   + exercisehrs * 60 + exercisemins + eatinghrs * 60 + eatingmins + otherhrs * 60 + othermins;
    	   
    	   TimeTracker.setTotalMinutesUsed(totalMinutes);
    	   
    	   TimeTracker.setTotalMinutesRemaining(TimeTracker.getMaxMinutesInaDay() - TimeTracker.getTotalMinutesUsed());
    	   
    	   
    	   SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss a", Locale.ENGLISH);
    	   formatter.setTimeZone(TimeZone.getTimeZone("America/New_York"));

    	   Calendar cal = Calendar.getInstance();
    	   
    	   Date myDate = cal.getTime();
    	   
    	   String formattedDateString = formatter.format(myDate);
    	   
    	   
    	   TimeTracker.setCalcDate(formattedDateString.toString());
    	   
    	   System.out.println("You entered date  " + formattedDateString);
    	
       	    
       	    String userActivityInsertQuery = "INSERT INTO `timetracker`.`user_activities` (`activity_date`, `school_hrs`, `school_mins`, `work_hrs`,"
       	 		+ "`work_mins`,`sleep_hrs`,`sleep_mins`,`exercise_hrs`,`exercise_mins`,`eating_hrs`,`eating_mins`,`other_hrs`,`other_mins`,`user_ID`) "
       	 		+ "VALUES (SYSDATE(), '"+schoolhrs +"','" + schoolmins +"','" + workhrs +"','" + workmins +"','" + sleephrs +"','" + sleepmins +"','" 
       	 		+ exercisehrs +"','" + exercisemins +"','" + eatinghrs +"','" + eatingmins +"','" + otherhrs +"','" + othermins +"'," + loggedInUserLocal +  " )" ;
       	    
       	    isUserActivityInsertWorked = du.insertData(userActivityInsertQuery, connection);
       	    
       	    if(isUserActivityInsertWorked == true) {
       	    	
       	    	
       		 //parentTabs.setEnabledAt(3, true);
       		 parentTabs.setEnabledAt(4, true);
	    	 
	    	 parentTabs.setSelectedIndex(2);
 			
 			
	 			// Close  the connection
	     	    connection.close();
	 			
	 		}else{
	 			System.out.println("Insert failed in user activity6 table");
	 			// Close  the connection
	     	    connection.close();
	 		}
 		
       	 
       	 
       	   
	    } catch( Exception e ) 	{
		   System.out.println( e ) ;
		}
	   
	   
   }  

   // Variables declaration                     
   private javax.swing.JButton jButtonCalcTimeLeft;
   private javax.swing.JButton jButtonSave;
   private javax.swing.JComboBox<String> jComboBoxEatingHrs;
   private javax.swing.JComboBox<String> jComboBoxEatingMins;
   private javax.swing.JComboBox<String> jComboBoxExerciseHrs;
   private javax.swing.JComboBox<String> jComboBoxExerciseMins;
   private javax.swing.JComboBox<String> jComboBoxOtherHrs;
   private javax.swing.JComboBox<String> jComboBoxOtherMins;
   private javax.swing.JComboBox<String> jComboBoxSchoolHrs;
   private javax.swing.JComboBox<String> jComboBoxSchoolMins;
   private javax.swing.JComboBox<String> jComboBoxSleepHrs;
   private javax.swing.JComboBox<String> jComboBoxSleepMins;
   private javax.swing.JComboBox<String> jComboBoxWorkHrs;
   private javax.swing.JComboBox<String> jComboBoxWorkMins;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel11;
   private javax.swing.JLabel jLabel13;
   private javax.swing.JLabel jLabel15;
   private javax.swing.JLabel jLabel16;
   private javax.swing.JLabel jLabel17;
   private javax.swing.JLabel jLabel18;
   private javax.swing.JLabel jLabel19;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JLabel jLabelEating;
   private javax.swing.JLabel jLabelExercise;
   private javax.swing.JLabel jLabelOther;
   private javax.swing.JLabel jLabelSchool;
   private javax.swing.JLabel jLabelSleep;
   private javax.swing.JLabel jLabelWork;
   // End of variables declaration                   
}
