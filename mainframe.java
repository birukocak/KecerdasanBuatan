
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainframe extends JFrame implements ActionListener {
    JTextField tf_persediaan,  tf_permintaan, tf_produksi;
    JLabel lb_persediaan, lb_permintaan, lb_produksi;
    JButton hitung;

    mainframe() {
        lb_persediaan = new JLabel("Persediaan");
        lb_persediaan.setBounds(50, 50, 100, 30);

        tf_persediaan = new JTextField();
        tf_persediaan.setBounds(170, 50, 150, 30);

        lb_permintaan = new JLabel("Permintaan");
        lb_permintaan.setBounds(50, 90, 100, 30);

        tf_permintaan = new JTextField();
        tf_permintaan.setBounds(170, 90, 150, 30);

        lb_produksi = new JLabel("Produksi");
        lb_produksi.setBounds(50, 130, 100, 30);

        tf_produksi = new JTextField();
        tf_produksi.setBounds(170, 130, 150, 30);
        
        hitung = new JButton("Hitung");
        hitung.setBounds(350, 100, 100, 30);
        hitung.addActionListener(this);
        hitung.setActionCommand("Hitung");

        add(lb_persediaan);
        add(tf_persediaan);
        add(lb_permintaan);
        add(tf_permintaan);
        add(lb_produksi);
        add(tf_produksi);
        add(hitung);

        setTitle("Studi Kasus Pabrik Kue Kering");
        setSize(500,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
            String klik = e.getActionCommand();
            if (klik.equals("Hitung")) {
                int persediaan = Integer.parseInt(tf_persediaan.getText());
                int permintaan = Integer.parseInt(tf_permintaan.getText());

                rules rule =new rules();
                rule.hitungAlphaPred(permintaan,persediaan);

                Produksi p = new Produksi();
                System.out.println("tess = "+p.nilaiProduksiBerkurang(0.25));

                tf_produksi.setText(rule.defuzzifikasi()+"");
            }
    }
    
    public static void main (String args[]) {
        new mainframe();
    }
    
}
