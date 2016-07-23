package cobagit;

import java.awt.EventQueue;
import javax.swing.*;

public class Cobagit extends JFrame {
    private static final long serialVersionUID = 1L;

    public Cobagit() {
        initUI();
    }

    private void initUI() {
        setTitle("HALO DIXON");
        setSize(1000, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        System.out.println("HAI NAMAKU RODERICK");

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Cobagit ex = new Cobagit();
                ex.setVisible(true);
            }
        });
    }
}
