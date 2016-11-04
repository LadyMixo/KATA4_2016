package kata4;

import java.io.File;

public class KATA4 {

    public static void main(String[] args) {
        
    File file = new File("c:\\");
    String names[] = file.list(); // listado directorios del fichero guardado en ese array
    
        for (String name : names) {
            System.out.println(name);
            
        }
        
    }
}
