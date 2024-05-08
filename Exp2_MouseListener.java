package Practicals;

import java.awt.*;
import java.awt.event.*;

public class Exp2_MouseListener extends Frame implements MouseListener {

  String s = " ";

  public Exp2_MouseListener() {
    addMouseListener(this);
    setSize(300, 400);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Exp2_MouseListener();
  }

  public void mouseClicked(MouseEvent m) {
    s = "mouse clicked";
    repaint();
  }

  public void mousePressed(MouseEvent m) {
    s = "mouse Pressed";
    repaint();
  }

  public void mouseReleased(MouseEvent m) {
    s = "mouse Released";
    repaint();
  }

  public void mouseEntered(MouseEvent m) {
    s = "mouse Entered";
    repaint();
  }

  public void mouseExited(MouseEvent m) {
    s = "mouse Exited";
    repaint();
  }

  public void paint(Graphics g) {
    g.drawString(s, 40, 50);
  }
}
