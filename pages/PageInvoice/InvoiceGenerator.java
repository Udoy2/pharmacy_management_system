package pages.PageInvoice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import pages.Model.Med;

public class InvoiceGenerator extends JFrame {
    List<Med> cart = new ArrayList<>();
    InvoiceGenerator(List<Med> cart){
        this.cart = cart;
        System.out.println("invoice");
        this.setSize(1280,720);
        this.setTitle("receipt");
        this.setLayout(null);
    }

    public void initComponents(){
        JPanel slip = new JPanel();
        slip.setBounds(367, 13, 545, 694);
        slip.setBackground(Color.white);
        this.add(slip);

        JLabel heading = new JLabel("Kuratoli pharmacy management system");
        this.add(heading);
    }
}
