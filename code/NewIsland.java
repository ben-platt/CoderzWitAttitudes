import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class NewIsland extends JFrame implements ActionListener{
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel newIslPanel;
   private JLabel welcome;

   public NewIsland(){
     // ----------- PREPARING THE GUI ----------- //
     mainFrame = new JFrame("Sporganizer");
     mainFrame.setSize(500,500);
     mainFrame.setLayout(new GridLayout(5, 1));

     mainFrame.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent windowEvent){
           System.exit(0);
        }
     });
     headerLabel = new JLabel("", JLabel.CENTER);
     statusLabel = new JLabel("",JLabel.CENTER);
     statusLabel.setSize(350,100);
     JPanel welcomepanel = new JPanel();
     JLabel space = new JLabel("", JLabel.CENTER);
     welcome = new JLabel("Islanders", JLabel.CENTER);
     welcomepanel.add(welcome);
     welcome.setFont(new Font("Serif Italics", Font.PLAIN, 32));
     newIslPanel = new JPanel();
     newIslPanel.setLayout(new FlowLayout());


     // ------------ SHOWING COMPONENTS ------------ //
     headerLabel.setText("Enter your name: ");

     final JTextField nameDepText = new JTextField(15);

     JButton createButton = new JButton("Create Game!");
     createButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
           String name = new String(nameDepText.getText());
           new Home(name);
         }

       });
       // ----------- ADDING COMPONENTS TO GUI ---------//
       //newIslPanel.add(nameDepLabel);
       newIslPanel.add(nameDepText);
       newIslPanel.add(createButton);
       mainFrame.add(space);
       mainFrame.add(welcomepanel);
       mainFrame.add(headerLabel);
       mainFrame.add(newIslPanel);
       mainFrame.add(statusLabel);
       mainFrame.setVisible(true);
       mainFrame.setLocationRelativeTo(null);
     }

     public void actionPerformed(ActionEvent e){
       System.exit(0);
     }
   public static void main(String[] args){
      NewIsland newgame = new NewIsland();
   }
}
