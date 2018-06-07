import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.SwingUtilities;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class Home extends JFrame{

  public Home(String name){
    //-----------MAKE NEW ISLAND-----------//
    Player p = new Player(); 
    JFrame isleFrame = new JFrame(name);

    JPanel title = new JPanel();
    JPanel header = new JPanel();
    JPanel statusPanel = new JPanel();

    JLabel nameofisle = new JLabel(name);
    JLabel statusLabel = new JLabel("status");


    JButton attackButton = new JButton("Hunt an animal");
    JButton checkVicinityButton = new JButton("Check your vicinity for an animal");
    

    //---------BUTTONS--------------------//
    
    //ATTACK BUTTON
    attackButton.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent d){
		double curhealth = p.attack();
		
	    }


	});

    //---------PREPARING THE GUI-----------//
    setTitle(name);
    nameofisle.setFont(new Font("Calibri", Font.PLAIN, 36));
    isleFrame.setLayout(new BorderLayout());
    isleFrame.setSize(750,750);
    isleFrame.setDefaultLookAndFeelDecorated(true);
    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    title.setLayout(new BorderLayout());

    statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
    statusPanel.setPreferredSize(new Dimension(isleFrame.getWidth(), 16));
    statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));

    statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
    statusPanel.add(statusLabel);

    


    //---------ADDING STUFF TO THE GUI----------//
    title.add(nameofisle, BorderLayout.NORTH);

    header.add(attackButton);

    isleFrame.add(title);
    isleFrame.add(header);
    isleFrame.add(statusPanel, BorderLayout.SOUTH);
    

    isleFrame.setVisible(true);
    isleFrame.setLocationRelativeTo(null);
  }
}