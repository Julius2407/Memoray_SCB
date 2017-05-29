package memory;

/**
 * Created by LennartanDeMeulen on 29.05.2017.
 */

import javax.swing.*;
import java.awt.*;

public class Test {

    public static void main (String[]args){

        JFrame Podest = new JFrame("Podest");
        Podest.setBounds(500, 100, 1000, 700);
        Podest.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel p = new JPanel(new GridLayout(0));
        p.add(new JLabel("Testfeld"));
        p.add(new JTextField(50));
        Podest.pack();
        Podest.setVisible(true);




    }

}
