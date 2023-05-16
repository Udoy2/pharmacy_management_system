package pages;
import javax.swing.*;
import javax.swing.border.AbstractBorder;

import pages.PageInvoice.PageInvoice;
import pages.Medicine.Medicine;
import pages.Model.MedicineCRUD;
import pages.font.OpenFont;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import pages.UserUpdatepage;

class RoundedBorder extends AbstractBorder {
        private Color color;
        private int radius;
        private int thickness;

        public RoundedBorder(Color color, int radius, int thickness) {
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
        public Insets getBorderInsets(Component c) {
                return new Insets(thickness, thickness, thickness, thickness);
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
                insets.top = insets.left = insets.bottom = insets.right = thickness;
                return insets;
        }
}

public class Dashboard extends JFrame {
        JFrame frame;
        JLabel logoLabel;
        JLabel statsItemText2;
        JLabel statsItemIcon2;
        JLabel statsItemNumber3;
        JLabel statsItemText3;
        JLabel statsItemIcon3;
        JLabel statsItemNumber4;
        JLabel statsItemText4;
        JLabel statsItemIcon4;
        JLabel bellIcon;
        JLabel optionLabel1;
        JLabel optionLabel2;
        JLabel optionLabel3;
        JLabel optionLabel4;
        JLabel optionLabel5;
        JLabel optionLabel6;
        JLabel userIcon;
        JLabel dashboardTitle;
        JLabel logoutIcon;
        JLabel statsItemNumber1;
        JLabel statsItemText1;
        JLabel statsItemIcon1;
        JLabel statsItemNumber2;
        JPanel navPanel;
        JPanel statsItemPanel4;
        JPanel separatorPanel;
        JPanel optionsPanel;
        JPanel optionPanel1;
        JPanel optionPanel2;
        JPanel optionPanel3;
        JPanel optionPanel4;
        JPanel optionPanel5;
        JPanel menuPanel;
        JPanel optionPanel6;
        JPanel optionsLayout;
        JPanel logoPanel;
        JPanel dashboardLayout;
        JPanel dashboardTitlePanel;
        JPanel dashboardPanel;
        JPanel statsPanel;
        JPanel statsItemPanel1;
        JPanel statsItemPanel2;
        JPanel statsItemPanel3;
        JSeparator separator;

        public Dashboard() {
                initComponents();
                frame = this;
        }

