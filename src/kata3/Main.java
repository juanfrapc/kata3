package kata3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Histogram<String> histograma = new Histogram<>();
        String pathName = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\JavaApplication1\\Data\\emailsfilev1.txt";
        try {
            BufferedReader fileIn = new BufferedReader(new FileReader(pathName));
            
            String mail;
            while ((mail = fileIn.readLine())!=null){
                if (!mail.contains("@")){
                    continue;
                }
                histograma.increment(mail.split("@")[1]);
            }
        } catch (Exception e) {
            System.out.println("Excpcion");
        }
        
        HistogramDisplay histo = new HistogramDisplay(histograma);
        histo.execute();
    }
}
