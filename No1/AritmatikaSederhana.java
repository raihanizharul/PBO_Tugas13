package Nusput.P13.No1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class AritmatikaSederhana extends JFrame implements ActionListener {
  private JTextField textField1, textField2, textFieldHasil;
  private JButton buttonTambah, buttonKurang, buttonKali, buttonBagi, buttonModulus;
  
  public AritmatikaSederhana() {
    // Menetapkan titel frame
    super("Proses Aritmatika Sederhana");
    
    // Menetapkan layout frame
    setLayout(new FlowLayout());
    
    // Membuat label dan text field
    JLabel label1 = new JLabel("");
    textField1 = new JTextField(11);
    add(label1);
    add(textField1);
    
    JLabel label2 = new JLabel("");
    textField2 = new JTextField(11);
    add(label2);
    add(textField2);
    
    JLabel labelHasil = new JLabel("Hasil:");
    textFieldHasil = new JTextField(5);
    add(labelHasil);
    add(textFieldHasil);
    
    // Membuat panel
    JPanel panel = new JPanel();
    
    // Menetapkan layout panel
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    
    // Membuat tombol
    buttonTambah = new JButton("                        +                        ");
  buttonKurang = new JButton("                        -                         ");
    buttonKali = new JButton("                        *                         ");
    buttonBagi = new JButton("                        /                         ");
    buttonModulus = new JButton("                 Modulus                  ");
    
    // Mengatur ukuran tombol
    buttonTambah.setPreferredSize(new Dimension(300, 200));
    buttonKurang.setPreferredSize(new Dimension(300, 50));
    buttonKali.setPreferredSize(new Dimension(300, 50));
    buttonBagi.setPreferredSize(new Dimension(200, 50));
    buttonModulus.setPreferredSize(new Dimension(100, 50));

    // Menambahkan tombol ke panel
    panel.add(buttonTambah);
    panel.add(buttonKurang);
    panel.add(buttonKali);
    panel.add(buttonBagi);
    panel.add(buttonModulus);

    // Menambahkan panel ke frame
    add(panel);

    // Menambahkan listener pada tombol
    buttonTambah.addActionListener(this);
    buttonKurang.addActionListener(this);
    buttonKali.addActionListener(this);
    buttonBagi.addActionListener(this);
    buttonModulus.addActionListener(this);

    // Menetapkan ukuran frame
    setSize(350, 230);

    // Menampilkan frame
    setVisible(true);
    }

    // Method untuk menangani event ketika tombol diklik
  public void actionPerformed(ActionEvent event) {
    // Menangkap input dari text field
    double bilangan1 = Double.parseDouble(textField1.getText());
    double bilangan2 = Double.parseDouble(textField2.getText());

    // Menentukan hasil sesuai dengan tombol yang diklik
    DecimalFormat df = new DecimalFormat("0");
    if (event.getSource() == buttonTambah) {
      textFieldHasil.setText(df.format(bilangan1 + bilangan2));
    } else if (event.getSource() == buttonKurang) {
      textFieldHasil.setText(df.format(bilangan1 - bilangan2));
    } else if (event.getSource() == buttonKali) {
      textFieldHasil.setText(df.format(bilangan1 * bilangan2));
    } else if (event.getSource() == buttonBagi) {
      textFieldHasil.setText(df.format(bilangan1 / bilangan2));
    } else if (event.getSource() == buttonModulus) {
      textFieldHasil.setText(df.format(bilangan1 % bilangan2));
    }
  }

  public static void main(String[] args) {
    AritmatikaSederhana frame = new AritmatikaSederhana();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}