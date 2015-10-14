package kata3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MailReader {

    private final String pathName;

    public MailReader(String pathName) {
        this.pathName = pathName;
    }
    
    public ArrayList <String> getDominiosArray(){
        ArrayList<String> dominiosArray= new ArrayList<>();
        try {
            BufferedReader fileIn = new BufferedReader(new FileReader(pathName));
            
            String mail;
            while ((mail = fileIn.readLine())!=null){
                if (!mail.contains("@")){
                    continue;
                }
                dominiosArray.add(mail.split("@")[1]);
            }
        } catch (Exception e) {
            System.out.println("Excepcion");
        }
        return dominiosArray;
    }
    
}
