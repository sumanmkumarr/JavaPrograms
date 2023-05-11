import java.swing.*;
import java.util.*;

public class JLABEL {
    public static void main(String args[]) {
        JFrame f = new JFrame("label demo");
        JLabel l1 = new JLabel(" first label");
        l1.setBounds(50, 50, 130, 30);
        JLabel l2 = new JLabel("second label");
        l2.setBounds(50, 100, 130, 30);
        f.add(l1);
        f.add(l2);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(True);
    }

}
