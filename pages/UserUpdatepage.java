package pages;



import javax.swing.*;
import javax.swing.border.AbstractBorder;

import pages.Auth.Auth;
import pages.Model.User;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.List;

class InputField extends JTextField {

        InputField(String text) {
                setText(text);
                setFont(new Font("Open Sans", 1, 12));
                setForeground(new Color(194, 194, 196));
                setBackground(new Color(250, 250, 252));
                setBorder(new RoundedBorderr(new Color(228, 228, 228), 10, 5));
                addFocusListener(new FocusListener() {
                        @Override
                        public void focusGained(FocusEvent e) {
                                if (getText().equals(text)) {
                                        setText("");
                                        setBorder(new RoundedBorderr(new Color(3, 78, 161), 10, 3));
                                        setForeground(new Color(50, 50, 50));
                                }
                        }

                        @Override
                        public void focusLost(FocusEvent e) {
                                if (getText().length() == 0) {
                                        setText(text);
                                        setForeground(new Color(194, 194, 196));
                                        setBorder(new RoundedBorderr(new Color(228, 228, 228), 10, 5));
                                }

                        }
                });
        }

        @Override
        public Insets getInsets() {
                return new Insets(0, 25, 0, 0);
        }
}

class RoundedBorderr extends AbstractBorder {
        private Color color;
        private int radius;
        private int thickness;

        public RoundedBorderr(Color color, int radius, int thickness) {
                this.color = color;
                this.radius = radius;
                this.thickness = thickness;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                g.setColor(color);
                g.drawRoundRect(x, y, width - thickness, height - thickness, radius, radius);
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
                insets.top = insets.left = insets.bottom = insets.right = thickness;
                return insets;
        }
}

class RoundedBorderFilled extends AbstractBorder {
        private Color color;
        private int radius;
        private int thickness;

        public RoundedBorderFilled(Color color, int radius, int thickness) {
                this.color = color;
                this.radius = radius;
                this.thickness = thickness;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                g.setColor(color);
                g.fillRoundRect(x, y, width - thickness, height - thickness, radius, radius);
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
                insets.top = insets.left = insets.bottom = insets.right = thickness;
                return insets;
        }
}

public class UserUpdatepage extends JFrame {
        // JPanels
        JPanel navPanel;
        JPanel logoPanel;
        JPanel menuPanel;
        JPanel userUpdatePanel;
        JPanel userUpdateTitlePanel;
        JPanel userFormLayout;
        JPanel userFormPanel;
        JPanel userFormTitlePanel;
        JPanel userFormItemPanel;
        JPanel userFormButtonLayout;
        JPanel button;
        JSeparator separator;
        // JLabel
        JLabel logoLabel;
        JLabel bellIcon;
        JLabel userIcon;
        JLabel logoutIcon;
        JLabel userUpdateTitle;
        JLabel userFormTitle;
        JLabel buttonLabel;

        String[] user;

        public UserUpdatepage() throws NumberFormatException, IOException {
                initComponents();
                // this.user = Auth.getAuth();
                // System.out.println(Auth.getAuth()[0]);
        }

