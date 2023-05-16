package pages.font;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class OpenFont {
    private int fontSize;
    private int fontType;
    private Font openSans;

    public OpenFont(int fontSize,int fontType){
        this.fontSize = fontSize;
        this.fontType = fontType;


    }

    public Font getFont(){
        try {
            openSans = Font.createFont(Font.TRUETYPE_FONT, new File("./pages/font/opensans.ttf")).deriveFont(this.fontType,this.fontSize);
            GraphicsEnvironment ge = 
                GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(openSans);
        } catch (IOException|FontFormatException e) {
            //Handle exception
        }
        return openSans;
    }
}
