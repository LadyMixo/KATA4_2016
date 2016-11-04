package kata4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class KATA4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // nombre de la cadena del fichero
        String fileName = "emailsfilev1.txt"; 
        ArrayList<String> mailList = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        
        histoDisplay.execute();
    }
}
