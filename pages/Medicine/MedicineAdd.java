package pages.Medicine;

import javax.swing.*;
import javax.swing.border.Border;

import pages.font.OpenFont;
import pages.*;
import pages.Model.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class MedicineAdd extends JFrame {
    public JFrame frame;
    public MedicineAdd medicineClass;

    public MedicineAdd() {
        initComponents();
        this.setSize(1280, 720);
        this.setTitle("Pharmacy Management System| Medicine  ");
        this.setLayout(null);
        this.getContentPane().setBackground(Color.white);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.frame = this;
        this.medicineClass = this;

    }

    public void initComponents() {
        initNavbar();
        initAppLocation();
        initDownPanel();
    }

    public void initNavbar() {
        JPanel navbar = new JPanel();
        navbar.setBounds(0, 0, 1280, 85);
        navbar.setBackground(Color.decode("#034EA1"));
        navbar.setLayout(null);
        this.add(navbar);

        JLabel appName = new JLabel("Pharmacy Management");
        appName.setFont(new Font("Open Sans", Font.BOLD, 23));
        appName.setBounds(73, 26, 375, 33);
        appName.setForeground(Color.white);
        appName.setCursor(new Cursor(Cursor.HAND_CURSOR));
        appName.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
                new Dashboard().setVisible(true);
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
        navbar.add(appName);

        JLabel bellIcon = new JLabel(new ImageIcon("./pages/icon/bellicon.png"));
        bellIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bellIcon.setBounds(1043, 19, 46, 46);
        navbar.add(bellIcon);

        JLabel userIcon = new JLabel(new ImageIcon("./pages/icon/usericon.png"));
        userIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
        userIcon.setBounds(1110, 25, 34, 34);
        navbar.add(userIcon);

        JLabel logoutIcon = new JLabel(new ImageIcon("./pages/icon/logouticon.png"));
        logoutIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logoutIcon.setBounds(1165, 21, 42, 43);
        navbar.add(logoutIcon);

    }

    public void initAppLocation() {
        JLabel appLocation = new JLabel("Home/ Medicine / Add");
        this.add(appLocation);
        appLocation.setBounds(80, 120, 329, 38);
        Font font = new OpenFont(28, Font.BOLD).getFont();
        appLocation.setFont(font);
        this.add(appLocation);

    }

    public void initDownPanel() {
    Font inputFont = new Font("Open Sans", Font.PLAIN, 13);

        Border greyBorder = BorderFactory.createLineBorder(Color.decode("#DDDEDE"), 1, true);
        Border border = BorderFactory.createLineBorder(Color.decode("#DDDEDE"), 1, true);
        JPanel medicineFormContainer = new JPanel();
        medicineFormContainer.setBackground(Color.decode("#F5F7F9"));
        medicineFormContainer.setOpaque(true);
        medicineFormContainer.setBounds(269, 188, 754, 480);
        medicineFormContainer.setBorder(border);
        medicineFormContainer.setLayout(null);
        this.add(medicineFormContainer);

        JPanel headerContainer = new JPanel();
        headerContainer.setBounds(0, 0, 753, 74);
        headerContainer.setOpaque(true);
        headerContainer.setBackground(Color.decode("#034EA1"));
        headerContainer.setLayout(null);
        medicineFormContainer.add(headerContainer);

        JLabel headerTitle = new JLabel("Medicine Details: ");
        headerTitle.setForeground(Color.white);
        headerTitle.setFont(new OpenFont(27, Font.BOLD).getFont());
        headerTitle.setBounds(30, 23, 332, 37);
        headerContainer.add(headerTitle);

        JLabel medicineName = new JLabel("Medicine Name:");
        medicineName.setForeground(Color.decode("#404040"));
        medicineName.setFont(new OpenFont(18, Font.BOLD).getFont());
        medicineName.setBounds(70, 116, 211, 30);
        medicineFormContainer.add(medicineName);

        JLabel medicinePrice = new JLabel("Medicine Price:");
        medicinePrice.setForeground(Color.decode("#404040"));
        medicinePrice.setFont(new OpenFont(18, Font.BOLD).getFont());
        medicinePrice.setBounds(70, 192, 211, 30);
        medicineFormContainer.add(medicinePrice);

        JLabel medicineDescription = new JLabel("Description:");
        medicineDescription.setForeground(Color.decode("#404040"));
        medicineDescription.setFont(new OpenFont(18, Font.BOLD).getFont());
        medicineDescription.setBounds(70, 261,211, 30);
        medicineFormContainer.add(medicineDescription);

        JTextField medicineNameTextField = new JTextField("Enter medicine name");
        medicineNameTextField.setBounds(256 ,110, 468, 43);
        medicineNameTextField.setForeground(Color.decode("#404040"));
        medicineNameTextField.setFont(inputFont);
        medicineNameTextField.setOpaque(true);
        medicineNameTextField.setBackground(Color.white);
        medicineNameTextField.setBorder(greyBorder);
        medicineNameTextField.setBorder(BorderFactory.createCompoundBorder(medicineNameTextField.getBorder(),
                BorderFactory.createEmptyBorder(0, 15, 0, 15)));

        medicineFormContainer.add(medicineNameTextField);       

        JTextField medicinePriceField = new JTextField("Enter price");
        medicinePriceField.setBounds(256 ,medicineNameTextField.getY()+medicineNameTextField.getHeight()+40, 468, 43);
        medicinePriceField.setForeground(Color.decode("#404040"));
        medicinePriceField.setFont(inputFont);
        medicinePriceField.setOpaque(true);
        medicinePriceField.setBackground(Color.white);
        medicinePriceField.setBorder(greyBorder);
        medicinePriceField.setBorder(BorderFactory.createCompoundBorder(medicinePriceField.getBorder(),
                BorderFactory.createEmptyBorder(0, 15, 0, 15)));

        medicineFormContainer.add(medicinePriceField);       

        JTextField medicineDescField = new JTextField("Enter medicine description");
        medicineDescField.setBounds(256 ,medicinePriceField.getY()+medicinePriceField.getHeight()+30, 468, 121);
        medicineDescField.setForeground(Color.decode("#404040"));
        medicineDescField.setFont(inputFont);
        medicineDescField.setOpaque(true);
        medicineDescField.setBackground(Color.white);
        medicineDescField.setBorder(greyBorder);
        medicineDescField.setBorder(BorderFactory.createCompoundBorder(medicineDescField.getBorder(),
                BorderFactory.createEmptyBorder(0, 15, 0, 15)));

        medicineFormContainer.add(medicineDescField);       
        

        JLabel saveButton = new JLabel(new ImageIcon("./pages/buttons/save.png"));
        saveButton.setBounds(272, medicineDescField.getY()+medicineDescField.getHeight()+20, 209, 51);
        saveButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        saveButton.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                MedicineCRUD.createMedicine(medicineNameTextField.getText(), medicineDescField.getText(),  Integer.parseInt(medicinePriceField.getText()));
                medicineNameTextField.setText("");
                medicineDescField.setText("");
                medicinePriceField.setText("");
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
        medicineFormContainer.add(saveButton);


    }

}
