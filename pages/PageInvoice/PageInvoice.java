
package pages.PageInvoice;
import javax.swing.*;

import pages.font.OpenFont;
import pages.*;
import pages.Model.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class PageInvoice extends JFrame {
    public JFrame frame;
    public PageInvoice medicineClass;
    public List<Med> invoice = new ArrayList<>();
    public JLabel cartSize;

    public PageInvoice() {
        initComponents();
        this.setSize(1280, 720);
        this.setTitle("Pharmacy Management System| Invoice  ");
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
        initCustomerListSection();
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
        JLabel appLocation = new JLabel("Home/ Invoice");
        this.add(appLocation);
        appLocation.setBounds(80, 120, 229, 38);
        Font font = new OpenFont(28, Font.BOLD).getFont();
        appLocation.setFont(font);
        this.add(appLocation);

        JLabel addButton = new JLabel(new ImageIcon("./pages/buttons/cart.png"));
        addButton.setBounds(1000, 143, 123, 80);
        addButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        addButton.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                new InvoiceGenerator(invoice).setVisible(true);
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
        this.add(addButton);

        cartSize = new JLabel("0");
        cartSize.setBounds(addButton.getX() + addButton.getWidth(), 145, 78, 38);
        cartSize.setFont(new Font("Open Sans", Font.BOLD, 24));
        
        this.add(cartSize);

    }

    public void initCustomerListSection() {
        // Create a JPanel to hold the buttons
        JPanel medicineList = new JPanel();
        medicineList.setLayout(new GridLayout(0, 1)); // Set the medicineList layout to a single column
        Font tableHeadingFont = new OpenFont(18, Font.BOLD).getFont();
        String headingColor = "#F5F5F5";
        String normalTdColor = "#404040";

        List<Med> medList = MedicineCRUD.searchMedicine(null);
        for (Med med : medList) { // Add a JPanel for each Med object to the medicineList
            JPanel medicineItem = new JPanel();
            medicineItem.setLayout(new GridLayout(0, 5));
            medicineItem.setPreferredSize(new Dimension(100, 67));

            JPanel td1 = new JPanel();
            td1.setBackground(new Color(0, 0, 0));
            td1.setOpaque(false);
            td1.setLayout(new BorderLayout());
            JPanel td2 = new JPanel();
            td2.setBackground(new Color(0, 0, 0));
            td2.setOpaque(false);
            td2.setLayout(new BorderLayout());
            JPanel td3 = new JPanel();
            td3.setBackground(new Color(0, 0, 0));
            td3.setOpaque(false);
            td3.setLayout(new BorderLayout());
            JPanel td4 = new JPanel();
            td4.setBackground(new Color(0, 0, 0));
            td4.setOpaque(false);
            td4.setLayout(new BorderLayout());
            JPanel td5 = new JPanel();
            td5.setBackground(new Color(0, 0, 0));
            td5.setOpaque(false);
            td5.setLayout(new BorderLayout());

            JLabel id = new JLabel();
            id.setFont(tableHeadingFont);
            id.setHorizontalAlignment(JLabel.CENTER);
            id.setVerticalAlignment(JLabel.CENTER);

            JLabel nameLabel = new JLabel();
            nameLabel.setFont(tableHeadingFont);
            nameLabel.setHorizontalAlignment(JLabel.CENTER);
            nameLabel.setVerticalAlignment(JLabel.CENTER);

            JLabel manufacturerLabel = new JLabel();
            manufacturerLabel.setFont(tableHeadingFont);
            manufacturerLabel.setHorizontalAlignment(JLabel.CENTER);
            manufacturerLabel.setVerticalAlignment(JLabel.CENTER);

            JLabel stockLabel = new JLabel();
            stockLabel.setForeground(Color.decode("#F5F5F5"));
            stockLabel.setFont(tableHeadingFont);
            stockLabel.setHorizontalAlignment(JLabel.CENTER);
            stockLabel.setVerticalAlignment(JLabel.CENTER);

            JLabel operation = new JLabel();
            operation.setFont(tableHeadingFont);
            operation.setHorizontalAlignment(JLabel.CENTER);
            operation.setVerticalAlignment(JLabel.CENTER);

            if (medList.indexOf(med) == 0) {
                id.setText("ID");
                id.setForeground(Color.decode(headingColor));
                nameLabel.setText("Name");
                nameLabel.setForeground(Color.decode(headingColor));
                manufacturerLabel.setText("Manufacturer");
                manufacturerLabel.setForeground(Color.decode(headingColor));
                stockLabel.setText("Price");
                stockLabel.setForeground(Color.decode(headingColor));
                operation.setText("Operation");
                operation.setForeground(Color.decode(headingColor));

                td1.add(id, BorderLayout.CENTER);
                td2.add(nameLabel, BorderLayout.CENTER);
                td3.add(manufacturerLabel, BorderLayout.CENTER);
                td4.add(stockLabel, BorderLayout.CENTER);
                td5.add(operation, BorderLayout.CENTER);

                medicineItem.add(td1);
                medicineItem.add(td2);
                medicineItem.add(td3);
                medicineItem.add(td4);
                medicineItem.add(td5);

            } else {

                id.setText(Integer.toString(med.getId()));
                id.setForeground(Color.decode(normalTdColor));
                nameLabel.setText(med.getName());
                nameLabel.setForeground(Color.decode(normalTdColor));
                manufacturerLabel.setText(med.getManufacturer());
                manufacturerLabel.setForeground(Color.decode(normalTdColor));
                stockLabel.setText(Integer.toString(med.getStock()));
                stockLabel.setForeground(Color.decode(normalTdColor));

                // buttons
                JPanel buttonContainer = new JPanel();
                buttonContainer.setLayout(new BorderLayout());
                buttonContainer.setBackground(new Color(0, 0, 0));
                buttonContainer.setOpaque(false);
                buttonContainer.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 50));

                JLabel medButton2 = new JLabel(new ImageIcon("./pages/buttons/add2.png"));
                medButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
                medButton2.addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        invoice.add(med);
                        cartSize.setText(Integer.toString(invoice.size()));

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
                buttonContainer.add(medButton2, BorderLayout.CENTER);

                td1.add(id, BorderLayout.CENTER);
                td2.add(nameLabel, BorderLayout.CENTER);
                td3.add(manufacturerLabel, BorderLayout.CENTER);
                td4.add(stockLabel, BorderLayout.CENTER);
                td5.add(buttonContainer, BorderLayout.CENTER);

                medicineItem.add(td1);
                medicineItem.add(td2);
                medicineItem.add(td3);
                medicineItem.add(td4);
                medicineItem.add(td5);
            }

            if (medList.indexOf(med) % 2 == 0 && medList.indexOf(med) != 0) {
                medicineItem.setBackground(Color.decode("#F5F7F9"));
            } else {
                medicineItem.setBackground(Color.decode("#D9D9D9"));
                if (medList.indexOf(med) == 0) {
                    medicineItem.setBackground(Color.decode("#034EA1"));
                }
            }

            medicineList.add(medicineItem);
        }

        // Create a JScrollPane to hold the medicineList
        JScrollPane scrollPane = new JScrollPane(medicineList);
        scrollPane.setBounds(102, 229, 1075, 331); // Set the bounds of the scroll pane
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); // Always show the vertical
                                                                                         // scroll
                                                                                         // bar
        scrollPane.setBorder(BorderFactory.createEmptyBorder());

        // Add the scroll pane to the JFrame
        add(scrollPane);
    }

    // public static void main(String[] args) {
    // new Medicine().setVisible(true);
    // }
}
