package Practicals;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Exp1_KeyListener extends Applet implements KeyListener {

  String msg;

  public void init() {
    addKeyListener(this);
  }

  public void paint(Graphics g) {
    g.drawString(msg, 50, 60);
  }

  public void keyPressed(KeyEvent k) {
    msg = "keydown";
    showStatus("keypressed");
    repaint();
  }

  public void keyReleased(KeyEvent k) {
    msg = "keyup";
    showStatus("keyreleased");
    repaint();
  }

  public void keyTyped(KeyEvent k) {
    msg = "keytype";

    msg += k.getKeyChar();
    showStatus("keytyped");
    repaint();
  }
}
