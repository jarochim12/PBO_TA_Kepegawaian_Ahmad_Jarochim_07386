/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kepegawaian.Gui;

/**
 *
 * @author msi pc
 */

import javax.swing.*;
import java.awt.event.*;

public class GuiLogin extends JFrame implements ActionListener {
  // deklarasi komponen
  private JLabel lblUsername = new JLabel("Username");
  private JTextField txtUsername = new JTextField();
  private JLabel lblPassword = new JLabel("Password");
  private JPasswordField txtPassword = new JPasswordField();
  private JButton btnLogin = new JButton("Login");
  private JLabel lblInfo = new JLabel(" ");

  public GuiLogin() {
    // atur layout
    setLayout(null);

    // tambahkan komponen ke form
    add(lblUsername);
    add(txtUsername);
    add(lblPassword);
    add(txtPassword);
    add(btnLogin);
    add(lblInfo);

    // atur posisi komponen
    lblUsername.setBounds(10, 10, 100, 20);
    txtUsername.setBounds(120, 10, 150, 20);
    lblPassword.setBounds(10, 35, 100, 20);
    txtPassword.setBounds(120, 35, 150, 20);
    btnLogin.setBounds(10, 60, 100, 20);
    lblInfo.setBounds(10, 85, 260, 20);

    // tambahkan event handler untuk tombol login
    btnLogin.addActionListener(this);
  }

  // event handler untuk tombol login
  @Override
  public void actionPerformed(ActionEvent e) {
    // ambil input
    String username = txtUsername.getText();
    char[] password = txtPassword.getPassword();
    String pass = new String(password);

    // validasi username dan password
    if (username.equals("admin") && pass.equals("admin")) {
        lblInfo.setText("Login Berhasil!");
    } else {
        lblInfo.setText("Username atau Password salah!");
    }
  } 
}
