import javax.swing.*;

public class startApps {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setContentPane(new sistem_penghitung_total_pesanan().getLayarUtama());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(500,400);
        jframe.setVisible(true);
    }
}