        private void initComponents() {
                GridBagConstraints gbc;
                navPanel = new JPanel();
                menuPanel = new JPanel();
                bellIcon = new JLabel();
                userIcon = new JLabel();
                logoutIcon = new JLabel();
                logoPanel = new JPanel();
                logoLabel = new JLabel();
                dashboardLayout = new JPanel();
                dashboardPanel = new JPanel();
                dashboardTitlePanel = new JPanel();
                statsPanel = new JPanel();
                statsItemPanel1 = new JPanel();
                statsItemNumber1 = new JLabel();
                statsItemText1 = new JLabel();
                statsItemIcon1 = new JLabel();
                statsItemPanel2 = new JPanel();
                statsItemNumber2 = new JLabel();
                statsItemText2 = new JLabel();
                statsItemIcon2 = new JLabel();
                statsItemPanel3 = new JPanel();
                statsItemNumber3 = new JLabel();
                statsItemText3 = new JLabel();
                statsItemIcon3 = new JLabel();
                statsItemPanel4 = new JPanel();
                statsItemNumber4 = new JLabel();
                statsItemText4 = new JLabel();
                statsItemIcon4 = new JLabel();
                dashboardTitle = new JLabel();
                separatorPanel = new JPanel();
                separator = new JSeparator();
                optionsLayout = new JPanel();
                optionsPanel = new JPanel();
                optionPanel1 = new JPanel();
                optionLabel1 = new JLabel();
                optionPanel2 = new JPanel();
                optionLabel2 = new JLabel();
                optionPanel3 = new JPanel();
                optionLabel3 = new JLabel();
                optionPanel4 = new JPanel();
                optionLabel4 = new JLabel();
                optionPanel5 = new JPanel();
                optionLabel5 = new JLabel();
                optionPanel6 = new JPanel();
                optionLabel6 = new JLabel();

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

                logoLabel.setFont(new OpenFont(25, Font.BOLD).getFont());
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
                userIcon.addMouseListener(new MouseListener() {

                        @Override
                        public void mouseClicked(MouseEvent e) {
                                frame.dispose();
                                try {
                                        new UserUpdatepage();
                                } catch (NumberFormatException | IOException e1) {
                                        e1.printStackTrace();
                                }
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {
                                // TODO Auto-generated method stub

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
                menuPanel.add(userIcon);
                // logoutIcon
                logoutIcon.setIcon(new ImageIcon("./pages/icon/logouticon.png"));
                logoutIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
                menuPanel.add(logoutIcon);

                GroupLayout panelGroupLayout = new GroupLayout(navPanel);
                navPanel.setLayout(panelGroupLayout);

                panelGroupLayout.setHorizontalGroup(
                        panelGroupLayout.createSequentialGroup()
                        .addGap(70, 70, GroupLayout.PREFERRED_SIZE)
                        .addComponent(logoPanel)
                        .addComponent(menuPanel,GroupLayout.PREFERRED_SIZE,200,GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, GroupLayout.PREFERRED_SIZE)
                );
                panelGroupLayout.setVerticalGroup(
                        panelGroupLayout.createParallelGroup()
                        .addComponent(logoPanel)
                        .addComponent(menuPanel,GroupLayout.PREFERRED_SIZE,80,GroupLayout.PREFERRED_SIZE)
                        .addComponent(menuPanel)
                );

                // -----------Dashboard Panel------------------
                // -----------Dashboard Panel------------------
                dashboardLayout.setBackground(new Color(255, 255, 255));
                dashboardPanel.setBackground(new Color(255, 255, 255));
                dashboardTitlePanel.setBackground(new Color(255, 255, 255));
                // statsPanel
                statsPanel.setBackground(new Color(255, 255, 255));
                statsPanel.setPreferredSize(new Dimension(895, 110));

                // statsItemPanel1

                statsItemPanel1.setBackground(new Color(255, 255, 255));
                statsItemPanel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
                statsItemPanel1.setBorder(new RoundedBorder(new Color(80, 77, 166), 10, 5));
                statsItemPanel1.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent e) {
                                statsItemPanel1MouseEntered();
                        }

                        public void mouseClicked(MouseEvent e) {
                                statsItemPanel1MouseClicked();
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                                statsItemPanel1MouseExited();
                        }
                });

                statsItemNumber1.setFont(new OpenFont(24, Font.BOLD).getFont());
                statsItemNumber1.setForeground(new Color(255, 255, 255));
                statsItemNumber1.setText(Integer.toString(MedicineCRUD.searchMedicine(null).size()));

                statsItemText1.setFont(new OpenFont(12, Font.BOLD).getFont());
                statsItemText1.setForeground(new Color(255, 255, 255));
                statsItemText1.setText("Total Medicine");

                statsItemIcon1.setIcon(new ImageIcon("./pages/icon/arrow.png"));

                GroupLayout statsItemPanel1Layout = new GroupLayout(statsItemPanel1);
                statsItemPanel1.setLayout(statsItemPanel1Layout);
                statsItemPanel1Layout.setHorizontalGroup(
                                statsItemPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(GroupLayout.Alignment.TRAILING, statsItemPanel1Layout
                                                                .createSequentialGroup()
                                                                .addComponent(statsItemIcon1)
                                                                .addContainerGap(30, 30))
                                                .addGroup(statsItemPanel1Layout.createSequentialGroup()
                                                                .addGap(24, 24, 24)
                                                                .addGroup(statsItemPanel1Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(statsItemText1)
                                                                                .addComponent(statsItemNumber1))
                                                                .addContainerGap(63, 63)));
                statsItemPanel1Layout.setVerticalGroup(
                                statsItemPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(statsItemPanel1Layout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addComponent(statsItemNumber1,
                                                                                GroupLayout.PREFERRED_SIZE, 26,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(statsItemText1)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(statsItemIcon1,
                                                                                GroupLayout.PREFERRED_SIZE, 24,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                // statsItemPanel2
                statsItemPanel2.setBackground(new Color(255, 255, 255));
                statsItemPanel2.setPreferredSize(new Dimension(164, 92));
                statsItemPanel2.setCursor(new Cursor(Cursor.HAND_CURSOR));
                statsItemPanel2.setBorder(new RoundedBorder(new Color(80, 77, 166), 10, 5));
                statsItemPanel2.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent e) {
                                statsItemPanel2MouseEntered();
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                                statsItemPanel2MouseExited();
                        }
                });

                statsItemNumber2.setFont(new OpenFont(24, Font.BOLD).getFont());
                statsItemNumber2.setForeground(new Color(255, 255, 255));
                statsItemNumber2.setText("12");

                statsItemText2.setFont(new OpenFont(12, Font.BOLD).getFont());
                statsItemText2.setForeground(new Color(255, 255, 255));
                statsItemText2.setText("Total Manufacturer");

                statsItemIcon2.setIcon(new ImageIcon("./pages/icon/arrow.png"));

                GroupLayout statsItemPanel2Layout = new GroupLayout(statsItemPanel2);
                statsItemPanel2.setLayout(statsItemPanel2Layout);
                statsItemPanel2Layout.setHorizontalGroup(
                                statsItemPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(GroupLayout.Alignment.TRAILING, statsItemPanel2Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(statsItemIcon2)
                                                                .addGap(30, 30, 30))
                                                .addGroup(statsItemPanel2Layout.createSequentialGroup()
                                                                .addGap(24, 24, 24)
                                                                .addGroup(statsItemPanel2Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(statsItemText2)
                                                                                .addComponent(statsItemNumber2))
                                                                .addContainerGap(63, Short.MAX_VALUE)));
                statsItemPanel2Layout.setVerticalGroup(
                                statsItemPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(statsItemPanel2Layout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addComponent(statsItemNumber2,
                                                                                GroupLayout.PREFERRED_SIZE, 26,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(statsItemText2)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(statsItemIcon2,
                                                                                GroupLayout.PREFERRED_SIZE, 24,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                // statsItemPanel3
                statsItemPanel3.setBackground(new Color(255, 255, 255));
                statsItemPanel3.setPreferredSize(new Dimension(164, 92));
                statsItemPanel3.setCursor(new Cursor(Cursor.HAND_CURSOR));
                statsItemPanel3.setBorder(new RoundedBorder(new Color(80, 77, 166), 10, 5));
                statsItemPanel3.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent e) {
                                statsItemPanel3MouseEntered();
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                                statsItemPanel3MouseExited();
                        }
                });

                statsItemNumber3.setFont(new OpenFont(24, Font.BOLD).getFont());
                statsItemNumber3.setForeground(new Color(255, 255, 255));
                statsItemNumber3.setText("34");

                statsItemText3.setFont(new OpenFont(12, Font.BOLD).getFont());
                statsItemText3.setForeground(new Color(255, 255, 255));
                statsItemText3.setText("Total Customer");

                statsItemIcon3.setIcon(new ImageIcon("./pages/icon/arrow.png"));

                GroupLayout statsItemPanel3Layout = new GroupLayout(statsItemPanel3);
                statsItemPanel3.setLayout(statsItemPanel3Layout);
                statsItemPanel3Layout.setHorizontalGroup(
                                statsItemPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(GroupLayout.Alignment.TRAILING, statsItemPanel3Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(statsItemIcon3)
                                                                .addGap(30, 30, 30))
                                                .addGroup(statsItemPanel3Layout.createSequentialGroup()
                                                                .addGap(24, 24, 24)
                                                                .addGroup(statsItemPanel3Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(statsItemText3)
                                                                                .addComponent(statsItemNumber3))
                                                                .addContainerGap(63, Short.MAX_VALUE)));
                statsItemPanel3Layout.setVerticalGroup(
                                statsItemPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(statsItemPanel3Layout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addComponent(statsItemNumber3,
                                                                                GroupLayout.PREFERRED_SIZE, 32,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(statsItemText3)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(statsItemIcon3,
                                                                                GroupLayout.PREFERRED_SIZE, 24,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                // statsItemPanel4
                statsItemPanel4.setBackground(new Color(255, 255, 255));
                statsItemPanel4.setPreferredSize(new Dimension(164, 92));
                statsItemPanel4.setCursor(new Cursor(Cursor.HAND_CURSOR));
                statsItemPanel4.setBorder(new RoundedBorder(new Color(80, 77, 166), 10, 5));
                statsItemPanel4.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent e) {
                                statsItemPanel4MouseEntered();
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                                statsItemPanel4MouseExited();
                        }
                });

                statsItemNumber4.setFont(new OpenFont(24, Font.BOLD).getFont());
                statsItemNumber4.setForeground(new Color(255, 255, 255));
                statsItemNumber4.setText("22");

                statsItemText4.setFont(new OpenFont(12, Font.BOLD).getFont());
                statsItemText4.setForeground(new Color(255, 255, 255));
                statsItemText4.setText("Total Vendor");

                statsItemIcon4.setIcon(new ImageIcon("./pages/icon/arrow.png"));

                GroupLayout statsItemPanel4Layout = new GroupLayout(statsItemPanel4);
                statsItemPanel4.setLayout(statsItemPanel4Layout);
                statsItemPanel4Layout.setHorizontalGroup(
                                statsItemPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(GroupLayout.Alignment.TRAILING, statsItemPanel4Layout
                                                                .createSequentialGroup()
                                                                .addComponent(statsItemIcon4)
                                                                .addContainerGap(30, 30))
                                                .addGroup(statsItemPanel4Layout.createSequentialGroup()
                                                                .addGap(24, 24, 24)
                                                                .addGroup(statsItemPanel4Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(statsItemText4)
                                                                                .addComponent(statsItemNumber4))
                                                                .addContainerGap(63, 63)));
                statsItemPanel4Layout.setVerticalGroup(
                                statsItemPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(statsItemPanel4Layout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addComponent(statsItemNumber4,
                                                                                GroupLayout.PREFERRED_SIZE, 32,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(statsItemText4)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(statsItemIcon4,
                                                                                GroupLayout.PREFERRED_SIZE, 24,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                GroupLayout statsPanelLayout = new GroupLayout(statsPanel);
                statsPanel.setLayout(statsPanelLayout);
                statsPanelLayout.setHorizontalGroup(
                                statsPanelLayout.createSequentialGroup()
                                                .addComponent(statsItemPanel1, GroupLayout.PREFERRED_SIZE, 185,
                                                                GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 60, 60)
                                                .addComponent(statsItemPanel2, GroupLayout.PREFERRED_SIZE, 185,
                                                                GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 60, 60)
                                                .addComponent(statsItemPanel3, GroupLayout.PREFERRED_SIZE, 185,
                                                                GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 60, 60)
                                                .addComponent(statsItemPanel4, GroupLayout.PREFERRED_SIZE, 185,
                                                                GroupLayout.PREFERRED_SIZE));
                statsPanelLayout.setVerticalGroup(
                                statsPanelLayout.createParallelGroup()
                                                .addComponent(statsItemPanel1, GroupLayout.PREFERRED_SIZE, 128,
                                                                GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 20, 20)
                                                .addComponent(statsItemPanel2, GroupLayout.PREFERRED_SIZE, 128,
                                                                GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 20, 20)
                                                .addComponent(statsItemPanel3, GroupLayout.PREFERRED_SIZE, 128,
                                                                GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 20, 20)
                                                .addComponent(statsItemPanel4, GroupLayout.PREFERRED_SIZE, 128,
                                                                GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 20, 20));

                // dashBoardTitle
                dashboardTitle.setFont(new OpenFont(26, Font.BOLD).getFont());
                dashboardTitle.setForeground(new Color(83, 83, 83));
                dashboardTitle.setText("Home/ Dashboard");
                dashboardTitle.setAlignmentY(0.0F);

                GroupLayout dashboardTitlePanelLayout = new GroupLayout(dashboardTitlePanel);
                dashboardTitlePanel.setLayout(dashboardTitlePanelLayout);
                dashboardTitlePanelLayout.setHorizontalGroup(
                                dashboardTitlePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(GroupLayout.Alignment.TRAILING, dashboardTitlePanelLayout
                                                                .createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addGroup(dashboardTitlePanelLayout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(dashboardTitle)
                                                                                .addComponent(statsPanel,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                872,
                                                                                                GroupLayout.PREFERRED_SIZE))));
                dashboardTitlePanelLayout.setVerticalGroup(
                                dashboardTitlePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(dashboardTitlePanelLayout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(dashboardTitle)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
                                                                                36, Short.MAX_VALUE)
                                                                .addComponent(statsPanel)));

                dashboardLayout.setLayout(new FlowLayout(FlowLayout.CENTER));
                dashboardLayout.add(dashboardTitlePanel);

                // SeparatorPanel
                separatorPanel.setBackground(new Color(255, 255, 255));
                separator.setForeground(new Color(204, 204, 204));

                separatorPanel.setLayout(new GridBagLayout());
                gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridheight = 1;
                gbc.gridwidth = 1;
                gbc.ipadx = 872;
                gbc.insets = new Insets(0, 0, 10, 0);
                separatorPanel.add(separator, gbc);

                // OptionsPanel
                optionsLayout.setBackground(new Color(255, 255, 255));
                // OptionPanel1
                optionsPanel.setBackground(new Color(255, 255, 255));

                optionPanel1.setBackground(new Color(255, 255, 255));
                optionPanel1.setLayout(new BorderLayout());
                optionPanel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
                optionPanel1.setBorder(new RoundedBorder(new Color(245, 247, 249), 10, 10));
                optionPanel1.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent e) {
                                optionPanel1MouseEntered();
                        }

                        public void mouseClicked(MouseEvent e) {
                                optionPanel1MouseClicked();
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                                optionPanel1MouseExited();
                        }
                });

                optionLabel1.setFont(new OpenFont(14, Font.BOLD).getFont());
                optionLabel1.setForeground(new Color(105, 106, 106));
                optionLabel1.setHorizontalAlignment(SwingConstants.CENTER);
                optionLabel1.setIcon(new ImageIcon("./pages/icon/calculator.png"));
                optionLabel1.setText("Create new invoice");
                optionLabel1.addMouseListener(new MouseListener() {

                        @Override
                        public void mouseClicked(MouseEvent e) {
                                frame.dispose();
                               new PageInvoice().setVisible(true);
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
                optionPanel1.add(optionLabel1, BorderLayout.CENTER);

                optionsPanel.add(optionPanel1);
                // OptionPanel2
                optionPanel2.setBackground(new Color(255, 255, 255));
                optionPanel2.setLayout(new BorderLayout());
                optionPanel2.setCursor(new Cursor(Cursor.HAND_CURSOR));
                optionPanel2.setBorder(new RoundedBorder(new Color(245, 247, 249), 10, 5));
                optionPanel2.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent e) {
                                optionPanel2MouseEntered();
                        }

                        public void mouseClicked(MouseEvent e) {
                                optionPanel2MouseClicked();
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                                optionPanel2MouseExited();
                        }
                });

                optionLabel2.setFont(new OpenFont(14, Font.BOLD).getFont());
                optionLabel2.setForeground(new Color(105, 106, 106));
                optionLabel2.setHorizontalAlignment(SwingConstants.CENTER);
                optionLabel2.setIcon(new ImageIcon("./pages/icon/group.png"));
                optionLabel2.setText("Add Customer");
                optionPanel2.add(optionLabel2, BorderLayout.CENTER);

                optionsPanel.add(optionPanel2);
                // OptionPanel3
                optionPanel3.setBackground(new Color(255, 255, 255));
                optionPanel3.setLayout(new BorderLayout());
                optionPanel3.setCursor(new Cursor(Cursor.HAND_CURSOR));
                optionPanel3.setBorder(new RoundedBorder(new Color(245, 247, 249), 10, 5));
                optionPanel3.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent e) {
                                optionPanel3MouseEntered();
                        }

                        public void mouseClicked(MouseEvent e) {
                                optionPanel3MouseClicked();
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                                optionPanel3MouseExited();
                        }
                });

                optionLabel3.setFont(new OpenFont(14, Font.BOLD).getFont());
                optionLabel3.setForeground(new Color(105, 106, 106));
                optionLabel3.setHorizontalAlignment(SwingConstants.CENTER);
                optionLabel3.setIcon(new ImageIcon("./pages/icon/med.png"));
                optionLabel3.setText("Add Medicine");
                optionPanel3.add(optionLabel3, BorderLayout.CENTER);

                optionsPanel.add(optionPanel3);
                // OptionPanel4
                optionPanel4.setBackground(new Color(255, 255, 255));
                optionPanel4.setLayout(new BorderLayout());
                optionPanel4.setCursor(new Cursor(Cursor.HAND_CURSOR));
                optionPanel4.setBorder(new RoundedBorder(new Color(245, 247, 249), 10, 5));
                optionPanel4.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent e) {
                                optionPanel4MouseEntered();
                        }

                        public void mouseClicked(MouseEvent e) {
                                optionPanel4MouseClicked();
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                                optionPanel4MouseExited();
                        }
                });

