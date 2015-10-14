package kata3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Histogram<String> histograma = new Histogram<>();
        String pathName = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\JavaApplication1\\Data\\emailsfilev1.txt";
        MailReader dominios = new MailReader(pathName);
        
        ArrayList<String> domis= dominios.getDominiosArray();
        
        for (int i = 0; i < domis.size(); i++) {
            histograma.increment(domis.get(i));
        }
                
        HistogramDisplay histo = new HistogramDisplay(histograma);
        histo.execute();
    }
}
