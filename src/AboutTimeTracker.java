
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EtchedBorder;

public class AboutTimeTracker
	extends JDialog
{
	public AboutTimeTracker(JFrame parent)
		throws UnsupportedEncodingException
	{
		this.setTitle("About...");
		this.setSize(620, 440);
	    this.setLocation(100, 100);
		this.setLocationRelativeTo(parent);
		this.setModal(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		JTabbedPane tabs = new JTabbedPane();

		
		JPanel PD = new JPanel();
		PD.setLayout(new BorderLayout(3, 3));
		PD.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

		JPanel aboutPanel = new JPanel();
		aboutPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		aboutPanel.setLayout(new BorderLayout(3, 3));
		JLabel aboutLabel = new JLabel();
		aboutLabel.setText(
			"<html><body><pre>" +
		     
			"</pre></body></html>");
		aboutLabel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		aboutPanel.add(aboutLabel, BorderLayout.NORTH);

		tabs.add("aboutTimeTracker", aboutPanel);

		this.getContentPane().setLayout(new BorderLayout(0, 0));
		this.getContentPane().add(tabs, BorderLayout.NORTH);

		JPanel closePanel = new JPanel();
		closePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 3, 3));
		JButton closeButon = new JButton("Close");
		closePanel.add(closeButon);
		this.getContentPane().add(closePanel, BorderLayout.SOUTH);

		closeButon.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					AboutTimeTracker.this.setVisible(false);
					AboutTimeTracker.this.dispose();
				}
		});
		
		pack();
	}
}
