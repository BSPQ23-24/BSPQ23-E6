package es.deusto.spq;

import javax.swing.JFrame;

import java.awt.Toolkit;

/**
 * Hello world!
 *
 */
public class App extends JFrame {
    static JFrame f;
    static Toolkit tk = Toolkit.getDefaultToolkit();

    public static void main(String[] args) {
        f = new JFrame("BIDEA");
        f.setSize((int) (Math.round(tk.getScreenSize().getWidth() * 0.80)),
                (int) (Math.round(tk.getScreenSize().getHeight() * 0.80)));
        f.setVisible(true);
        
    }
}
