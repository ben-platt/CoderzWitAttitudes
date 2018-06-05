import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
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
    Island newisle = new Island();
    JFrame isleFrame = new JFrame(name);

    JPanel title = new JPanel();
    JPanel header = new JPanel();

    JLabel nameofisle = new JLabel(name);
    JLabel spacew = new JLabel("");
    JLabel spacee = new JLabel("");
    JLabel spaces = new JLabel("");



    JButton attackButton = new JButton("Hunt an animal");


    //---------PREPARING THE GUI-----------//
    setTitle(name);
    nameofisle.setFont(new Font("Calibri", Font.PLAIN, 36));
    isleFrame.setLayout(new GridLayout(3,1,2,2));
    isleFrame.setDefaultLookAndFeelDecorated(true);
    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    title.setLayout(new BorderLayout());

    //---------ADDING STUFF TO THE GUI----------//
    title.add(nameofisle, BorderLayout.NORTH);
    title.add(spacew, BorderLayout.WEST);
    title.add(spacee, BorderLayout.EAST);
    title.add(spaces, BorderLayout.SOUTH);

    header.add(attackButton);

    isleFrame.add(title);
    isleFrame.add(header);
    isleFrame.setSize(1200,850);
    isleFrame.setVisible(true);
    isleFrame.setLocationRelativeTo(null);
  }
}
