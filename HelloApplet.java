import java.applet.Applet;
import java.awt.Graphics;
// Every applet must extend the java.applet.Applet class
public class HelloApplet extends Applet {
    // The paint method is used to draw shapes, text, or images on the applet window
    @Override
    public void paint(Graphics g) {
        g.drawString("Hello, World! Welcome to Java Applet.", 50, 50);
    }
}