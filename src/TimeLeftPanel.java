import javax.swing.JTabbedPane;

public class TimeLeftPanel extends javax.swing.JPanel {
	
	JTabbedPane parentTabs = new JTabbedPane();
	public int loggedInUserLocal = 0;
	
	 String calDateFromSuper = new String();
     
	
	 public String getCalDateFromSuper() {
		return calDateFromSuper;
	}



	public void setCalDateFromSuper(String calDateFromSuper) {
		this.calDateFromSuper = calDateFromSuper;
	}



	public int getLoggedInUserLocal() {
			return loggedInUserLocal;
		}



		public void setLoggedInUserLocal(int loggedInUserLocal) {
			this.loggedInUserLocal = loggedInUserLocal;
		}
		

    public TimeLeftPanel(JTabbedPane tabs , int loggedInUser) {
        initComponents(tabs);
        loggedInUserLocal = loggedInUser;
    }
                      
    private void initComponents(JTabbedPane tabs) {
    	parentTabs = tabs;

        jLabelTimeLeftScreen = new javax.swing.JLabel();
        jLabelDate01 = new javax.swing.JLabel();
        jLabelHoursLeft = new javax.swing.JLabel();
        jLabelTotalHoursLeftText = new javax.swing.JLabel();
        jLabelMinutesLeft2 = new javax.swing.JLabel();
        jLabelTotalMinutesLeftText = new javax.swing.JLabel();
        jLabelDateText2 = new javax.swing.JLabel();

        setToolTipText("abc");
        setName("-"); 

        jLabelTimeLeftScreen.setFont(new java.awt.Font("Tahoma", 1, 48)); 
        jLabelTimeLeftScreen.setText("Time Left in the Day");

        jLabelDate01.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        jLabelDate01.setText("Date:");

        jLabelHoursLeft.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        jLabelHoursLeft.setText("Hours Left:");

        jLabelTotalHoursLeftText.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        
        
        //jLabelTotalHoursLeftText.setText("Hello World01");

        jLabelMinutesLeft2.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        jLabelMinutesLeft2.setText("Minutes Left:");

        jLabelTotalMinutesLeftText.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        //jLabelTotalMinutesLeftText.setText("Hello World02");

        jLabelDateText2.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        
        
       
        
        
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        
        //

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMinutesLeft2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTotalMinutesLeftText, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDate01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDateText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelHoursLeft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTotalHoursLeftText, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelTimeLeftScreen))
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabelTimeLeftScreen)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDate01)
                    .addComponent(jLabelDateText2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHoursLeft)
                    .addComponent(jLabelTotalHoursLeftText))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMinutesLeft2)
                    .addComponent(jLabelTotalMinutesLeftText))
                .addContainerGap(283, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

                    
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {                                    
        // TODO add your handling code here:
    	
    	System.out.println( "Component shown" ) ;
    	
    	jLabelDateText2.setText(TimeTracker.getCalcDate());
    	
    	jLabelTotalHoursLeftText.setText(TimeTracker.getTotalCalcRemainingHrs() + "");
    	
    	jLabelTotalMinutesLeftText.setText(TimeTracker.getTotalCalcRemainingMins() + "");
    	
    	 
    	 System.out.println( "After setting date " + TimeTracker.getCalcDate() ) ;
    
    }    
    

    // Variables declaration                      
    private javax.swing.JLabel jLabelDate01;
    private javax.swing.JLabel jLabelDateText2;
    private javax.swing.JLabel jLabelHoursLeft;
    private javax.swing.JLabel jLabelMinutesLeft2;
    private javax.swing.JLabel jLabelTimeLeftScreen;
    private javax.swing.JLabel jLabelTotalHoursLeftText;
    private javax.swing.JLabel jLabelTotalMinutesLeftText;
    // End of variables declaration                   
}