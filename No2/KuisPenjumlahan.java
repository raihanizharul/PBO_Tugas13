package Nusput.P13.No2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class KuisPenjumlahan extends JFrame implements ActionListener {
  private JTextField textField1, textField2, textFieldJawaban;
  private JButton buttonCheck;
  private JLabel label1, label2, labelJawaban, labelHasil, labelPenjelasan;
  private Random random;

  public KuisPenjumlahan() {
    // Menetapkan titel frame
    super("Kuis Penjumlahan");

    // Menetapkan layout frame
    setLayout(new FlowLayout());

    // Membuat objek random
    random = new Random();

    // Membuat label dan text field
    label1 = new JLabel("");
    textField1 = new JTextField(8);
    textField1.setEditable(false);
    add(label1);
    add(textField1);

    label2 = new JLabel("");
    textField2 = new JTextField(8);
    textField2.setEditable(false);
    add(label2);
    add(textField2);

    labelJawaban = new JLabel("=");
    textFieldJawaban = new JTextField(5);
    add(labelJawaban);
    add(textFieldJawaban);

    // Membuat tombol
    buttonCheck = new JButton("Check");
    add(buttonCheck);
   

    // Membuat label hasil
    labelHasil = new JLabel("");
    add(labelHasil);

    // Membuat label penjelasan
    labelPenjelasan = new JLabel("");
    add(labelPenjelasan);
    
    
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.add(buttonCheck);
    add(panel, BorderLayout.CENTER);

    // Menambahkan listener pada tombol
    buttonCheck.addActionListener(this);



      // Menampilkan bilangan acak
      int bilangan1 = random.nextInt(100);
      int bilangan2 = random.nextInt(100);
      textField1.setText(String.valueOf(bilangan1));
      textField2.setText(String.valueOf(bilangan2));
  }  

  // Method untuk menangani event ketika tombol diklik
  public void actionPerformed(ActionEvent event) {
    // Menangkap input dari text field
    int jawaban = Integer.parseInt(textFieldJawaban.getText());

    // Menentukan hasil sesuai dengan tombol yang diklik
    int bilangan1 = Integer.parseInt(textField1.getText());
    int bilangan2 = Integer.parseInt(textField2.getText());
    int hasil = bilangan1 + bilangan2;
    if (jawaban == hasil) {
      labelHasil.setText("Selamat Jawaban Anda Benar");
      getContentPane().setBackground(Color.GREEN);
      labelPenjelasan.setText(bilangan1 + " + " + bilangan2 + " = " + hasil);
    } else {
      labelHasil.setText("Maaf, Jawaban Anda Salah");
      getContentPane().setBackground(Color.RED);
      labelPenjelasan.setText(bilangan1 + " + " + bilangan2 + " = " + hasil);
    }
  }

  public static void main(String[] args) {
    KuisPenjumlahan frame = new KuisPenjumlahan();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 250);
    frame.setVisible(true);
  }
}