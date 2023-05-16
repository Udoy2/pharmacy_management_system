package pages;
import javax.swing.*;
import javax.swing.border.Border;

import pages.style.inputClickListener;
import pages.Model.*;
import pages.font.OpenFont;

import java.awt.*;
import java.awt.event.*;

/**
 * Register
 */
public class Register extends JFrame{
    JFrame frame;
    JPanel leftPanel;
    JPanel rightPanel;
    JLabel firstHeading;
    JLabel secondHeading;

    JLabel submitButton;

    Font headingFont = new Font("Open Sans",Font.BOLD , 28);
    Font inputFont = new Font("Open Sans",Font.PLAIN , 13);

    String blueColor = "#034EA1";
    String greyTextColor = "#9C9C9C";
    String inputBackgrounColor = "#F5F7F9";

    Border greyBorder = BorderFactory.createLineBorder(Color.decode("#DDDEDE"), 1, true);

    JTextField userName;
    JTextField userEmail;
    JTextField userPassword;
    // constructor
    Register()
    {
        initComponents();
        this.setTitle("Register");
        this.setSize(900, 600);    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.white);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        this.frame = this;
    }

    // initing the components
    public void initComponents(){
        initLeftPanel();
        initRightPanel();
    }


    public void initLeftPanel(){
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

    public void initRightPanel(){
        int gapY_between_inputs = 30;
        int gapY_between_heading_and_input = 55;
        secondHeading = new JLabel("Register");
        secondHeading.setForeground(Color.decode(blueColor));
        secondHeading.setFont(headingFont);
        secondHeading.setBounds(612, 100, 115, 38);
        this.add(secondHeading);

        userName = new JTextField("Enter your name");
        userName.setName("userName");
        userName.setBounds(485, secondHeading.getY()+secondHeading.getHeight()+gapY_between_heading_and_input, 364, 51);
        userName.setForeground(Color.decode(greyTextColor));
        userName.setFont(inputFont);
        userName.setOpaque(true);
        userName.setBackground(Color.decode(inputBackgrounColor));
        userName.setBorder(greyBorder);
        userName.addFocusListener(new inputClickListener());
        userName.setBorder(BorderFactory.createCompoundBorder(userName.getBorder(), BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        this.add(userName);

        userEmail = new JTextField("Enter your email");
        userEmail.setName("userEmail");
        userEmail.setBounds(485, userName.getY() + userName.getHeight() + gapY_between_inputs, 364, 51);
        userEmail.setForeground(Color.decode(greyTextColor));
        userEmail.setFont(inputFont);
        userEmail.setOpaque(true);
        userEmail.setBackground(Color.decode(inputBackgrounColor));
        userEmail.setBorder(greyBorder);
        userEmail.addFocusListener(new inputClickListener());
        userEmail.setBorder(BorderFactory.createCompoundBorder(userEmail.getBorder(), BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        this.add(userEmail);

        userPassword = new JTextField("Enter your password");
        userPassword.setName("userPassword");
        userPassword.setBounds(485, userEmail.getY() + userEmail.getHeight() + gapY_between_inputs, 364, 51);
        userPassword.setForeground(Color.decode(greyTextColor));
        userPassword.setFont(inputFont);
        userPassword.setOpaque(true);
        userPassword.setBackground(Color.decode(inputBackgrounColor));
        userPassword.setBorder(greyBorder);
        userPassword.addFocusListener(new inputClickListener());
        userPassword.setBorder(BorderFactory.createCompoundBorder(userPassword.getBorder(), BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        this.add(userPassword);

        submitButton = new JLabel(new ImageIcon("./pages/buttons/submit.png"));
        submitButton.setBounds(555, userPassword.getY() + userPassword.getHeight() + gapY_between_inputs, 209, 51);
        submitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(submitButton);

        submitButton.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                User.createUser(userName.getText(),userEmail.getText(),userPassword.getText());
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


        JLabel loginLabel = new JLabel("Login");
        loginLabel.setBounds(638, submitButton.getY() + submitButton.getHeight() + 10, 102, 19);
        loginLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginLabel.setFont(new OpenFont(14, Font.BOLD).getFont());
        loginLabel.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(false);
                new Login().setVisible(true);
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
        this.add(loginLabel);

    }

    public static void main(String[] args) {
        new Register();
    }

}