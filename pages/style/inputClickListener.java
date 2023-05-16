package pages.style;


import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


import javax.swing.JTextField;


public class inputClickListener implements FocusListener{
    public String current_text;
    @Override
    public void focusGained(FocusEvent e) {
        
        // JTextField field = (JTextField) e.getSource();
        // current_text = field.getText();
        // if(field.getName() == "userName"){
        //     if(field.getText().equals("Enter your name")){
        //         field.setText("");
        //     }
        // }
        // if(field.getName() == "userEmail"){
        //     if(field.getText().equals("Enter your email")){
        //         field.setText("");
        //     }
        // }
        // if(field.getName() == "userPassword"){
        //     if(field.getText().equals("Enter your password")){
        //         field.setText("");
        //     }
        // }
    }
    
    @Override
    public void focusLost(FocusEvent e) {
        JTextField field = (JTextField) e.getSource();
        
        field.setText(field.getText()); 
        

    }



    
}
