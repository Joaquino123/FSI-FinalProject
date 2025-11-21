package componentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.EmptyBorder;

/**
 * Botón profesional basado en JPanel, con propiedades modernas (todas con prefijo x).
 * Se ve limpio, moderno y es totalmente personalizable.
 */
public class botonPersonalizado extends JPanel {

    // 🔹 Propiedades personalizables
    private String xTexto = "Botón";
    private Font xFuente = new Font("Segoe UI", Font.BOLD, 14);
    private Color xColorNormal = new Color(0, 150, 136);
    private Color xColorHover = new Color(0, 200, 180);
    private Color xColorPresionado = new Color(0, 121, 107);
    private Color xColorTexto = Color.WHITE;

    private int xRadioBorde = 20;

    private boolean xSombra = true;
    private int xTamañoSombra = 6;
    private Color xColorSombra = new Color(0, 0, 0, 60);

    private boolean xMostrarBorde = false;
    private Color xColorBorde = new Color(0, 100, 90);
    private float xGrosorBorde = 2f;

    private int xPaddingHorizontal = 20;
    private int xPaddingVertical = 10;

    private Icon xIcono = null;
    private int xEspaciadoIcono = 8;
    private int xPosicionIcono = SwingConstants.LEFT; // LEFT o RIGHT

    // Estados del mouse
    private boolean mouseOver = false;
    private boolean mousePressed = false;

    // 🔹 Constructor
    public botonPersonalizado() {
        setOpaque(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setBorder(new EmptyBorder(8, 12, 8, 12));

        // Eventos del mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mouseOver = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseOver = false;
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                mousePressed = true;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mousePressed = false;
                repaint();
            }
        });
    }

    // 🔹 Dibujo del botón
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // Determinar color según estado
        Color colorFondo = xColorNormal;
        if (mousePressed) colorFondo = xColorPresionado;
        else if (mouseOver) colorFondo = xColorHover;

        // 🔸 Dibujar sombra
        if (xSombra) {
            g2.setColor(xColorSombra);
            g2.fillRoundRect(xTamañoSombra, xTamañoSombra,
                    width - xTamañoSombra, height - xTamañoSombra,
                    xRadioBorde, xRadioBorde);
        }

        // 🔸 Dibujar fondo
        g2.setColor(colorFondo);
        g2.fillRoundRect(0, 0, width - xTamañoSombra, height - xTamañoSombra, xRadioBorde, xRadioBorde);

        // 🔸 Dibujar borde
        if (xMostrarBorde) {
            g2.setStroke(new BasicStroke(xGrosorBorde));
            g2.setColor(xColorBorde);
            g2.drawRoundRect(0, 0, width - xTamañoSombra - 1, height - xTamañoSombra - 1, xRadioBorde, xRadioBorde);
        }

        // 🔸 Dibujar texto e ícono
        g2.setFont(xFuente);
        g2.setColor(xColorTexto);
        FontMetrics fm = g2.getFontMetrics();

        int textWidth = fm.stringWidth(xTexto);
        int textHeight = fm.getAscent();

        int iconWidth = (xIcono != null) ? xIcono.getIconWidth() : 0;
        int iconHeight = (xIcono != null) ? xIcono.getIconHeight() : 0;

        int totalWidth = textWidth + (xIcono != null ? (xEspaciadoIcono + iconWidth) : 0);
        int startX = (width - totalWidth) / 2;
        int textY = (height + textHeight) / 2 - 4;

        if (xIcono != null) {
            int iconY = (height - iconHeight) / 2;
            int iconX = (xPosicionIcono == SwingConstants.LEFT)
                    ? startX
                    : startX + textWidth + xEspaciadoIcono;

            xIcono.paintIcon(this, g2, iconX, iconY);

            if (xPosicionIcono == SwingConstants.LEFT)
                g2.drawString(xTexto, iconX + iconWidth + xEspaciadoIcono, textY);
            else
                g2.drawString(xTexto, startX, textY);
        } else {
            g2.drawString(xTexto, (width - textWidth) / 2, textY);
        }

        g2.dispose();
    }

    // 🔹 Propiedades (getters y setters con prefijo x)
    public String getxTexto() { return xTexto; }
    public void setxTexto(String texto) { this.xTexto = texto; repaint(); }

    public Font getxFuente() { return xFuente; }
    public void setxFuente(Font fuente) { this.xFuente = fuente; repaint(); }

    public Color getxColorNormal() { return xColorNormal; }
    public void setxColorNormal(Color color) { this.xColorNormal = color; repaint(); }

    public Color getxColorHover() { return xColorHover; }
    public void setxColorHover(Color color) { this.xColorHover = color; repaint(); }

    public Color getxColorPresionado() { return xColorPresionado; }
    public void setxColorPresionado(Color color) { this.xColorPresionado = color; repaint(); }

    public Color getxColorTexto() { return xColorTexto; }
    public void setxColorTexto(Color color) { this.xColorTexto = color; repaint(); }

    public int getxRadioBorde() { return xRadioBorde; }
    public void setxRadioBorde(int radio) { this.xRadioBorde = radio; repaint(); }

    public boolean isxSombra() { return xSombra; }
    public void setxSombra(boolean sombra) { this.xSombra = sombra; repaint(); }

    public int getxTamañoSombra() { return xTamañoSombra; }
    public void setxTamañoSombra(int tamaño) { this.xTamañoSombra = tamaño; repaint(); }

    public Color getxColorSombra() { return xColorSombra; }
    public void setxColorSombra(Color color) { this.xColorSombra = color; repaint(); }

    public boolean isxMostrarBorde() { return xMostrarBorde; }
    public void setxMostrarBorde(boolean mostrar) { this.xMostrarBorde = mostrar; repaint(); }

    public Color getxColorBorde() { return xColorBorde; }
    public void setxColorBorde(Color color) { this.xColorBorde = color; repaint(); }

    public float getxGrosorBorde() { return xGrosorBorde; }
    public void setxGrosorBorde(float grosor) { this.xGrosorBorde = grosor; repaint(); }

    public Icon getxIcono() { return xIcono; }
    public void setxIcono(Icon icono) { this.xIcono = icono; repaint(); }

    public int getxEspaciadoIcono() { return xEspaciadoIcono; }
    public void setxEspaciadoIcono(int espaciado) { this.xEspaciadoIcono = espaciado; repaint(); }

    public int getxPosicionIcono() { return xPosicionIcono; }
    public void setxPosicionIcono(int pos) { this.xPosicionIcono = pos; repaint(); }
}
