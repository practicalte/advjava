package Practicals;

import java.awt.*;
import java.awt.event.*;

public class Exp3_GUI {

  public static void main(String[] args) {
    Frame f = new Frame("ActionListener Example");
    Frame f1 = new Frame("Result");
    Label l1, l2, l3, l4;
    final TextField tf = new TextField();
    tf.setBounds(50, 50, 150, 20);
    l1 = new Label("enter marks of m1");
    l1.setBounds(50, 30, 150, 20);
    final TextField tf1 = new TextField();
    tf1.setBounds(50, 90, 150, 20);
    l2 = new Label("enter marks of m2");
    l2.setBounds(50, 70, 150, 20);
    l3 = new Label("Result");
    l3.setBounds(50, 70, 150, 20);
    final TextField tf2 = new TextField();
    tf2.setBounds(50, 130, 150, 20);
    Button b = new Button("Display Result");
    b.setBounds(50, 190, 200, 30);
    b.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          // int a= tf.getText();
          // int b= tf.getText();
          f1.setVisible(true);
          int c = 0;
          String s1 = tf.getText();
          String s2 = tf1.getText();
          int a = Integer.parseInt(s1);
          int b = Integer.parseInt(s2);
          c = a + b;
          tf2.setText("" + c);
          // l3 = new Label (""+c);
          // l3.setBounds(50,70, 150,20);
        }
      }
    );
    f.add(b);
    f.add(tf);
    f.add(tf1);
    // f.add(tf2);
    f.add(l1);
    f.add(l2);
    // f.add(l3);
    f1.add(tf2);
    f1.setSize(400, 400);
    f1.setLayout(null);
    f.setSize(400, 400);

    f.setLayout(null);
    f.setVisible(true);
  }
}
