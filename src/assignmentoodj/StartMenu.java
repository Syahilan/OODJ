/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

//IMPORT LIST
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class StartMenu extends JFrame implements ActionListener {

    
    
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == Personnel) {
            
            //Go to Personnel Login Page
            setVisible(false);
            PersonnelLoginPage personnelLogin = new PersonnelLoginPage();
            personnelLogin.setVisible(true);
            
           

        } else if (e.getSource() == People){
        
            //Go to People Login Page
            setVisible(false);
            PeopleLoginPage peopleLogin = new PeopleLoginPage();
            peopleLogin.setVisible(true);
            
        } else if (e.getSource() == Exit){
        
            // Exit the program.
            System.exit(0);
        }
        
        
    }

    private Button Personnel, People, Exit;
    
    public StartMenu() {
    
        
        // Title set for the Start Menu
        setTitle("Covid Vaccine Management System (CVMS)");
        
        // TODO: ICON IMAGE CHANGE
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("your image here")));
        
        setSize(500, 300);
        
        //setLocation(700, 200);
        setLocationRelativeTo(null);                    // This will set JFrame in the middle
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        //Buttons
        Personnel = new Button("Personnel");
        Personnel.setFont(new java.awt.Font("Sans Serif", 1, 20)); // NOI18N
        People = new Button("People");
        People.setFont(new java.awt.Font("Sans Serif", 1, 20)); // NOI18N
        Exit = new Button("Exit");
        Exit.setFont(new java.awt.Font("Sans Serif", 1, 20)); // NOI18N
        Personnel.addActionListener(this);
        People.addActionListener(this);
        Exit.addActionListener(this);
        add(Personnel);
        add(People);
        add(Exit);
        setVisible(true);
        
    
    }
    
    
}
