package pages;
import javax.swing.*;
import javax.swing.border.Border;

import pages.style.inputClickListener;
import pages.Auth.Auth;
import pages.Model.*;
import pages.font.OpenFont;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
/**
 * Register
 */
public class Login extends JFrame {
    JFrame frame;
    JPanel leftPanel;
    JPanel rightPanel;
    JLabel firstHeading;
    JLabel secondHeading;

    JLabel submitButton;

    Font headingFont = new Font("Open Sans", Font.BOLD, 28);
    Font inputFont = new Font("Open Sans", Font.PLAIN, 13);

    String blueColor = "#034EA1";
    String greyTextColor = "#9C9C9C";
    String inputBackgrounColor = "#F5F7F9";

    Border greyBorder = BorderFactory.createLineBorder(Color.decode("#DDDEDE"), 1, true);

    JTextField userName;
    JTextField userEmail;
    JTextField userPassword;

    // constructor
    public Login() {
        initComponents();
        this.setTitle("Login");
        this.setSize(900, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.white);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        frame = this;
    }

    // initing the components
    public void initComponents() {
        initLeftPanel();
        initRightPanel();
    }

    public void initLeftPanel() {
        leftPanel = new JPanel();
        leftPanel.setBackground(Color.decode(blueColor));
        leftPanel.setBounds(0, 0, 437, 600);
        leftPanel.setLayout(null);
        this.add(leftPanel);
        firstHeading = new JLabel("<html><body>Pharmacy<br>Management System</body></html>");
        firstHeading.setForeground(Color.white);
        firstHeading.setFont(headingFont);
        firstHeading.setBounds(64, 135, 295, 85);
        leftPanel.add(firstHeading);
    }

    public void initRightPanel() {
        int gapY_between_inputs = 30;
        int gapY_between_heading_and_input = 55;
        secondHeading = new JLabel("Login");
        secondHeading.setForeground(Color.decode(blueColor));
        secondHeading.setFont(headingFont);
        secondHeading.setBounds(612, 100, 115, 38);
        this.add(secondHeading);

        userEmail = new JTextField("Enter your email");
        userEmail.setBounds(485, 
                secondHeading.getY() + secondHeading.getHeight() + gapY_between_heading_and_input, 364, 51);
        userEmail.setForeground(Color.decode(greyTextColor));
        userEmail.setFont(inputFont);
        userEmail.setOpaque(true);
        userEmail.setBackground(Color.decode(inputBackgrounColor));
        userEmail.setBorder(greyBorder);
        userEmail.setBorder(BorderFactory.createCompoundBorder(userEmail.getBorder(),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)));

        userEmail.addFocusListener(new inputClickListener());
        this.add(userEmail);

        userPassword = new JTextField("Enter your password");
        userPassword.setBounds(485, userEmail.getY() + userEmail.getHeight() + gapY_between_inputs, 364, 51);
        userPassword.setForeground(Color.decode(greyTextColor));
        userPassword.setFont(inputFont);
        userPassword.setOpaque(true);
        userPassword.setBackground(Color.decode(inputBackgrounColor));
        userPassword.setBorder(greyBorder);
        userPassword.setBorder(BorderFactory.createCompoundBorder(userPassword.getBorder(),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        
        userPassword.addFocusListener(new inputClickListener());
        this.add(userPassword);

        submitButton = new JLabel(new ImageIcon("./pages/buttons/submit.png"));
        submitButton.setBounds(560, userPassword.getY() + userPassword.getHeight() + gapY_between_inputs, 209, 51);
        submitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(submitButton);

        submitButton.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if(User.login(userEmail.getText(), userPassword.getText())){
                    int id = Integer.parseInt(User.loggedInId(userEmail.getText(), userPassword.getText()));
                    List<String> user = User.getUser(id);
                    try {
                        Auth.login(Integer.parseInt(user.get(0)), user.get(2), user.get(1));
                    } catch (Exception error) {
                        error.printStackTrace();
                    }
                    frame.setVisible(false);
                    new Dashboard().setVisible(true);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               
            }

            @Override
            public void mouseExited(MouseEvent e) {
               
            }
            
        });

        JLabel registerLabel = new JLabel("Register");
        registerLabel.setBounds(638, submitButton.getY()+submitButton.getHeight()+10, 102, 19);
        registerLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        registerLabel.setFont(new OpenFont(14, Font.BOLD).getFont());
        registerLabel.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(false);
                new Register().setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
            
        });
        this.add(registerLabel);


    }



}