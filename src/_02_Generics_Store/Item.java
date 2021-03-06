package _02_Generics_Store;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Item {
    String item;
    public int cost;
    public abstract JLabel getItem();

    @SuppressWarnings("rawtypes")
    public static ImageIcon loadImage(String fileName) {
        try {
            return new ImageIcon(ImageIO
                    .read(new Cart().getClass().getResourceAsStream(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