                optionLabel4.setFont(new OpenFont(14, Font.BOLD).getFont());
                optionLabel4.setForeground(new Color(105, 106, 106));
                optionLabel4.setIcon(new ImageIcon("./pages/icon/stat.png"));
                optionLabel4.setText("Todays Report");
                optionLabel4.setHorizontalAlignment(SwingConstants.CENTER);
                optionPanel4.add(optionLabel4, BorderLayout.CENTER);
                

                // OptionPanel5
                optionPanel5.setBackground(new Color(255, 255, 255));
                optionPanel5.setLayout(new BorderLayout());
                optionPanel5.setCursor(new Cursor(Cursor.HAND_CURSOR));
                optionPanel5.setBorder(new RoundedBorder(new Color(245, 247, 249), 10, 5));
                optionPanel5.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent e) {
                                optionPanel5MouseEntered();
                        }

                        public void mouseClicked(MouseEvent e) {
                                optionPanel5MouseClicked();
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                                optionPanel5MouseExited();
                        }
                });

                optionLabel5.setFont(new OpenFont(14, Font.BOLD).getFont());
                optionLabel5.setForeground(new Color(105, 106, 106));
                optionLabel5.setHorizontalAlignment(SwingConstants.CENTER);
                optionLabel5.setIcon(new ImageIcon("./pages/icon/fac.png"));
                optionLabel5.setText("Add Manufacturer");
                optionPanel5.add(optionLabel5, BorderLayout.CENTER);

                // OptionPanel6
                optionPanel6.setBackground(new Color(255, 255, 255));
                optionPanel6.setLayout(new BorderLayout());
                optionPanel6.setCursor(new Cursor(Cursor.HAND_CURSOR));
                optionPanel6.setBorder(new RoundedBorder(new Color(245, 247, 249), 10, 5));
                optionPanel6.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent e) {
                                optionPanel6MouseEntered();
                        }

                        public void mouseClicked(MouseEvent e) {
                                optionPanel6MouseClicked();
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                                optionPanel6MouseExited();
                        }
                });

                optionLabel6.setFont(new OpenFont(14, Font.BOLD).getFont());
                optionLabel6.setForeground(new Color(105, 106, 106));
                optionLabel6.setHorizontalAlignment(SwingConstants.CENTER);
                optionLabel6.setIcon(new ImageIcon("./pages/icon/report.png"));
                optionLabel6.setText("Total Report");
                optionPanel6.add(optionLabel6, BorderLayout.CENTER);

                GroupLayout optionGroupLayout = new GroupLayout(optionsPanel);
                optionsPanel.setLayout(optionGroupLayout);

                optionGroupLayout.setHorizontalGroup(
                                optionGroupLayout.createSequentialGroup()
                                                .addGroup(optionGroupLayout.createParallelGroup()
                                                                .addComponent(optionPanel1, GroupLayout.PREFERRED_SIZE,
                                                                                270, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(optionPanel4, GroupLayout.PREFERRED_SIZE,
                                                                                270, GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(GroupLayout.PREFERRED_SIZE,35,GroupLayout.PREFERRED_SIZE)
                                                .addGroup(optionGroupLayout.createParallelGroup()
                                                                .addComponent(optionPanel2, GroupLayout.PREFERRED_SIZE,
                                                                                270, GroupLayout.PREFERRED_SIZE)
                                                                
                                                                .addComponent(optionPanel5, GroupLayout.PREFERRED_SIZE,
                                                                                270, GroupLayout.PREFERRED_SIZE)
                                                                )
                                                                .addGap(GroupLayout.PREFERRED_SIZE,35,GroupLayout.PREFERRED_SIZE)
                                                .addGroup(optionGroupLayout.createParallelGroup()
                                                                .addComponent(optionPanel3, GroupLayout.PREFERRED_SIZE,
                                                                                270, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(optionPanel6, GroupLayout.PREFERRED_SIZE,
                                                                                270, GroupLayout.PREFERRED_SIZE)));
                optionGroupLayout.setVerticalGroup(
                                optionGroupLayout.createSequentialGroup()
                                                .addGroup(optionGroupLayout.createParallelGroup()
                                                                .addComponent(optionPanel1, GroupLayout.PREFERRED_SIZE,
                                                                                130, GroupLayout.PREFERRED_SIZE)
                                                                
                                                                .addComponent(optionPanel2, GroupLayout.PREFERRED_SIZE,
                                                                                130, GroupLayout.PREFERRED_SIZE)
                                                                
                                                                .addComponent(optionPanel3, GroupLayout.PREFERRED_SIZE,
                                                                                130, GroupLayout.PREFERRED_SIZE)
                                                                )
                                                .addGap(GroupLayout.PREFERRED_SIZE,15,GroupLayout.PREFERRED_SIZE)
                                                .addGroup(optionGroupLayout.createParallelGroup()
                                                                .addComponent(optionPanel4, GroupLayout.PREFERRED_SIZE,
                                                                                130, GroupLayout.PREFERRED_SIZE)
                                                                
                                                                .addComponent(optionPanel5, GroupLayout.PREFERRED_SIZE,
                                                                                130, GroupLayout.PREFERRED_SIZE)
                                                                
                                                                .addComponent(optionPanel6, GroupLayout.PREFERRED_SIZE,
                                                                                130, GroupLayout.PREFERRED_SIZE)
                                                                )

                );

                optionsLayout.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
                optionsLayout.add(optionsPanel);

                GroupLayout layout = new GroupLayout(dashboardPanel);
                dashboardPanel.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(dashboardLayout)
                                                .addComponent(separatorPanel)
                                                .addComponent(optionsLayout));
                layout.setVerticalGroup(
                                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(dashboardLayout, 230, 230, 230)
                                                                .addComponent(separatorPanel)
                                                                .addComponent(optionsLayout)));
                this.add(navPanel, BorderLayout.NORTH);
                this.add(dashboardPanel);
                
        }

        public void statsItemPanel1MouseEntered() {
                statsItemPanel1.setBorder(new RoundedBorder(new Color(80, 40, 166), 10, 2));
        }

        public void statsItemPanel1MouseExited() {
                statsItemPanel1.setBorder(new RoundedBorder(new Color(80, 77, 166), 10, 5));
        }

        public void statsItemPanel1MouseClicked() {
                // code
        }

        public void statsItemPanel2MouseEntered() {
                statsItemPanel2.setBorder(new RoundedBorder(new Color(80, 40, 166), 10, 2));
        }

        public void statsItemPanel2MouseExited() {
                statsItemPanel2.setBorder(new RoundedBorder(new Color(80, 77, 166), 10, 5));
        }

        public void statsItemPanel2MouseClicked() {
                // code
        }

        public void statsItemPanel3MouseEntered() {
                statsItemPanel3.setBorder(new RoundedBorder(new Color(80, 40, 166), 10, 2));
        }

        public void statsItemPanel3MouseExited() {
                statsItemPanel3.setBorder(new RoundedBorder(new Color(80, 77, 166), 10, 5));
        }

        public void statsItemPanel3MouseClicked() {
                // code
        }

        public void statsItemPanel4MouseEntered() {
                statsItemPanel4.setBorder(new RoundedBorder(new Color(80, 40, 166), 10, 2));
        }

        public void statsItemPanel4MouseExited() {
                statsItemPanel4.setBorder(new RoundedBorder(new Color(80, 77, 166), 10, 5));
        }

        public void statsItemPanel4MouseClicked() {
                // code
        }

        public void optionPanel1MouseEntered() {
                optionPanel1.setBorder(new RoundedBorder(new Color(221,221,221), 10, 2));
                optionPanel1.setForeground(new Color(105, 106, 106));
        }

        public void optionPanel1MouseExited() {
                optionPanel1.setBorder(new RoundedBorder(new Color(245, 247, 249), 10, 5));
        }

        public void optionPanel1MouseClicked() {
                // code
        }

        public void optionPanel2MouseEntered() {
                optionPanel2.setBorder(new RoundedBorder(new Color(221,221,221), 10, 2));
        }

        public void optionPanel2MouseExited() {
                optionPanel2.setBorder(new RoundedBorder(new Color(245, 247, 249), 10, 5));
        }

        public void optionPanel2MouseClicked() {
                // code
        }

        public void optionPanel3MouseEntered() {
                optionPanel3.setBorder(new RoundedBorder(new Color(221,221,221), 10, 2));
        }

        public void optionPanel3MouseExited() {
                optionPanel3.setBorder(new RoundedBorder(new Color(245, 247, 249), 10, 5));
        }

        public void optionPanel3MouseClicked() {
                this.dispose();
                new Medicine().setVisible(true);
        }

        public void optionPanel4MouseEntered() {
                optionPanel4.setBorder(new RoundedBorder(new Color(221,221,221), 10, 2));
        }

        public void optionPanel4MouseExited() {
                optionPanel4.setBorder(new RoundedBorder(new Color(245, 247, 249), 10, 5));
        }

        public void optionPanel4MouseClicked() {
                // code
        }

        public void optionPanel5MouseEntered() {
                optionPanel5.setBorder(new RoundedBorder(new Color(221,221,221), 10, 2));
        }

        public void optionPanel5MouseExited() {
                optionPanel5.setBorder(new RoundedBorder(new Color(245, 247, 249), 10, 5));
        }

        public void optionPanel5MouseClicked() {
                // code
        }

        public void optionPanel6MouseEntered() {
                optionPanel6.setBorder(new RoundedBorder(new Color(221,221,221), 10, 2));
        }

        public void optionPanel6MouseExited() {
                optionPanel6.setBorder(new RoundedBorder(new Color(245, 247, 249), 10, 5));
        }

        public void optionPanel6MouseClicked() {
                // code
        }


}