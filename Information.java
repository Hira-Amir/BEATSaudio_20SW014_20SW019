package dev.roshan.baaja;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Information 
{
	JFrame infoFrame;
	Image imageBaaja, imageLogo,imageClose;
	ImageIcon iconBaaja, iconLogo, iconClose;
	JButton btnLogo, btnClose;
	
	MoveMouseListener mmlInfoObj;
	
	public void infoframe() //Info
	{
		infoFrame=new JFrame("Info");
		infoFrame.setSize(700,500);
		infoFrame.setUndecorated(true);
		infoFrame.setOpacity(0.9f);
		infoFrame.setLocationRelativeTo(null);
		infoFrame.setLayout(null);
		infoFrame.getContentPane().setBackground(new Color(176,224,230));
		
		iconBaaja  = new ImageIcon("src/assets/logo.jpeg");
		imageBaaja = iconBaaja.getImage();
		iconBaaja.setImage(imageBaaja);
		infoFrame.setIconImage(imageBaaja);
		
		
		////////////////////////////icon_Logo starts here ////////////////////////////////////
		iconLogo = new ImageIcon("src/assets/logo.png");
		imageLogo = iconLogo .getImage();
		imageLogo  = imageLogo .getScaledInstance(39,39, Image.SCALE_SMOOTH);
		iconLogo .setImage(imageLogo );
		//////////////////////////// icon_Logo closed here /////////////////////////////////////
		
		btnLogo = new JButton();
		btnLogo.setBounds(5, 5, 40, 40);
		btnLogo.setFont(new Font("Times New Roman",Font.BOLD,9));
		btnLogo.setFocusPainted(false);
		btnLogo.setBorderPainted(false);
		btnLogo.setContentAreaFilled(false);
		btnLogo.setBackground(Color.black);
		btnLogo.setIcon(iconLogo);
		btnLogo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
		
			}          
		});
		
//		pnlInfoHdr.add(btnLogo);
		
		
		btnClose = new JButton();
		btnClose.setBounds(650, 10, 40, 40);
		btnClose.setFont(new Font("Times New Roman",Font.BOLD,9));
		btnClose.setFocusPainted(false);
		btnClose.setBorderPainted(false);
		btnClose.setContentAreaFilled(false);
		btnClose.setToolTipText("Close");
		btnClose.setBackground(Color.black);
		btnClose.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
		    {
					infoFrame.dispose();
		    }          
		});
		
		////////////////////////////icon_close starts here ////////////////////////////////////
		iconClose  = new ImageIcon("src/assets/PNGClose.png");
		imageClose = iconClose.getImage();
		imageClose = imageClose.getScaledInstance(39,39, Image.SCALE_SMOOTH);
		iconClose.setImage(imageClose);
		//////////////////////////// icon_close closed here /////////////////////////////////////
		
		btnClose.setIcon(iconClose);
		
		
		
		
		ImageIcon iconLogo  = new ImageIcon("rc/assets/logo.png");
		 Image imageLogo = iconLogo.getImage();
		 imageLogo = imageLogo.getScaledInstance(380,150, Image.SCALE_DEFAULT);
		 iconLogo.setImage(imageLogo);
		

		
	}//info frame method closed
}
