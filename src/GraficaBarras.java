import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficaBarras {

    private ConexionHR con;

    public GraficaBarras(ConexionHR con) {
        this.con = con;
    }

    public void crearGrafica(String consultaSQL, String titulo, String ejeX, String ejeY, JPanel panelDestino, String tabla) {

        try {
            ArrayList<ArrayList<String>> datos = con.consultar(consultaSQL);

            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            // Cada fila debe tener: genero | cantidad
            for (ArrayList<String> fila : datos) {
                String genero = fila.get(0);     // eje X
                int cantidad = Integer.parseInt(fila.get(1)); // eje Y
                dataset.addValue(cantidad, tabla, genero);
            }

            JFreeChart chart = ChartFactory.createBarChart(
                    titulo,
                    ejeX,
                    ejeY,
                    dataset
            );

            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setMouseWheelEnabled(true);

            panelDestino.removeAll();
            panelDestino.setLayout(new BorderLayout());
            panelDestino.add(chartPanel, BorderLayout.CENTER);
            panelDestino.validate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