        private void initComponents() {
                // JPanels
                navPanel = new JPanel();
                menuPanel = new JPanel();
                logoPanel = new JPanel();
                userUpdatePanel = new JPanel();
                userUpdateTitlePanel = new JPanel();
                userFormLayout = new JPanel();
                userFormPanel = new JPanel();
                userFormTitlePanel = new JPanel();
                userFormItemPanel = new JPanel();
                userFormButtonLayout = new JPanel();
                button = new JPanel();
                separator = new JSeparator();
                // JLabel
                logoLabel = new JLabel();
                bellIcon = new JLabel();
                userIcon = new JLabel();
                logoutIcon = new JLabel();
                userUpdateTitle = new JLabel();
                userFormTitle = new JLabel();
                buttonLabel = new JLabel();
                // JTextField

                // Frame
                setLayout(new BorderLayout());
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setBackground(new Color(255, 255, 255));
                setSize(1000, 700);
                setLocationRelativeTo(null);

                // -----------Nav Panel------------------
                // -----------Nav Panel------------------
                navPanel.setBackground(new Color(3, 78, 161));
                navPanel.setForeground(new Color(255, 255, 255));
                // logoPanel
                logoPanel.setBackground(new Color(3, 78, 161));
                logoPanel.setLayout(new BorderLayout());

                logoLabel.setFont(new Font("Open Sans", 1, 25));
                logoLabel.setForeground(new Color(255, 255, 255));
                logoLabel.setText("Pharmacy Management");
                logoPanel.add(logoLabel, BorderLayout.CENTER);

                // MenuPanel
                menuPanel.setBackground(new Color(3, 78, 161));
                menuPanel.setLayout(new GridLayout(1, 0, 25, 0));
                // bellIcon
                bellIcon.setIcon(new ImageIcon("./pages/icon/bellicon.png"));
                bellIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
                menuPanel.add(bellIcon);
                // userIcon
                userIcon.setIcon(new ImageIcon("./pages/icon/usericon.png"));
                userIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
                menuPanel.add(userIcon);
                // logoutIcon
                logoutIcon.setIcon(new ImageIcon("./pages/icon/logouticon.png"));
                logoutIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
                menuPanel.add(logoutIcon);

                GroupLayout panelGroupLayout = new GroupLayout(navPanel);
                navPanel.setLayout(panelGroupLayout);

                panelGroupLayout.setHorizontalGroup(
                                panelGroupLayout.createSequentialGroup()
                                                .addGap(3, 70, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(logoPanel)
                                                .addComponent(menuPanel, GroupLayout.PREFERRED_SIZE, 200,
                                                                GroupLayout.PREFERRED_SIZE)
                                                .addGap(70, 70, GroupLayout.PREFERRED_SIZE));
                panelGroupLayout.setVerticalGroup(
                                panelGroupLayout.createParallelGroup()
                                                .addComponent(logoPanel)
                                                .addComponent(menuPanel, GroupLayout.PREFERRED_SIZE, 80,
                                                                GroupLayout.PREFERRED_SIZE)
                                                .addComponent(menuPanel));
                // ------------userUpdatePanel-------------
                // ------------userUpdatePanel-------------
                userUpdatePanel.setBackground(new Color(255, 255, 255));
                userUpdatePanel.setLayout(new BorderLayout());
                // UserTitlePanel
                userUpdateTitlePanel.setBackground(new Color(255, 255, 255));
                userUpdateTitlePanel.setLayout(new FlowLayout(FlowLayout.LEADING, 70, 25));
                userUpdateTitle.setFont(new Font("Open Sans", 1, 26));
                userUpdateTitle.setForeground(new Color(83, 83, 83));
                userUpdateTitle.setText("Home/ User Update");
                userUpdateTitlePanel.add(userUpdateTitle);
                // userFormLayout
                userFormLayout.setBackground(new Color(255, 255, 255));
                userFormLayout.setLayout(new FlowLayout(FlowLayout.CENTER));
                // userFormTitlePanel
                userFormTitlePanel.setBackground(new Color(255, 255, 255));
                userFormTitlePanel.setLayout(new FlowLayout(FlowLayout.LEADING));
                userFormTitle.setFont(new Font("Open Sans", 1, 20));
                userFormTitle.setForeground(new Color(83, 83, 83));
                userFormTitle.setText("User Information");
                userFormTitlePanel.add(userFormTitle);
                // Separator
                separator.setForeground(new Color(233, 233, 233));
                // userFormItemPanel
                userFormItemPanel.setLayout(new GridLayout(4, 1, 0, 15));
                userFormItemPanel.setPreferredSize(new Dimension(800, 300));
                userFormItemPanel.setBackground(new Color(255, 255, 255));
                // UserName
                InputField userName = new InputField(this.user[2]);
                // UserEmail
                InputField userEmail = new InputField(this.user[1]);

                userFormItemPanel.add(userName);
                userFormItemPanel.add(userEmail);
                // button
                userFormButtonLayout.setBackground(new Color(255, 255, 255));
                userFormButtonLayout.setLayout(new FlowLayout(FlowLayout.CENTER));
                button.setLayout(new BorderLayout());
                button.setCursor(new Cursor(Cursor.HAND_CURSOR));
                button.setBackground(new Color(255, 255, 255));
                button.setPreferredSize(new Dimension(160, 55));
                button.setBorder(new RoundedBorderFilled(new Color(33, 33, 33), 10, 4));
                button.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent e) {
                                button.setBorder(new RoundedBorderr(new Color(3, 78, 161), 10, 3));
                                buttonLabel.setForeground(new Color(0, 0, 0));
                        }

                        @Override
                        public void mouseClicked(MouseEvent e) {
                                // code
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                                button.setBorder(new RoundedBorderFilled(new Color(33, 33, 33), 10, 4));
                                buttonLabel.setForeground(new Color(255, 255, 255));
                        }
                });
                // buttonLabel
                buttonLabel.setText("Update Information");
                buttonLabel.setForeground(new Color(255, 255, 255));
                buttonLabel.setHorizontalAlignment(SwingConstants.CENTER);
                buttonLabel.setFont(new Font("Open Sans", 1, 12));
                button.add(buttonLabel, BorderLayout.CENTER);
                userFormButtonLayout.add(button);

                // userFormPanel
                userFormPanel.setPreferredSize(new Dimension(580, 470));
                userFormPanel.setBackground(new Color(255, 255, 255));
                userFormPanel.setBorder(new RoundedBorderr(new Color(228, 228, 228), 10, 5));

                GroupLayout userFormGroupLayout = new GroupLayout(userFormPanel);
                userFormPanel.setLayout(userFormGroupLayout);

                userFormGroupLayout.setHorizontalGroup(
                                userFormGroupLayout.createSequentialGroup()
                                                .addGap(GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(userFormGroupLayout.createParallelGroup()
                                                                .addComponent(userFormTitlePanel)
                                                                .addComponent(separator, GroupLayout.PREFERRED_SIZE,
                                                                                200, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(userFormItemPanel)
                                                                .addComponent(userFormButtonLayout))

                                                .addGap(GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE));

                userFormGroupLayout.setVerticalGroup(
                                userFormGroupLayout.createSequentialGroup()
                                                .addGap(GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(userFormTitlePanel)
                                                .addComponent(separator)
                                                .addGap(20, 20, 20)
                                                .addComponent(userFormItemPanel, GroupLayout.PREFERRED_SIZE, 250,
                                                                GroupLayout.PREFERRED_SIZE)
                                                .addGap(GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
                                                .addGap(GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(userFormButtonLayout)
                                                .addGap(GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE));

                userFormLayout.add(userFormPanel);

                this.add(navPanel, BorderLayout.NORTH);
                userUpdatePanel.add(userUpdateTitlePanel, BorderLayout.NORTH);
                userUpdatePanel.add(userFormLayout);
                this.add(userUpdatePanel);
                setVisible(true);
        }



}
