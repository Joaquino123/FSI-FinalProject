
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class Recursos {
    
    public Recursos(){
        
    }
    
    public static void panelFondo(JPanel panel, String rutaImagen) {
        ImageIcon icon = new ImageIcon(Recursos.class.getResource(rutaImagen));
        Image imagen = icon.getImage();

        panel.setOpaque(false);

        panel.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent e) {
                panel.repaint();
            }
        });

        panel.paintComponents(panel.getGraphics());
        panel.setUI(new javax.swing.plaf.PanelUI() {
            @Override
            public void update(Graphics g, JComponent c) {
                g.drawImage(imagen, 0, 0, panel.getWidth(), panel.getHeight(), null);
                super.update(g, c);
            }
        });
    }
    
    public static void redondearPanel(JPanel panel, int radio) {
    panel.setOpaque(false); // Muy importante: el panel no pinta su fondo plano

        panel.setUI(new javax.swing.plaf.PanelUI() {
            @Override
            public void update(Graphics g, JComponent c) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Dibuja el color del fondo del panel, con transparencia si la tiene
                g2.setColor(panel.getBackground());
                g2.fillRoundRect(0, 0, panel.getWidth(), panel.getHeight(), radio, radio);

                g2.dispose();
            }
        });
    }
}
