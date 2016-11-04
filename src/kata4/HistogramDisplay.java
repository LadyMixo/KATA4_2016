package kata4;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    private final Histogram<String> histo;

    public HistogramDisplay(Histogram<String> histo) {
        super("HISTOGRAM");
        this.histo = histo;
          // establecemos panel contenedor
        setContentPane(createPanel());
        // pack() = pone la ventana con el tamaño mínimo para que todos
        //los componentes sean visibles
        pack();
    }
    
    public void execute(){
        // hacemos visible la ventana
        setVisible(true);
    }
    
    private JPanel createPanel(){
        // creamos ventana, panel y panel para datos
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        
        
        // establecemos tamaño
        chartPanel.setPreferredSize(new Dimension(500,400));
        
        // devolvemos chartPanel
        return chartPanel;
    }
    
    
    // creación del panel: titulo, etiqueta horizontal, etiqueta vertical, conjunto datos, orientación, etiqueta bajo gráfico, -, -.
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("JFreecharHistogram",
                                                      "Dominois email", 
                                                      "Nº Emails", 
                                                      dataSet, 
                                                      PlotOrientation.VERTICAL, 
                                                      false, 
                                                      rootPaneCheckingEnabled, 
                                                      rootPaneCheckingEnabled 
                );
        return chart;
        
    }
    
    // creación del conjunto de datos
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(10, "", "gmail.com");
        dataSet.addValue(15, "", "ulpgc.com");
        dataSet.addValue(12, "", "ull.com");
        dataSet.addValue(4, "", "hotmail.com");
        
        return dataSet;
    }
    
}