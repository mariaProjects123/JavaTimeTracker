
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.UnsupportedEncodingException;

import javax.swing.ImageIcon;

import javax.swing.JFrame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;

public class TimeTracker extends JFrame {
	
	private JMenuItem menuItemExit;
    private JMenuItem menuItemAbout;
    
    // list of panels
    public LoginPagePanel loginPagePanel;
    public SignUpPanel    signUpPanel;
    public UserInputPanel userInputPanel;
    public DashboardPanel dashboardPanel;
    public TimeLeftPanel timeLeftPanel;
    

	JTabbedPane tabs;
    
    public static int loggedInUserId = 0;
    public static String userName = "";
    public static String  userEmail = "";
    
    public static int totalMinutesUsed = 0;
    
	public static int totalMinutesRemaining = 0;
	public static int maxMinutesInaDay = 1440;
	
	
	public static int totalCalcRemainingHrs = 0;
	public static int totalCalcRemainingMins = 0;
	
	public static String calcDate = new String();
	
	public static String getCalcDate() {
		return calcDate;
	}


	public static void setCalcDate(String calcDate) {
		TimeTracker.calcDate = calcDate;
	}


	public static int getTotalCalcRemainingHrs() {
		return totalCalcRemainingHrs;
	}


	public static void setTotalCalcRemainingHrs(int totalCalcRemainingHrs) {
		TimeTracker.totalCalcRemainingHrs = totalCalcRemainingHrs;
	}


	public static int getTotalCalcRemainingMins() {
		return totalCalcRemainingMins;
	}


	public static void setTotalCalcRemainingMins(int totalCalcRemainingMins) {
		TimeTracker.totalCalcRemainingMins = totalCalcRemainingMins;
	}


	
       
    
    
    public static String getUserName() {
		return userName;
	}


	public static void setUserName(String userName) {
		TimeTracker.userName = userName;
	}

    public static String getUserEmail() {
		return userEmail;
	}


	public static void setUserEmail(String userEmail) {
		TimeTracker.userEmail = userEmail;
	}


	public static int getLoggedInUserId() {
		return loggedInUserId;
	}


	public static void setLoggedInUserId(int loggedInUserId) {
		TimeTracker.loggedInUserId = loggedInUserId;
	}
	
	
	public static int getTotalMinutesUsed() {
		return totalMinutesUsed;
	}


	public static void setTotalMinutesUsed(int totalMinutesUsed) {
		TimeTracker.totalMinutesUsed = totalMinutesUsed;
	}


	public static int getTotalMinutesRemaining() {
		return totalMinutesRemaining;
	}


	public static void setTotalMinutesRemaining(int totalMinutesRemaining) {
		TimeTracker.totalMinutesRemaining = totalMinutesRemaining;
	}


	public static int getMaxMinutesInaDay() {
		return maxMinutesInaDay;
	}


	public static void setMaxMinutesInaDay(int maxMinutesInaDay) {
		TimeTracker.maxMinutesInaDay = maxMinutesInaDay;
	}





	public TimeTracker() {
		
		super("Time Tracker 1.0");
		
		ClassLoader cl = this.getClass().getClassLoader();
		
		this.setIconImage(new ImageIcon(cl.getResource("timetracker.jpg")).getImage());
		
		this.setSize(new Dimension(1224, 968));
		
		// Add Menu
		
		JMenuBar mb = new JMenuBar();
	    JMenu timeTrackerMenu = new JMenu("TimeTracker");
	    timeTrackerMenu.setMnemonic(KeyEvent.VK_M);
	    int accelaratorKeyMask = Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask();
	    timeTrackerMenu.add(menuItemAbout = new JMenuItem("About...", KeyEvent.VK_T));
	    menuItemAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, accelaratorKeyMask));
	    timeTrackerMenu.addSeparator();
	    timeTrackerMenu.add(menuItemExit = new JMenuItem("Quit", KeyEvent.VK_Q));
	    menuItemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, accelaratorKeyMask));
	    mb.add(timeTrackerMenu);
	    
	    this.setJMenuBar(mb);
	    
	    
	    // Add tabs
	    
	    Container contentPane = this.getContentPane();
	    
	    tabs = new JTabbedPane();
        Font oldTabFont = tabs.getFont();
        Font newTabFont  = new Font(oldTabFont.getName(), Font.BOLD | Font.ITALIC, oldTabFont.getSize() * 57 / 50);
        tabs.setFont(newTabFont);
        tabs.addTab("Sign up Screen ",
      		  new ImageIcon(cl.getResource("signup_small.png")),
      		  signUpPanel = new SignUpPanel(tabs));
        tabs.addTab("Login Screen ",
        		    new ImageIcon(cl.getResource("userlogin_small.png")),
        		    loginPagePanel = new LoginPagePanel(tabs,loggedInUserId));
       tabs.addTab("Dashboard ",
        		  new ImageIcon(cl.getResource("dashboard_small.png")),
        		  dashboardPanel = new DashboardPanel(tabs,loggedInUserId));
       tabs.addTab("Enter Activities ",
        		  new ImageIcon(cl.getResource("user_time_input_small.png")),
        		  userInputPanel = new UserInputPanel(tabs,loggedInUserId));
        
        tabs.addTab("Time Left",
        		  new ImageIcon(cl.getResource("time_left_small.png")),
        		  timeLeftPanel = new TimeLeftPanel(tabs,loggedInUserId));
        
        
        tabs.setEnabledAt(2, false);
        tabs.setEnabledAt(3, false);
        tabs.setEnabledAt(4, false);
        
        
        contentPane.add(tabs);
       
        this.setSize(new Dimension(1224, 968));
        
        
	    
	    
	    
	    
	    // Add listeners etc.
        menuItemExit.addActionListener(
            new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                	TimeTracker.this.exitProgram();
                }
            }
        );
        
        menuItemAbout.addActionListener(
            new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                	try
                	{
                		AboutTimeTracker ad = new AboutTimeTracker(TimeTracker.this);
                		ad.setVisible(true);
                	} catch (UnsupportedEncodingException uee)
                	{
                		uee.printStackTrace();
                	}
                }
            }
        );
	}


	public void exitProgram()
    {
        System.out.println("Exiting ...");

        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        
        TimeTracker.this.setVisible(false);
        TimeTracker.this.dispose();

        System.exit(0);
    }
	

}
