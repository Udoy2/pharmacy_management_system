package pages.Medicine;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MedicineButtonHandeler implements MouseListener{
    public int id;
    public JFrame frame;
    public JPanel medicinelist;
    MedicineButtonHandeler(int id,JFrame framee,JPanel medicineList){
        this.id = id;
        this.frame = framee;
        this.medicinelist = medicineList;


        
        
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(id);
        this.frame.getContentPane().remove(this.medicinelist);
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
    
}
