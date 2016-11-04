package kata4;

import java.util.ArrayList;

public class MailHistogramBuilder {
    
    public static Histogram<String> build( ArrayList <String> mail){
        Histogram<String> histo = new Histogram<>();
        for (String mail1 : mail) {
            histo.increment(new Mail(mail1).getDomain()); // nos quedamos con el domingio y aumentamos su numero ne el mapa
        }
        return histo;
    }
}
