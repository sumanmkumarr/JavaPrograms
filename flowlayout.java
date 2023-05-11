import java.awt.*;
import javax.swing.*;
import java.applet.*;

public class flowlayout {
    JFrame f;

    flowlayout() {
        f = new JFrame();
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("OK");
        JButton b5 = new JButton("Cancel");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.setLayout(new FlowLayout());
        f.setSize(300, 300);
        f.setAlwaysOnTop(true);
    }

    public static void main(String args[]) {
        new flowlayout();
    }
}
