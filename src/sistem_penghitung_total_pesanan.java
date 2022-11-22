import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sistem_penghitung_total_pesanan extends Container {
    private JTextField nama_barang;
    private JTextField harga_barang;
    private JTextField total_beli;
    private JButton totalkanButton;
    private JPanel layarUtama;
    private JLabel hasil_penotalan;

    public sistem_penghitung_total_pesanan() {
        totalkanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String get_nama_barang = nama_barang.getText();
                int get_harga_barang = Integer.parseInt(harga_barang.getText());
                int get_total_beli = Integer.parseInt(total_beli.getText());
                int get_total_pesanan = get_harga_barang * get_total_beli;
                hasil_penotalan.setText("Rp." + Integer.toString(get_total_pesanan));

            }
        });
    }

    public JPanel getLayarUtama() {
        return layarUtama;
    }
}
