package nether.util.splash;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public final class JSplashLabel extends JLabel {

    private static final long serialVersionUID = -774117609679903588L;
    
    private String m_text = null;
    private Font m_font = null;
    private Color m_color = null;

    public JSplashLabel(URL url, String text, Font font, Color color) {
        
        ImageIcon icon = new ImageIcon(url);
        
        if (icon.getImageLoadStatus() != 8) {
            System.err.println("Cannot load splash screen: " + url);
            setText("Cannot load splash screen: " + url);
        } else {
            setIcon(icon);
            this.m_text = text;
            this.m_font = font;
            this.m_color = color;

            if (this.m_font != null) {
                setFont(this.m_font);
            }
        }
    }

    public JSplashLabel(URL url, String text) {
        
        ImageIcon icon = new ImageIcon(url);
        
        if (icon.getImageLoadStatus() != 8) {
            System.err.println("Cannot load splash screen: " + url);
            setText("Cannot load splash screen: " + url);
        } else {
            setIcon(icon);
            this.m_text = text;
            
            if (this.m_font != null) {
                setFont(this.m_font);
            }
        }
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        if (this.m_text != null) {
            if (this.m_color != null) {
                graphics.setColor(this.m_color);
            }

            FontMetrics fm = graphics.getFontMetrics();
            int width = fm.stringWidth(this.m_text) + 20;
            int height = fm.getHeight();

            graphics.drawString(this.m_text, getWidth() - width, getHeight() - height);
        }
    }
}
