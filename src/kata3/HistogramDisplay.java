package kata3;

import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay(){
        super("Histogram");
        setContentPane(createPanel());
        pack();
    }
    
    private ChartPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart("Gráfico", "Dominios", "nº emails",
                dataset, PlotOrientation.VERTICAL,
                false, false, false);
        return chart;
    }
   
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10,"ENE","gmail.com");
        dataset.addValue(7,"ENE","ulpgc.es");
        dataset.addValue(5,"ENE","hotmail.com");
        return dataset;
    }
    
    public void execute(){
        setVisible(true);
    }

    
    
    
}
