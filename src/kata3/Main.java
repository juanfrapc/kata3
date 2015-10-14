package kata3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String pathName = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\JavaApplication1\\Data\\emailsfilev1.txt";
        MailReader dominios = new MailReader(pathName);
        ArrayList<String> domis= dominios.getDominiosArray();
        Histogram<String> histograma = DominiosHistogramBuilder.execute(domis);
                        
        HistogramDisplay histo = new HistogramDisplay(histograma);
        histo.execute();
    }
}
