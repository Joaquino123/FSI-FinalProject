package componentes;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class textBoxPersonalizado extends JTextField {

    // === Propiedades personalizadas ===
    private int xRadius = 15;                   // Radio del borde
    private Color xBorderColor = new Color(180, 180, 180); // Color del borde normal
    private Color xFocusedColor = new Color(0, 150, 255);  // Color del borde con foco
    private int xBorderSize = 2;                // Grosor del borde
    private Color xBackgroundColor = Color.WHITE;           // Fondo
    private Color xPlaceholderColor = new Color(140, 140, 140); // Color del placeholder
    private String xPlaceholderText = "";       // Texto placeholder
    private boolean xShowShadow = false;        // Sombra opcional
    private Color xShadowColor = new Color(0, 0, 0, 40);
    private int xShadowSize = 4;

    public textBoxPersonalizado() {
        setOpaque(false);
        setBorder(new EmptyBorder(6, 10, 6, 10));
        setFont(new Font("Segoe UI", Font.PLAIN, 14));
        setForeground(new Color(30, 30, 30));
        setCaretColor(new Color(60, 60, 60));
        setSelectionColor(new Color(220, 240, 255));

        // 🔹 Forzar repintado cuando el textbox gana o pierde foco
        addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                repaint();
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // === Fondo con sombra ===
        if (xShowShadow) {
            g2.setColor(xShadowColor);
            g2.fillRoundRect(xShadowSize, xShadowSize, getWidth() - xShadowSize, getHeight() - xShadowSize, xRadius, xRadius);
        }

        // === Fondo principal ===
        g2.setColor(xBackgroundColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), xRadius, xRadius);

        super.paintComponent(g2);

        // === Placeholder ===
        if (getText().isEmpty() && !isFocusOwner() && xPlaceholderText != null && !xPlaceholderText.isEmpty()) {
            g2.setColor(xPlaceholderColor);
            FontMetrics fm = g2.getFontMetrics();
            int textY = (getHeight() - fm.getHeight()) / 2 + fm.getAscent();
            g2.drawString(xPlaceholderText, getInsets().left, textY);
        }

        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Color borderColor = isFocusOwner() ? xFocusedColor : xBorderColor;
        g2.setColor(borderColor);
        g2.setStroke(new BasicStroke(xBorderSize));

        // Ajuste para evitar recortes en el borde superior
        g2.drawRoundRect(xBorderSize / 2, xBorderSize / 2,
                getWidth() - xBorderSize, getHeight() - xBorderSize,
                xRadius, xRadius);

        g2.dispose();
    }

    // === GETTERS y SETTERS con prefijo "x" ===
    public int getxRadius() { return xRadius; }
    public void setxRadius(int xRadius) { this.xRadius = xRadius; repaint(); }

    public Color getxBorderColor() { return xBorderColor; }
    public void setxBorderColor(Color xBorderColor) { this.xBorderColor = xBorderColor; repaint(); }

    public Color getxFocusedColor() { return xFocusedColor; }
    public void setxFocusedColor(Color xFocusedColor) { this.xFocusedColor = xFocusedColor; repaint(); }

    public int getxBorderSize() { return xBorderSize; }
    public void setxBorderSize(int xBorderSize) { this.xBorderSize = xBorderSize; repaint(); }

    public Color getxBackgroundColor() { return xBackgroundColor; }
    public void setxBackgroundColor(Color xBackgroundColor) { this.xBackgroundColor = xBackgroundColor; repaint(); }

    public Color getxPlaceholderColor() { return xPlaceholderColor; }
    public void setxPlaceholderColor(Color xPlaceholderColor) { this.xPlaceholderColor = xPlaceholderColor; repaint(); }

    public String getxPlaceholderText() { return xPlaceholderText; }
    public void setxPlaceholderText(String xPlaceholderText) { this.xPlaceholderText = xPlaceholderText; repaint(); }

    public boolean isxShowShadow() { return xShowShadow; }
    public void setxShowShadow(boolean xShowShadow) { this.xShowShadow = xShowShadow; repaint(); }

    public Color getxShadowColor() { return xShadowColor; }
    public void setxShadowColor(Color xShadowColor) { this.xShadowColor = xShadowColor; repaint(); }

    public int getxShadowSize() { return xShadowSize; }
    public void setxShadowSize(int xShadowSize) { this.xShadowSize = xShadowSize; repaint(); }
}
